package com.itcr.ce.estape11.sqlitetest.db.entidades;

import android.provider.BaseColumns;

/**
 * Created by estape11 on 9/19/17.
 */

public class CarreraContract {

    private CarreraContract(){}

    public static class CarreraEntry implements BaseColumns {
        public static final String TABLE_NAME = "Carrera";
        public static final String COLUMN_NAME_ID = "IdCarrera";
        public static final String COLUMN_NAME_NOMBRE = "Nombre";
    }
}
