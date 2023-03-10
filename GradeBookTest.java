import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook obj1;
	GradeBook obj2;

	@BeforeEach
	void setUp() throws Exception {
		// creates 2 objects of GradeBook to hold 5 scores
		obj1 = new GradeBook(5);
		obj2 = new GradeBook(5);

		// calls addScore method for each object and adds random scores into GradeBook
		// objects
		obj1.addScore(50);
		obj1.addScore(65);

		obj2.addScore(80);
		obj2.addScore(95);
	}

	@AfterEach
	void tearDown() throws Exception {
		// set both objects of GradeBook to null
		obj1 = null;
		obj2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(obj1.toString().equals("50.0,65.0,"));
		assertTrue(obj2.toString().equals("80.0,95.0,"));
	}

	@Test
	void testSum() {
		assertEquals(115, obj1.sum(), .0001);
		assertEquals(175, obj2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, obj1.minimum(), .001);
		assertEquals(80, obj2.minimum(), .001);
		
		
	}

	@Test
	void testFinalScore() {
		assertEquals(65, obj1.finalScore(), .001);
		assertEquals(95, obj2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, obj1.getScoreSize());
		assertEquals(2, obj2.getScoreSize());
	}

	@Test
	void testToString() {
	}

}
