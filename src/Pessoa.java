import java.util.Scanner;

public class Pessoa {
    private String nome;
    int idade;
    private int quantidade_de_filhos;

    Pessoa(){}
    Pessoa(String nome, int idade, int quantidade_de_filhos) {
        this.setIdade(idade);
        this.setNome(nome);
        this.setQuantidade_de_filhos(quantidade_de_filhos);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade_de_filhos(int quantidade_de_filhos) {
        this.quantidade_de_filhos = quantidade_de_filhos;
    }

    public int getIdade() {
        return idade;
    }

    public int getQuantidade_de_filhos() {
        return quantidade_de_filhos;
    }

    public String getNome() {
        return nome;
    }

    private void imprimeinfo(){
        System.out.printf("Pessoa com nome %s possui idade: %d e %d filhos", this.getNome(), this.getIdade(), this.getQuantidade_de_filhos());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa(sc.next(), sc.nextInt(), sc.nextInt());
        p1.imprimeinfo();
    }

}