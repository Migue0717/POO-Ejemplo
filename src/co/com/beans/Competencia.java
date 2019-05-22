package co.com.beans;


public class Competencia {

    private String codigo;
    private String duracion;
    private String nombre;
    private String objetico;

    public Competencia() {
    }

    public Competencia(String codigo, String duracion, String nombre, String objetico) {
        this.codigo = codigo;
        this.duracion = duracion;
        this.nombre = nombre;
        this.objetico = objetico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetico() {
        return objetico;
    }

    public void setObjetico(String objetico) {
        this.objetico = objetico;
    }
}
