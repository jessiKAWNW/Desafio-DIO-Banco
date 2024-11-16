public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Jessica");

        Conta contac = new ContaCorrente(cliente);
        Conta contap = new ContaCorrente(cliente);

        contac.depositar(100);
        contac.tranferir(50.00,contap);

        contac.imprimirExtrato();
        contap.imprimirExtrato();




    }
}
