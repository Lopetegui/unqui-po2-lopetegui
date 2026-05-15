package personasMascotasTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import personasMascotas.Mascota;
import personasMascotas.Nombrable;
import personasMascotas.Persona;

class NombrableTest {

	@Test
	void testGetNombrePersona() {
		Persona p = new Persona("Juan", LocalDate.of(2000, 1 , 1)); 
		assertEquals("Juan", p.getNombre());
	}
	
	@Test
	void testGetNombreMascota() {
		Mascota m = new Mascota("Rex", "Labrador");
		assertEquals("Rex", m.getNombre()); 
	}

	@Test
    void testColeccionMixta() {
        List<Nombrable> coleccion = new ArrayList<>();
        coleccion.add(new Persona("Juan", LocalDate.of(2000, 1, 1)));
        coleccion.add(new Persona("Maria", LocalDate.of(1995, 3, 5)));
        coleccion.add(new Mascota("Rex", "Labrador"));
        coleccion.add(new Mascota("Michi", "Persa"));

        List<String> nombres = new ArrayList<>();
        for (Nombrable cada : coleccion) {
            nombres.add(cada.getNombre());
        }

        assertEquals("Juan", nombres.get(0));
        assertEquals("Maria", nombres.get(1));
        assertEquals("Rex", nombres.get(2));
        assertEquals("Michi", nombres.get(3));
    }
	
	@Test
    void testPersonaMenorQue() {
        Persona p1 = new Persona("Juan", LocalDate.of(2000, 1, 1));
        Persona p2 = new Persona("Maria", LocalDate.of(1995, 3, 5));

        assertTrue(p1.menorQue(p2));
    }

}
