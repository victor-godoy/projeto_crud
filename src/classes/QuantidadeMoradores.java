package classes;

public class QuantidadeMoradores {

  // Atributos
  private int id;
  private String nome;
  private int idade;
  private String predio;
  private int numeroPredio;

  // Construtor
  public QuantidadeMoradores(int id, String nome, int idade, String predio, int numeroPredio) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.predio = predio;
    this.numeroPredio = numeroPredio;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  // Setters
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getPredio() {
    return predio;
  }

  public void setPredio(String predio) {
    this.predio = predio;
  }

  public int getNumeroPredio() {
    return numeroPredio;
  }

  public void setNumeroPredio(int numeroPredio) {
    this.numeroPredio = numeroPredio;
  }
}
