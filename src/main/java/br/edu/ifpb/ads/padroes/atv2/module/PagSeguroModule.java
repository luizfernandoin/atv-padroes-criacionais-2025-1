package br.edu.ifpb.ads.padroes.atv2.module;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro.PagSeguroSDK;
import com.google.inject.AbstractModule;


public class PagSeguroModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(PagSeguroGateway.class);
        bind(PagSeguroSDK.class).toInstance(new PagSeguroSDK());
    }
}