package src;
public class Contador {
    public static void main(String[] args) {
        Contador contadorUno = new Contador(4);
        Contador modificar = contadorUno;

        System.out.println(modificar.getContador());
        modificar.incrementear();
        System.out.println("el incremento con el metodo es:");
        System.out.println(modificar.getContador());
        modificar.decrementar();
        System.out.println("el decremento es:");
        System.out.println(modificar.getContador());

    }
    private int contador = 0;
    public Contador(int contador){
        this.contador = contador;
    }
    public void setContador(int contador){
        this.contador = contador;
    }
    public int getContador(){
        return this.contador;
    }
    public int incrementear(){
        return contador ++;
    }
    public int decrementar(){
        return contador --;
    }
}