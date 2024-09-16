import java.util.Random;
import java.util.Scanner;
public class Character {

    Random rnd = new Random();
    public LevelOfCharacter levelOfCharacter;
    public LevelOfCharacter levelOfEnemy;

    public Character(LevelOfCharacter levelOfCharacter) {
        this.levelOfCharacter = levelOfCharacter;
    }

    public void attack(Enemy enemy) {
//        System.out.println("NULL: " + (enemy.levelOfEnemy == null));

        System.out.println("Witaj w grze!");
        while (true) {
            System.out.println("Enemy level: " + enemy.getLevelOfEnemy().getLevel());
            System.out.println("Enemy stats: Attack: " + enemy.getLevelOfEnemy().getAttackPower() +
                    ", Defense: " + enemy.getLevelOfEnemy().getDefensePower() +
                    ", Wisdom: " + enemy.getLevelOfEnemy().getWisdom() +
                    ", Mana: " + enemy.getLevelOfEnemy().getManaAmount() +
                    ", AmountOfExperience: " + enemy.getLevelOfEnemy().getAmountOfNeededExperience());
//
//            System.out.println("Your level: " + levelOfCharacter.getLevel());
//            System.out.println("Your stats: Attack: " + levelOfCharacter.getAttackPower() +
//                    ", Defense: " + levelOfCharacter.getDefensePower() +
//                    ", Wisdom: " + levelOfCharacter.getWisdom() +
//                    ", Mana: " + levelOfCharacter.getManaAmount() +
//                    ", AmountOfExperience: " + levelOfCharacter.getAmountOfNeededExperience());
//

            Scanner scanner = new Scanner(System.in);
            System.out.println("Type 'attack' to attack the enemy: ");
            String input = scanner.nextLine();


            if (input.equals("attack")) {
                if (levelOfCharacter.getLevel() >= enemy.levelOfEnemy.getLevel()) {
                    System.out.println("You defeated the enemy");
                    //enemy.addLevelToEnemy();
                    levelOfCharacter.amountOfExperience += rnd.nextInt(50, 120);
                    enemy.levelOfEnemy.amountOfExperience += rnd.nextInt(50, 120);
                    int shouldLevelUp = levelOfCharacter.shouldLevelUp();
                    if (shouldLevelUp > -1) {
                        levelOfCharacter = LevelOfCharacter.values()[levelOfCharacter.ordinal() + 1];
                        levelOfCharacter.amountOfExperience = shouldLevelUp;
                    }

                    shouldLevelUp = enemy.levelOfEnemy.shouldLevelUp();
                    if (shouldLevelUp > -1) {
                        enemy.levelOfEnemy = LevelOfCharacter.values()[enemy.levelOfEnemy.ordinal() + 1];
                        enemy.levelOfEnemy.amountOfExperience = shouldLevelUp;
                    }


                    System.out.println("Your level: " + levelOfCharacter);
                    System.out.println("Your experience: " + levelOfCharacter.amountOfExperience + " / " + levelOfCharacter.amountOfNeededExperience);
                    System.out.println("Your new stats after leveling up: Attack: " + levelOfCharacter.getAttackPower() +
                            ", Defense: " + levelOfCharacter.getDefensePower() +
                            ", Wisdom: " + levelOfCharacter.getWisdom() +
                            ", Mana: " + levelOfCharacter.getManaAmount() +
                            ", AmountOfExperience: " + levelOfCharacter.getAmountOfNeededExperience());

                } else {
                    System.out.println("You are not strong enough to defeat this enemy");
                }
            } else {
                System.out.println("Invalid command. Try again");
            }
        }
    }

    public LevelOfCharacter getLevelOfCharacter() {
        return levelOfCharacter;
    }
}