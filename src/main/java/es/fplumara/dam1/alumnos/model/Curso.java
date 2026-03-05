package es.fplumara.dam1.alumnos.model;

public class Curso {

    private Integer id;

    private Boolean activo;

    private String nombre;

    public Curso(Integer id, boolean activo, String nombre) {
        this.id = id;
        this.activo = activo;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
