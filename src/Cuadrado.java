package src;
public class Cuadrado{
    public static void main(String[] args){
    Cuadrado cuadrado = new Cuadrado(4);  
        System.out.println("El lado es: "+ cuadrado.getLado());
        System.out.println("El area es: "+ cuadrado.area());
        System.out.println("El perimetro es: "+ cuadrado.perimetro());
}
private double lado;
public Cuadrado(double lado){
    this.lado = lado;
}
public double getLado(){
    return lado;
}
public void setLado(double lado){
    this.lado = lado;

}
public double area(){
    return lado*lado;
}

public double perimetro(){
    return lado*4;
}
}

