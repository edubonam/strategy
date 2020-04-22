package strategy.pizzaria;

public class ClientePizzaria {

    private PedidoDeCliente tipoDeComanda;
    private int quantidadeDePizzasPedidas;

    public ClientePizzaria(PedidoDeCliente tipoDeComanda) {
        setTipoDeComanda(tipoDeComanda);
    };

    public void setTipoDeComanda(PedidoDeCliente tipoDeComanda){
        this.tipoDeComanda = tipoDeComanda;
    };

    public void fazerPedido(int quantidadeDePizzas){
        this.quantidadeDePizzasPedidas = this.quantidadeDePizzasPedidas + quantidadeDePizzas;
    };

    public double getValorParaPagar(){
       return this.tipoDeComanda.retornaValor(quantidadeDePizzasPedidas);
    };

    public void pagarConta(){
        this.tipoDeComanda.retornaValor(quantidadeDePizzasPedidas);
        this.quantidadeDePizzasPedidas = 0;
        System.out.println("Conta paga com sucesso!");
    };

}
