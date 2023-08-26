import pkgAlumnos.Alumno;
import pkgAlumnos.CursoAsignado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CursoAsignado> cat_cursos = new ArrayList<>();

        cat_cursos.add(new CursoAsignado(101, "Programación", 500));
        cat_cursos.add(new CursoAsignado(105, "Derecho", 1));
        cat_cursos.add(new CursoAsignado(110, "Estadística", 450));
        cat_cursos.add(new CursoAsignado(120, "Electronica", 400));


        Alumno al1 = new Alumno("2023015", "Andrea", "55555", "5 calle 8-36 zona 12");
        al1.agregarCursoAsignado(cat_cursos.get(1));
        al1.agregarCursoAsignado(cat_cursos.get(2));
        System.out.println("Total del Alumno:"+al1.getNombre()+" Q."+al1.getTotalCurso());



        Alumno al2 = new Alumno("2025015", " Monica", "11111", "5 calle 8-36 zona 10");
        al1.agregarCursoAsignado(cat_cursos.get(0));
        al1.agregarCursoAsignado(cat_cursos.get(2));
        al1.agregarCursoAsignado(cat_cursos.get(3));
        System.out.println("Total del Alumno:"+al2.getNombre()+" Q."+al2.getTotalCurso());

            System.out.println("Gran Total:"+ al1.getTotalCurso()+al2.getTotalCurso());
    }
}