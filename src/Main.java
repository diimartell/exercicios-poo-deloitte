//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Luiza", 13);
        Pessoa pessoa2 = new Pessoa("Vitória", 31);

        //Método para exibir informações da pessoa
        pessoa1.exibirInformacoes();

        //Verificando se a pessoa 1 é maior de idade
        if (pessoa1.isMaiorDeIdade()) {
            System.out.println("Esta pessoa é maior de idade.");
        }
        else {
            System.out.println("Esta pessoa é menor de idade");
        }

        //Comparando as idades das pessoas
        if (pessoa1.getIdade() > pessoa2.getIdade()) {
            System.out.println("A pessoa 1 é mais velha que a pessoa 2.");
        }
        else if (pessoa1.getIdade() < pessoa2.getIdade()) {
            System.out.println("A pessoa 2 é mais velha que a pessoa 1");
        }
        else {
            System.out.println("As pessoas têm a mesma idade.");
        }
    }
}