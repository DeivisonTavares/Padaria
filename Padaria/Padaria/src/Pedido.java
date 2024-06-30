public class Pedido {
    private int qtdePao, qtdePizza, qtdeCoxinha, qtdeEmpada, qtdeEsfirra, qtdePaoDoce;

    String res = "";

    private int comanda;
    //Tipo 1 = Pedido bancada ; Tipo 2 = Pedido telefone
    private int tipo;
    private String endereco;

    public Pedido(int comanda, int tipo) {
        this.comanda = comanda;
        this.tipo = tipo;
        this.endereco = "";
    }

    public void adicionarNoCarrinho(int tipo) {
        switch (tipo) {
            case 1:
                this.qtdePao = this.qtdePao + 1;
                break;
            case 2:
                this.qtdePizza = this.qtdePizza + 1;
                break;
            case 3:
                this.qtdeCoxinha = this.qtdeCoxinha + 1;
                break;
            case 4:
                this.qtdeEmpada = this.qtdeEmpada + 1;
                break;
            case 5:
                this.qtdeEsfirra = this.qtdeEsfirra + 1;
                break;
            case 6:
                this.qtdePaoDoce = this.qtdePaoDoce + 1;
                break;
        }
    }

    public void imprimirCarrinho(Pedido pedido) {
        String res = "";

        if (qtdePao > 0)
            res += "Pão: " + qtdePao + " / ";
        if (qtdePizza > 0)
            res += "Mini Pizza: " + qtdePizza + " / ";
        if (qtdeCoxinha > 0)
            res += "Coxinha: " + qtdeCoxinha + " / ";
        if (qtdeEmpada > 0)
            res += "Empada: " + qtdeEmpada + " / ";
        if (qtdeEsfirra > 0)
            res += "Esfirra: " + qtdeEsfirra + " / ";
        if (qtdePaoDoce > 0)
            res += "Pão Doce: " + qtdePaoDoce + " / ";

        System.out.println("Carrinho: " + res + "\n");

    }

    public void imprimirPedido(int tipo) {

        if (qtdePao > 0)
            res += "Pão: " + qtdePao + " \n";
        if (qtdePizza > 0)
            res += "Mini Pizza: " + qtdePizza + " \n";
        if (qtdeCoxinha > 0)
            res += "Coxinha: " + qtdeCoxinha + " \n";
        if (qtdeEmpada > 0)
            res += "Empada: " + qtdeEmpada + " \n";
        if (qtdeEsfirra > 0)
            res += "Esfirra: " + qtdeEsfirra + " \n";
        if (qtdePaoDoce > 0)
            res += "Pão Doce: " + qtdePaoDoce + " \n";

        //Tipo 1 = Balcão
        if (this.tipo == 1) {
            System.out.println(
                    "##### PEDIDO ##### \n" +
                            "COMANDA: " + comanda + " \n" +
                            (!endereco.equals("") ? "ENDEREÇO: " + endereco + "\n\n" : "\n") +
                            res);
        }
        if (this.tipo == 2) {
            System.out.println(
                    "##### PEDIDO ##### \n" +
                            "COMANDA: " + comanda + " \n" +
                            (!endereco.equals("") ? "ENDEREÇO: " + endereco + "\n\n" : "\n") +
                            res);
        }

        res = "";
    }

    public void adicionarEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
