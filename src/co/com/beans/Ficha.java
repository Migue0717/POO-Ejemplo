package co.com.beans;

import java.util.ArrayList;


public class Ficha {
    private String id;
    private ProgramaFormacion programaFormacion;
    private ArrayList<Aprendiz> aprendices = new ArrayList<Aprendiz>();

    public Ficha(String id, ProgramaFormacion programaFormacion, ArrayList<Aprendiz> aprendices) {
        this.id = id;
        this.programaFormacion = programaFormacion;
        this.aprendices = aprendices;
    }

    public Ficha() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProgramaFormacion getProgramaFormacion() {
        return programaFormacion;
    }

    public void setProgramaFormacion(ProgramaFormacion programaFormacion) {
        this.programaFormacion = programaFormacion;
    }

    public ArrayList<Aprendiz> getAprendices() {
        return aprendices;
    }

    public void setAprendices(ArrayList<Aprendiz> aprendices) {
        this.aprendices = aprendices;
    }
}
