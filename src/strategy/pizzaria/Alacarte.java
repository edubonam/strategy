package strategy.pizzaria;

public class Alacarte implements PedidoDeCliente {
    @Override
    public double retornaValor(int quantidadePizzas) {
        //considerando que todas as pizzas dessa pizzaria tem um valor igual de 10
        return 10 * quantidadePizzas;
    }
}
