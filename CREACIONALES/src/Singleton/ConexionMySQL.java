/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Hector
 */
public class ConexionMySQL{
    
    private static ConexionMySQL conexion;

    private ConexionMySQL() {
        System.out.println("Se ha conectado con la base de datos MySQL");
    }    
    
    public static synchronized ConexionMySQL obtenerConexion() {
        if(conexion == null){
            conexion = new ConexionMySQL();
        }
        return conexion;
    }

    public void cerrarConexion() {
        System.out.println("Cerrando Conexión MySQL");
    }
    
}
