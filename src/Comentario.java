
import java.util.LinkedList;
import java.util.List;

public class Comentario {
    private String texto;
    private int likes;
    private Usuario autor;
    private List<Usuario> ListaUsuarios=new LinkedList<Usuario>();

    public Comentario(){
        this.likes = 0;
    }
    public Comentario(String texto,Usuario autor)
    {
        this.likes = 0;
        this.texto = texto;
        this.autor=autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLikes()
    {
        return ListaUsuarios.size();
    }

    public void setLikes(int likes) {
        this.likes = likes;
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

    public void like(Usuario usuario)
    {
        likes++;
        ListaUsuarios.add(usuario);
    }
    public int numeroLetras()
    {
        int contador=0;
        for (Character car:texto.toCharArray())
        {
            if (Character.isLetter(car)==true)
                contador++;
        }
        return contador;
    }
    public int numeroNumeros()
    {
        int contador=0;
        for (Character car:texto.toCharArray())
        {
            if (Character.isDigit(car)==true)
                contador++;
        }
        return contador;
    }
    public int numeroCaracteresEspeciales()
    {
        int contador=0;
        for (Character car:texto.toCharArray())
        {
            if (Character.isDigit(car)==false && Character.isLetter(car)==false)
                contador++;
        }
        return contador;
    }
    public void mostrar()
    {
        System.out.println("Texto: "+texto);
        System.out.println("Autor: "+autor.getNombre()+" "+autor.getApellido());
        System.out.println("Likes: "+likes);
        for (Usuario usuario:ListaUsuarios)
        {
            usuario.Mostrar();
            //System.out.print("");
        }
    }

}
