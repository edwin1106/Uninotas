package co.edu.uco.uninotas.repository;

import co.edu.uco.uninotas.entity.TipoDocumentoIdentidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDocumentoRepository extends JpaRepository<TipoDocumentoIdentidadEntity,Long> {
}
