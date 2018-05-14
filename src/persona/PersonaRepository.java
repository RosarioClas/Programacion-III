
package persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonaRepository {
    
    private List<Persona> personas =new ArrayList<>();
    Scanner sn = new Scanner(System.in);
    public PersonaRepository(){
        Persona pr1 = new Persona(1001);
        pr1.setNombre("Andy");
        pr1.setLocalizacion("Guayaquil");
        pr1.setEdad(16);
        
        Persona pr2 = new Persona (1002, "Erick", "Guayaquil", 41);
        Persona pr3 = new Persona (1003, "Rachel", "Guayaquil", 20);
        Persona pr4 = new Persona (1004, "Freddy", "Guayaquil", 19);
       // List<Persona> personas=new ArrayList<>();
        personas.add(pr1);
        personas.add(pr2);
        personas.add(pr3);
        personas.add(pr4);
    }
    
    public void getAgregar(Persona persona){
        personas.add(persona);
      
    }
    public List<Persona>getPersonas(){
        return personas;
    }
    public Persona getPersona (int id){
        for(Persona persona:personas){
            if(persona.getId()==id)
                return persona;
        }
        return null;
    }
    public List<Persona>getPorRangoEdad(int inicio,int fin){
        List<Persona> result =new ArrayList<>();
        for(Persona persona:personas){
            if(persona.getEdad() >= inicio && persona.getEdad() <= fin )
            result.add(persona);
        }
        return result;
    }
    public List<Persona> getPersonaPorNombre(String filtro){
        List<Persona> result = new ArrayList<>();
        for(Persona persona:personas){
            if(persona.getNombre().contains(filtro))
                result.add(persona);
        }
        return result;
    }
    
    public List<Persona> MostrarTodos(){
        List<Persona> result = new ArrayList<>();
        for(int x=0;x<personas.size();x++) {
            System.out.println(personas.get(x));
            }
        return result;
    }
   
}
