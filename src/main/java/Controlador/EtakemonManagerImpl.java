package Controlador;
import Modelo.Objetos;
import Modelo.Usuarios;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * Created by BrunoGarcia on 19/4/17.
 */
public class EtakemonManagerImpl implements EtakemonManager{

    private static EtakemonManagerImpl instance;
    private HashMap<String, Usuarios> HashMapUsuarios;
    final static Logger logger = Logger.getLogger(EtakemonManagerImpl.class);

    private EtakemonManagerImpl(){
        HashMapUsuarios = new HashMap<String, Usuarios>();
        logger.info("se ha creado correctamente la lista de usuarios");
    }

    public static EtakemonManagerImpl getInstance(){
        if (instance==null){
            instance= new EtakemonManagerImpl();
        }
        return instance;
    }

    public void AnyadirUsuario(Usuarios usuarioxraanyadir) {
        String nombre = usuarioxraanyadir.getNombre();
        HashMapUsuarios.put(nombre, usuarioxraanyadir);
        logger.info("se ha anyadido"+nombre);

    }
    public void  AnyadirObjetoaUsuario(String nombreusuario, Objetos objeto){  // le paso el nombre por el cual va a buscar al usuario
        Usuarios usuariodummy = HashMapUsuarios.get(nombreusuario);
        usuariodummy.AnyadirObjeto(objeto);
    }
    public void ActualizarUsuario(String nombre,String nuevonombre){
        Usuarios nuevouser = HashMapUsuarios.get(nombre); //puntero que apunta al objeto del mapa
        nuevouser.setNombre(nuevonombre); // al realizar un cambio al usuario, ya cambia dentro del mapa (puntero)
        logger.info("el usuario ha sido actualizado por: "+nuevonombre);
    }

    public String infoUsuario(String nombre){
        int i = HashMapUsuarios.get(nombre).numeroObjetos();
        int edadusuario = HashMapUsuarios.get(nombre).getEdad();
        String cantidad = "El usuario " +HashMapUsuarios.get(nombre).getNombre()+ " tiene "+i+" objetos y su edad es: "+edadusuario;
        logger.info(" "+cantidad);
        return cantidad;

    }

    public List<Objetos> ObjetosUsuarios(String nombre){
        logger.info("se ha devuelto la lista de objetos");
        return HashMapUsuarios.get(nombre).getLobjetos();
    }


    public ArrayList<String> ListaUsuarios(){//ordenar
        ArrayList<String> milista = new ArrayList<String>(HashMapUsuarios.keySet());
        Collections.sort(milista);
        StringBuffer devolver = new StringBuffer();
        for (String s: milista
                ) {
            devolver.append(s);

        }
        logger.info("he devuelto la lista ordenada y es" + devolver);
        return milista;


    }

}
