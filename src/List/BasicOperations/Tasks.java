package List.BasicOperations;

public class Tasks {
  //atributo
  private String descricao;

  public Tasks(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return  descricao;
  }
}
