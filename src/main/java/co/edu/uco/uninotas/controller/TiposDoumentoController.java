package co.edu.uco.uninotas.controller;

import co.edu.uco.uninotas.entity.TipoDocumentoIdentidadEntity;
import co.edu.uco.uninotas.services.ITipoDocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tiposDocumento")

public class TiposDoumentoController {
    @Autowired
    private ITipoDocumentoIdentidadService tipoDocumentoIdentidadService;

    @GetMapping("/tiposDocumento")
    public List<TipoDocumentoIdentidadEntity> findAll(){
        return tipoDocumentoIdentidadService.findAll();
    }
}
