
package persona;

public class Persona {
    private int id;
    private String nombre;
    private String localizacion;
    private int edad;
    
    public Persona(){}

    public Persona(int id, String nombre, String localizacion, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.edad = edad;
    }

    public Persona(int id) {
        this.id = id;
    }

    public Persona(int id, int edad) {
        this.id = id;
        this.edad = edad;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   
   @Override
   public String toString(){
       return "id: "+ id + " nombre:"+ nombre + " localizacion: " + localizacion + " edad: " + edad;
   } 
  
}
