package br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro;

public class PagSeguroSDK {
    public void autenticar() {
        System.out.println("Autenticando na SDK PagSeguro...");
    }

    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PagSeguro.");
    }
}
