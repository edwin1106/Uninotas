package co.edu.uco.uninotas.services;

import co.edu.uco.uninotas.entity.PersonaEntity;
import co.edu.uco.uninotas.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<PersonaEntity> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public PersonaEntity findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        personaRepository.deleteById(id);

    }

    @Override
    public void save(PersonaEntity personaEntity) {
        personaRepository.save(personaEntity);

    }
}
