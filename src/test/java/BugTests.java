import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BugTests {
	@Test
	public void testMinimum1() {
		// actual minimum: 1
		int[] a = {1, 2, 3, 4, 5, 6};

		assertEquals(1, Bug.minimum(a));
	}

	@Test
	public void testMinimum2() {
		// Expect IllegalArgumentException if called with null
		assertThrows(NullPointerException.class, () -> Bug.minimum(null));

		// Expect IllegalArgumentException if called with empty array
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> Bug.minimum(new int[0]));
	}
}