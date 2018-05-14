
package persona;

public class Objetos {
    public static void sumarEdad(Persona persona){
    persona.setEdad(persona.getEdad()+1);
    }
    public static void sumarEdad(int val){
    val++;
    }
    public static void main(String[] args) {
        Persona pr1 = new Persona(1001);
        pr1.setNombre("Andy");
        pr1.setLocalizacion("Guayaquil");
        pr1.setEdad(21);
        
        Persona pr2 = new Persona (1002, "Gabriel", "Manta", 25);
        Persona pr3 = new Persona (1003, "Gabriela", "Manta", 26);
        
        Persona pr4 = pr1;
        pr2 =pr4;
        pr3 = pr2;
        pr4.setEdad(10);
        
        
        sumarEdad(pr1);
        pr1.setEdad(pr1.getEdad()+3);
        pr4 =new Persona  (1,55);
        sumarEdad(pr4);
        sumarEdad(pr2);
        
        
        System.out.println(pr1);
        System.out.println(pr4);
        System.out.println(pr2);
       System.out.println(pr3);
       
        System.out.println();
        int edad1=10, edad2=20, edad3= 30;
        edad1 = edad2;
        edad1++;
        sumarEdad(edad2);
        
        System.out.println(edad1);
        System.out.println(edad2);
        System.out.println(edad3);
//        System.out.println(pr3);
    }
} 
