package com.sanfernando.sanfernando.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class Conexion {

  private Connection con;

  String url = "jdbc:postgresql://localhost:5432/sf-masivo";
  String username = "postgres";
  String password = "123456";
  
  public void startConexion() {
    try{
      Connection con = DriverManager.getConnection(url, username, password);
      this.con = con;
    }catch (SQLException e){
      e.printStackTrace();
    }
  }

  public void closeConexion() {
    try{
      this.con.close();
    }catch (SQLException e){
      e.printStackTrace();
    }
  }
}
