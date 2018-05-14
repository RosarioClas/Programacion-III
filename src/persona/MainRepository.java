
package persona;

import java.util.List;

public class MainRepository {
    
    public static void main(String[] args) {
        
        PersonaRepository pr = new PersonaRepository();
        
        Persona pr4 = new Persona (1004, "Freddy", "Guayaquil", 16);
        Persona pr5 = new Persona (1005, "Gabriela", "Guayaquil", 15);
        Persona pr6 = new Persona (1006, "Luis", "Guayaquil", 50); 
        
        //pr.getAgregar(pr4);
        //pr.getAgregar(pr5);
        //pr.getAgregar(pr6);
        
        Persona result = pr.getPersona(1001);
        
        
        List<Persona> list = pr.getPersonas();
        for (Persona persona: list ){
        System.out.println(persona);
        }
        System.out.println("");
        System.out.println(result);
        
        String filtro="r";
        System.out.println("Busqueda por filtro:"+ filtro);
        List<Persona>listFilter=pr.getPersonaPorNombre(filtro);
        System.out.println(listFilter);
        
        System.out.println(" ");
        
      
        
        List<Persona>listFilterE=pr.getPorRangoEdad(19, 41);
        System.out.println(listFilterE);
       
        
    // Persona result =pr.getPorRangoEdad(19, 41);
  
        
    }
}
