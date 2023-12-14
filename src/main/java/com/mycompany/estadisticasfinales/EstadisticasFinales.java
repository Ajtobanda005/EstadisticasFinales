/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

    package com.mycompany.estadisticasfinales;

    import java.util.ArrayList;
    import java.util.Scanner;

    /**
     *
     * @author Dell
     */
    public class EstadisticasFinales {

        public static void main(String[] args) {
           Scanner leer= new Scanner(System.in);
            System.out.print("Ingrese el nombre del curso: ");
            String name= leer.next();
            System.out.println("Ingrese el numero de estudiantes matriculados en "+name);
           int numero= leer.nextInt();

           ArrayList<Estudiante> es=new ArrayList<>(); 
           for(int i=0; i<numero;i++){
               System.out.println("Ingrese la nota del estudiante "+(i+1)+": ");
               double not = leer.nextDouble();
               System.out.println("Ingrese el semestre del estudiante "+(i+1)+": ");
               int sem = leer.nextInt();
               Estudiante estu= new Estudiante(not,sem);
             es.add(estu); 

           }
           Curso curso = new Curso(name, es);
            // Obtener y mostrar estadísticas
            double notaPromedio = curso.calcularNotaPromedio();
            int estudiantesAprobados = curso.contarEstudiantesAprobados();
            int estudiantesReprobados = curso.contarEstudiantesReprobados();
            int semestrePromedio = curso.calcularModaSemestre();

            System.out.println("Estadísticas para el curso " + curso.getNombre() + ":");
            System.out.println("Nota promedio del curso: " + notaPromedio);
            System.out.println("Estudiantes que aprobaron: " + estudiantesAprobados);
            System.out.println("Estudiantes que reprobaron: " + estudiantesReprobados);
            System.out.println("Semestre promedio de los estudiantes: " + semestrePromedio);
        }
    }


