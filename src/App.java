
import classes.ListaMoradores;
import classes.QuantidadeMoradores;

public class App {
    public static void main(String[] args) throws Exception {

        ListaMoradores lista = new ListaMoradores(10);

        // Adicionando
        System.out.println();
        System.out.println("Adicionando");
        System.out.println("================================================");
        lista.adicionar(new QuantidadeMoradores(2, "Ana", 25, "B", 202));
        lista.adicionar(new QuantidadeMoradores(3, "Fernando", 19, "C", 100));
        lista.adicionar(new QuantidadeMoradores(1, "Victor Godoy", 20, "A", 291));

        // atualizando
        System.out.println();
        System.out.println("Atualizaçao");
        System.out.println("================================================");
        lista.atualizar(1, "Victor Godoy", 21, "B", 202);

        // listando
        System.out.println();
        System.out.println("Listando");
        System.out.println("================================================");
        lista.listarMoradores();

        // buscando pela pessoa em especifico
        System.out.println();
        System.out.println("Buscando");
        System.out.println("================================================");
        lista.buscarMorador(1);

        // remover

    }
}
