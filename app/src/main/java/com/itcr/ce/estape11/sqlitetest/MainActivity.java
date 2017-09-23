package com.itcr.ce.estape11.sqlitetest;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itcr.ce.estape11.sqlitetest.db.GastroDBHelper;
import com.itcr.ce.estape11.sqlitetest.db.entidades.CarreraContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.RestauranteContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.UsuarioContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.VisitaContract;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GastroDBHelper dbHelper=new GastroDBHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_NOMBRE, "Eduardo");
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_APELLIDO, "Kj");
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_IDCARRERA, 7);
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_EMAIL, "eee@gmail.com");
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_PARTICIPACION, 0);
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_ID,2015097708);
        valores.put(UsuarioContract.UsuarioEntry.COLUMN_NAME_PASSWORD, "jejejeje");

        ContentValues tempCarrera= new ContentValues();
        tempCarrera.put(CarreraContract.CarreraEntry.COLUMN_NAME_NOMBRE,"Computadores");
        //db.insert(CarreraContract.CarreraEntry.TABLE_NAME,null,tempCarrera);

        //db.insert(UsuarioContract.UsuarioEntry.TABLE_NAME, null, valores);
        System.out.println("KE");
        String e="Esteban";
        //Cursor c =db.rawQuery("SELECT * FROM Usuario WHERE Nombre=?",new String[]{e});
        //Cursor c =db.rawQuery("SELECT * FROM Usuario U INNER JOIN Carrera C ON U.IdCarrera=C.IdCarrera",null);
        //Cursor c =db.rawQuery("SELECT * FROM Usuario WHERE Nombre=?",new String[]{"Daniela"});
        ContentValues ll=new ContentValues();
        ll.put(VisitaContract.VisitaEntry.COLUMN_NAME_FECHA,12062017);
        ll.put(VisitaContract.VisitaEntry.COLUMN_NAME_HORA,230800);
        ll.put(VisitaContract.VisitaEntry.COLUMN_NAME_IDRESTAURANTE,1);
        ll.put(VisitaContract.VisitaEntry.COLUMN_NAME_CARNET,2015097708);
        //db.insert(VisitaContract.VisitaEntry.TABLE_NAME,null,ll);
        //Cursor c =db.rawQuery("SELECT * FROM Usuario U RIGHT JOIN Carrera C ON U.IdCarrera=C.IdCarrera",null);
        Integer car=2015097708;
        Cursor c =db.rawQuery("SELECT count(Carnet) FROM Usuario WHERE Nombre=?",new String[]{"Ra"});
        if(c.moveToFirst()){
            do{
                //System.out.print(c.getString(1));
                //System.out.print(" ");
                //System.out.println(c.getString(3));
                System.out.println(c.getInt(0));

            }while(c.moveToNext());
        }else{
            System.out.println("NO ENCONTRADO");
        }

    }
}