public class Enemy {


    public LevelOfCharacter levelOfEnemy;

    public Enemy(LevelOfCharacter levelOfEnemy) {
        this.levelOfEnemy = levelOfEnemy;
    }

    public LevelOfCharacter getLevelOfEnemy() {
        return levelOfEnemy;
    }

    public void addLevelToEnemy() {
        levelOfEnemy = LevelOfCharacter.values()[levelOfEnemy.ordinal() + 1];
    }

    public int amountOfExperience = 0;

}
