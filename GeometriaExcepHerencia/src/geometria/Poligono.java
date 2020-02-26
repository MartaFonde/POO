package geometria;
import java.util.Scanner;

public class Poligono extends Figura{
    Scanner sc=new Scanner(System.in);
    public Punto[] puntos;

    /**
     * Inicializa las propiedades nombre, punto de origen. 
     * Declara, con un tamaño, el array puntos.
     * @param nombre nombre
     * @param origen punto origen
     * @param cantPuntos tamaño array puntos
     */
    public Poligono(String nombre, Punto origen, int cantPuntos){
        super(origen, nombre);
        this.puntos=new Punto[cantPuntos];
    }

    /**
     * Inicializa un polígono "triángulo" con unos puntos 
     */
    public Poligono(){
        this("triángulo", new Punto(2.5,2.5), 3);
        this.puntos[0]=new Punto(0,0);
        this.puntos[1]=new Punto(5,0);
        this.puntos[2]=new Punto(2.5,5);
    }

    /**
     * Pide nombre, punto de origen y puntos del polígono al usuario
     */
    @Override
    public void pedirDatos(){
        super.pedirDatos();
        System.out.println("== Introduce los puntos del polígono ==");
        for(int i=0; i<puntos.length; i++){
            System.out.print("Punto "+(i+1)+": ");
            this.puntos[i]=new Punto(l.pedirReal(), l.pedirReal());
            System.out.println();
        }
    }

    /**
     * Muestra el nombre, punto de origen y los puntos del polígono
     */
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("== Los puntos del polígono son:");
        for(Punto i: puntos){
            System.out.println(i);
        }
    }
}
