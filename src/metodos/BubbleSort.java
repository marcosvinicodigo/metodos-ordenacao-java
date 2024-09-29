package metodos;

/**
 * A classe BubbleSort implementa o algoritmo de ordenação Bubble Sort.
 * O Bubble Sort percorre o array várias vezes, trocando os elementos adjacentes
 * que estão fora de ordem, até que a lista esteja completamente ordenada.
 */
public class BubbleSort {

    /**
     * O método Bolhas realiza a ordenação de um array de inteiros utilizando o algoritmo Bubble Sort.
     * 
     * @param numeros Um array de inteiros a ser ordenado.
     */
    public static void Bolhas(int numeros[]) {
        int n = numeros.length;  // Armazena o comprimento do array
        int aux;  // Variável auxiliar para realizar as trocas

        // Laço externo controla o número de iterações
        for (int i = 0; i < n - 1; i++) {

            // Laço interno percorre o array, comparando pares de elementos adjacentes
            for (int j = 0; j < n - 1 - i; j++) {

                // Se o elemento atual for maior que o próximo, troca os dois
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];  // Armazena o valor do elemento atual
                    numeros[j] = numeros[j + 1];  // Move o próximo elemento para a posição atual
                    numeros[j + 1] = aux;  // Coloca o valor armazenado na posição seguinte
                }
            }
        }
    }

    /**
     * O método principal (main) inicializa um array de inteiros, ordena-o utilizando o Bubble Sort
     * e imprime o resultado.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String args[]) {
        int numeros[] = {5, 2, 7, 9, 4, 3, 1, 6};  // Array de inteiros a ser ordenado
        Bolhas(numeros);  // Chama o método para ordenar o array

        // Exibe o array ordenado
        System.out.println("Elementos ordenados: ");
        for (int num : numeros)
            System.out.println(num + " ");  // Imprime cada elemento do array ordenado
    }
}
