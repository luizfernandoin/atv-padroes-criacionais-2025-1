package br.edu.ifpb.ads.padroes.atv2.sdk.stripe;

public class StripeSDK {
    public void autenticar() {
        System.out.println("Autenticando na SDK Stripe...");
    }

    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Stripe.");
    }
}
