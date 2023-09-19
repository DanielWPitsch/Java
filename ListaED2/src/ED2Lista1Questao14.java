import java.util.Scanner;

/**
** Função : sistema de reserva de passagens aéreas
** Autor : Daniel Warella Pitsch
** Data : 09/09/2023
** Observações:
*/

public class ED2Lista1Questao14 {
	public static class Passageiro {
        private final String nome;
        private final String cpf;
        private final String telefone;

        public Passageiro(String nome, String cpf, String telefone) {
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
        }

    }

    public static class ListaPassageiros {
        private static class Node {
            private final Passageiro passageiro;
            private Node next;

            public Node(Passageiro passageiro, Node next) {
                this.passageiro = passageiro;
                this.next = next;
            }
        }

        private Node head = null;
        private int size = 0;

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void addFirst(Passageiro passageiro) {
            head = new Node(passageiro, head);
            size++;
        }

        public void addLast(Passageiro passageiro) {
            Node newest = new Node(passageiro, null);
            if (isEmpty()) {
                head = newest;
            } else {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = newest;
            }
            size++;
        }

        public Passageiro removeFirst() {
            if (isEmpty()) return null;
            Passageiro answer = head.passageiro;
            head = head.next;
            size--;
            return answer;
        }
    }

    public static class Voo {
        private final int numero;
        private final String destino;
        private final String aeronave;
        private final int assentosTotais;
        private int assentosSobrando;
        private final ListaPassageiros listaPassageiros;

        public Voo(int numero, String destino, String aeronave, int assentosTotais, int assentosSobrando) {
            this.numero = numero;
            this.destino = destino;
            this.aeronave = aeronave;
            this.assentosTotais = assentosTotais;
            this.assentosSobrando = assentosSobrando;
            this.listaPassageiros = new ListaPassageiros();
        }


    }

    public static class ListaVoos {
        private static class Node {
            private final Voo voo;
            private Node next;

            public Node(Voo voo, Node next) {
                this.voo = voo;
                this.next = next;
            }
        }

        private Node head = null;
        private int size = 0;

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void addFirst(Voo voo) {
            head = new Node(voo, head);
            size++;
        }

        public void addLast(Voo voo) {
            Node newest = new Node(voo, null);
            if (isEmpty()) {
                head = newest;
            } else {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = newest;
            }
            size++;
        }

        public Voo removeFirst() {
            if (isEmpty()) return null;
            Voo answer = head.voo;
            head = head.next;
            size--;
            return answer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaVoos listaVoos = new ListaVoos();
        boolean sair = false;

        while (!sair) {

            System.out.println("\nMenu de opções:");
            System.out.println("1. Adicionar voo");
            System.out.println("2. Remover voo");
            System.out.println("3. Listar voos");
            System.out.println("4. Adicionar passageiro a um voo");
            System.out.println("5. Remover passageiro de um voo");
            System.out.println("6. Listar passageiros de um voo");
            System.out.println("7. Sair");
            System.out.print("\nDigite a opção desejada: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {


                System.out.print("Digite o número do voo que deseja adicionar: ");
                int numeroVoo = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite o destino do voo: ");
                String destinoVoo = sc.nextLine();
                System.out.print("Digite a aeronave do voo: ");
                String aeronaveVoo = sc.nextLine();
                System.out.print("Digite o número total de assentos do voo: ");
                int assentosTotaisVoo = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite o total de assentos disponíveis do voo: ");
                int assentosSobrandoVoo = sc.nextInt();
                sc.nextLine();

                Voo voo = new Voo(numeroVoo, destinoVoo, aeronaveVoo, assentosTotaisVoo, assentosSobrandoVoo);
                listaVoos.addLast(voo);
                System.out.println("\nVoo adicionado com sucesso!");

            }else if (opcao == 2) {


                System.out.print("Digite o número do voo que deseja remover: ");
                int numeroVoo = sc.nextInt();
                sc.nextLine();

                ListaVoos.Node current = listaVoos.head;
                ListaVoos.Node previous = null;

                while (current != null) {
                    if (current.voo.numero == numeroVoo) {
                        if (previous == null) {
                            listaVoos.head = current.next;
                        } else {
                            previous.next = current.next;
                        }
                        listaVoos.size--;
                        System.out.println("\nVoo removido com sucesso!");
                        break;
                    }
                    previous = current;
                    current = current.next;
                }

            } if (opcao == 3) {

                System.out.println("\nLista de voos cadastrados:");
                ListaVoos.Node current = listaVoos.head;

                while (current != null) {
                    System.out.println("\nNúmero do voo: " + current.voo.numero);
                    System.out.println("Destino do voo: " + current.voo.destino);
                    System.out.println("Aeronave do voo: " + current.voo.aeronave);
                    System.out.println("Total de assentos do voo: " + current.voo.assentosTotais);
                    System.out.println("Total de assentos disponíveis do voo: " + current.voo.assentosSobrando);
                    System.out.println();
                    current = current.next;
                }

            } else if (opcao == 4) {


                System.out.print("Digite o número do voo, que deseja adicionar um passageiro: ");
                int numeroVoo = sc.nextInt();
                sc.nextLine();

                // código para procurar o voo na lista
                ListaVoos.Node current = listaVoos.head;
                Voo vooEncontrado = null;

                while (current != null) {
                    if (current.voo.numero == numeroVoo) {
                        vooEncontrado = current.voo;
                        break;
                    }
                    current = current.next;
                }

                if (vooEncontrado != null) {


                    System.out.print("Digite o nome do passageiro: ");
                    String nomePassageiro = sc.nextLine();
                    System.out.print("Digite o CPF do passageiro: ");
                    String cpfPassageiro = sc.nextLine();
                    System.out.print("Digite o telefone do passageiro: ");
                    String telefonePassageiro = sc.nextLine();

                    Passageiro passageiro = new Passageiro(nomePassageiro, cpfPassageiro, telefonePassageiro);
                    vooEncontrado.listaPassageiros.addLast(passageiro);
                    vooEncontrado.assentosSobrando--;
                    System.out.println("\nPassageiro adicionado com sucesso!");

                } else {


                    System.out.println("\nDesculpe! Voo não encontrado!");

                }

            } if (opcao == 5) {


                System.out.print("Digite o número do voo, que deseja remover um passageiro: ");
                int numeroVoo = sc.nextInt();
                sc.nextLine();

                ListaVoos.Node current = listaVoos.head;
                Voo vooEncontrado = null;

                while (current != null) {
                    if (current.voo.numero == numeroVoo) {
                        vooEncontrado = current.voo;
                        break;
                    }
                    current = current.next;
                }

                if (vooEncontrado != null) {

                    System.out.print("Digite o CPF do passageiro a ser removido: ");
                    String cpfPassageiro = sc.nextLine();

                    ListaPassageiros.Node currentPassageiro = vooEncontrado.listaPassageiros.head;
                    ListaPassageiros.Node previousPassageiro = null;

                    while (currentPassageiro != null) {
                        if (currentPassageiro.passageiro.cpf.equals(cpfPassageiro)) {
                            if (previousPassageiro == null) {
                                vooEncontrado.listaPassageiros.head = currentPassageiro.next;
                            } else {
                                previousPassageiro.next = currentPassageiro.next;
                            }
                            vooEncontrado.listaPassageiros.size--;
                            vooEncontrado.assentosSobrando++;
                            System.out.println("\nPassageiro removido com sucesso!");
                            break;
                        }
                        previousPassageiro = currentPassageiro;
                        currentPassageiro = currentPassageiro.next;
                    }

                } else {

                    // se o voo não foi encontrado, exibir uma mensagem de erro
                    System.out.println("\nDesculpe! Voo não encontrado!");
                }

            } if (opcao == 6) {

                System.out.print("Digite o número do voo, que deseja listas os passageiros: ");
                int numeroVoo = sc.nextInt();
                sc.nextLine();


                ListaVoos.Node current = listaVoos.head;
                Voo vooEncontrado = null;

                while (current != null) {
                    if (current.voo.numero == numeroVoo) {
                        vooEncontrado = current.voo;
                        break;
                    }
                    current = current.next;
                }

                if (vooEncontrado != null) {

                    ListaPassageiros.Node currentPassageiro = vooEncontrado.listaPassageiros.head;

                    while (currentPassageiro != null) {
                        System.out.println("\nNome do passageiro: " + currentPassageiro.passageiro.nome);
                        System.out.println("CPF do passageiro: " + currentPassageiro.passageiro.cpf);
                        System.out.println("Telefone do passageiro: " + currentPassageiro.passageiro.telefone);
                        System.out.println();
                        currentPassageiro = currentPassageiro.next;
                    }

                } else {

                    System.out.println("\nDesculpe! Voo não encontrado!");
                }

            } else if (opcao == 7) {

                sair = true;
            }
        }
    }
}
