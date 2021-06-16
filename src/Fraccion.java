package src;
public class Fraccion {
    public static void main(String[] args) {
        Fraccion Fraccion = new Fraccion(3.2, 4.2);
        System.out.println("La suma es "+Fraccion.sumar());
        System.out.println("La resta es "+Fraccion.resta());
        System.out.println("La multiplicacion es "+Fraccion.multiplicar());
        System.out.println("La division es "+Fraccion.dividir());
    }
    private double primerNumero;
    private double segundoNumero;
    public Fraccion(double primerNumero, double segundoNumero){
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }
    public double getPrimerNumero(){
        return this.primerNumero;
    }
    public double getSegundoNumeor(){
        return this.segundoNumero;
    }
    public void setPrimerNumero(double primerNumero){
        this.primerNumero = primerNumero;
    }
    public void setSegundoNumero(double segundoNumero){
        this.segundoNumero = segundoNumero;
    }

    public double sumar(){
        return this.primerNumero + this.segundoNumero;
    }
    public double resta(){
        return this.primerNumero - this.segundoNumero;
    }
    public double multiplicar(){
        return this.primerNumero * this.segundoNumero;
    }
    public double dividir(){
        if (this.segundoNumero!=0) {
            return this.primerNumero / this.segundoNumero;
        }else{
            return 0;
        }
    }
}