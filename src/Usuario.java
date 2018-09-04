
public class Usuario
{
    private String Nombre="";
    private String Apellido="";

    public Usuario(){};

    public Usuario(String Nombre,String Apellido)
    {
        this.Nombre=Nombre;
        this.Apellido=Apellido;
    }

    public void Mostrar()
    {
        System.out.println(Nombre+" "+Apellido);

    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}