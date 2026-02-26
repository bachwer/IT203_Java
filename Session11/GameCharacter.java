public class GameCharacter implements ISkill {
    private String name;
    private int hp;
    private int attackPower;
    static int count;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    void attack(GameCharacter target){};


    void takeDamage(int amount){
        this.hp = this.hp - amount;
        if(hp <= 0){
            System.out.println(this.name + " Đã bị hạ gục");
            this.hp = 0;
        }else{
            System.out.println(this.name + ": -" + amount +", HP con lai: " + this.hp );
        }
    }

    void display(){
        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("AttackPower: " + attackPower);
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if(hp <= 0){
            System.out.println(this.name + " -> Đã bị hạ gục");
            this.hp = 0;
        }
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public static void setCount(int count) {
        GameCharacter.count = count;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public void useUltimate(GameCharacter target) {

    }
}
