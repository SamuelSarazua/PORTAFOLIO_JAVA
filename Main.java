import calculadora.Edad;
import colegio.Escuela;
import conversor.Conversor_monedas;
import interfaz_grafica.Banner;
import libros.Biblioteca;
import mis_metodos.ListaOpciones;
import IMC.IMC;
import calculadora.Mate;
import conversor.fahrenheit_a_grados_centigrados;
import conversor.convensor_de_unidades;
import lista.lista_de_compras;
import mis_metodos.MisMetodos;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MisMetodos.limpiarConsola();
        Banner.mensaje();

        // sección gráfica
        JFrame  miVentana = new JFrame("JFrame de Sarazua");
        miVentana.setLayout(null);
        miVentana.setBounds(0, 0, 500, 1050);
        miVentana.setVisible(true);


        //Panel del Banner
        JPanel banner = new JPanel();
        JLabel texto = new JLabel(" ROCKEMMA ");
        texto.setBounds(200, 20, 500, 60);
        texto.setForeground(Color.WHITE);
        texto.setVisible(true);
        banner.setBackground(Color.BLUE);
        banner.setBounds(0, 0 ,500, 500);

        //OPCIONES
        JLabel opc1 = new JLabel("[1] ----------");
        opc1.setBounds(50,100,150, 30);
        opc1.setForeground(Color.WHITE);


        JLabel opc2 = new JLabel("[2] ----------");
        opc2.setBounds(300,100,150, 30);
        opc2.setForeground(Color.WHITE);

        JLabel opc3 = new JLabel("[3] ----------");
        opc3.setBounds(50,200,150, 30);
        opc3.setForeground(Color.WHITE);

        JLabel opc4 = new JLabel("[4] ----------");
        opc4.setBounds(300,200,150, 30);
        opc4.setForeground(Color.WHITE);

        JLabel opc5 = new JLabel("[5] ----------");
        opc5.setBounds(50,300,150, 30);
        opc5.setForeground(Color.WHITE);

        JLabel opc6 = new JLabel("[6] ----------");
        opc6.setBounds(300,300,150, 30);
        opc6.setForeground(Color.WHITE);

        //BOTÓN
        JButton boton = new JButton("Toca");
        boton.setBounds(350,400, 100, 50);
        boton.setVisible(true);

        miVentana.add(opc1);
        miVentana.add(opc2);
        miVentana.add(opc3);
        miVentana.add(opc4);
        miVentana.add(opc5);
        miVentana.add(opc6);
        miVentana.add(boton);

        miVentana.add(texto);
        miVentana.add(banner);
        miVentana.setVisible(true);

        boolean programa = true;
    do {
        MisMetodos.imprimirLinea();
        ListaOpciones.cargarOpciones();

        // PEDIR UNA OPCION
        Scanner intOpcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = intOpcion.nextInt();
        System.out.println("---------------------------------------------------------------");

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
                Biblioteca.programa();
                break;

            case 9:
                Escuela.programa();
                break;

            case 10:
                programa = false;
                break;


        }
    }while (programa);

    }
}