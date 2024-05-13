package prototype;

public class Enemy implements Cloneable {
    private String nome;
    private Integer vida;
    private Integer dano;
    private Weapon weapon;

    public Enemy(String nome, Integer vida, Integer dano, Weapon weapon){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.weapon = weapon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public Enemy clone() throws CloneNotSupportedException {
        Enemy enemyClone = (Enemy) super.clone();
        enemyClone.weapon = (Weapon) enemyClone.weapon.clone();
        return enemyClone;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", dano=" + dano +
                ", weapon=" + weapon +
                '}';
    }
}
