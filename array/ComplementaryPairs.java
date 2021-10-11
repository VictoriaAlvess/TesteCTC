package teste.array;

/*Escreva um algoritmo eficiente, para encontrar “K-Complementary Pairs”. Dado um array
A, e um inteiro K o par (i, j) é um K-Complementary se K = A[i] + A[J].
*/
public class ComplementaryPairs {

	public int ParesComplementary(int A[], int k) {
		int result = 0;
		for (int i = 0; i <= A.length; i++) {
			for (int j = i; j < A.length - 1; j++) {
				if (A[i] + A[j] == k) {
					result++;
				}
			}
		}
		return result * 2;
	}

	public static void main(String[] args) {
		int[] intArray = new int[] { 4, 5, 6, 3, 1, 8, -7, -6 };
		int k = 1;
		System.out.println(
				"Número de pares complementares é de : " + new ComplementaryPairs().ParesComplementary(intArray, k));
	}

}
