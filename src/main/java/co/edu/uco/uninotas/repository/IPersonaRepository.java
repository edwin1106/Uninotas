package co.edu.uco.uninotas.repository;

import co.edu.uco.uninotas.entity.PersonaEntity;
import net.bytebuddy.description.type.TypeDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<PersonaEntity,Long> {

}
