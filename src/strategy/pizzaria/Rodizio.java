package strategy.pizzaria;

public class Rodizio implements PedidoDeCliente {

    @Override
    public double retornaValor(int quantidadePizzas) {
        //valor base do rodízio de pizza, independentemente da quantidade de pizzas consumidas
        return 50.99;
    }
}
