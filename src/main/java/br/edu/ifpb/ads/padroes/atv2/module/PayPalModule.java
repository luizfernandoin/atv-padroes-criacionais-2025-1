package br.edu.ifpb.ads.padroes.atv2.module;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PayPalGateway;
import br.edu.ifpb.ads.padroes.atv2.sdk.paypal.PaypalSDK;
import com.google.inject.AbstractModule;

public class PayPalModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(PayPalGateway.class);
        bind(PaypalSDK.class).toInstance(new PaypalSDK());
    }
}