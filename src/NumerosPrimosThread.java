import java.util.ArrayList;
import java.util.List;

public class NumerosPrimosThread extends Thread {
    private int inicio;
    private int fim;
    String color = "\u001B[";

    public NumerosPrimosThread(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {
        List<Integer> primos = encontrarNumerosPrimos(inicio, fim);
        System.out.print(color+33+"m"+"\nPrimos no intervalo [" + inicio + "-" + fim + "]: "+color+"m");
        for (int primo : primos) {
            System.out.print("[ "+color+32+"m"+primo+color+"m"+" ]");
        }
        System.out.println();
    }

    public List<Integer> encontrarNumerosPrimos(int inicio, int fim) {
        List<Integer> primos = new ArrayList<>();

        for (int numero = inicio; numero <= fim; numero++) {
            if (ehPrimo(numero)) {
                primos.add(numero);
            }
        }

        return primos;
    }

    public boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}