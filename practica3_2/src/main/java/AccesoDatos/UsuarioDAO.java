/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AccesoDatos;

import Modelo.Usuario;

/**
 *
 * @author victo
 */
public interface UsuarioDAO {
    
    public abstract  boolean altaUsuario(Usuario user);
    public abstract boolean buscarUsuario (String username, String pass);
    public abstract boolean buscarUsuario (String usernname);
    public abstract boolean actualizarPassword (String user, String nuevaPass);
    
}
