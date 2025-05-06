public class Pessoa {
    //Atributos nome e idade
    String nome;
    int idade;

    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Exibindo informações

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    //Verificando se a pessoa é maior de idade
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }
}
