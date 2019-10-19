package co.edu.uco.uninotas.services;

import co.edu.uco.uninotas.entity.TipoDocumentoIdentidadEntity;
import co.edu.uco.uninotas.repository.ITipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoService implements ITipoDocumentoIdentidadService {
    @Autowired
    private ITipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public List<TipoDocumentoIdentidadEntity> findAll(){return tipoDocumentoRepository.findAll();}
}
