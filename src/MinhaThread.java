
class MinhaThread extends Thread {
    @Override
    public void run() {
        // Coloque um breakpoint aqui para observar a execução das threads
        System.out.println("Executando thread " + Thread.currentThread().getId());
    }
}
