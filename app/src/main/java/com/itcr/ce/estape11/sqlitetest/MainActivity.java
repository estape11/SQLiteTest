package com.itcr.ce.estape11.sqlitetest;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itcr.ce.estape11.sqlitetest.db.GastroDBHelper;
import com.itcr.ce.estape11.sqlitetest.db.entidades.CarreraContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.RestauranteContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.UsuarioContract;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GastroDBHelper dbHelper=new GastroDBHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_NOMBRE, "Esteban");
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_APELLIDO, "Perez");
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_IDCARRERA, 2);
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_EMAIL, "estape11@outlook.com");
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_PARTICIPACION, 0);
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_PASSWORD, "jejejeje");
        //db.insert(UsuarioContract.UsuarioEntry.TABLE_NAME, null, valores);
        System.out.println("KE");
        String e="estape11@gmail.com";
        Cursor c =db.rawQuery("SELECT * FROM Usuario WHERE Email=?",new String[]{e});
        if(c.moveToFirst()){
            do{
                System.out.println(c.getString(1 ));

            }while(c.moveToNext());
        }

    }
}