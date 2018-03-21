public class Bug {
	/**
	 * Find the minimum in the referenced array.
	 * @param a Array of int values
	 * @return smallest value on the array
	 * @throws IllegalArgumentException if referenced array is null or empty
	 */
	public static int minimum(int[] a) throws IllegalArgumentException {


		// abfragen ob das Array null ist oder die Länge 0 hat. Wenn einer zutrifft dann Expection werfen!
		if(a == null || a.length == 0)
			throw new IllegalArgumentException();
		// "m" darf nur dann initialisiert werden wenn das Array weder null noch die Länge null hat!
		int m = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < m) {
				m = a[i];
			}
		}

		return m;
	}
}