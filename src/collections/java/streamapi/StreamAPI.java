package collections.java.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        List<Gato> caes = new ArrayList<>(){{
           add(new Gato("Jonin", 10, "preto"));
           add(new Gato("Repi", 15, "tigrado"));
           add(new Gato("Zura", 8, "branco"));
           add(new Gato("Tipi", 34, "amarelo"));
           add(new Gato("Akira", 20, "azul"));
           add(new Gato("Suzano", 60, "cinza"));
        }};

        caes.sort(Comparator.comparing(Gato::getNome)); // Reference Method

        System.out.println(caes);
    }
}

class Gato {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
