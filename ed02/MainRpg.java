

/**
 * Classe principal de teste do jogo RPG.
 */
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        g.status();
        m.status();
        a.status();

        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        g.status();
        m.status();
        a.status();
    }
}