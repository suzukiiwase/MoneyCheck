package com.example.android62.moneycheck;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;

public class Boss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);


        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(Boss.this,R.layout.spinner_item,getResources().getStringArray(R.array.spnEntries));
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
                EditText bossMoney = (EditText) findViewById(R.id.bossMoney);
                //人数情報の取得
                EditText people = (EditText) findViewById(R.id.people);
                EditText boss = (EditText) findViewById(R.id.boss);
                //計算結果のオブジェクト
                TextView txtResult = (TextView) findViewById(R.id.txtResult);
                String strSumMoney = sumMoney.getText().toString();
                String strBossMoney = bossMoney.getText().toString();
                String strPeople = people.getText().toString();
                String strBoss = boss.getText().toString();
                TextView txtExtra = (TextView) findViewById(R.id.txtExtra);
                //割り勘情報（spinnerオブジェクト）を取得
                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                //選択されているアイテムのindexを取得
                int idx = spinner.getSelectedItemPosition();
                //******数値に変換**********//

                double result;
                result = 0;
                String res = null;
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
                if((strSumMoney.equals(""))|| (strBossMoney.equals("")) || (strPeople.equals("")) || (strBoss.equals(""))) {
                    AlertDialog.Builder alertDlg;
                    alertDlg = new AlertDialog.Builder(Boss.this);
                    alertDlg.setMessage("情報を入力してください");
                    alertDlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    });
                    alertDlg.create().show();
                }


                else {
                    double sMoney = Integer.parseInt(strSumMoney);
                    double bMoney = Integer.parseInt(strBossMoney);
                    double pnum = Integer.parseInt(strPeople);
                    double bnum = Integer.parseInt(strBoss);
                    result = (Math.ceil(((sMoney - bMoney) / (pnum - bnum)) / calc)) * calc;
                    res = String.format("%d", (int) result);
                    txtResult.setText(res);
                    //余り
                    extra = String.format("%d", (int) ((result * (pnum - bnum) + bMoney) - sMoney));
                    txtExtra.setText(extra);
                }
            }
        });
    }
}
