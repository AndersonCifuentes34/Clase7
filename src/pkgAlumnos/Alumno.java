package pkgAlumnos;

import java.util.ArrayList;

public class Alumno {
    private String carnet;
    public String nombre;
    public String Telefono;
    public String Direccion;
    private ArrayList<CursoAsignado>CursoAsignados;

    
    public double getTotalCurso(){
        double t = 0;
        for (CursoAsignado c : CursoAsignados){
            t = t + c.getCostoCurso();
        }
        return t;
    }
    
    //Contructor

    public Alumno(String carnet, String nombre, String Telefono, String Direccion){
        this.nombre = nombre;
        this.carnet = carnet;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.CursoAsignados = new ArrayList<>();
    }

    public void agregarCursoAsignado(CursoAsignado curso){
        CursoAsignados.add(curso);
    }

    @Override
    public String toString(){
        return "Carnet:" +this.carnet+ "Nombre:" +this.nombre+ "Dirección:" +this.Direccion;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Cursos Asignados:");
        for (CursoAsignado curso : CursoAsignados){
            System.out.println("Curso:"+curso.getNombrecurso());
            System.out.println("Preio:"+curso.getCostoCurso());
            System.out.println("---------------");
        }
    }

    public void getNombre(String nombre) {
        this.nombre = nombre;
    }
}
