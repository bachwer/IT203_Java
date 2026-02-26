import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<GameCharacter> characters = new ArrayList<>();

        GameCharacter warrior = new Warrior("Warrior", 700, 150, 200);
        GameCharacter mage = new Mage("Mage", 600, 80, 250);

        characters.add(warrior);
        characters.add(mage);

        GameCharacter goblin = new GameCharacter("Goblin", 150, 10){
            @Override
            public void attack(GameCharacter target) {
                System.out.println("Goblin cắn trộm...");
                target.takeDamage(10);
            }
        };

        characters.add(goblin);

        // 4. Giả lập trận đấu: tất cả tấn công Goblin
        System.out.println("=== BẮT ĐẦU TRẬN ĐẤU ===");
        for (GameCharacter character : characters) {
            if (character != goblin) {
                character.attack(goblin);
            }
        }

        // 5. Gọi thử ultimate
        System.out.println("\n=== DÙNG CHIÊU CUỐI ===");
        System.out.println("warrior");
        warrior.useUltimate(mage);

        System.out.println("---");
        System.out.println("mage");
        mage.useUltimate(warrior);

        // 6. In tổng số nhân vật đã tạo
        System.out.println("\nTổng số nhân vật đã tạo: " + GameCharacter.count);
    }

}



