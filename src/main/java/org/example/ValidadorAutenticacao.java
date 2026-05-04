package org.example;

public class ValidadorAutenticacao extends Validador {
    @Override
    public boolean validar(PedidoPlay pedido) {
        if (!pedido.isLogado()) return false;
        if (proximo != null) return proximo.validar(pedido);
        return true;
    }
}