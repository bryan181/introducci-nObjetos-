package src;
public class Rectangulo{
    public static void main(String[] args){
    Rectangulo rectangulo = new Rectangulo(2.8,3.8);
    }
    System.out.println("El area del rectangulo es "+rectangulo.area());
        System.out.println("El perimetro del rectangulo es "+rectangulo.perimetro());
    }
    private double ancho;
    private double largo;
    public Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }
    public double area (){
        return this.ancho * this.largo;
    }
    public double perimetro(){
        return (2* this.ancho)*(2*this.largo);
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }
}