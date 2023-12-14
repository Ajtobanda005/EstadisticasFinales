/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticasfinales;

import java.util.ArrayList;

/**
 *
 
 */
public class Curso {
    //ATRIBUTOS
    private String materia;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombre, ArrayList<Estudiante> estudiantes) {
        this.estudiantes=estudiantes;
        this.materia=nombre;   
    }

   public double calcularNotaPromedio() {
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.size();
        
    }

    public int contarEstudiantesAprobados() {
        int estudiantesAprobados = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() >= 14.0) {
                estudiantesAprobados++;
            }
        }
        return estudiantesAprobados;
    }

    public int contarEstudiantesReprobados() {
        return estudiantes.size() - contarEstudiantesAprobados();
    }

    public int calcularModaSemestre() {
        int[] frecuenciaSemestres = new int[20];
        for (Estudiante estudiante : estudiantes) {
            int semestreActual = estudiante.getSemestre();
            frecuenciaSemestres[semestreActual]++;
        }
        int moda = 0;
        int maxFrecuencia = 0;

        for (int i = 1; i < frecuenciaSemestres.length; i++) {
            if (frecuenciaSemestres[i] > maxFrecuencia) {
                moda = i; 
                maxFrecuencia = frecuenciaSemestres[i];
            }
        }

        return moda;
    }

    // Getter para el nombre del curso
    public String getNombre() {
        return materia;
    }
    
}
    
