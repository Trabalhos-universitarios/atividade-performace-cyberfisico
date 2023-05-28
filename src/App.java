import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color = "\u001B[";


        // ATIVIDADE 1
        System.out.println(color+33+"m"+"\n*** ATIVIDADE 1 ***"+color+"m");
        Thread t1 = new MinhaThread();
        Thread t2 = new MinhaThread();

        t1.start();
        t2.start();

        // Contagem de threads em execução
        ThreadGroup grupoThreads = Thread.currentThread().getThreadGroup();
        int quantidadeThreads = grupoThreads.activeCount();
        System.out.println("Quantidade de threads: " + quantidadeThreads);


        // ATIVIDADE 2
        System.out.println(color+33+"m"+"\n*** ATIVIDADE 2 ***"+color+"m");
        System.out.println(color+33+"m"+"\n*** VAMOS VERIFICAR EM UM INTERVALO DE NÚMEROS INTEIROS QUAIS SÃO OS NÚMEROS PRIMOS! ***"+color+"m");

        System.out.print("\nDigite o primeiro número: ");
        Integer inicio = input.nextInt();input.nextLine();
        System.out.print("\nDigite o segundo número: ");
        Integer fim = input.nextInt();input.nextLine();
        
        List<Integer> primos = NumerosPrimos.encontrarNumerosPrimos(inicio, fim);
        
        System.out.print("\nPrimos: ");
        for (int primo : primos) {
            System.out.println();
            System.out.print("[ "+color+32+"m"+primo+color+"m"+" ]");
        }


        // ATIVIDADE 3
        System.out.println(color+33+"m"+"\n*** ATIVIDADE 3 ***"+color+"m");
        NumerosPrimosThread thread = new NumerosPrimosThread(inicio, fim);
        thread.start();


        // ATIVIDADE 4
        System.out.println(color+33+"m"+"\n*** ATIVIDADE 4 ***"+color+"m");
        int meio = (inicio + fim) / 2;

        NumerosPrimosThread thread1 = new NumerosPrimosThread(inicio, meio);
        NumerosPrimosThread thread2 = new NumerosPrimosThread(meio + 1, fim);

        thread1.start();
        thread2.start();


        //ATIVIDADE 5
        System.out.println(color+33+"m"+"\n*** ATIVIDADE 5 ***"+color+"m");
        List<Intervalo> intervalos = new ArrayList<>();
        intervalos.add(new Intervalo(5, 50));
        intervalos.add(new Intervalo(50, 100));
        intervalos.add(new Intervalo(100, 150));
        intervalos.add(new Intervalo(150, 200));

        List<NumerosPrimosThread> threads = new ArrayList<>();

        for (Intervalo intervalo : intervalos) {
            NumerosPrimosThread thread_ = new NumerosPrimosThread(intervalo.getInicio(), intervalo.getFim());
            threads.add(thread_);
            thread_.start();
        }

        for (NumerosPrimosThread thread_ : threads) {
            try {
                thread_.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        // ATIVIDADE 6
        System.out.println(color+33+"m"+"\n*** ATIVIDADE 6 ***"+color+"m");
        intervalos.add(new Intervalo(5, 5000000));
        intervalos.add(new Intervalo(5000001, 10000000));
        intervalos.add(new Intervalo(10000001, 15000000));
        intervalos.add(new Intervalo(15000001, 20000000));

        for (Intervalo intervalo : intervalos) {
            NumerosPrimosThread thread_ = new NumerosPrimosThread(intervalo.getInicio(), intervalo.getFim());
            threads.add(thread_);
            thread_.start();
        }

        for (NumerosPrimosThread thread_ : threads) {
            try {
                thread_.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}