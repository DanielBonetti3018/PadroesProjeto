package prototype;

public class Weapon implements Cloneable {
    private String tipo;
    private String nome;

    public Weapon(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Weapon clone() throws CloneNotSupportedException {
        return (Weapon) super.clone();
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
