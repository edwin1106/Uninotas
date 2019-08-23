package co.edu.uco.uninotas.model;

import co.edu.uco.uninotas.model.businessexception.NotaMinimaPermitidaException;
import co.edu.uco.uninotas.model.businessexception.ValorMaximoPermitidoException;
import co.edu.uco.uninotas.model.message.Mensaje;

public class SubNota {

    private String nombre;
    private double valor;
    private double valorNotaMaxima;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ValorMaximoPermitidoException, NotaMinimaPermitidaException {
        if(valor > valorNotaMaxima){
            throw new ValorMaximoPermitidoException(Mensaje.Nota.NOTA_MAYOR_A_LA_PERMITIDA);
        }else if(valor < ParametroSistema.NOTA_MINIMA_PERMITIDA){
            throw new NotaMinimaPermitidaException(Mensaje.Nota.NOTA_MENOR_A_LA_PERMITIDA);
        }
        this.valor = valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValorNotaMaxima(double valorNotaMaxima) {
        this.valorNotaMaxima = valorNotaMaxima;
    }
}
