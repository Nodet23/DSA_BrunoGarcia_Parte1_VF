package Vista;

import Controlador.EtakemonManager;
import Controlador.EtakemonManagerImpl;
import Modelo.Objetos;
import Modelo.Usuarios;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.StaticHttpHandler;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nodet on 19/4/17.
 */
public class Main {


    public static void main(String[] args) throws Exception {
        // PARTE 1
        EtakemonManagerImpl controlador = EtakemonManagerImpl.getInstance();
        Usuarios user1 = new Usuarios("Bruno", 23);
        Usuarios user2 = new Usuarios("Juan", 24);
        Usuarios user3 = new Usuarios("Alvaro", 38);
        Usuarios user4 = new Usuarios("Misaki", 21);
        Usuarios user5 = new Usuarios("Z-Misaki", 21);
        controlador.AnyadirUsuario(user2);
        controlador.AnyadirUsuario(user1);
        controlador.AnyadirUsuario(user3);
        controlador.AnyadirUsuario(user4);
        controlador.AnyadirUsuario(user5);
        Objetos miobjeto = new Objetos("hola");
        Objetos miobjeto2 = new Objetos("hola3");
        controlador.AnyadirObjetoaUsuario("Bruno", miobjeto);
        controlador.AnyadirObjetoaUsuario("Bruno", miobjeto2);
        String palabra = controlador.infoUsuario("Bruno");
        List<Objetos> milistaobjetos = controlador.ObjetosUsuarios("Bruno");
        ArrayList<String> milistausuarios = controlador.ListaUsuarios();


    }

}
