public class Fila {

    String res = "";
    Node cabeca;
    Node calda;
    int count = 0;
    
    public Fila(){
        this.cabeca = null;
        this.calda = null;
    }


    public void add(Pedido pedido){
        Node temp = new Node(pedido);

        if(calda == null){
            cabeca = temp;
            calda = temp;
        }else{
            temp.anterior = calda;
            calda.proximo = temp;
            calda = temp;
        }
        
        count ++;
    }

    public void peek(){
        Node temp = cabeca;
        
        temp.pedido.imprimirPedido(1);
    }

    public void remove() {
        if (cabeca == null) {
            System.out.println("Não há elementos na lista a serem removidos");
            return; 
        }
    
        if (cabeca.proximo == null) {
            calda = null;
            cabeca = null;
        } else {
            Node temp = cabeca;
            cabeca = cabeca.proximo;
            cabeca.anterior = null;
            temp.proximo = null;
        }
    
        count--;
    }
    

    public boolean isEmpty(){
        if(calda == null){
           return true;
        }
        return false;
    }

}
