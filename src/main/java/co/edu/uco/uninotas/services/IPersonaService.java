package co.edu.uco.uninotas.services;

import co.edu.uco.uninotas.entity.PersonaEntity;

import java.util.List;

public interface IPersonaService {
    List<PersonaEntity> findAll();
    PersonaEntity findById(Long id);
    void deleteById(Long id);
    void save(PersonaEntity personaEntity);
}
