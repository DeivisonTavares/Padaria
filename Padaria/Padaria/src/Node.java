public class Node {
    Pedido pedido;
    Node proximo;
    Node anterior;

    public Node(Pedido pedido){

        this.pedido = pedido;
        this.proximo = null;
        this.anterior = null;


    }
}
