package org.example;

public abstract class Validador {
    protected Validador proximo;

    public void setProximo(Validador proximo) {
        this.proximo = proximo;
    }

    public abstract boolean validar(PedidoPlay pedido);
}