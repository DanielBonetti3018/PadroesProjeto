package propotype;

import org.junit.jupiter.api.Test;
import prototype.Enemy;
import prototype.Weapon;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EnemyTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Enemy enemy = new Enemy("Orc", 15, 20, new Weapon("LongSword", "Espada"));

        Enemy enemyClone = enemy.clone();
        enemyClone.setNome("Trol");
        enemyClone.setVida(30);
        enemyClone.getWeapon().setTipo("Porrete");
        enemyClone.getWeapon().setNome("Maça");

        assertEquals("Enemy{nome='Orc', vida=15, dano=20, weapon=Weapon{tipo='LongSword', nome='Espada'}}", enemy.toString());
        assertEquals("Enemy{nome='Trol', vida=30, dano=20, weapon=Weapon{tipo='Porrete', nome='Maça'}}", enemyClone.toString());
    }

}