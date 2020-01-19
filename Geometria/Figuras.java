import java.util.Scanner;
public class Figuras{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double base, altura;
        int opcion;

        System.out.printf("Opciones:\n1.Rectángulo\n2.Triángulo\n");
        opcion=sc.nextInt();

        if(opcion==1){
            System.out.println("Introduce base y altura");
            base=sc.nextDouble();
            altura=sc.nextDouble();
            Geometria rectangulo = new Geometria(true, base, altura);
            System.out.printf("Área: %f\nPerímetro: %f\nDiagonal: %f\n", rectangulo.area(), rectangulo.perimetro(), rectangulo.diagonal());
        } else {
            System.out.println("Introduce base y altura");
            base=sc.nextDouble();
            altura=sc.nextDouble();
            Geometria triangulo = new Geometria(false, base, altura);
            System.out.printf("Área: %f\nPerímetro: %f\nDiagonal: %f\n", triangulo.area(), triangulo.perimetro(), triangulo.diagonal());
        }       
    }
}