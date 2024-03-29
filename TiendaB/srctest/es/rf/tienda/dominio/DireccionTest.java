package es.rf.tienda.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.rf.tienda.exception.DomainException;

class DireccionTest {
	final static String NOMBREOK = "Andrea";
	
	
	Direccion dir;

	@BeforeEach
	void creacion() {
		dir = new Direccion();
	}

	@Test
	void testSetDir_nombre() throws DomainException {
		dir.setDir_nombre(NOMBREOK);
		assertEquals(NOMBREOK, dir.getDir_nombre());
	}

}
