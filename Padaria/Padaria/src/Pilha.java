public class Pilha {

    Node cabeca;
    Node calda;

    public Pilha() {
        this.cabeca = null;
        this.calda = null;
    }

    public void push(Pedido pedido) {
        Node temp = new Node(pedido);
        if (cabeca == null) {
            cabeca = temp;
            calda = temp;
        } else {
            temp.proximo = cabeca;
            cabeca.anterior = temp;
            cabeca = temp;
            
        } 
    }

    public void peek() {
        cabeca.pedido.imprimirPedido(2);
    }

    public void pop() {

        if (cabeca == null) {
            return;
        }
        if (cabeca == calda) {
            cabeca = null;
            calda = null;
            return;
        }
        Node temp = cabeca;
        cabeca = cabeca.proximo;
        cabeca.anterior = null;
        temp.proximo = null;

    }

    public boolean isEmpty(){
        if(cabeca == null){
            return true;
         }
         return false;

        
    }

}