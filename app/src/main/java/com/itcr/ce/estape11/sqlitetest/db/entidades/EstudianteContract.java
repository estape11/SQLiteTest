package com.itcr.ce.estape11.sqlitetest.db.entidades;

/**
 * Created by estape11 on 9/19/17.
 */

public class EstudianteContract {

    private EstudianteContract(){}

    public static class EstuEntry{
        public static final String TABLE_NAME = "Estudiante";
        public static final String COLUMN_NAME_ID = "carnet";
        public static final String COLUMN_NAME_NOMBRE = "nombre";
        public static final String COLUMN_NAME_APELLIDO = "apellido";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_PASSWORD = "password";
        public static final String COLUMN_NAME_PARTICIPACION = "participacion";
        public static final String COLUMN_NAME_IDCARRERA = "idCarrera";
    }
}
