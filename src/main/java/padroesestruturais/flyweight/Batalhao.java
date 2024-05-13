package padroesestruturais.flyweight;

public class Batalhao {
    private String nomeBatalhao;

    private String abreviacao;

    public Batalhao(String nome, String abreviacao){
        this.nomeBatalhao=nome;
        this.abreviacao=abreviacao;
    }
    public String getNomeBatalhao(){return nomeBatalhao;}

    public String getAbreviacao(){return abreviacao;}
}
