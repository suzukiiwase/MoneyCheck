package com.example.android62.moneycheck;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Female extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);


        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(Female.this,R.layout.spinner_item,getResources().getStringArray(R.array.spnEntries));
        adapter.setDropDownViewResource(R.layout.spinner_dropdown);
        //割り勘情報（spinnerオブジェクト）を取得
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);


        Button btn = (Button) findViewById(R.id.btnCalc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //******入力情報のオブジェクトの取得********//
                //金額情報の取得
                EditText sumMoney = (EditText) findViewById(R.id.sumMoney);
                //女性負担金額
                EditText womenMoney = (EditText) findViewById(R.id.womenMoney);
                //人数情報の取得
                EditText men = (EditText) findViewById(R.id.men);
                EditText women = (EditText) findViewById(R.id.women);
                //計算結果のオブジェクト
                TextView resultMen = (TextView) findViewById(R.id.resultMen);
                TextView perPerson = (TextView) findViewById(R.id.perPerson);
                String strSumMoney = sumMoney.getText().toString();
                String strWomenMoney = womenMoney.getText().toString();
                String strMen = men.getText().toString();
                String strWomen = women.getText().toString();
                TextView txtExtra = (TextView) findViewById(R.id.txtExtra);
                //割り勘情報（spinnerオブジェクト）を取得
                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                //選択されているアイテムのindexを取得
                int idx = spinner.getSelectedItemPosition();
                //******数値に変換**********//

                double wMoney;
                double Presult;
                double Mresult;
                Presult = 0;
                Mresult = 0;
                String Mres;
                String Pres;
                String extra = null;
                //******計算***************//
                int calc = 0;
                switch (idx) {
                    case 0:
                        calc = 1;
                        break;
                    case 1:
                        calc = 10;
                        break;
                    case 2:
                        calc = 100;
                        break;
                }


                if((strMen.equals(""))|| (strSumMoney.equals("")) || (strWomen.equals(""))) {
                    AlertDialog.Builder alertDlg;
                    alertDlg = new AlertDialog.Builder(Female.this);
                    alertDlg.setMessage("情報を入力してください");
                    alertDlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    });
                    alertDlg.create().show();
                }
//                else if (strWomenMoney.equals("")) {
//                    Mres = "0";
//                    resultMen.setText(Mres);
//                    Pres = String.format("%d", (int)Presult);
//                    perPerson.setText(Pres);
//                }

                else{
                    double sMoney = Integer.parseInt(strSumMoney);
                    double Mnum = Integer.parseInt(strMen);
                    double Wnum = Integer.parseInt(strWomen);
                    Presult = sMoney / (Mnum + Wnum);  //一人当たり
                    if (strWomenMoney.equals("")) {
                        Mres = "0";
                        resultMen.setText(Mres);
                        Pres = String.format("%d", (int)Presult);
                        perPerson.setText(Pres);
                    }

                    else {
                        wMoney = Integer.parseInt(strWomenMoney);
                        Mresult = (Math.ceil(((sMoney - (wMoney * Wnum)) / Mnum) / calc)) * calc;  //男性支払金額
                        Mres = String.format("%d", (int) Mresult);
                        resultMen.setText(Mres);
                        Pres = String.format("%d", (int) Presult);
                        perPerson.setText(Pres);
                        //余り
                        extra = String.format("%d", (int) (((Mresult * Mnum) + (wMoney * Wnum)) - sMoney));
                        txtExtra.setText(extra);
                    }
                }
            }
        });
    }
}
