package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.stripe.StripeSDK;
import com.google.inject.Inject;

public class StripeGateway implements PagamentoGateway {
    private final StripeSDK sdk;

    @Inject
    public StripeGateway(StripeSDK sdk) {
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
