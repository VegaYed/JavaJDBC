package modelo;

import java.util.Date;
import java.util.Objects;

public class Alumno {
    private Long id = null;
    private String nombre;
    private String apellidos;
    private Date fecha_na;

    public Alumno(String nombre, String apellidos, Date fecha_na) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_na = fecha_na;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFecha_na() {
        return fecha_na;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellidos);
        hash = 79 * hash + Objects.hashCode(this.fecha_na);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fecha_na, other.fecha_na)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
   
}
