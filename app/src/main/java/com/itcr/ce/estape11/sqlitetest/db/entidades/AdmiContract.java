package com.itcr.ce.estape11.sqlitetest.db.entidades;

import android.provider.BaseColumns;

/**
 * Created by estape11 on 9/19/17.
 */

public class AdmiContract {

    private AdmiContract() {}

    public static class AdmiEntry implements BaseColumns {
        public static final String TABLE_NAME = "Administrador";
        public static final String COLUMN_NAME_ID = "idAdmi";
        public static final String COLUMN_NAME_NOMBRE = "nombre";
        public static final String COLUMN_NAME_APELLIDO = "apellido";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_PASSWORD = "password";
        public static final String COLUMN_NAME_IDREST = "idRest";
    }
}
