package Controlador;

import Modelo.Objetos;
import Modelo.Usuarios;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by B on 19/4/17.
 */
public interface EtakemonManager {
    ArrayList<String> ListaUsuarios();
    void  AnyadirUsuario(Usuarios usuarioxraanyadir);
    void ActualizarUsuario(String nombre,String nuevonombre);
    String infoUsuario(String nombre);
    List<Objetos> ObjetosUsuarios(String nombre);
    void  AnyadirObjetoaUsuario(String nombreusuario, Objetos objeto);



}
