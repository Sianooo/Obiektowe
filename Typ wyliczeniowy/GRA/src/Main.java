public class Main {
    public static void main(String[] args) {
        Character character = new Character(LevelOfCharacter.LEVEL_1);
        Enemy enemy = new Enemy(LevelOfCharacter.LEVEL_1);
        character.attack(enemy);
    }
}
