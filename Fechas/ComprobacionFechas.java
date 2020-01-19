import java.util.Scanner;
public class ComprobacionFechas{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int dia, mes, ano1, ano2;
        Fecha fecha1= new Fecha();

        System.out.println("Introduce una fecha");
        dia=sc.nextInt();
        fecha1.setDia(dia);
        mes=sc.nextInt();
        fecha1.setMes(mes);
        ano1=sc.nextInt();
        fecha1.setAno(ano1);
        
        System.out.println(fecha1.fechaFormateada(true));
        System.out.println(fecha1.fechaFormateada(false));

        System.out.println("Introduce una fecha");
        dia=sc.nextInt();
        mes=sc.nextInt();
        ano2=sc.nextInt();
        Fecha fecha2= new Fecha(dia, mes, ano2);
        
        System.out.println(fecha2.fechaFormateada(true));
        System.out.println(fecha2.fechaFormateada(false));

        System.out.printf("La diferencia en años es: %d\n", Fecha.diferenciaFechas(fecha1, fecha2));

    }
    
}