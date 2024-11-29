/*
create database sistema_reservas;
create table reserva (
    id int auto_increment primary key,
    numeroSala varchar(11) NOT NULL,
    curso varchar(100) NOT NULL,
    disciplina varchar(100) NOT NULL,
    professor varchar(100) NOT NULL,
    data varchar(10) NOT NULL,
    hrEntrada varchar(5) NOT NULL,
    hrSaida varchar(5) NOT NULL,
    informatica tinyint (1) NOT NULL,
    turno varchar(5) NOT NULL);
*/
package com.example.dsjavafinal.Model.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseMySQL implements Database{
    private Connection connection;
    @Override
    public Connection conectar(){
        try{
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_reservas","root","");
            return this.connection;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMySQL.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }

    @Override
    public void desconectar() {
        try{
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMySQL.class.getName()).log(Level.SEVERE,null,ex);
        }


    }
}