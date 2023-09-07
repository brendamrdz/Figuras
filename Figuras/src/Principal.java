import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Calcular el area del cuadrado
        System.out.println("Ingresa el lado del cuadrado: ");
        double ladoCuadrado = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el color del cuadrado: ");
        String colorCuadrado = sc.nextLine();

        Cuadrado cuadrado = new Cuadrado(ladoCuadrado, colorCuadrado);
        
        System.out.println("El area del cuadrado es:" + cuadrado.calcularArea() + "\nEl color del cuadrado es: " + cuadrado.color());

        //Calcular el area del triangulo
        System.out.println("Ingresa la altura del triangulo: ");
        double alturaTriangulo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa la base del triangulo: ");
        double baseTriangulo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el color del triangulo: ");
        String colorTriangulo = sc.nextLine();
        sc.close();

        Triangulo triangulo = new Triangulo(colorTriangulo, baseTriangulo, alturaTriangulo);
        
        System.out.println("El area del triangulo es:" + triangulo.calcularArea() + "\nEl color del triangulo es: " + triangulo.color());
    }
}

