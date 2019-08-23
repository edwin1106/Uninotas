package co.edu.uco.uninotas.model;

import java.util.List;

public class Nota {

    private TipoNota tipoNota;
    private List<SubNota> subNotas;

    public TipoNota getTipoNota() {
        if(tipoNota == null){
            tipoNota = new TipoNota();
        }
        return tipoNota;
    }

    public void setSubNotas(List<SubNota> subNotas) {
        this.subNotas = subNotas;
    }
}
