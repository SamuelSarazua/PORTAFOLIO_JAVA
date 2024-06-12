package calculadora;

import java.util.Scanner;

public class Mate {
    //AQUI SE IMPRIME EL LISTADO
    public static void cargarOperaciones() {
        String[] listaDeOperaciones = {
                "Suma", "Resta",
                "Multiplicacion", "Division",
        };

        //AQUI EL LISTADO SALE EN 2 COLUMNAS Y ORDENADO
        for (int i = 0; i < listaDeOperaciones.length; i++) {
            System.out.printf("[%d] %s  ", i + 1, listaDeOperaciones[i]);

            //SI LA PALABRA ES MENOR A LA CANTIDAD DE LETRAS SE IMPRIME EN FILA
            for (int j = 0; j < (14 - listaDeOperaciones[i].length()); j++) {
                System.out.print(" ");
            }

            //SI LA PALABRA ES MAYOR A LA CANTIDAD DE LETRAS HACE UN SALTO DE LINEAS
            if ((i + 1) % 2 == 0) {
                System.out.println(" ");
            }
        }

        //ESTE SCANNER NOS PERMITE SELECCIONAR UNA DE LAS 4 OPCIONES
        Scanner intOpcion2 = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion2 = intOpcion2.nextInt();
        System.out.println("----------------------------------------------");

        //MUESTRA LA OPERACION QUE SELECCIONAMOS JUNTO CON LA RESPUESTA
        switch (opcion2){
            case 1:
                //SE COLOCA LA RESPUESTA DEL METODO
                Mate.operacion1();
                break;
            case 2:
                //SE COLOCA LA RESPUESTA DEL METODO
                Mate.operacion2();
                break;
            case 3:
                //SE COLOCA LA RESPUESTA DEL METODO
                Mate.operacion3();
                break;
            case 4:
                //SE COLOCA LA RESPUESTA DEL METODO
                Mate.operacion4();
        }


    }

    //ESTE METODO ES EL QUE OPERA Y NOS DA LA SUMA
    public static void operacion1(){

        Scanner intoDato2 = new Scanner(System.in);
        System.out.print("Ingresa tu primer numero: ");
        int n1 = intoDato2.nextInt();
        System.out.print("Ingresa tu segundo numero: ");
        int n2 = intoDato2.nextInt();

        int suma = n1 + n2;
        System.out.println("Suma: " + suma);

    }

    //ESTE METODO ES EL QUE OPERA Y NOS DA LA RESTA
    public static void operacion2(){

        Scanner intoDato2 = new Scanner(System.in);
        System.out.print("Ingresa tu primer numero: ");
        int n1 = intoDato2.nextInt();
        System.out.print("Ingresa tu segundo numero: ");
        int n2 = intoDato2.nextInt();

        int resta = n1 - n2;
        System.out.println("Resta: " + resta);

    }

    //ESTE METODO ES EL QUE OPERA Y NOS DA LA MULTIPLICACION
    public static void operacion3(){

        Scanner intoDato2 = new Scanner(System.in);
        System.out.print("Ingresa tu primer numero: ");
        int n1 = intoDato2.nextInt();
        System.out.print("Ingresa tu segundo numero: ");
        int n2 = intoDato2.nextInt();

        int multi = n1 * n2;
        System.out.println("Multiplicacion: " + multi);

    }

    //ESTE METODO ES EL QUE OPERA Y NOS DA LA DIVISION
    public static void operacion4(){

        Scanner intoDato2 = new Scanner(System.in);
        System.out.print("Ingresa tu primer numero: ");
        int n1 = intoDato2.nextInt();
        System.out.print("Ingresa tu segundo numero: ");
        int n2 = intoDato2.nextInt();

        int divi = n1 / n2;
        System.out.println("Division: " + divi);

    }

}
