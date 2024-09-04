package classes;

public class ListaMoradores {

  // Atributos
  // ----- o objeto é (QuantidadeMoradores[] )
  // ----- e a váriavel para falar desse obj ou array é ( moradoresNaLista )
  private QuantidadeMoradores[] moradoresNaLista;
  private int contador;

  // Construtor
  // --- vou colocar um limite para a minha lista
  public ListaMoradores(int limite) {
    this.moradoresNaLista = new QuantidadeMoradores[limite];
    // iniciando a minha lista-array (zerada)
    this.contador = 0;
  }

  // Metodos
  // Adicionar
  public boolean adicionar(QuantidadeMoradores morador) {
    if (contador < moradoresNaLista.length) { // Corrigido o erro de digitação
      moradoresNaLista[contador++] = morador; // Adiciona e incrementa o contador
      return true;
    }
    return false; // Caso a lista esteja cheia
  }

  // Remover
  public boolean remover(int id) {
    for (int i = 0; i < contador; i++) {
      // O que acontece é que cada item do array (i) vai ser percorrido
      // usei o (.getId) assim me retorna o id de cada item unico
      // e faco a comparacao para ver se é igual ao meu item
      if (moradoresNaLista[i].getId() == id) {
        // Quando removo um elemento ao inves de passar o resto para a esquerda
        // subistituo o morador que vai ser removido pelo ultimo da lista
        // isso é para nao deixar buracos na nossa array
        moradoresNaLista[i] = moradoresNaLista[contador - 1];

        // após subistituir pelo ultimo temos que tirar ele da lista
        // por isso passamos o seu valor de null. Ex (retirando o Morador2 que no caso
        // esta na posicao (i = 1))
        // --- moradoresNaLista = [Morador1, Morador2, Morador3, Morador4]

        // Codigo : moradoresNaLista[i] = moradoresNaLista[contador - 1];

        // --- moradoresNaLista = [Morador1, Morador4, Morador3, Morador4]

        moradoresNaLista[contador - 1] = null;

        // --- moradoresNaLista = [Morador1, Morador4, Morador3, null]

        // e ai só retiramos da array
        contador--;
        return true;
      }
    }
    return false;
  }

  // Atualizar
  public boolean atualizar(int id, String nomeNovo, int idadeNova, String predioNovo, int numeroPredioNovo) {
    for (int i = 0; i < contador; i++) {
      if (moradoresNaLista[i].getId() == id) {
        moradoresNaLista[i].setNome(nomeNovo);
        moradoresNaLista[i].setIdade(idadeNova);
        moradoresNaLista[i].setPredio(predioNovo);
        moradoresNaLista[i].setNumeroPredio(numeroPredioNovo);
        return true;
      }
    }
    return false;
  }

  // Buscar
  public QuantidadeMoradores buscarMorador(int id) {
    for (int i = 0; i < contador; i++) {
      if (moradoresNaLista[i].getId() == id) {
        System.out.println("O morador (" + moradoresNaLista[i] + ") foi localizado.");
        return moradoresNaLista[i];
      }

    }
    System.out.println("O morador com ID " + id + " não foi localizado.");
    return null;
  }

  // listar
  public void listarMoradores() {
    if (contador == 0) {
      System.out.println("Nenhum morador na lista.");
    } else {
      for (int i = 0; i < contador; i++) {
        System.out.println(moradoresNaLista[i]); // Isso chama o método toString() de QuantidadeMoradores
      }
    }
  }
}
