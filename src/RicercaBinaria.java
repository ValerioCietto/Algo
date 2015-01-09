
public class RicercaBinaria {

	/**
	 * Trova un elemento in un array usando la ricerca binaria
	 * in maniera iterativa
	 * @param x elemento da trovare
	 * @param a array su cui cercare
	 * @return true se l'elemento è presente, false altrimenti
	 * (pre-condizione l'array deve essere ordinato)
	 */
	public static int find(int x, int[] a) {
		int inf = 0;
		int sup = a.length - 1;
		//i.c. se è presente x, è compreso tra inf e sup
		while (inf <= sup) {
			int i = (inf + sup) / 2;
			if (x < a[i])
				sup = i - 1;
			else if (x > a[i])
				inf = i + 1;
			else
				return i;
		}
		return -1;
	}
	/**
	 * Trova un elemento in un array usando la ricerca binaria
	 * in maniera iterativa
	 * @param x elemento da trovare
	 * @param a array su cui cercare
	 * @return true se l'elemento è presente, false altrimenti
	 * (pre-condizione l'array deve essere ordinato)
	 */
	public static boolean isPresent(int x, int[] a) {
		int inf = 0;
		int sup = a.length - 1;
		//i.c. se è presente x, è compreso tra inf e sup
		while (inf <= sup) {
			int i = (inf + sup) / 2;
			if (x < a[i])
				sup = i - 1;
			else if (x > a[i])
				inf = i + 1;
			else
				return true;
		}
		return false;
	}
	/**
	 * Trova un elemento in un array usando la ricerca binaria
	 * @param x elemento da trovare
	 * @param a array su cui cercare
	 * @return x se è presente, -1 altrimenti
	 * (pre-condizione l'array deve essere ordinato)
	 */
	public static int findRecursively(int x, int[] a) {
		return findRecursively(x, a, 0, a.length - 1);
	}
	/**
	 * Trova un elemento in un array usando la ricerca binaria
	 * in maniera ricorsiva
	 * @param x elemento da trovare
	 * @param a a array su cui cercare
	 * @param inf limite inferiore su cui cercare
	 * @param sup limite superiore su cui cercare
	 * @return x se è presente, -1 altrimenti
	 * (pre-condizione l'array deve essere ordinato)
	 */
	private static int findRecursively(int x, int[] a, int inf, int sup) {
		
		if (inf <= sup) {
			int i = (inf + sup) / 2;
			if (x < a[i])
				return findRecursively(x, a, inf, i - 1);
			else if (x > a[i])
				return findRecursively(x, a, i + 1, sup);
			else
				return i;
		}
		return -1;
	}
}
