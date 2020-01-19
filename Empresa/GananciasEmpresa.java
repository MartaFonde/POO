import java.util.Scanner;

public class GananciasEmpresa{ 
    public static void modificacionDatos(Empresa empresa){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Modificar datos directivo");
            System.out.println("2. Modificar datos empleado 1");
            System.out.println("3. Modificar datos empleado 2");
            System.out.println("4. Salir");
            opcion=sc.nextInt();
            switch(opcion){
                case 1: empresa.directivo.introduccionDatos();
                break;
                case 2: empresa.empleado1.introduccionDatos();
                break;
                case 3: empresa.empleado2.introduccionDatos();
                break;
            }
        }while(opcion!=4);
    }

    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Directivo directivo =  new Directivo();
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empresa empresa = new Empresa(directivo, empleado1, empleado2, 10000);
        int opcion;
        int opcion2;
        float cobro;
        
        System.out.println("=== Empleado 1 ===");
        empresa.empleado1.introduccionDatos();
        System.out.println("=== Empleado 2 ===");
        empresa.empleado2.introduccionDatos();
        System.out.println("=== Directivo ===");
        empresa.directivo.introduccionDatos();
        
        do{
            System.out.println("---OPCIONES---");
            System.out.println("1. Ver datos empleados");
            System.out.println("2. Ver datos directivo");
            System.out.println("3. Modificar datos");
            System.out.println("4. Pagar");
            System.out.println("5. Cobrar");
            System.out.println("6. Salir");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    do{
                        System.out.println("1. Ver nombre y apellidos");
                        System.out.println("2. Ver edad");
                        System.out.println("3. Ver DNI");
                        System.out.println("4. Ver salario anual e IRPF");
                        System.out.println("5. Ver todos los datos");
                        System.out.println("6. Salir");
                        opcion2=sc.nextInt();
                        switch(opcion2){
                            case 1: 
                                    System.out.println("=== Empleado 1 ===");
                                    empresa.empleado1.mostrarDatos(opcion2);
                                    System.out.println("=== Empleado 2 ===");
                                    empresa.empleado2.mostrarDatos(opcion2);
                                break;
                            case 2: 
                                    System.out.println("=== Empleado 1 ===");
                                    empresa.empleado1.mostrarDatos(opcion2);
                                    System.out.println("=== Empleado 2 ===");
                                    empresa.empleado2.mostrarDatos(opcion2);
                                break;
                            case 3: 
                                    System.out.println("=== Empleado 1 ===");
                                    empresa.empleado1.mostrarDatos(opcion2);
                                    System.out.println("=== Empleado 2 ===");
                                    empresa.empleado2.mostrarDatos(opcion2);
                                break;
                            case 4: 
                                    System.out.println("=== Empleado 1 ===");
                                    empresa.empleado1.mostrarDatos(opcion2);
                                    System.out.println("=== Empleado 2 ===");
                                    empresa.empleado2.mostrarDatos(opcion2);
                                break;
                            case 5: 
                                    System.out.println("=== Empleado 1 ===");
                                    empresa.empleado1.mostrarDatos();
                                    System.out.println("=== Empleado 2 ===");
                                    empresa.empleado2.mostrarDatos();
                                break;
                        }
                    }while(opcion2!=6);
                    break;
                    
                case 2: empresa.directivo.mostrarDatos(empresa.getGanancia());
                    break;
                case 3: 
                    modificacionDatos(empresa);
                    break;
                case 4:
                    System.out.printf("Ganancias antes de pago: %.2f\n", empresa.getGanancia());
                    empresa.setGanancia(-1*(empresa.empleado1.getSalarioAnual()+empresa.empleado2.getSalarioAnual()));
                    empresa.setGanancia(-(empresa.directivo.ganancia((float)empresa.getGanancia())));
                    System.out.printf("Ganancias después de pago: %.2f\n", empresa.getGanancia());
                    break;
                case 5:
                    System.out.printf("Ganancias antes de cobro: %.2f\n", empresa.getGanancia());
                    System.out.print("Introduce cobro: ");
                    cobro=sc.nextFloat();
                    empresa.setGanancia(cobro);
                    System.out.printf("Ganancias después de cobro: %.2f\n", empresa.getGanancia());
                    break;
            }
        }while(opcion!=6);
        

    }
}
