import Controlador.EtakemonManagerImpl;
import Modelo.Objetos;
import Modelo.Usuarios;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
/**
 * Created by Nodet on 23/04/2017.
 */
public class TestEtakemonManagerImpl {
    static EtakemonManagerImpl manager = EtakemonManagerImpl.getInstance();
    List<Objetos> listaobetos = new ArrayList<Objetos>();
    List<Usuarios> listausuarios = new ArrayList<Usuarios>();
    @BeforeClass
    public static void setUp(){

       Usuarios user1 = new Usuarios("Bruno",23);
       Usuarios user2 = new Usuarios("Marina",22);
        manager.AnyadirUsuario(user1);
        manager.AnyadirUsuario(user2);
        Objetos miobjeto3 = new Objetos("hola3");
        manager.AnyadirObjetoaUsuario("Bruno", miobjeto3);
    }
    @Test
    public void AnyadirUsuario(){
        Usuarios user3 = new Usuarios("Juan",23);
        manager.AnyadirUsuario(user3);
        int i = manager.ListaUsuarios().size();
        assertEquals(3,i);
    }
    @Test
    public void AnyadirObjetoaUsuario(){
        Objetos miobjeto = new Objetos("hola");
        Objetos miobjeto2 = new Objetos("hola3");
        manager.AnyadirObjetoaUsuario("Bruno", miobjeto);
        manager.AnyadirObjetoaUsuario("Bruno", miobjeto2);
        int i = manager.ObjetosUsuarios("Bruno").size();
        assertEquals(3,i);
    }

    @After
    public void tearDown()
    {
    }
}
