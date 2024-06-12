package lista;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class lista_de_compras {

    public static String[] opciones6 = {"Lista de Compras", "Salir"};

    //PROGRAMA INICIAL
    public static void programa() {

        for (int i = 0; i < opciones6.length; i++) {
            System.out.printf("[%d] %s  ", i + 1, opciones6[i]);

            //SI LA PALABRA ES MENOR A LA CANTIDAD DE LETRAS SE IMPRIME EN FILA
            for (int j = 0; j < (16 - opciones6[i].length()); j++) {
                System.out.print(" ");
            }

            //SI LA PALABRA ES MAYOR A LA CANTIDAD DE LETRAS HACE UN SALTO DE LINEAS
            if ((i + 1) % 2 == 0) {
                System.out.println(" ");
            }
        }


        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion2 = opcion.nextInt();

    switch (opcion2){
        case 1 :
            crearLista();
            break;

        case 2 :
            System.out.println("Salir");
            break;
    }

    }

    //CREA LA LISTA DE COMPRAS
    public static void crearLista(){
        List<String> ListaNombre = new ArrayList<>();
        List<Double> ListaPrecio = new ArrayList<>();

        //PEDIR PRODUCTO Y PRECIO

        String rP;
        double rPc;

        for (int i = 1; i <=3; i++){
            Scanner item = new Scanner(System.in);
            System.out.print("Producto: ");
            rP = item.nextLine();
            System.out.print("Precio: ");
            rPc = item.nextDouble();

            ListaNombre.add(rP);
            ListaPrecio.add(rPc);
        }

        //MOSTRAR LA LISTA
        System.out.println(ListaNombre + " --> " + ListaPrecio);
    }
}


