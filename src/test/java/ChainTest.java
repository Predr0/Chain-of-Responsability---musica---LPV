package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChainTest {

    @Test
    void deveBloquearUsuarioNaoLogado() {
        Validador auth = new ValidadorAutenticacao();
        Validador assinatura = new ValidadorAssinatura();
        auth.setProximo(assinatura);

        PedidoPlay pedido = new PedidoPlay(false, true, true, false);
        assertFalse(auth.validar(pedido));
    }

    @Test
    void devePermitirUsuarioLogadoEPremium() {
        Validador auth = new ValidadorAutenticacao();
        Validador assinatura = new ValidadorAssinatura();
        auth.setProximo(assinatura);

        PedidoPlay pedido = new PedidoPlay(true, true, true, true);
        assertTrue(auth.validar(pedido));
    }

    @Test
    void deveBloquearMusicaExplicitaParaNaoPremium() {
        Validador auth = new ValidadorAutenticacao();
        Validador assinatura = new ValidadorAssinatura();
        auth.setProximo(assinatura);

        PedidoPlay pedido = new PedidoPlay(true, false, true, true);
        assertFalse(auth.validar(pedido));
    }
}