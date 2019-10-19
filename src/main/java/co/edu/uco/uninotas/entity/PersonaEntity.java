package co.edu.uco.uninotas.entity;

import co.edu.uco.uninotas.model.TipoDocumentoIdentidad;
import co.edu.uco.uninotas.model.TipoRol;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="persona")

public class PersonaEntity {

    @Id
    //genera una secuencia
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    //llave foranea de muchos a uno
    @ManyToOne
    @JoinColumn(name="iddocumentoidentidad")
    private TipoDocumentoIdentidadEntity tipoDocumentoIdentidad;

    @Column(name="nrodocumento")
    private String nroDocumento;
    @Column(name="correo")
    private String correo;
    @Column(name="telefono")
    private String telefono;
    @Column(name="fechaNacimiento")
    private Date fechaNacimiento;
}
