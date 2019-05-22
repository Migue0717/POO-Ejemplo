package co.com.beans;

import java.util.HashMap;

public class Coordinador {
	private String nombre;
    private String codigo;
    private HashMap<String, Instructor> instructores;


    public Coordinador(String nombre, String codigo, HashMap<String, Instructor> instructores) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.instructores = instructores;
    }

    public Coordinador() {
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

    public HashMap<String, Instructor> getInstructores() {
        return instructores;
    }

    public void setInstructores( HashMap<String, Instructor> instructores) {
        this.instructores = instructores;
    }
}

