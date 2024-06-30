import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int escolha = 0;
        int comanda = 0;
        boolean erro = false;
        Scanner sc = new Scanner(System.in);
        Padaria padaria = new Padaria();

        while (escolha != 10) {
            try {
                if (!erro) {
                    limpar();
                }
                menu();
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        comanda++;
                        limpar();
                        System.out.println("##### PADARIA ##### \n" +
                                "1 - Pedir no Balcão \n" +
                                "2 - Pedir por Telefone \n");
                        escolha = sc.nextInt();

                        if (escolha == 1) {
                            Pedido pedidoBancada = new Pedido(comanda, 1);
                            limpar();
                            while (escolha != 7) {
                                limpar();
                                cardapio(pedidoBancada);
                                escolha = sc.nextInt();

                                switch (escolha) {
                                    case 1:
                                        pedidoBancada.adicionarNoCarrinho(1);
                                        break;
                                    case 2:
                                        pedidoBancada.adicionarNoCarrinho(2);
                                        break;
                                    case 3:
                                        pedidoBancada.adicionarNoCarrinho(3);
                                        break;
                                    case 4:
                                        pedidoBancada.adicionarNoCarrinho(4);
                                        break;
                                    case 5:
                                        pedidoBancada.adicionarNoCarrinho(5);
                                        break;
                                    case 6:
                                        pedidoBancada.adicionarNoCarrinho(6);
                                        break;
                                }
                            }
                            padaria.anotarPedidoBalcao(pedidoBancada);
                            escolha = 0;
                            while (escolha != 1) {
                                limpar();
                                pedidoBancada.imprimirPedido(1);
                                System.out.println("\n1 - Voltar para o Menu\n");
                                escolha = sc.nextInt();
                            }
                        }
                        if (escolha == 2) {
                            String endereco = "";
                            Pedido pedidoTelefone = new Pedido(comanda, 2);
                            limpar();
                            System.out.println("Digite o seu Endereço: \n");
                            endereco = sc.next();
                            pedidoTelefone.adicionarEndereco(endereco);
                            while (escolha != 7) {
                                limpar();
                                cardapio(pedidoTelefone);
                                escolha = sc.nextInt();

                                switch (escolha) {
                                    case 1:
                                        pedidoTelefone.adicionarNoCarrinho(1);
                                        break;
                                    case 2:
                                        pedidoTelefone.adicionarNoCarrinho(2);
                                        break;
                                    case 3:
                                        pedidoTelefone.adicionarNoCarrinho(3);
                                        break;
                                    case 4:
                                        pedidoTelefone.adicionarNoCarrinho(4);
                                        break;
                                    case 5:
                                        pedidoTelefone.adicionarNoCarrinho(5);
                                        break;
                                    case 6:
                                        pedidoTelefone.adicionarNoCarrinho(6);
                                        break;
                                }
                            }
                            padaria.anotarPedidoTelefone(pedidoTelefone);
                            escolha = 0;
                            while (escolha != 1) {
                                limpar();
                                pedidoTelefone.imprimirPedido(2);
                                System.out.println("\n1 - Voltar para o Menu\n");
                                escolha = sc.nextInt();
                            }
                        }
                        break;

                    case 2:
                        limpar();
                        System.out.println("##### PADARIA ##### \n" +
                                "1 - Fila do Balcão \n" +
                                "2 - Fila do Telefone \n");

                        escolha = sc.nextInt();

                        if (escolha == 1) {
                            escolha = 0;
                            while (escolha != 1) {
                                limpar();
                                System.out.println("FILA:\n\n");
                                padaria.mostrarFila();
                                System.out.println("\n1 - Voltar para o Menu\n");
                                escolha = sc.nextInt();
                            }

                        } else if (escolha == 2) {
                            escolha = 0;
                            while (escolha != 1) {
                                limpar();
                                System.out.println("PILHA:\n\n");
                                padaria.mostrarPilha();
                                System.out.println("\n1 - Voltar para o Menu\n");
                                escolha = sc.nextInt();
                            }
                        }
                        else{
                            limpar();
                            System.out.println("Escolha uma opção valida");
                            erro = true;
                        }

                        escolha = 0;
                        break;

                    case 3:
                        if (!padaria.verificarFilaVazia()) {
                            limpar();
                            padaria.mostrarFilaSaida();
                            System.out.println("Entregar \n" +
                                    "1 - Sim \t 2 - Não ");
                            escolha = sc.nextInt();
                            if (escolha == 1) {
                                padaria.entregarPedidoBalcao();
                            }
                        } else {
                            escolha = 0;
                            while (escolha != 1) {
                                limpar();
                                System.out.println("Nenhuma Entrega Para Realizar\n\n");
                                System.out.println("\n1 - Voltar para o Menu\n");
                                escolha = sc.nextInt();
                            }
                        }

                        break;
                    case 4:
                        if (!padaria.verificarPilhaVazia()) {

                            limpar();
                            padaria.mostrarPilhaSaida();
                            System.out.println("Entregar \n" +
                                    "1 - Sim \t 2 - Não ");
                            escolha = sc.nextInt();
                            if (escolha == 1) {
                                padaria.entregarPedidoTelefone();
                            }
                        } else {
                            escolha = 0;
                            while (escolha != 1) {
                                limpar();
                                System.out.println("Nenhuma Entrega Para Realizar\n\n");
                                System.out.println("\n1 - Voltar para o Menu\n");
                                escolha = sc.nextInt();
                            }
                        }

                        break;

                    case 10:
                        limpar();
                        System.out.println("Volte sempre...");
                        break;
                }
            } catch (Exception e) {
                limpar();
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                erro = true;
                sc.nextLine();
            }
        }
        sc.close();
    }

    static void menu() {
        System.out.println("##### PADARIA ##### \n" +
                "1 - Fazer Pedido \n" +
                "2 - Ver Fila de Pedidos \n" +
                "3 - Entregar Pedido Balcão \n" +
                "4 - Entregar Pedido Delivery \n\n" +
                "10 - Sair \n");
    }

    static void limpar() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

    static void cardapio(Pedido pedido) {
        System.out.println("##### CARDÁPIO #####  \n" +
                "1 - Pão Careca \t 2 - Mini Pizza \n" +
                "3 - Coxinha    \t 4 - Empada     \n" +
                "5 - Esfirra    \t 6 - Pão Doce   \n\n" +
                "7 - Finalizar Carrinho   \n");

        pedido.imprimirCarrinho(pedido);
    }

}
