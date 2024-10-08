package com.skilldistillery.yoga.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class YogaTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Yoga yoga;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	    emf = Persistence.createEntityManagerFactory("JPAYogaTracker");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	    emf.close();

	}

	@BeforeEach
	void setUp() throws Exception {
		   em = emf.createEntityManager();
		    yoga = em.find(Yoga.class, 1);

	}

	@AfterEach
	void tearDown() throws Exception {
	    em.close();



	}

	@Test
	void test() {
		assertNotNull(yoga);
		assertEquals("Bikram", yoga.getStyleName());
	}

}
