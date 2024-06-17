package libros;

public class Biblioteca {

    public static void programa(){
        System.out.println("Biblioteca");

        Libro libro1 = new Libro("The Science of Interstellar", "Kip S. Thorne","2014");
        Libro libro2 = new Libro("Los Juegos del Hambre", "Suzanne","2008");
        Libro libro3 = new Libro("El Código Da Vinci", "Dan Brown","2003");
        Libro libro4 = new Libro("Harry Potter y la piedra filosofal","J.K. Rowling","1997");
        Libro libro5 = new Libro("Jurassic Park", "Michael Crichton","1990");
        Libro libro6 = new Libro("Forrest Gump","Winston Groom","1986");
        Libro libro7 = new Libro("It","Stephen King","1986");
        Libro libro8 = new Libro("El juego de Ende", "Orson Scott Card","1985");
        Libro libro9 = new Libro("El Señor de los Anillos","J.R.R. Tolkien","1954-1955");
        Libro libro10 = new Libro("El Hobbit","J.R.R.","1937");

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());
        System.out.println(libro5.toString());
        System.out.println(libro6.toString());
        System.out.println(libro7.toString());
        System.out.println(libro8.toString());
        System.out.println(libro9.toString());
        System.out.println(libro10.toString());
    }

}
