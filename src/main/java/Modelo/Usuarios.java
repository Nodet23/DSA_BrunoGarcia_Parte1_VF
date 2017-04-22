package Modelo;

import com.sun.prism.Texture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by B on 19/4/17.
 */
public class Usuarios {
    private String nombre;
    private int edad;


    private ArrayList<Objetos> Lobjetos = new ArrayList<Objetos>();

    public Usuarios() {
    }

    public Usuarios(String name, int edad){
        this.nombre= name;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Objetos> getLobjetos() {
        return Lobjetos;
    }

    public void setLobjetos(ArrayList<Objetos> lobjetos) {
        Lobjetos = lobjetos;
    }

    /*public List<Objetos> devolverListaUsuarios(){  // este fue mi getter, ahora lo he puesto de forma standard
            return this.Lobjetos;
        }*/

    public void AnyadirObjeto(Objetos objetoxraanyadir) {
        Lobjetos.add(objetoxraanyadir);
    }

    public int numeroObjetos(){return Lobjetos.size();}


}