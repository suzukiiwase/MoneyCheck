package com.example.android62.moneycheck;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ThemedSpinnerAdapter;
import android.widget.TextView;
import android.widget.Button;

public class Lose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);

        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(Lose.this,R.layout.spinner_item,getResources().getStringArray(R.array.spnEntries));
        adapter.setDropDownViewResource(R.layout.spinner_dropdown);
        //割り勘情報（spinnerオブジェクト）を取得
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);



        Button btn = (Button) findViewById(R.id.btnCalc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //******入力情報のオブジェクトの取得********//
                //金額情報の取得//
                EditText sumMoney = (EditText) findViewById(R.id.sumMoney);
                //人数情報の取得//
                EditText people = (EditText) findViewById(R.id.people);
                //計算結果のオブジェクト//
                TextView txtLose = (TextView) findViewById(R.id.txtLose);
                TextView txtWin = (TextView) findViewById(R.id.txtWin);
                TextView txtper = (TextView) findViewById(R.id.txtPer);
                TextView txtExtra = (TextView) findViewById(R.id.txtExtra);
                String strSumMoney = sumMoney.getText().toString();
                String strPeople = people.getText().toString();
                //割り勘情報（spinnerオブジェクト）を取得
                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                //選択されているアイテムのindexを取得
                int idx = spinner.getSelectedItemPosition();
                //選択されているアイテムを取得
                String item = (String) spinner.getSelectedItem();
                //******負けた人の負担割合決定******//
                int d = (int)(Math.random()*10) + 1;
                //******数値に変換**********//

                double loseMoney, winMoney;
                String lmoney = null;
                String wmoney = null;
                String strPer = null;
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
                if((strSumMoney.equals(""))|| (strPeople.equals(""))) {
                    AlertDialog.Builder alertDlg;
                    alertDlg = new AlertDialog.Builder(Lose.this);
                    alertDlg.setMessage("情報を入力してください");
                    alertDlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    });
                    alertDlg.create().show();
                }

                else {

                    double sMoney = Integer.parseInt(strSumMoney);
                    double pnum = Integer.parseInt(strPeople);
                    loseMoney = (Math.ceil(((sMoney / pnum) * (1 + (d * 0.1))) / calc)) * calc;
                    winMoney = (Math.ceil(((sMoney - loseMoney) / (pnum - 1)) / calc)) * calc;
                    lmoney = String.format("%d", (int) loseMoney);
                    txtLose.setText(lmoney);
                    wmoney = String.format("%d", (int) winMoney);
                    txtWin.setText(wmoney);
                    strPer = String.format("%d", d * 10);
                    txtper.setText(strPer);
                    //余り
                    extra = String.format("%d", (int) ((loseMoney + (winMoney * (pnum - 1))) - sMoney));
                    txtExtra.setText(extra);
                }


            }
        });
    }
}