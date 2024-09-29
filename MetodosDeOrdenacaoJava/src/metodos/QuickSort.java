package metodos;

/**
 * A classe QuickSort implementa o algoritmo de ordenação Quick Sort.
 * O Quick Sort é um algoritmo eficiente de ordenação que utiliza a técnica de
 * "divisão e conquista", selecionando um elemento como pivô e particionando o array
 * em torno desse pivô.
 */
public class QuickSort {

    /**
     * O método Quick é responsável pela chamada recursiva do algoritmo Quick Sort.
     * Ele divide o array em duas partes com base em um pivô e ordena cada parte.
     * 
     * @param p O índice inicial do array ou subarray.
     * @param q O índice final do array ou subarray.
     * @param vetor O array de inteiros a ser ordenado.
     */
    public static void Quick(int p, int q, int vetor[]) {
        if (p < q) {
            // Chama a função de partição e obtém o índice do pivô corretamente posicionado
            int x = particao(p, q, vetor);

            // Chama o Quick Sort recursivamente para os subarrays à esquerda e à direita do pivô
            Quick(p, x - 1, vetor);
            Quick(x + 1, q, vetor);
        }
    }

    /**
     * O método particao organiza o array em torno de um pivô, movendo todos os elementos
     * menores que o pivô para a esquerda e todos os elementos maiores para a direita.
     * 
     * @param p O índice inicial do subarray a ser particionado.
     * @param q O índice final do subarray a ser particionado.
     * @param vetor O array de inteiros a ser particionado.
     * @return O índice do pivô após a partição.
     */
    public static int particao(int p, int q, int vetor[]) {
        int aux = vetor[q];  // Escolhe o último elemento como pivô
        int j = p - 1;  // Índice para elementos menores que o pivô

        // Percorre o array e compara cada elemento com o pivô
        for (int i = p; i <= q; i++) {
            if (vetor[i] <= aux) {
                j++;  // Incrementa o índice de elementos menores

                // Troca os elementos
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        return j;  // Retorna a posição final do pivô
    }

    /**
     * O método principal (main) inicializa um array de inteiros, ordena-o utilizando o Quick Sort
     * e imprime o resultado.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String args[]) {
        int vetor[] = {6, 2, 3, 8, 5, 9, 1, 4, 7};  // Array de inteiros a ser ordenado
        Quick(0, vetor.length - 1, vetor);  // Chama o método Quick para ordenar o array

        // Exibe o array ordenado
        System.out.println("Elementos ordenados: ");
        for (int num : vetor) {
            System.out.println(num);
        }
    }
}
