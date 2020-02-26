package geometria;
import interfaz.Libreria;

public class Linea extends Figura{
    private Punto puntoFinal;
    Libreria l = new Libreria();

    // public Linea(){}

    /**
     * Inicializa las propiedades punto origen (x,y) y punto final con parámetros dados
     * @param a punto origen
     * @param b punto final
     */
    public Linea(Punto a, Punto b){
        super(a, "Línea");
        this.puntoFinal = b;
    }

    /**
     * Pide posición de punto origen y final al usuario
     */
    @Override
    public void pedirDatos() {
        super.pedirDatos();
        System.out.println("Punto final: ");
        this.puntoFinal = new Punto(l.pedirReal(),l.pedirReal());
    }

    /**
     * Muestra punto origen y punto final
     */
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Punto final: "+puntoFinal);
    }
}