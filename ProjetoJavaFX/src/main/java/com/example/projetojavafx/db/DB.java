package com.example.projetojavafx.db;
import java.sql.*;

public class DB {

    private static Connection conec = null;

    public static Connection getConnection(){
        if(conec == null){
            try {
                conec = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojavafx", "root", "1234");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conec;
    }
    public static void closeConnection(){
        if(conec != null){
            try {
                conec.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void closeResultSet(ResultSet rs){
        if (rs!= null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void closeStatement(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}




