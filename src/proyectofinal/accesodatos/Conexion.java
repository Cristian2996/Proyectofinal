/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.accesodatos;
import java.sql.*;
import java.util.List;

public class Conexion {

    final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String URL = "jdbc:sqlserver://192.168.100.7:1433;databaseName=ProyectoFinal";
    final String USER = "Cristian1";
    final String PASS = "1234";
    Connection con = null;

    public void conectar() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver: "
                    + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de sql: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido al conectar: "
                    + e.getMessage());
        }
    }

    public ResultSet ejecutaQuery(String sql, List<Parametro> lst) {
        ResultSet rst = null;
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            if (lst != null) {
                for (Parametro p : lst) {
                    if (p.getValor() instanceof java.util.Date) {
                        pstm.setObject(p.getPosicion(),
                        new java.sql.Date(((java.util.Date) p.getValor())
                                .getTime()));
                    } else {
                        pstm.setObject(p.getPosicion(), p.getValor());
                    }

                }
            }
            rst = pstm.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en ejecución: "
                    + e.getMessage());
        }
        return rst;
    }

    public int ejecutaComando(String sql, List<Parametro> lst) {
        int numFilasAfectadas = 0;
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            if (lst != null) {
               for (Parametro p : lst) {
                  if (p.getValor() instanceof java.util.Date) {
                    pstm.setObject(p.getPosicion(),
                    new java.sql.Date(((java.util.Date) p.getValor())
                           .getTime()));
                   } else {
                       pstm.setObject(p.getPosicion(), p.getValor());
                   }
               }
            }
            numFilasAfectadas = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en ejecución: "
                    + e.getMessage());
        }
        return numFilasAfectadas;
    }

    public void desconectar() {
        try {
            if (con != null) {
                if (!con.isClosed()) {
                    con.close();
                }
            }
        } catch (Exception e) {
            System.out.println("Error desconocido al desconectar:"
                    + e.getMessage());
        }
    }
}

