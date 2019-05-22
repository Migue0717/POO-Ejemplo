package co.com.beans;

import java.util.ArrayList;

public class Subdirector {
	private String id;
	private String nombre;
    private ArrayList<Coordinador> coordinadores;
    
    public Subdirector(String id, String nombre, ArrayList<Coordinador>coordinadores) {
    	this.id = id;
    	this.nombre = nombre;
        this.coordinadores = coordinadores;
    }
    
    public Subdirector() {
    	
    }
    
    public String getId() {
    	return id;
    }
    
    public void setId(String id){
    	this.id=id;
    }
    
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre){
    	this.nombre=nombre;
    }
    public ArrayList<Coordinador> getCoordinadores() {
        return coordinadores;
    }

    public void setCoordinadores(ArrayList<Coordinador> coordinadores) {
        this.coordinadores = coordinadores;
    }

}
