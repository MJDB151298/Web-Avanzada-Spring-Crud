package pucmm.webavanzada.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pucmm.webavanzada.crud.controlador.Controladora;
import pucmm.webavanzada.crud.encapsulaciones.Estudiante;
import pucmm.webavanzada.crud.servicios.EstudianteServicio;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        EstudianteServicio.getInstance().addEstudiante(new Estudiante("Marcos", 20160370, 809580111));
        SpringApplication.run(CrudApplication.class, args);
    }

}
