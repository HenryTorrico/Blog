
public class Main {

    public static void main(String[] args) {
        // write your code here
        Blog blog = new Blog("www.google.com", "google");

        Usuario usuario1 = new Usuario("Juanito1", "Perez1");
        Usuario usuario2 = new Usuario("Juanito2", "Perez2");
        Usuario usuario3 = new Usuario("Juanito3", "Perez3");

        Articulo articulo1 = new Articulo("Soy el primer ARTICULO 1", usuario1);
        articulo1.like(usuario3);

        Comentario com1 = new Comentario("soy el primer COMENTARIO 1", usuario1);
        com1.like(usuario2);
        com1.like(usuario3);

        Comentario com2 = new Comentario("soy el segundo COMENTARIO 2", usuario2);
        com2.like(usuario3);

        Comentario com3 = new Comentario("soy el tercer COMENTARIO 3", usuario3);
        com3.like(usuario1);
        com3.like(usuario2);

        try {
            articulo1.anadirComentario(com1);
            articulo1.anadirComentario(com2);
            articulo1.anadirComentario(com3);
        } catch (ComentarioVacioException e) {
            System.out.println("Comentario vacio");
        } catch (ComentarioLengthException e) {
            System.out.println(e.getMessage());
        }

        Articulo articulo2 = new Articulo("Soy el segundo ARTICULO 2", usuario3);

        Comentario com4 = new Comentario("soy el cuarto COMENTARIO 4", usuario1);
        com4.like(usuario2);

        Comentario com5 = new Comentario("soy el quinto COMENTARIO 5", usuario2);
        com5.like(usuario1);
        com5.like(usuario3);

        articulo2.like(usuario1);
        articulo2.like(usuario2);
        articulo2.like(usuario3);

        try {
            articulo2.anadirComentario(com4);
            articulo2.anadirComentario(com5);
        } catch (ComentarioVacioException e) {
            System.out.println("Comentario vacio");
        } catch (ComentarioLengthException e) {
            System.out.println(e.getMessage());
        }
        blog.anadirArticulo(articulo1);
        blog.anadirArticulo(articulo2);
        articulo1.rate(usuario1,3);
        articulo1.rate(usuario2,2);
        articulo1.rate(usuario3,5);
        blog.mostrarArticulos();


        System.out.println("La cantidad de Articulos es: " + blog.numeroArticulos());
        System.out.println("La cantidad de Comentarios es: " + blog.numeroComentarios());
        System.out.println("La cantidad de Likes es: " + blog.NumeroDeLikes());
        System.out.println("La cantidad de Palabras es: " + blog.numeroPalabras());
        System.out.println("La cantidad de Letras es: " + blog.numeroLetras());
        System.out.println("La cantidad de Numeros es: " + blog.numeroNumeros());
        System.out.println("La cantidad de Caracteres Especiales es: " + blog.numeroCaracteresEspeciales());

    }
}
