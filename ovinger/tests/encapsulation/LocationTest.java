package encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LocationTest {

	Location location;

	@BeforeEach
	protected void setUp() throws Exception {
		location = new Location();
	}

	private void testLocation(int x, int y) {
		assertEquals(x, location.getX());
		assertEquals(y, location.getY());
	}

	@Test
	public void testGetSetX() {
		location.setX(0);
		assertEquals(0, location.getX());
		location.setX(10);
		assertEquals(10, location.getX());
		location.setX(-1);
		assertEquals(-1, location.getX());
	}

	@Test
		public void testGetSetY() {
			location.setY(0);
			assertEquals(0, location.getY());
			location.setY(10);
			assertEquals(10, location.getY());
			location.setY(-1);
			assertEquals(-1, location.getY());
		}

    @Test
	public void testLeft() {
		testLocation(0, 0);
		location.left();
		testLocation(-1, 0);
	}

	@Test
	public void testUp() {
		testLocation(0, 0);
		location.up();
		testLocation(0, -1);
	}

	@Test
	public void testRight() {
		testLocation(0, 0);
		location.right();
		testLocation(1, 0);
	}

    
    @Test
	public void testDown() {
		testLocation(0, 0);
		location.down();
		testLocation(0, 1);
	}
}
