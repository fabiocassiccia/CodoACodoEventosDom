
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabio
 */
public class actividadObligatoriaModulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        String edad = "";
        String hobbie = "";
        String editor = "";
        String sistemaOperativo = "";
        System.out.println("Bienvenido nuevo Usuario!");
        System.out.println("Por favor, ingrese su nombre:");
        nombre = scanner.next();
        System.out.println("Por favor, ingrese su apellido:");
        apellido = scanner.next();
        System.out.println("Por favor, ingrese su edad:");
        edad = scanner.next();
        System.out.println("Por favor, ingrese algun hobbie:");
        hobbie = scanner.next();
        System.out.println("Por favor, ingrese su editor de código de preferencia:");
        editor = scanner.next();
        System.out.println("Por favor, ingrese su sistema operativo:");
        sistemaOperativo = scanner.next();
        System.out.println("Bienvendio nuevamente " + nombre + " " + apellido + " !!");
        System.out.println("Por favor, verifique sus datos ingresados:");
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nHobbie: " + hobbie + "\nEditor de prefencia: " + editor + "\nSistema Operativo: " + sistemaOperativo);
        System.out.println("En caso de ser incorrectos, por favor, vuelva a realizar la operación. Muchas gracias.");
    }
}
