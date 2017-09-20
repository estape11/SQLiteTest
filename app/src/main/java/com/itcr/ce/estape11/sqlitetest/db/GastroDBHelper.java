package com.itcr.ce.estape11.sqlitetest.db;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.itcr.ce.estape11.sqlitetest.db.entidades.AdmiContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.RestContract;

/**
 * Created by estape11 on 9/20/17.
 */

public class GastroDBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "GastroTEC.db";

    public GastroDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE IF NOT EXISTS "+ RestContract.RestEntry.TABLE_NAME+"(" +
                        RestContract.RestEntry.COLUMN_NAME_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        RestContract.RestEntry.COLUMN_NAME_NOMBRE+" TEXT NOT NULL UNIQUE, " +
                        RestContract.RestEntry.COLUMN_NAME_DESCRIPCION+" TEXT NOT NULL, " +
                        RestContract.RestEntry.COLUMN_NAME_UBICACION+" TEXT NOT NULL)"
        );
        db.execSQL(
                "CREATE TABLE IF NOT EXISTS "+ AdmiContract.AdmiEntry.TABLE_NAME+"("+
                        AdmiContract.AdmiEntry.COLUMN_NAME_ID+"  INTEGER PRIMARY KEY AUTOINCREMENT, "+
                        AdmiContract.AdmiEntry.COLUMN_NAME_NOMBRE+" TEXT NOT NULL, "+
                        AdmiContract.AdmiEntry.COLUMN_NAME_APELLIDO+" TEXT NOT NULL,"+
                        AdmiContract.AdmiEntry.COLUMN_NAME_EMAIL+" TEXT NOT NULL UNIQUE,"+
                        AdmiContract.AdmiEntry.COLUMN_NAME_PASSWORD+" TEXT NOT NULL,"+
                        AdmiContract.AdmiEntry.COLUMN_NAME_IDREST+" INTEGER NOT NULL, " +
                        "FOREIGN KEY("+AdmiContract.AdmiEntry.COLUMN_NAME_IDREST+")  REFERENCES "+ RestContract.RestEntry.TABLE_NAME+"("+ RestContract.RestEntry.COLUMN_NAME_ID+"))"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void add(){
        SQLiteDatabase db = getWritableDatabase();
        if(db != null){
            ContentValues valores = new ContentValues();
            valores.put("nombre", "Casa Luna");
            valores.put("descripcion", "No tan rico y poco barato");
            valores.put("ubicacion", "B1");
            db.insert("Restaurante", null, valores);
            db.close();
        }
    }
}
