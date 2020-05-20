package pucmm.webavanzada.crud.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pucmm.webavanzada.crud.encapsulaciones.Estudiante;
import pucmm.webavanzada.crud.servicios.EstudianteServicio;

import java.util.ArrayList;

//@Controller() //indica que es un controlador.
@RestController
@RequestMapping(path = "/")
public class EstudianteControlador {

    @RequestMapping(path = "listar")
    public ArrayList<Estudiante> listarEstudiantes(){
        return EstudianteServicio.getInstance().getMisEstudiantes();
    }

    @RequestMapping(path = "buscar/{matricula}")
    public Estudiante buscarEstudiante(@PathVariable int matricula){
        return EstudianteServicio.getInstance().buscarEstudiante(matricula);
    }

    @RequestMapping(path = "eliminar/{matricula}")
    public void eliminarEstudiante(@PathVariable int matricula){
        EstudianteServicio.getInstance().eliminarEstudiante(matricula);
        return;
    }

    @RequestMapping(path = "validar/{matricula}")
    public boolean validarMatricula(@PathVariable int matricula){
        return EstudianteServicio.getInstance().validarMatricula(matricula);
    }
}
