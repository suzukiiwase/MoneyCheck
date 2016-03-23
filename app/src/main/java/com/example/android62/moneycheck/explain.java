package com.example.android62.moneycheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Activity;
import android.app.ActionBar;

import java.util.Locale;


public class explain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_explain);

        ViewGroup vg = (ViewGroup)findViewById(R.id.TableLayout1);
        for (int i = 0; i < 5; i++){
            TableRow tr = (TableRow)vg.getChildAt(i);
            String str = String.format(Locale.getDefault(),"　%d．",i+1);
            ((TextView)(tr.getChildAt(0))).setText(str);

            switch (i){
                case 0:
                    ((TextView)(tr.getChildAt(1))).setText(R.string.SECTION_310);
                    break;
                case 1:
                    ((TextView)(tr.getChildAt(1))).setText(R.string.SECTION_311);
                    break;
                case 2:
                    ((TextView)(tr.getChildAt(1))).setText(R.string.SECTION_312);
                    break;
                case 3:
                    ((TextView)(tr.getChildAt(1))).setText(R.string.SECTION_313);
                    break;
                case 4:
                    ((TextView)(tr.getChildAt(1))).setText(R.string.SECTION_314);
                    break;

            }

        }


        ViewGroup vg2 = (ViewGroup)findViewById(R.id.TableLayout2);
        for (int i = 0; i < 5; i++){
            TableRow tr2 = (TableRow)vg2.getChildAt(i);
            String str2 = String.format(Locale.getDefault(),"　%d．",i+1);
            ((TextView)(tr2.getChildAt(0))).setText(str2);

            switch (i){
                case 0:
                    ((TextView)(tr2.getChildAt(1))).setText(R.string.SECTION_410);
                    break;
                case 1:
                    ((TextView)(tr2.getChildAt(1))).setText(R.string.SECTION_411);
                    break;
                case 2:
                    ((TextView)(tr2.getChildAt(1))).setText(R.string.SECTION_412);
                    break;
                case 3:
                    ((TextView)(tr2.getChildAt(1))).setText(R.string.SECTION_413);
                    break;
                case 4:
                    ((TextView)(tr2.getChildAt(1))).setText(R.string.SECTION_414);
                    break;

            }

        }

        ViewGroup vg3 = (ViewGroup)findViewById(R.id.TableLayout3);
        for (int i = 0; i < 5; i++){
            TableRow tr3 = (TableRow)vg3.getChildAt(i);
            String str3 = String.format(Locale.getDefault(),"　%d．",i+1);
            ((TextView)(tr3.getChildAt(0))).setText(str3);

            switch (i){
                case 0:
                    ((TextView)(tr3.getChildAt(1))).setText(R.string.SECTION_210);
                    break;
                case 1:
                    ((TextView)(tr3.getChildAt(1))).setText(R.string.SECTION_211);
                    break;
                case 2:
                    ((TextView)(tr3.getChildAt(1))).setText(R.string.SECTION_212);
                    break;
                case 3:
                    ((TextView)(tr3.getChildAt(1))).setText(R.string.SECTION_213);
                    break;
                case 4:
                    ((TextView)(tr3.getChildAt(1))).setText(R.string.SECTION_214);
                    break;

            }

        }

    }
}
