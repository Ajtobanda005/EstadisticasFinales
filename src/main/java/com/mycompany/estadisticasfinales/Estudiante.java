/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticasfinales;

/**
 *
 * @author Dell
 */
public class Estudiante {
    //ATRIBUTOS
    private double nota;
    private int semestre;
    
public Estudiante(double nota, int semestre){
    this.nota=nota;
    this.semestre=semestre;
}

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
