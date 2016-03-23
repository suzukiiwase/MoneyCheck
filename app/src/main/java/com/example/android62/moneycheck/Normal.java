package com.example.android62.moneycheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;



public class Normal extends AppCompatActivity {
//    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);



        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(Normal.this,R.layout.spinner_item,getResources().getStringArray(R.array.spnEntries));
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
                EditText etxtMoney = (EditText) findViewById(R.id.inputSenetenceView);
                //人数情報の取得
                EditText etxtNum = (EditText) findViewById(R.id.inputSenetenceView2);
                //計算結果のオブジェクト
                TextView txtResult = (TextView) findViewById(R.id.txtResult);
                String strMoney = etxtMoney.getText().toString();
                String strNum = etxtNum.getText().toString();
                TextView txtExtra = (TextView) findViewById(R.id.txtExtra);


                Spinner spinner = (Spinner) findViewById(R.id.spinner);


                //選択されているアイテムのindexを取得
                int idx = spinner.getSelectedItemPosition();
                //******数値に変換**********//
                double money = 0;
                double num = 0;
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

                if((strMoney.equals(""))|| (strNum.equals(""))) {
                    AlertDialog.Builder alertDlg;
                    alertDlg = new AlertDialog.Builder(Normal.this);
                    alertDlg.setMessage("情報を入力してください");
                    alertDlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    });
                    alertDlg.create().show();
                }

                else{
                    money = Integer.parseInt(strMoney);
                    num = Integer.parseInt(strNum);
                    result = (Math.ceil(((money / num) / calc))) * calc;
                    res = String.format("%d", (int) result);
                    txtResult.setText(res);
                    //余り
                    extra = String.format("%d", (int) ((result * num) - money));
                    txtExtra.setText(extra);
                }
            }
        });
    }

}
