package opciones;

public class ListaOpciones {

    public static void cargarOpciones(){
        String [] listaDeOpciones = {
                "Calculadora","IMC",
                "Grados","Conversor de unidades",
                "Calculadora de edad","Lista de Compras",
                "Conversor de monedas","Opcion_8",
                "Opcion_9","Salir"
        };


        System.out.println(" ");
        for (int i =0; i< listaDeOpciones.length; i++){
            System.out.printf("[%d] %s        ", i + 1, listaDeOpciones[i]);

            for (int j = 0; j < (21 - listaDeOpciones[i].length()); j++){
                System.out.print(" ");
            }


            if ((i+1) % 2 == 0){
                System.out.println(" ");
            }


        }

    }

}
