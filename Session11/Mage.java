public class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void useUltimate(GameCharacter target) {
        int dame = getAttackPower();
        if(mana < 50){
            System.out.println("Het Mana");
        }else{
            System.out.println(getName() + ": -" + 50 + " mana");
            target.takeDamage(dame * 3);
            mana -= 50;
        }
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("- 5 mana");
        int dame = getAttackPower();
        if(mana < 5){
            target.takeDamage(dame / 2);
        }else{
            target.takeDamage(dame);
            this.mana -= 5;
        }
    }
}
