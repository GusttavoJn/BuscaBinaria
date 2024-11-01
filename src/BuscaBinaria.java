import java.util.stream.IntStream;

public class BuscaBinaria {
	
    public static void binaria(int[] v, int target) {
        int cont = 0;
        busca(v, 0, v.length - 1, target, cont);
    }

    private static void busca(int[] v, int inicio, int fim, int target, int cont) {
        if (inicio <= fim) {
            cont++;
            int meio = (inicio + fim) / 2;

            if (v[meio] == target) {
		        System.out.println("O número " + target + " foi encontrado na posicao " + meio);
                System.out.println("Nº de testes: " + cont);
            } else if (v[meio] < target) {
                busca(v, meio + 1, fim, target, cont);
            } else {
                busca(v, inicio, meio - 1, target, cont);
            }
            cont++;

        } else {
            System.out.println("O valor " + target + " não foi encontrado!");
            System.out.println("Numero(s) de teste: " + cont);
        }
    }
    
    public static int[] vet(int n1, int n2) {
        int[] vetor = IntStream.range(n1, n2).toArray();
        return vetor;
    }

    public static void main(String[] args) {
        //10
        binaria(vet(1,11), 100);

        //100
        binaria(vet(1,101), 200);

        //1.000
        binaria(vet(1,1001), 2000);

        //10.000
        binaria(vet(1,10001), 20000);

        //100.000
        binaria(vet(1,100001), 200000);

        //1.000.000
        binaria(vet(1,1000001), 2000000);

        //10.000.000
        binaria(vet(1,10000001), 20000000);

        //100.000.000
        binaria(vet(1,100000001), 200000000);

	}
}
