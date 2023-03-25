import static org.junit.jupiter.api.Assertions.*;

class ClaseCadenaTest {

    @org.junit.jupiter.api.Test
    void devuelveIniciales() {
        String prueba1 = ClaseCadena.DevuelveIniciales("Eloy Sánchez Tamayo");
        assertEquals("E.S.T.", prueba1);
        String prueba2 = ClaseCadena.DevuelveIniciales("Eloy Sánchez");
        assertEquals("E.S.", prueba2);
        String prueba3 = ClaseCadena.DevuelveIniciales("");
        assertEquals("", prueba3);
        String prueba4 = ClaseCadena.DevuelveIniciales(null);
        assertEquals("", prueba4);
    }
}