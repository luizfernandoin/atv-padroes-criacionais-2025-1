package br.edu.ifpb.ads.padroes.atv2.gateway;

public interface PagamentoGateway {
    void conectar();
    void processarPagamento(double valor);
}
