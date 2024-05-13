package padroesestruturais.flyweight;

public class Soldado {
    private String nome;

    private Batalhao batalhaoalocado;

    public Soldado(String nome, Batalhao batalhaoalocado) {
        this.nome = nome;
        this.batalhaoalocado = batalhaoalocado;
    }

    public String obterSoldado() {
        return "Soldado{" +
                "nome='" + this.nome + '\'' +
                ", batalhão='" + batalhaoalocado.getNomeBatalhao() + '\'' +
                ", Abreviação='" + batalhaoalocado.getAbreviacao() + '\'' +
                '}';
    }
}