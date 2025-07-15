package br.edu.ifpb.ads.padroes.atv2.sdk.paypal;

public class PaypalSDK {
    public void autenticar() {
        System.out.println("Autenticando na SDK PayPal...");
    }

    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PayPal.");
    }
}
