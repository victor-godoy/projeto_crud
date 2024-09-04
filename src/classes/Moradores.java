package classes;

public class Moradores {

  // Atributos
  private String name;
  private int idade;
  private String predio;
  private int numeroPredio;

  // Consrutor
  public Moradores(String name, int idade, String predio, int numeroPredio) {
    this.name = name;
    this.idade = idade;
    this.predio = predio;
    this.numeroPredio = numeroPredio;
  }

  // Getters = serve para acessar os valores
  public String getName() {
    return name;
  }

  public int getIdade() {
    return idade;
  }

  public String getPredio() {
    return predio;
  }

  public int getNumPredio() {
    return numeroPredio;
  }

  // Setters = serve para modificarmos os valores
  // como queremos modificar o valor, logo não precisamos do retorno por isso
  // passamos
  // metodo ( void )
  public void setName(String name) {
    this.name = name;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setPredio(String predio) {
    this.predio = predio;
  }

  public void setNumeroPredio(int numeroPredio) {
    this.numeroPredio = numeroPredio;
  }

}