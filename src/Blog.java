
import java.util.ArrayList;
import java.util.List;

public class Blog extends SitioWeb {

    private List<Articulo> articulos;
    private ArrayList<Usuario> ListaUsuarios=new ArrayList<Usuario>();

    public Blog(String url, String nombre) {
        super(url, nombre);
        articulos=new ArrayList<Articulo>();
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public int numeroArticulos(){
        return articulos.size();
    }
    public int numeroComentarios(){
        int numeroComentarios = 0;
        for(Articulo articulo : this.articulos){
            numeroComentarios += articulo.numeroComentarios();
        }
        return numeroComentarios;//TODO
    }

    public int numeroPalabras(){
        int numeroPalabras=0;
        for (Articulo articulo:articulos)
        {
            numeroPalabras=numeroPalabras+articulo.numeroPalabras();
        }
        return numeroPalabras;
    }
    public void mostrarArticulos(){
        System.out.println("Url: " +getUrl());
        System.out.println("Nombre: "+getNombre());
        for (Articulo articulo:articulos)
        {
            articulo.mostrar();
        }
    }
    public int numeroLetras()
    {
        int contador=0;
        for (Articulo articulo:articulos)
        {
            contador=contador+articulo.numeroDeLetras();
        }
        return contador;
    }
    public int numeroNumeros()
    {
        int contador=0;
        for (Articulo articulo:articulos)
        {
            contador=contador+articulo.numeroNumeros();
        }
        return contador;
    }
    public int numeroCaracteresEspeciales()
    {
        int contador=0;
        for (Articulo articulo:articulos)
        {
            contador=contador+articulo.numeroCaracteresEspeciales();
        }
        return contador;
    }
    public int NumeroDeLikes(){
        int Numero_Likes=0;
        for (Articulo articulo:articulos) {
            Numero_Likes=Numero_Likes+articulo.getLikes();
        }
        return Numero_Likes;
    }
    public void anadirArticulo(Articulo articulo){
        articulos.add(articulo);

    }

    public void borrarArticulo(Integer id){
        articulos.remove(id);
    }

}
