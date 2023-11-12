/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class JDBCUsuario implements UsuarioDAO {

    // Mirar bien como hacer esto de la conexión teniendola en una clase aparte.
    public JDBCUsuario() {
    }

    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String BBDD = "usuarios";
    private final String USERDB = "root";
    private final String PASSDB = null;
    private Connection conexion;
     
    public Connection conectarBBDD() {
        try {
            Connection conexion = DriverManager.getConnection(URL + BBDD, USERDB, PASSDB); // Conexion con la base de datos
            return conexion;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos");
            return null;
        }        
    }

    public boolean desconectarBBDD() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al desconectar la base de datos");
            return false;
        }
        return true;
    }

    @Override
    public boolean altaUsuario(Usuario user) {
        try (Connection conexion = conectarBBDD()) {                        
            Statement stm = conexion.createStatement();
            if (user.isInfo()) {
                stm.executeUpdate("INSERT INTO usuarios VALUES ('"+ user.getUsuario() +"','"+user.getContraseña() +"')");
                stm.executeUpdate("INSERT INTO infousuarios (Usuario, nombre, apellidos, fechaNacimiento, email) VALUES ('"
                        + user.getUsuario() + "', '" + user.getNombre() + "', '" + user.getApellido() + "', '" + user.getFechaNac() + "', '"
                        + user.getEmail() + "' )");
            } else {
                stm.executeUpdate("INSERT INTO usuarios (Usuario, Password) VALUES ('" + user.getUsuario() + "', '" + user.getContraseña() + "')");
            }
            stm.close();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario, inentelo de nuevo");
            return false;
        }

        return true;
    }

    @Override
    public boolean buscarUsuario(String username, String pass) {        
        try(Connection conexion = conectarBBDD()) {                        
            Statement stm = conexion.createStatement(); 
            ResultSet rs = stm.executeQuery("SELECT usuario, password FROM usuarios WHERE usuario = '" + username + "' AND password = '" + pass + "'");
            if (rs.next()) { //Si devuelve true es que hay registro
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario.");
            return false;
        }
    }

    @Override
    public boolean buscarUsuario(String username) {
        try (Connection conexion = conectarBBDD()) {                        
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery("SELECT Usuario FROM usuarios WHERE Usuario = '" + username + "'");
            if (rs.next()) { //Si devuelve true es que hay registro
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario.");
            return false;
        }
    }

    @Override
    public boolean actualizarPassword(String username, String nuevaPass) {
        try (Connection conexion = conectarBBDD()) {                        
            Statement stm = conexion.createStatement();
            stm.executeUpdate("UPDATE usuarios SET Password = '" + nuevaPass + "' WHERE Usuario = '" + username + "'");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cambiar la contraseña, inentelo de nuevo.");
            return false;
        }
        return true;
    }

}
