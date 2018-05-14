/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Rachel
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
 
public class MenuRepository {
 private List<Persona> personas =new ArrayList<>();
    public static void main(String[] args) {
        PersonaRepository pr = new PersonaRepository();
        Persona persona = new Persona();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
       
        while (!salir) {
 
            System.out.println("1. Ingresar persona");
            System.out.println("2. Buscar por id");
            System.out.println("3. Buscar por rango de edad ");
            System.out.println("4. Buscar por filtro");
            System.out.println("5. Mostrar todos");
            System.out.println("6. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese Id:");
                        persona.setId(sn.nextInt());
                        
                        System.out.println("Ingrese Nombre:");
                        persona.setNombre(sn.next());
                        
                        System.out.println("Ingrese localizacion:");
                        persona.setLocalizacion(sn.next());
                        
                        System.out.println("Ingrese edad:");
                        persona.setEdad(sn.nextInt());
            
                        pr.getAgregar(persona);
                        break;
                    case 2:
                        System.out.println("Ingrese Id:");
                        int i = sn.nextInt();
                        Persona result = pr.getPersona(i);
                        System.out.println(result);
                        break;
                    case 3:
                        System.out.println("Ingrese Rango de edad:");
                        System.out.print("Inicial:");
                        int x = sn.nextInt();
                        System.out.print("Final: ");
                        int y = sn.nextInt();
                    
                        List<Persona> ListFiltro = pr.getPorRangoEdad(x,y);
                        System.out.println(ListFiltro);
                        break;
                    case 4:
                        System.out.println("lAS PERSONAS CON EL FILTRO QUE BUSCA ES ");
                        String nomb = sn.next();
                        List<Persona> ListFilter = pr.getPersonaPorNombre(nomb);
                        System.out.println(ListFilter);
                        break;
                    case 5:
                        pr.getPersonas();
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
 
}
