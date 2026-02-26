public class Warrior extends GameCharacter {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void useUltimate(GameCharacter target) {
        int dame = getAttackPower();
        target.takeDamage(dame * 2);
        int hp =  getHp();
        setHp((int) (hp - (hp * 0.1)));
        System.out.println(getName() + ": -" + (hp * 0.1) + ": HP");
    }

    @Override
    public void attack(GameCharacter target) {
        int dame = getAttackPower();
        target.takeDamage(dame);
    }

    @Override
    void takeDamage(int amount){
        if(armor > amount){
            armor -= amount;
            System.out.println(getName() + " -" + amount +", HP con lai: " +  getHp());

        }else if(armor > 0){
            armor -= amount;
            int hp =  getHp();
            hp += armor;
            setHp(hp);
            System.out.println(getName() + " -" + amount +", HP con lai: " +  getHp());
            armor = 0;

        }else{
            int hp =  getHp();
            setHp(hp - amount);
            System.out.println(getName() + " -" + amount +", HP con lai: " +  getHp());

        }

    }
}
