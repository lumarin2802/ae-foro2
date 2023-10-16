package uy.edu.utec.Entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    // id (como clave primaria), nombre, puesto, y salario
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq1")
    @SequenceGenerator(name = "seq1", sequenceName = "seq_prod", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(length= 50, nullable = false)
    private String nombre;

    @Column(length = 500)
    private String puesto;

    @Column(length = 10)
    private double salario;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;


    public Empleado() {
    }

    public Empleado(Long id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}