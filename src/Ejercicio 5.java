
package src;
public class Ejercicio5 {
    public static void main(String[] args) {
        Ejercicio5 contadornuevo = new Ejercicio5(4);
        System.out.println("El resultado del contador con el metodo get"+contadornuevo.getContar());
        nuevoObjeto.setContar(7);
        System.out.println("Cambiar el resultado del contador con el metodo set"+contadornuevo.getContar());
    }
    private double contar;
    public Ejercicio5(double contar){
        this.contar = contar;
    }
    public double getContar(){
        return this.contar;
    }
    public void setContar(double contar){
        this.contar = contar;
    }
}