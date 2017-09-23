package com.itcr.ce.estape11.sqlitetest.db.entidades;

import android.provider.BaseColumns;

/**
 * Created by estape11 on 9/19/17.
 */

public class UsuarioContract {

    private UsuarioContract(){}

    public static class UsuarioEntry implements BaseColumns {
        public static final String TABLE_NAME = "Usuario";
        public static final String COLUMN_NAME_ID = "Carnet";
        public static final String COLUMN_NAME_NOMBRE = "Nombre";
        public static final String COLUMN_NAME_APELLIDO = "Apellido";
        public static final String COLUMN_NAME_EMAIL = "Email";
        public static final String COLUMN_NAME_PASSWORD = "Password";
        public static final String COLUMN_NAME_PARTICIPACION = "Participacion";
        public static final String COLUMN_NAME_IDCARRERA = "IdCarrera";
    }
}
