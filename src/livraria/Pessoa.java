package livraria;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //Método

    public void fazerAniver(){

    }

    //Métodos especiais


    public Pessoa(String nome, int idade, String sexo) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
