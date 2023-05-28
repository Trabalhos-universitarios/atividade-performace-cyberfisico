import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {
    
    public static List<Integer> encontrarNumerosPrimos(int inicio, int fim) {
        List<Integer> primos = new ArrayList<>();
        
        for (int numero = inicio; numero <= fim; numero++) {
            if (ehPrimo(numero)) {
                primos.add(numero);
            }
        }
        
        return primos;
    }
    
    public static boolean ehPrimo(int numero) {
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

