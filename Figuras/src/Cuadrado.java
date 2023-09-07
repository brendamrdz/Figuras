public class Cuadrado extends Figura{
    double lado;

    public Cuadrado(double lado, String color){
        super(color);
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }
}
