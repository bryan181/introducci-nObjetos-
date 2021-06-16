package src;

public class Principal {
    public static void main(String[] args) {
        Principal ejecutar = new Principal();
    }

    public Principal() {
        Contador Ejercicio1 = new Contador(4);
        Cuadrado Ejercicio2 = new Cuadrado(4);
        Circulo Ejercicio3 = new Circulo(6);
        Rectangulo Ejercicio4 = new Rectangulo(4.3, 8.3);
        Ejercicio5 Ejercicio5 = new Ejercicio5(4);
        Libro Ejercicio6 = new Libro("dunqerke", "nacho", "3 feb 1991");
        Fraccion Ejercicio7 = new Fraccion(1.5, 0.5);
        mostarInformaion(Ejercicio1, Ejercicio2, Ejercicio3, Ejercicio4, Ejercicio5, Ejercicio6, Ejercicio7);
        Contador Ejercicio1_Otro = Ejercicio1;
        Cuadrado Ejercicio2_Otro = Ejercicio2;
        Circulo Ejercicio3_Otro = Ejercicio3;
        Rectangulo Ejercicio4_Otro = Ejercicio4;
        Ejercicio5 Ejercicio5_Otro = Ejercicio5;
        Libro Ejercicio6_Otro = Ejercicio6;
        Fraccion Ejercicio7_Otro = Ejercicio7;

        Ejercicio1_Otro.setContador(4);
        Ejercicio2_Otro.setLado(50);
        Ejercicio3_Otro.setRadio(2);
        Ejercicio4_Otro.setAncho(5);
        Ejercicio4_Otro.setLargo(4);
        Ejercicio5_Otro.setContar(4);
        Ejercicio6_Otro.setAutor("dunqerke (estados unidos)");
        Ejercicio6_Otro.setNombre("nacho (guatemala)");
        Ejercicio6_Otro.setFechaPublicacion("3 feb 1991");
        Ejercicio7_Otro.setPrimerNumero(5);
        Ejercicio7_Otro.setSegundoNumero(6);

        mostarInformaion(Ejercicio1, Ejercicio2, Ejercicio3, Ejercicio4, Ejercicio5, Ejercicio6, Ejercicio7);
    }

 
    public void mostarInformaion(Contador Ejercicio1, Cuadrado Ejercicio2, Circulo Ejercicio3, Rectangulo Ejercicio4,Ejercicio5 Ejercicio5, Libro Ejercicio6, Fraccion Ejercicio7) {
        espacios();
        System.out.println("Primer ejercicio contador " + Ejercicio1.getContador());
        System.out.println("El area del ejercicio dos " + Ejercicio2.area());
        System.out.println("El perimetro del ejercicio dos  " + Ejercicio2.perimetro());
        System.out.println("El area del ejercicio tres  " + Ejercicio3.area());
        System.out.println("El perimetro del ejercicio tres  " + Ejercicio3.perimetro());
        System.out.println("El area del ejercicio cuarto  " + Ejercicio4.area());
        System.out.println("El perimetro ejercicio cuarto  " + Ejercicio4.perimetro());
        System.out.println("El contador del ejercicio quinto  " + Ejercicio5.getContar());
        System.out.println("La informacion del ejercicio sexto nombre  " + Ejercicio6.getNombre() + " autor  "
                + Ejercicio6.getAutor() + " fecha  " + Ejercicio6.getFechaPUblicion());
        System.out.println("Las operaciones del ejercicio septimo, suma  " + Ejercicio7.sumar() + " multiplicar  "
                + Ejercicio7.multiplicar() + " division  " + Ejercicio7.dividir());
        espacios();

    }
    public void espacios(){
        for (int i = 0; i < 50; i++) {
            System.out.print("#");
        }
        System.out.println(" ");
    }
}