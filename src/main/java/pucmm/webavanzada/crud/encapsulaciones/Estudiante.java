package pucmm.webavanzada.crud.encapsulaciones;

public class Estudiante {
    private String nombre;
    private int matricula;
    private int telefono;

    public Estudiante(){}

    public Estudiante(String nombre, int matricula, int telefono){
        this.setNombre(nombre);
        this.setMatricula(matricula);
        this.setTelefono(telefono);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
