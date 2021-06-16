package src;
public class Contador{
    private int cont;
    public static void main(String[] args){
    Contador c = new Contador(0);

}
 //constructor por defecto
public Contador(){
}
//constructor con parametros
public contador(int contador){
    if (cont <0) {
        this.cont=0;
    } else {
        this.cont = cont;
    }
}
//constructor copia
public Contador(final Contador c){
    cont  = c.cont;
}
public int getCont(){
    return cont;
}
public void setCont(int cont){
    if (cont <0){
        this.cont = 0;
    }else {
        this.cont = cont;
    }
}
public void incrementar(){
    cont++;
}
public void decrementar(){
    cont--;
}
 
  
}
