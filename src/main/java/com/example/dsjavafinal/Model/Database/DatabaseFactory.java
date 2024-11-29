package com.example.dsjavafinal.Model.Database;

public class DatabaseFactory {
    public static Database getDatabase(String nome){
        if (nome.equals("postgresql")){
            return new DatabasePostgreSQL();
        }else {
            return new DatabaseMySQL();

        }
    }
}

