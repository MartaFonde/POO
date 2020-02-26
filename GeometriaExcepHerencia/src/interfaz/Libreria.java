package interfaz;
import java.util.Scanner;

public class Libreria{
    Scanner sc = new Scanner(System.in);
    private int entero;
    private double real;
    boolean excepcion=false;

    /**
     * Pide un número entero al usuario, si es algo distinto de un entero repite la petición.
     * @return número entero
     * @throws NumberFormatException si la cadena no es convertible a entero
     */
    public int pedirEntero(){ 
        do{
            try{
                System.out.println("Introduce un número entero");
                entero=Integer.parseInt(sc.nextLine());
                excepcion=false;
            } catch (NumberFormatException e){
                System.out.println("La cadena no es convertible a número entero");
                excepcion=true;
            } 
        }while(excepcion == true);
        return entero;
    }

    /**
     * Pide un número real al usuario, si es algo distinto de un real repite la petición.
     * @return número real
     * @throws NumberFormatException si la cadena no es convertible a real
     * @throws NullPointerException si la cadena es nula
     */
    public double pedirReal(){
        do{
            try{
                System.out.println("Introduce un número real");
                real=Double.parseDouble(sc.nextLine());
                excepcion=false;
            } catch (NumberFormatException e){
                System.out.println("La cadena no es convertible a número real");
                excepcion=true;
            } catch (NullPointerException e){
                System.out.println("La cadena es nula");
                excepcion=true;
            }
        }while(excepcion == true);
        return real;
    }
}