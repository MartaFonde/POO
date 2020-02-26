package geometria;
import interfaz.*;
import java.util.Scanner;

public class Figura implements InterfazUsuario{
    protected Punto origen;
    private String nombre;
    Scanner sc=new Scanner(System.in);
    Libreria l = new Libreria();

    /**
     * Inicializa las propiedades origen con las coordenadas (x,y) y nombre con los parámetros dados
     * @param x coordenada x de punto origen
     * @param y coordenada y de punto origen
     * @param nombre nombre
     */
    public Figura(double x, double y, String nombre){
        this.origen = new Punto(x,y);
        setNombre(nombre);
    }

    
    public Figura(Punto origen, String nombre){
        this.origen=origen;
        setNombre(nombre);
    }


    /**
     * Inicializa las propiedades origen y nombre a (0,0) y ""
     */
    public Figura(){
        this(0,0, "");  
    }

    /**
     * Establece la propiedad nombre con mayúsculas y sin espacios extremos
     * @param nombre nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre.toUpperCase().trim();
    }
    
    public String getNombre(){
        return nombre;
    }

    /**
     * Introduce datos que pide al usuario nombre y posición origen de la figura 
     */
    @Override
    public void pedirDatos() {
        System.out.println("Introduce nombre");
        setNombre(sc.nextLine()); 
        System.out.println("Punto origen: ");
        this.origen = new Punto(l.pedirReal(), l.pedirReal());
    }

    /**
     * Muestra propiedades origen y nombre
     */
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Punto origen: "+origen); // TODO mostrar coordenadas

        //System.out.println("Punto origen: "+origen); muestra puntero
        //Solucion: sobreescribir toString() en clase Punto
        //ó System.out.println("Punto origen: "+origen.x);
        //System.out.println("Punto origen: "+origen.y);
    }

}