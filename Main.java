import calculadora.Edad;
import conversor.Conversor_monedas;
import interfaz_grafica.Banner;
import mis_metodos.ListaOpciones;
import IMC.IMC;
import calculadora.Mate;
import conversor.fahrenheit_a_grados_centigrados;
import conversor.convensor_de_unidades;
import lista.lista_de_compras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    boolean programa = true;
    do {
        Banner.mensaje();
        ListaOpciones.cargarOpciones();

        // PEDIR UNA OPCION
        Scanner intOpcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = intOpcion.nextInt();
        System.out.println("----------------------------------------------");

        // CARGAR OPCIONES DEL USUARIO
        switch (opcion){
            case 1:
                Mate.cargarOperaciones();
                break;

            case 2:
                IMC.programaIMC();
                break;

            case 3:
                fahrenheit_a_grados_centigrados.grados();
                break;

            case 4:
                convensor_de_unidades.cargarOperaciones();
                break;

            case 5:
                Edad.ProgramaEdad();
                break;

            case 6:
                lista_de_compras.programa();
                break;

            case 7:
                Conversor_monedas.Programa();
                break;

            case 8:
                System.out.println("Opcion 8");
                break;

            case 9:
                System.out.println("Opcion 9");
                break;

            case 10:
                programa = false;
                break;


        }
    }while (programa);

    }
}