package Fahrenheit_a_centigrados;

import java.util.Scanner;

public class fahrenheit_a_grados_centigrados {
    public static void grados() {

        String[] listaDeGrados = {
                "Fahrenheit / Centigrados", "Centigrados / Fahrenheit",
        };


        for (int i = 0; i < listaDeGrados.length; i++) {
            System.out.printf("[%d] %s  ", i + 1, listaDeGrados[i]);

            for (int j = 0; j < (14 - listaDeGrados[j].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println(" ");
            }
        }

        Scanner intOpcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = intOpcion.nextInt();
        System.out.println("----------------------------------------------");

        switch (opcion){
            case 1:
                programa2();
                break;
            case 2:
                programa1();
                break;
        }



    }

    public static void programa1(){
        Scanner numero1 = new Scanner(System.in);
        System.out.print("Ingresa la temperatura: ");
        int respuesta1 = numero1.nextInt();
        int fahrenheit = respuesta1 * 9 / 5 + 32;
        System.out.println("Fahrenheit = " + fahrenheit);
    }

    public static void programa2(){
        Scanner numero1 = new Scanner(System.in);
        System.out.print("Ingresa la temperatura: ");
        int respuesta1 = numero1.nextInt();
        double fahrenheit = (respuesta1 -32)* 5/9;
        System.out.println("Centigrados = " + fahrenheit);
    }
}
