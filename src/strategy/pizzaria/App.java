package strategy.pizzaria;

public class App {

    public static void main(String[] args) {

        //Comanda do rodízio iniciada
        PedidoDeCliente comandaRodizio = new Rodizio();
        ClientePizzaria clienteRodizio = new ClientePizzaria(comandaRodizio);

        System.out.println("= = = RODÍZIO  = = =");
        System.out.println("Novo Cliente  : " + clienteRodizio);

        clienteRodizio.fazerPedido(10);

        System.out.println("Valor a Pagar : " + clienteRodizio.getValorParaPagar() );
        clienteRodizio.pagarConta();

        //Comanda do alacarte iniciada
        PedidoDeCliente comandaAlacarte = new Alacarte();
        ClientePizzaria clienteAlacarte = new ClientePizzaria(comandaAlacarte);

        System.out.println("= = = ALACARTE = = =");
        System.out.println("Novo Cliente  : " + clienteAlacarte);

        clienteAlacarte.fazerPedido(10);

        System.out.println("Valor a pagar : " + clienteAlacarte.getValorParaPagar() );

        clienteAlacarte.pagarConta();
    }

}
