public class Padaria {
    Fila fila = new Fila();
    Pilha pilha = new Pilha();

    public void entregarPedidoBalcao() {
        fila.remove();
        System.out.println("Pedido Entrege");
    }

    public void entregarPedidoTelefone() {
        pilha.pop();
        System.out.println("Pedido Saiu Para Entrega");
    }

    public void anotarPedidoBalcao(Pedido pedido) {
        fila.add(pedido);
    }

    public void anotarPedidoTelefone(Pedido pedido) {
        pilha.push(pedido);
    }

    public void mostrarFila() {
        Node temp = fila.cabeca;
        while (temp != null) {
            temp.pedido.imprimirPedido(1);
            temp = temp.proximo;
        }
    }

    public void mostrarPilha() {
        Node temp = pilha.cabeca;
        while (temp != null) {
            temp.pedido.imprimirPedido(2);
            temp = temp.proximo;
        }
    }

    public void mostrarFilaSaida() {
        fila.peek();
    }

    public void mostrarPilhaSaida() {
        pilha.peek();
    }

    public boolean verificarFilaVazia(){
        return fila.isEmpty();
    }

    public boolean verificarPilhaVazia(){
        return pilha.isEmpty();

    }
}
