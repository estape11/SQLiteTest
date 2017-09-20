package com.itcr.ce.estape11.sqlitetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itcr.ce.estape11.sqlitetest.db.GastroDBHelper;
import com.itcr.ce.estape11.sqlitetest.db.entidades.RestContract;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GastroDBHelper dbHelper=new GastroDBHelper(this);
        System.out.println(RestContract.RestEntry._ID);
        dbHelper.add();
        System.out.println("KE");
    }
}