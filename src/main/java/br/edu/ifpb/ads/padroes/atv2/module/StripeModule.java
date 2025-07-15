package br.edu.ifpb.ads.padroes.atv2.module;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.StripeGateway;
import br.edu.ifpb.ads.padroes.atv2.sdk.stripe.StripeSDK;
import com.google.inject.AbstractModule;

public class StripeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(StripeGateway.class);
        bind(StripeSDK.class).toInstance(new StripeSDK());
    }
}