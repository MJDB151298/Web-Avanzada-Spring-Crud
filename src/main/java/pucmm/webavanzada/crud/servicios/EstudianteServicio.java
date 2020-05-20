package pucmm.webavanzada.crud.servicios;

import pucmm.webavanzada.crud.encapsulaciones.Estudiante;

import java.util.ArrayList;

public class EstudianteServicio {
    private static final long serialVersionUID = 1L;
    private ArrayList<Estudiante> misEstudiantes;
    private static EstudianteServicio controladora;

    public EstudianteServicio(){
        misEstudiantes = new ArrayList<>();
    }

    public static EstudianteServicio getInstance() {
        if (controladora == null) {
            controladora = new EstudianteServicio();
        }
        return controladora;
    }

    public ArrayList<Estudiante> getMisEstudiantes(){
        return this.misEstudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        getMisEstudiantes().add(estudiante);
    }

    public Estudiante buscarEstudiante(int matricula){
        for(Estudiante e : getMisEstudiantes()){
            if(e.getMatricula() == matricula){
                return e;
            }
        }
        return null;
    }

    public void eliminarEstudiante(int matricula){
        for(int i = 0; i < getMisEstudiantes().size(); i++){
            if(getMisEstudiantes().get(i).getMatricula() == matricula){
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
        for(Estudiante estudiante : getMisEstudiantes()){
            if(estudiante.getMatricula() == matricula){
                return false;
            }
        }
        return true;
    }
}
