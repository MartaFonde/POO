package principal;
import java.util.Scanner;
import java.util.ArrayList;
import geometria.*;
import interfaz.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Figura> col = new ArrayList<Figura>();
        Libreria l= new Libreria();
        int opcion;

        do{
            System.out.println("=== MENÚ DE OPCIONES ===");
            System.out.println("INSERTAR:");
            System.out.println("1. Linea");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Circunferencia");
            System.out.println("MOSTRAR:");
            System.out.println("5. Elementos de la colección");
            System.out.println("6. Mostrar datos de un elemento");
            System.out.println("7. Salir");
            opcion=Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1: 
                    Linea linea = new Linea(new Punto(), new Punto());
                    linea.pedirDatos();
                    col.add(linea);
                    break;
                case 2:
                    Poligono triangulo = new Poligono();
                    triangulo.pedirDatos();
                    col.add(triangulo);
                    break;
                case 3:
                    Poligono cuadrado = new Poligono("cuadrado", new Punto(), 4);
                    cuadrado.pedirDatos();
                    col.add(cuadrado);
                    break;
                case 4:
                    Circunferencia circunferencia = new Circunferencia();
                    circunferencia.pedirDatos();
                    col.add(circunferencia);
                    break;
                case 5:
                    System.out.println("- Elementos colección -");
                    for(Figura i: col){
                        System.out.println(i.getNombre());
                    }
                    System.out.println();
                    break;
                case 6:
                    int indice=0;
                    boolean error=false;
                    do{
                        System.out.println("- Índice -");
                        indice=l.pedirEntero();
                        try{
                            col.get(indice).mostrarDatos();
                        } catch(IndexOutOfBoundsException e){
                            System.out.println("El índice no existe en la colección");
                            System.out.println("Tamaño de la colección: "+col.size());
                            error=true;
                        }
                    }while(error && col.size()>0); //repite se existe algo na col e salta error
                    break;
                case 7: System.out.println("Abur!");
                    break;
                default: System.out.println("Opción no válida");
            }
        }while(opcion!=7);
    }
}