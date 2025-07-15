package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro.PagSeguroSDK;
import com.google.inject.Inject;

public class PagSeguroGateway implements PagamentoGateway {
    private final PagSeguroSDK sdk;

    @Inject
    public PagSeguroGateway(PagSeguroSDK sdk) {
        this.sdk = sdk;
    }

    @Override
    public void conectar() {
        sdk.autenticar();
    }

    @Override
    public void processarPagamento(double valor) {
        sdk.realizarPagamento(valor);
    }
}
