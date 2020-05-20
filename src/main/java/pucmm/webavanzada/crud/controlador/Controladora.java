package pucmm.webavanzada.crud.controlador;

import pucmm.webavanzada.crud.encapsulaciones.Estudiante;

import java.util.ArrayList;

public class Controladora {
    private static final long serialVersionUID = 1L;
    private ArrayList<Estudiante> misEstudiantes;
    private static Controladora controladora;

    public Controladora(){
        misEstudiantes = new ArrayList<>();
    }

    public static Controladora getInstance() {
        if (controladora == null) {
            controladora = new Controladora();
        }
        return controladora;
    }

    public ArrayList<Estudiante> getMisEstudiantes(){
        return this.misEstudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        Controladora.getInstance().getMisEstudiantes().add(estudiante);
    }

    public Estudiante buscarEstudiante(int matricula){
        for(Estudiante e : Controladora.getInstance().getMisEstudiantes()){
            if(e.getMatricula() == matricula){
                return e;
            }
        }
        return null;
    }

    public void eliminarEstudiante(Estudiante estudiante){
        for(int i = 0; i < getMisEstudiantes().size(); i++){
            if(getMisEstudiantes().get(i).getMatricula() == estudiante.getMatricula()){
                getMisEstudiantes().remove(i);
                return;
            }
        }
    }

    public void editarEstudiante(int index, Estudiante estudiante){
        Estudiante original = getMisEstudiantes().get(index);
        if(estudiante.getMatricula() != original.getMatricula() || !estudiante.getNombre().equalsIgnoreCase(original.getNombre())
        || estudiante.getTelefono() != original.getTelefono()){
            getMisEstudiantes().get(index).setMatricula(estudiante.getMatricula());
            getMisEstudiantes().get(index).setTelefono(estudiante.getTelefono());
            getMisEstudiantes().get(index).setNombre(estudiante.getNombre());
        }
    }

    public boolean validarMatricula(int matricula){
        for(Estudiante estudiante : Controladora.getInstance().getMisEstudiantes()){
            if(estudiante.getMatricula() == matricula){
                return false;
            }
        }
        return true;
    }
}
