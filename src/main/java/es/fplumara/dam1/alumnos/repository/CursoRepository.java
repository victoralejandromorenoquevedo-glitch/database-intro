package es.fplumara.dam1.alumnos.repository;

import es.fplumara.dam1.alumnos.model.Curso;

import java.util.List;

public interface CursoRepository {

    void initSchema();

    Curso crearCurso (Curso curso);

    Curso activar (Curso curso);

    void eliminarSiNombreContiene (String texto);

    List<Curso> listarPorEstado (Boolean estado);

    List<Curso>listarOrdenadoPor (String campo, String ordenacion);

}
