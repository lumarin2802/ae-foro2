package uy.edu.utec.Entidad;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq1")
    @SequenceGenerator(name = "seq1", sequenceName = "seq_dpto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(length= 50, nullable = false)
    private String nombre;

    @Column(length = 500)
    private String descripcion;
    @OneToMany(mappedBy = "departamento")
    private List<Empleado> empleados;


    public Departamento() {
    }

    public Departamento(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}