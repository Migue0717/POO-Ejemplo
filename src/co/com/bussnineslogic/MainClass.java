package co.com.bussnineslogic;

import java.util.Iterator;
import java.util.List;
import java.util.Date;
import java.util.Calendar;

import co.com.beans.Aprendiz;
import co.com.beans.Competencia;
import co.com.beans.Coordinador;
import co.com.beans.Ficha;
import co.com.beans.Instructor;
import co.com.beans.ProgramaFormacion;
import co.com.beans.Subdirector;

import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		ProgramaFormacion programaFormacion = new ProgramaFormacion(); // creamos un programa de formacion

		// Competencias
		Competencia basesDeDatos = new Competencia("1", "3 mese", "Bases de datos", "Normalizar bases de datos");

		Competencia java = new Competencia("", "3 mese", "Inicio de la programacion con Java",
				"Conocer los conceptos basicos  de la programacÃ­on con Java ");
		// Listas de competencias

		ArrayList<Competencia> competencias = new ArrayList<Competencia>();

		competencias.add(basesDeDatos);
		competencias.add(java);

		programaFormacion.setCompetencias(competencias);

		// Instructor
		Instructor Alejo = new Instructor("98726", "Alejo", "Jaramillo");
		Instructor Jose = new Instructor("773773", "Jose", "Velez");
		Instructor Edwin = new Instructor("123123", "Edwin", "Patiño");

		// ArrayList de Instructores
		HashMap<String, Instructor> instructores;
		instructores = new HashMap<String, Instructor>();
		instructores.put("1", Alejo);
		instructores.put("2", Jose);
		instructores.put("3", Edwin);

		// Coordinador
		Coordinador Eldrim = new Coordinador("Eldrim", "234678", instructores);
		System.out.println("Elementos del mapa:");
		System.out.println(instructores.get("2").getNombre());
		// ArrayList de Coordinadores
		ArrayList<Coordinador> coordinadores = new ArrayList<Coordinador>();
		coordinadores.add(Eldrim);

		// Subdirector
		Subdirector Miguel = new Subdirector("1312", "Miguel", coordinadores);

		// Aprendices
		Aprendiz daniel = new Aprendiz(3, "Daniel", "Amaya Ruiz", "464565645"); // Crear un aprendiz

		Aprendiz esteban = new Aprendiz(1, "Esteban", "Estrada", "23423442"); // Crear un aprendiz

		Aprendiz mariana = new Aprendiz(2, "Mariana", "Estrada", "238942304"); // Crear un aprendiz
		// Lista de aprendices
		
		//Lista con Crunchify
		List<Aprendiz> crunchifyList = new ArrayList<Aprendiz>();
		crunchifyList.add(esteban);
		crunchifyList.add(daniel);

		System.out.println("==> For Loop Example of Aprendiz.");
		for (int i = 0; i < crunchifyList.size(); i++) {
			System.out.println(crunchifyList.get(i).getNombres());
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
		
		//--------------------------------------------------------------------------------
		//Ficha adsi = new Ficha("1598765", programaFormacion, aprendices); // Crear una adsi

		//for (Competencia competencia : adsi.getProgramaFormacion().getCompetencias()) {
		//	System.out.println(String.format("%s das", competencia.getNombre()));
		//}
		
		

//        for (Aprendiz ap :
//                adsi.getAprendices()) {
//            System.out.println("ap = " + ap.getNombres());
//        }
//
//        aprendices.add(mariana);
//
//        System.out.println("------------------");
//
//        for (Aprendiz ap :
//                adsi.getAprendices()) {
//            System.out.println("ap = " + ap.getNombres());
//        }

//        JOptionPane.showMessageDialog(null, String.format(" %o %s %s %s", daniel.getId(), daniel.getNombres(), daniel.getApellidos(), daniel.getTelefono()));
	}
}
