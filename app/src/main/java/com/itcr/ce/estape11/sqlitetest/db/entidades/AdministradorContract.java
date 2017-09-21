package com.itcr.ce.estape11.sqlitetest.db.entidades;

import android.provider.BaseColumns;

/**
 * Created by estape11 on 9/19/17.
 */

public class AdministradorContract {

    private AdministradorContract() {}

    public static class AdmiEntry implements BaseColumns {
        public static final String TABLE_NAME = "Administrador";
        public static final String COLUMN_NAME_ID = "IdAdministrador";
        public static final String COLUMN_NAME_NOMBRE = "Nombre";
        public static final String COLUMN_NAME_APELLIDO = "Apellido";
        public static final String COLUMN_NAME_EMAIL = "Email";
        public static final String COLUMN_NAME_PASSWORD = "Password";
        public static final String COLUMN_NAME_IDRESTAURANTE = "IdRestaurante";
    }

}
