import java.util.logging.SocketHandler;

public class Bug {
	/**
	 * Find the minimum in the referenced array.
	 *
	 * @param a Array of int values
	 * @return smallest value on the array
	 * @throws IllegalArgumentException if referenced array is null or empty
	 */
	public static int minimum(int[] a) throws IllegalArgumentException {
		if (a == null || a.length == 0) {
			throw new IllegalArgumentException();
		}

		int m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < m) {
				m = a[i];
			}
		}

		return m;
	}
}