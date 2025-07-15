package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.paypal.PaypalSDK;
import com.google.inject.Inject;

public class PayPalGateway implements PagamentoGateway {
    private final PaypalSDK sdk;

    @Inject
    public PayPalGateway(PaypalSDK sdk) {
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
