package com.itcr.ce.estape11.sqlitetest.db;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.itcr.ce.estape11.sqlitetest.db.entidades.AdministradorContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.CarreraContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.PlatilloContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.PlatilloRestauranteContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.RestauranteContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.UsuarioContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.VisitaContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.VotoPlatilloContract;
import com.itcr.ce.estape11.sqlitetest.db.entidades.VotoRestauranteContract;

/**
 * Created by estape11 on 9/20/17.
 */

public class GastroDBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "test.db";
    private final String TABLE_RESTAURANTE="CREATE TABLE IF NOT EXISTS "+ RestauranteContract.RestEntry.TABLE_NAME+"(" +
            RestauranteContract.RestEntry.COLUMN_NAME_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
            RestauranteContract.RestEntry.COLUMN_NAME_NOMBRE+" TEXT NOT NULL UNIQUE, " +
            RestauranteContract.RestEntry.COLUMN_NAME_DESCRIPCION+" TEXT NOT NULL, " +
            RestauranteContract.RestEntry.COLUMN_NAME_UBICACION+" TEXT NOT NULL, "+
            RestauranteContract.RestEntry.COLUMN_NAME_HORARIO+" TEXT NOT NULL)";
    private final String TABLE_DELETE_RESTAURANTE="DROP TABLE IF EXISTS " + RestauranteContract.RestEntry.TABLE_NAME;

    private final String TABLE_ADMINISTRADOR= "CREATE TABLE IF NOT EXISTS "+ AdministradorContract.AdmiEntry.TABLE_NAME+"("+
            AdministradorContract.AdmiEntry.COLUMN_NAME_ID+"  INTEGER PRIMARY KEY AUTOINCREMENT, "+
            AdministradorContract.AdmiEntry.COLUMN_NAME_NOMBRE+" TEXT NOT NULL, "+
            AdministradorContract.AdmiEntry.COLUMN_NAME_APELLIDO+" TEXT NOT NULL,"+
            AdministradorContract.AdmiEntry.COLUMN_NAME_EMAIL+" TEXT NOT NULL UNIQUE,"+
            AdministradorContract.AdmiEntry.COLUMN_NAME_PASSWORD+" TEXT NOT NULL,"+
            AdministradorContract.AdmiEntry.COLUMN_NAME_IDRESTAURANTE +" INTEGER NOT NULL, " +
            "FOREIGN KEY("+ AdministradorContract.AdmiEntry.COLUMN_NAME_IDRESTAURANTE +")  REFERENCES "+ RestauranteContract.RestEntry.TABLE_NAME+"("+ RestauranteContract.RestEntry.COLUMN_NAME_ID+"))";
    private final String TABLE_DELETE_ADMINISTRADOR="DROP TABLE IF EXISTS " + AdministradorContract.AdmiEntry.TABLE_NAME;

    private final String TABLE_CARRERA="CREATE TABLE IF NOT EXISTS "+ CarreraContract.CarreraEntry.TABLE_NAME+"(" +
                    CarreraContract.CarreraEntry.COLUMN_NAME_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    CarreraContract.CarreraEntry.COLUMN_NAME_NOMBRE+" TEXT NOT NULL UNIQUE)";
    private final String TABLE_DELETE_CARRERA="DROP TABLE IF EXISTS " + CarreraContract.CarreraEntry.TABLE_NAME;

    private final String TABLE_USUARIO="CREATE TABLE IF NOT EXISTS "+ UsuarioContract.UsuarioEntry.TABLE_NAME+"(" +
            UsuarioContract.UsuarioEntry.COLUMN_NAME_ID+" INTEGER PRIMARY KEY, " +
            UsuarioContract.UsuarioEntry.COLUMN_NAME_NOMBRE+" TEXT NOT NULL, " +
            UsuarioContract.UsuarioEntry.COLUMN_NAME_APELLIDO+" TEXT NOT NULL, " +
            UsuarioContract.UsuarioEntry.COLUMN_NAME_EMAIL+" TEXT UNIQUE NOT NULL, " +
            UsuarioContract.UsuarioEntry.COLUMN_NAME_PASSWORD+" TEXT NOT NULL, " +
            UsuarioContract.UsuarioEntry.COLUMN_NAME_PARTICIPACION+" INTEGER NOT NULL, " +
            UsuarioContract.UsuarioEntry.COLUMN_NAME_IDCARRERA+" INTEGER NOT NULL, " +
            "FOREIGN KEY("+ UsuarioContract.UsuarioEntry.COLUMN_NAME_IDCARRERA +")  REFERENCES "+ CarreraContract.CarreraEntry.TABLE_NAME+"("+ CarreraContract.CarreraEntry.COLUMN_NAME_ID+"))";
    private final String TABLE_DELETE_USUARIO="DROP TABLE IF EXISTS " + UsuarioContract.UsuarioEntry.TABLE_NAME;

    private final String TABLE_PLATILLO="CREATE TABLE IF NOT EXISTS "+ PlatilloContract.PlatilloEntry.TABLE_NAME+"(" +
            PlatilloContract.PlatilloEntry.COLUMN_NAME_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
            PlatilloContract.PlatilloEntry.COLUMN_NAME_NOMBRE+" TEXT NOT NULL UNIQUE, " +
            PlatilloContract.PlatilloEntry.COLUMN_NAME_DESCRIPCION+" TEXT NOT NULL)";
    private final String TABLE_DELETE_PLATILLO="DROP TABLE IF EXISTS " + PlatilloContract.PlatilloEntry.TABLE_NAME;

    private final String TABLE_PLATILLORESTAURANTE="CREATE TABLE IF NOT EXISTS "+ PlatilloRestauranteContract.PlatilloRestauranteEntry.TABLE_NAME+"(" +
            PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_ID+"  INTEGER PRIMARY KEY AUTOINCREMENT, "+
            PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_IDPLATILLO+" INTEGER NOT NULL, " +
            PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_IDRESTAURANTE+" INTEGER NOT NULL, " +
            PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_PRECIO+" INTEGER NOT NULL, " +
            PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_FECHA+" INTEGER NOT NULL, " +
            PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_HORA+" INTEGER NOT NULL, " +
            "FOREIGN KEY("+ PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_IDPLATILLO +")  REFERENCES "+ PlatilloContract.PlatilloEntry.TABLE_NAME+"("+ PlatilloContract.PlatilloEntry.COLUMN_NAME_ID+"), " +
            "FOREIGN KEY("+ PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_IDRESTAURANTE +")  REFERENCES "+ RestauranteContract.RestEntry.TABLE_NAME+"("+ RestauranteContract.RestEntry.COLUMN_NAME_ID+") )";
    private final String TABLE_DELETE_PLATILLORESTAURANTE="DROP TABLE IF EXISTS " + PlatilloContract.PlatilloEntry.TABLE_NAME;

    private final String TABLE_VOTOPLATILLO="CREATE TABLE IF NOT EXISTS "+ VotoPlatilloContract.VotoPlatilloEntry.TABLE_NAME+"(" +
            VotoPlatilloContract.VotoPlatilloEntry.COLUMN_NAME_IDPLATILLO+" INTEGER NOT NULL, " +
            VotoPlatilloContract.VotoPlatilloEntry.COLUMN_NAME_CARNET+" INTEGER NOT NULL, " +
            VotoPlatilloContract.VotoPlatilloEntry.COLUMN_NAME_FECHA+" INTEGER NOT NULL, " +
            VotoPlatilloContract.VotoPlatilloEntry.COLUMN_NAME_VOTO+" INTEGER NOT NULL, " +
            "FOREIGN KEY("+ VotoPlatilloContract.VotoPlatilloEntry.COLUMN_NAME_IDPLATILLO +")  REFERENCES "+ PlatilloRestauranteContract.PlatilloRestauranteEntry.TABLE_NAME+"("+ PlatilloRestauranteContract.PlatilloRestauranteEntry.COLUMN_NAME_ID+"), " +
            "FOREIGN KEY("+ VotoPlatilloContract.VotoPlatilloEntry.COLUMN_NAME_CARNET +")  REFERENCES "+ UsuarioContract.UsuarioEntry.TABLE_NAME+"("+ UsuarioContract.UsuarioEntry.COLUMN_NAME_ID+") )";
    private final String TABLE_DELETE_VOTOPLATILLO="DROP TABLE IF EXISTS " + VotoPlatilloContract.VotoPlatilloEntry.TABLE_NAME;

    private final String TABLE_VOTORESTAURANTE ="CREATE TABLE IF NOT EXISTS "+ VotoRestauranteContract.VotoRestauranteEntry.TABLE_NAME+"(" +
            VotoRestauranteContract.VotoRestauranteEntry.COLUMN_NAME_IDRESTAURANTE+" INTEGER NOT NULL, " +
            VotoRestauranteContract.VotoRestauranteEntry.COLUMN_NAME_CARNET+" INTEGER NOT NULL, " +
            VotoRestauranteContract.VotoRestauranteEntry.COLUMN_NAME_FECHA+" INTEGER NOT NULL, " +
            VotoRestauranteContract.VotoRestauranteEntry.COLUMN_NAME_VOTO+" INTEGER NOT NULL, " +
            "FOREIGN KEY("+ VotoRestauranteContract.VotoRestauranteEntry.COLUMN_NAME_IDRESTAURANTE +")  REFERENCES "+ RestauranteContract.RestEntry.TABLE_NAME+"("+ RestauranteContract.RestEntry.COLUMN_NAME_ID+"), " +
            "FOREIGN KEY("+ VotoRestauranteContract.VotoRestauranteEntry.COLUMN_NAME_CARNET +")  REFERENCES "+ UsuarioContract.UsuarioEntry.TABLE_NAME+"("+ UsuarioContract.UsuarioEntry.COLUMN_NAME_ID+") )";
    private final String TABLE_DELETE_VOTORESTAURANTE="DROP TABLE IF EXISTS " + VotoRestauranteContract.VotoRestauranteEntry.TABLE_NAME;

    private final String TABLE_VISITA="CREATE TABLE IF NOT EXISTS "+ VisitaContract.VisitaEntry.TABLE_NAME+"( " +
            VisitaContract.VisitaEntry.COLUMN_NAME_IDRESTAURANTE+" INTERGER NOT NULL, " +
            VisitaContract.VisitaEntry.COLUMN_NAME_FECHA +"INTEGER NOT NULL" +
            VisitaContract.VisitaEntry.COLUMN_NAME_HORA+"INTEGER NOT NULL" +
            VisitaContract.VisitaEntry.COLUMN_NAME_CARNET+"INNTEGER NOT NULL" +
            "FOREIGN KEY("+ VisitaContract.VisitaEntry.COLUMN_NAME_IDRESTAURANTE +")  REFERENCES "+ RestauranteContract.RestEntry.TABLE_NAME+"("+ RestauranteContract.RestEntry.COLUMN_NAME_ID+", "+
            "FOREIGN KEY("+ VisitaContract.VisitaEntry.COLUMN_NAME_CARNET +")  REFERENCES "+ UsuarioContract.UsuarioEntry.TABLE_NAME+"("+ UsuarioContract.UsuarioEntry.COLUMN_NAME_ID+") )";
    private final String TABLE_DELETE_VISITA="DROP TABLE IF EXISTS "+ VisitaContract.VisitaEntry.TABLE_NAME;

    public GastroDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_RESTAURANTE);
        db.execSQL(TABLE_ADMINISTRADOR);
        db.execSQL(TABLE_CARRERA);
        db.execSQL(TABLE_USUARIO);
        db.execSQL(TABLE_PLATILLO);
        db.execSQL(TABLE_PLATILLORESTAURANTE);
        db.execSQL(TABLE_VOTOPLATILLO);
        db.execSQL(TABLE_VOTORESTAURANTE);
        db.execSQL(TABLE_VISITA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(TABLE_DELETE_RESTAURANTE);
        db.execSQL(TABLE_DELETE_ADMINISTRADOR);
        db.execSQL(TABLE_DELETE_CARRERA);
        db.execSQL(TABLE_DELETE_USUARIO);
        db.execSQL(TABLE_DELETE_PLATILLO);
        db.execSQL(TABLE_DELETE_PLATILLORESTAURANTE);
        db.execSQL(TABLE_DELETE_VOTOPLATILLO);
        db.execSQL(TABLE_DELETE_VOTORESTAURANTE);
        db.execSQL(TABLE_DELETE_VISITA);
        onCreate(db);
    }
}
