package pkgAlumnos;

public class CursoAsignado {
    private int codigocurso;
    private String nombrecurso;
    private double costoCurso;

    public CursoAsignado(int codigo, String nombre, double costo){
        this.codigocurso = codigo;
        this.nombrecurso = nombre;
        this.costoCurso = costo;
    }

    //Getters and Setters
    public int getCodigocurso() {
        return codigocurso;
    }

    public void setCodigocurso(int codigocurso) {
        this.codigocurso = codigocurso;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public double getCostoCurso() {
        return costoCurso;
    }

    public void setCostoCurso(double costoCurso) {
        this.costoCurso = costoCurso;
    }
}
