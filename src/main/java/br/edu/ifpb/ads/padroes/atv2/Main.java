package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.module.PagSeguroModule;
import br.edu.ifpb.ads.padroes.atv2.module.PayPalModule;
import br.edu.ifpb.ads.padroes.atv2.module.StripeModule;
import br.edu.ifpb.ads.padroes.atv2.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injectorPayPal = Guice.createInjector(new PayPalModule());
        PagamentoService pagamentoPayPal = injectorPayPal.getInstance(PagamentoService.class);
        pagamentoPayPal.pagar(150.0);

        Injector injectorStripe = Guice.createInjector(new StripeModule());
        PagamentoService pagamentoStripe = injectorStripe.getInstance(PagamentoService.class);
        pagamentoStripe.pagar(299.99);

        Injector injectorPagSeguro = Guice.createInjector(new PagSeguroModule());
        PagamentoService pagamentoPagSeguro = injectorPagSeguro.getInstance(PagamentoService.class);
        pagamentoPagSeguro.pagar(79.9);
    }
}

