package co.edu.uco.uninotas.entity;

import lombok.Data;
import org.hibernate.service.spi.InjectService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="tipodocumentoidentidad")

public class TipoDocumentoIdentidadEntity {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="sigla")
    private String sigla;
    @Column(name="activo")
    private boolean activo;
}
