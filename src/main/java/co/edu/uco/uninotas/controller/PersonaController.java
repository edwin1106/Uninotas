package co.edu.uco.uninotas.controller;

import co.edu.uco.uninotas.entity.PersonaEntity;
import co.edu.uco.uninotas.service.persona.impl.IPersonaService;
import co.edu.uco.uninotas.service.persona.impl.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas")
    public List<PersonaEntity> findAll(){
        return personaService.findAll();
    }

    @GetMapping("/{id}/persona")
    public PersonaEntity findById(@PathVariable(value= "id", required = true)Long id){
        return personaService.findById(id);
    }
    @DeleteMapping("{id}/persona")
    public void deleteById(@PathVariable(value="id",required = true)Long id){
        personaService.deleteById(id);
    }

    @PostMapping("/persona")
    public void insert(@RequestBody PersonaEntity personaEntity){
        personaService.save(personaEntity);

    }
    @PutMapping("/{id}/persona")
    public void save(@RequestBody PersonaEntity personaEntity,@PathVariable(value = "id",required = true)Long id){
        personaEntity.setId(id);
        personaService.save(personaEntity);
    }

}
