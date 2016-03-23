package com.example.android62.moneycheck;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MoneyCheckController extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreateは最初の起動時に実行されるメソッド
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu); //レイアウトをセットする

        final Button btnNormal = (Button)findViewById(R.id.btnNormal);
        // クリックイベントを受け取れるようにする
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            // このメソッドがクリック毎に呼び出される
            public void onClick(View v) {
                // ここにクリックされたときの処理を記述
                if (v == btnNormal) {
                    Intent intent = new Intent();
                    intent.setClassName("com.example.android62.moneycheck", "com.example.android62.moneycheck.Normal");
                    startActivity(intent);
                }
            }
        });

        final Button btnLose = (Button)findViewById(R.id.btnLose);
        btnLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btnLose) {
                    Intent intent = new Intent();
                    intent.setClassName("com.example.android62.moneycheck", "com.example.android62.moneycheck.Lose");
                    startActivity(intent);
                }
            }
        });

        final Button btnBoss = (Button)findViewById(R.id.btnBoss);
        btnBoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btnBoss) {
                    Intent intent = new Intent();
                    intent.setClassName("com.example.android62.moneycheck", "com.example.android62.moneycheck.Boss");
                    startActivity(intent);
                }
            }
        });

        final Button btnFemale = (Button)findViewById(R.id.btnFemale);
        btnFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btnFemale) {
                    Intent intent = new Intent();
                    intent.setClassName("com.example.android62.moneycheck", "com.example.android62.moneycheck.Female");
                    startActivity(intent);
                }
            }
        });

        final Button btnExplain = (Button)findViewById(R.id.btnExplain);
        btnExplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btnExplain) {
                    Intent intent = new Intent();
                    intent.setClassName("com.example.android62.moneycheck", "com.example.android62.moneycheck.explain");
                    startActivity(intent);
                }
            }
        });

//        final Button btnTab = (Button)findViewById(R.id.btnTab);
//        btnExplain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (v == btnTab) {
//                    Intent intent = new Intent();
//                    intent.setClassName("com.example.android62.moneycheck", "com.example.android62.moneycheck.tabNavigation");
//                    startActivity(intent);
//                }
//            }
//        });

    }
}