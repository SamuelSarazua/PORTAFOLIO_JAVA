package conversor;

import java.util.Scanner;

public class Conversor_monedas {
    public static double Calcular(int Dolares) {

        double conversiones = Dolares * 7.76;
        return conversiones;
    }

    public static double Calcular2(int Quetzales){
        double conversiones2 = Quetzales * 0.13;
        return conversiones2;
    }

    public static double Calcular3(int Que_a_pesos) {

        double conversiones3 = Que_a_pesos * 2.39;
        return conversiones3;
    }

    public static double Calcular4(int Pesos_a_que){
        double conversiones4 = Pesos_a_que * 0.42;
        return conversiones4;
    }

    public static void Programa() {
        String[] listaDeOperaciones = {
                "Quetzales a Dolares", "Dolares a Quetzales", "Quetzales a Pesos Mexicanos", "Pesos Mexicanos a Quetzales"
        };

        for (int i = 0; i < listaDeOperaciones.length; i++) {
            System.out.printf("[%d] %s      ", i + 1, listaDeOperaciones[i]);

            for (int j = 0; j < (27 - listaDeOperaciones[i].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println(" ");
            }
        }
        Scanner intOpcion2 = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion2 = intOpcion2.nextInt();
        System.out.println("----------------------------------------------");

        switch (opcion2){
            case 1:
                Conversor_monedas.conversion1_();
                break;
            case 2:
                Conversor_monedas.conversion2_();
                break;
            case 3:
                Conversor_monedas.conversion3_();
                break;
            case 4:
                Conversor_monedas.conversion4_();
                break;
        }
    }



    public static void conversion1_(){
        Scanner intoDato3 = new Scanner(System.in);
        System.out.print("Escribe la cantidad: ");
        int cantidad1 = intoDato3.nextInt();

        double conversion1 =Calcular2(cantidad1);
        System.out.println("La conversion a Dolares es: " + conversion1);
    }

    public static void conversion2_(){
        Scanner intoDato4 = new Scanner(System.in);
        System.out.print("Escribe la cantidad: ");
        int cantidad2 = intoDato4.nextInt();

        double conversion2 =Calcular(cantidad2);
        System.out.println("La conversion a Quetzales es: " + conversion2);
    }

    public static void conversion3_(){
        Scanner intoDato5 = new Scanner(System.in);
        System.out.print("Escribe la cantidad: ");
        int cantidad3 = intoDato5.nextInt();

        double conversion3 =Calcular3(cantidad3);
        System.out.println("La conversion a Pesos es: " + conversion3);
    }

    public static void conversion4_(){
        Scanner intoDato6 = new Scanner(System.in);
        System.out.print("Escribe la cantidad: ");
        int cantidad4 = intoDato6.nextInt();

        double conversion4 =Calcular4(cantidad4);
        System.out.println("La conversion a Quetzales es: " + conversion4);
    }
}

