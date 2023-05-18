import java.util.Scanner;

// Dado una edad, poner si es menor de edad, mayor de edad o ha puesto un número erróneo.

public class Edad {
    public void asd(){
        Scanner leerTeclado = new Scanner(System.in);
        int Edad;
        do{
            System.out.println("Escribe tu edad con un número");
            Edad = leerTeclado.nextInt();
            if(Edad < 0 || Edad > 130){
                System.out.println("La metiste mal, bobo.");
            }
        } while(Edad < 0 || Edad > 130);
        if (Edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}