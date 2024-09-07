package InjecaoDependencia;

public class Cobranca {

    private IMetodoPagamento MetodoPagamento;

    Cobranca(IMetodoPagamento metodopgto) {
        this.MetodoPagamento = metodopgto;

    }

    public Boolean Cobrar() {

        return this.MetodoPagamento.executarPagamento();
    }

    // injeção via setter
    public void setMetodoCobranca(IMetodoPagamento Metodotopgto) {

        this.MetodoPagamento = Metodotopgto;
    }
}