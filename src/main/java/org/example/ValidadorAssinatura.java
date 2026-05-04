package org.example;

public class ValidadorAssinatura extends Validador {
    @Override
    public boolean validar(PedidoPlay pedido) {
        if (!pedido.isPremium() && pedido.isMusicaExplicita()) return false;
        if (proximo != null) return proximo.validar(pedido);
        return true;
    }
}