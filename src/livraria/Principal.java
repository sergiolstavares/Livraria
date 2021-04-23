package livraria;

public class Principal {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];


        p[0] = new Pessoa("Jorge",18,"M");
        p[1] = new Pessoa("Laura",20,"F");

        l[0]= new Livro("Aprendendo java","José da silva",300,p[0]);
        l[1] = new Livro("Percy jackson","Mauricio queiroz",250,p[1]);

        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].folhear(150);
        System.out.println(l[0].detalhes());
    }
}
