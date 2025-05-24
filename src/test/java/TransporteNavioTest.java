import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TransporteNavioTest {
    @Test
    void deveEntregarPorNavio() {
        ITransporte transporte = TransporteFactory.obterEntrega("Navio");
        assertEquals("Entrega realizada por navio", transporte.entregar());
    }

    @Test
    void deveCancelarEntregarPorNavio() {
        ITransporte transporte = TransporteFactory.obterEntrega("Navio");
        assertEquals("Entrega por navio cancelada", transporte.cancelarEntrega());
    }
}
