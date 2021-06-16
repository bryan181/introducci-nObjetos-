package src;
public class Circulo{
    public static void main(String[] args){
    Circulo circulo = new Circulo(1);
    System.out.println("El area del circulo es "+ circulo.areaC());
     System.out.println("El perimertro del circulo es "+circulo.perimetroC());
}
private double radioC;
public Circulo (double radioC){
    this.radioC = radioC;
}
public double getradioC(){
    return radioC;
}
public void setradioC(double radioC){
    this.radioC = radioC;
}
public double areaC(){
    return 3.1416*(radioC*radioC);
}

public double perimetroC(){
    return 2*(radioC*3.1416);
}

}