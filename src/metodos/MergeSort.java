package metodos;

/**
 * A classe MergeSort implementa o algoritmo de ordenação Merge Sort.
 * O Merge Sort utiliza a técnica de "divisão e conquista", dividindo o array
 * em subarrays menores e os ordenando de forma recursiva, para depois
 * combiná-los em ordem crescente.
 */
public class MergeSort {

    /**
     * O método mergeSort realiza a divisão recursiva do array, chamando-se até
     * que os subarrays contenham apenas um elemento, e então chama o método
     * merge para combinar os subarrays ordenados.
     * 
     * @param vetor O array de inteiros a ser ordenado.
     * @param inicio O índice inicial do array a ser ordenado.
     * @param fim O índice final do array a ser ordenado.
     */
    public static void mergeSort(int vetor[], int inicio, int fim) {
        // Caso base: se o subarray tiver apenas um elemento, não há necessidade de ordenação
        if (inicio == fim) {
            return;
        }

        // Calcula o ponto médio do array
        int meio = (inicio + fim) / 2;

        // Ordena recursivamente as duas metades
        mergeSort(vetor, inicio, meio);
        mergeSort(vetor, meio + 1, fim);

        // Combina as duas metades ordenadas
        merge(vetor, inicio, meio, fim);
    }

    /**
     * O método merge combina dois subarrays ordenados em um único array ordenado.
     * 
     * @param vetor O array de inteiros contendo os subarrays a serem combinados.
     * @param inicio O índice inicial do primeiro subarray.
     * @param meio O índice final do primeiro subarray e o início do segundo subarray.
     * @param fim O índice final do segundo subarray.
     */
    public static void merge(int vetor[], int inicio, int meio, int fim) {
        int n = fim - inicio + 1;  // Número de elementos no subarray
        int[] b = new int[n];  // Array temporário para armazenar a combinação
        int i1 = inicio;  // Índice para percorrer o primeiro subarray
        int i2 = meio + 1;  // Índice para percorrer o segundo subarray
        int j = 0;  // Índice para preencher o array temporário

        // Combina os subarrays até que um deles seja totalmente percorrido
        while (i1 <= meio && i2 <= fim) {
            if (vetor[i1] < vetor[i2]) {
                b[j] = vetor[i1];  // Adiciona o menor elemento do primeiro subarray
                i1++;
            } else {
                b[j] = vetor[i2];  // Adiciona o menor elemento do segundo subarray
                i2++;
            }
            j++;
        }

        // Copia os elementos restantes do primeiro subarray, se houver
        while (i1 <= meio) {
            b[j] = vetor[i1];
            i1++;
            j++;
        }

        // Copia os elementos restantes do segundo subarray, se houver
        while (i2 <= fim) {
            b[j] = vetor[i2];
            i2++;
            j++;
        }

        // Copia os elementos combinados de volta ao array original
        for (j = 0; j < n; j++) {
            vetor[inicio + j] = b[j];
        }
    }

    /**
     * O método principal (main) inicializa um array de inteiros, ordena-o utilizando o Merge Sort
     * e imprime o resultado.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String args[]) {
        int vetor[] = {6, 4, 7, 9, 3, 2, 5};  // Array de inteiros a ser ordenado
        mergeSort(vetor, 0, vetor.length - 1);  // Chama o método mergeSort para ordenar o array

        // Exibe o array ordenado
        System.out.println("Elementos ordenados: ");
        for (int num : vetor) {
            System.out.println(num);
        }
    }
}
