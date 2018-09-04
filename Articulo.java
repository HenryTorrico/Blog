
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Articulo {

    private String texto;
    private int likes;
    private Usuario autor;
    private List<Comentario> comentarios;
    private List<Usuario> ListaUsuarios=new LinkedList<Usuario>();


    public Articulo(){
        this.likes = 0;
    }
    public Articulo(String texto,Usuario autor)
    {
        this.autor=autor;
        this.likes = 0;
        this.texto = texto;
        comentarios=new ArrayList<Comentario>();
    }
    public void mostrar()
    {
        System.out.println("\nTexto: "+texto);
        System.out.println("Autor: ");
        autor.Mostrar();
        System.out.println("Likes: "+likes);
        for (Usuario usuario:ListaUsuarios)
        {
            usuario.Mostrar();
            System.out.printf("  ");
        }
        System.out.println("Comentarios: \n" );
        for (Comentario comentario:comentarios)
        {
            comentario.mostrar();
        }
    }

    public int numeroComentarios(){
        return this.comentarios.size();
    }

    public int numeroPalabras(){
        int total=0;
        for (char c:texto.toCharArray())
        {
            if (c==' ')
            {
                total++;
            }
        }
        if (texto.length()>0)
        {
            total++;
        }
        return total;
    }
    public int numeroDeLetras(){
        int contador=0;
        for (Comentario comentario:comentarios) {
            contador=contador+comentario.numeroLetras();
        }
        return contador;
    }
    public int numeroNumeros()
    {
        int contador=0;
        for (Comentario comentario:comentarios)
        {
            contador=contador+comentario.numeroNumeros();
        }
        return contador;
    }
    public int numeroCaracteresEspeciales()
    {
        int contador=0;
        for (Comentario comentario:comentarios)
        {
            contador=contador+comentario.numeroCaracteresEspeciales();
        }
        return contador;
    }

    public void like(Usuario usuario)
    {
        likes++;
        ListaUsuarios.add(usuario);
    }

    public int getLikes()
    {
        int total=likes;
        for (Comentario comentario:comentarios) {
            total=total+comentario.getLikes();
        }
        return total;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        comentarios = comentarios;
    }

    public void anadirComentario(Comentario comentario) throws ComentarioVacioException, ComentarioLengthException
    {
        if(comentario.getTexto().equals("")){
            throw  new ComentarioVacioException();
        }
        if(comentario.getTexto().length() <= 5){
            throw  new ComentarioLengthException(comentario.getTexto().length());
        }
        this.comentarios.add(comentario);
    }

    public void borrarComentario(Integer id){
        comentarios.remove(id);
    }

}
