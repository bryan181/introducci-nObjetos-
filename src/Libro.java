package src;
public class Libro {
    public static void main(String[] args) {
        Libro nuevo = new Libro("Como pensar en grande", "Bryan", "2021/06/5");
        System.out.println("El nombre del ligro es "+nuevo.getNombre()+" el autor fue "+nuevo.getAutor()+" la fecha que fue postiado fue "+nuevo.getFechaPUblicion());
    }
    private String nombre;
    private String autor;
    private String fechaPublicacion;
    public Libro (String nombre,String autor, String fechaPublicion){
        this.nombre = nombre;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getFechaPUblicion(){
        return this.fechaPublicacion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setFechaPublicacion(String fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
}