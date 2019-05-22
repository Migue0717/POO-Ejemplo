package co.com.beans;


import java.util.ArrayList;

enum NivelFormacion {
    tecnico,
    tecnologo
}

public class ProgramaFormacion {
    private String nombre;
    private String codigo;
    private String duracion;
    private NivelFormacion tipo;
    private String descripcion;
    private ArrayList<Competencia> competencias;


    public ProgramaFormacion(String nombre, String codigo, String duracion, NivelFormacion tipo, String descripcion, ArrayList<Competencia> competencias) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.duracion = duracion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.competencias = competencias;
    }

    public ProgramaFormacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public NivelFormacion getTipo() {
        return tipo;
    }

    public void setTipo(NivelFormacion tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(ArrayList<Competencia> competencias) {
        this.competencias = competencias;
    }
}
