
import java.util.Scanner;
import classes.ListaMoradores;
import classes.QuantidadeMoradores;

public class App {
    public static void main(String[] args) throws Exception {

        ListaMoradores lista = new ListaMoradores(10);
        Scanner sc = new Scanner(System.in);

        int opc;



        System.out.println();
        System.out.println("================ Bem Vindo ao CRUD de Moradores ================");
        System.out.println();

    do {
        //lista para escolha 
        System.out.println("\nDigite a opção que deseja:");
        System.out.println("1 - Adicionar um novo morador");
        System.out.println("2 - Atualizar registro do morador");
        System.out.println("3 - Remover morador");
        System.out.println("4 - Buscar morador pelo código de ID");
        System.out.println("5 - Listar moradores");
        System.out.println("6 - Sair");
        System.out.println("Digite aqui : ");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc) {
            case 1:
                // adicionando 
                System.out.print("Digite o ID do morador: ");
                int id = sc.nextInt();
                sc.nextLine(); 

                System.out.print("Digite o nome do morador: ");
                String nome = sc.nextLine();

                System.out.print("Digite a idade do morador: ");
                int idade = sc.nextInt();

                System.out.print("Digite o Prédio do morador (A) (B) (C) : ");
                String predio = sc.next();

                System.out.print("Digite o novo apartamento do morador: Ex(100.102...)");
                int numeroPredio = sc.nextInt();
                sc.nextLine(); 

                System.out.println();
                lista.adicionar(new QuantidadeMoradores(id, nome, idade, predio, numeroPredio));

                System.out.println("Morador(a) : "  + nome + " adicionado com sucesso ");
                System.out.println();

                break;
            

            case 2:
                // atualizando
                System.out.print("Digite o ID do morador que deseja atualizar: ");
                    int idParaAtualizar = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Digite o novo nome do morador: ");
                    String nomeN = sc.nextLine();

                    System.out.print("Digite a nova idade do morador: ");
                    int idadeN = sc.nextInt();

                    System.out.print("Digite o novo Prédio do morador (A) (B) (C) :");
                    String predioN = sc.next();

                    System.out.print("Digite o novo apartamento do morador:Ex(100.102...) ");
                    int numeroPredioN = sc.nextInt();
                    sc.nextLine(); 

                    System.out.println();
                    lista.atualizar(idParaAtualizar, nomeN, idadeN, predioN, numeroPredioN);
                    System.out.println("Atualizado com sucesso!");
                    System.out.println();
    
                    break;
           

            case 3:
                // remover
                System.out.print("Digite o ID do morador que deseja remover: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine(); 

                    System.out.println();
                    lista.remover(idRemover);
                    System.out.println("Morador removido com sucesso!");
                    System.out.println();
                    break;
            
            case 4:
                // buscando
                System.out.print("Digite o ID do morador que deseja buscar: ");
                int idBusca = sc.nextInt();
                sc.nextLine();

                System.out.println();
                lista.buscarMorador(idBusca);
                break;

            case 5:
                // listando
                 System.out.println("Lista de Moradores:");
                 System.out.println("====================");
                 System.out.println();
                 lista.listarMoradores();
                 break;

            case 6:
                System.out.println("Saindo do programa...");
                break;
            
            default:
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                break;
        }

    }
    while (opc != 6);
        sc.close();
    }
}
