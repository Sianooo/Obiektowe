class Character {
    private LevelOfCharacter levelOfCharacter;
    private int health;
    private int stamina;
    private int amountOfExperience;
    private int amountOfNeededExperience;

    public Character(LevelOfCharacter levelOfCharacter) {
        this.levelOfCharacter = levelOfCharacter;
        this.health = levelOfCharacter.getMaxHealth();
        this.stamina = 100;
        this.amountOfExperience = 400;
        this.amountOfNeededExperience = levelOfCharacter.getAmountOfNeededExperience();
    }

    public void printSkills() {
        System.out.println("Aktualne umiejętności gracza:");
        System.out.println("Poziom: " + levelOfCharacter.getLevel());
        System.out.println("Atak: " + levelOfCharacter.getAttackPower());
        System.out.println("Obrona: " + levelOfCharacter.getDefensePower());
        System.out.println("Mądrość: " + levelOfCharacter.getWisdom());
        System.out.println("Mana: " + levelOfCharacter.getManaAmount());
        System.out.println("Maks. zdrowie: " + levelOfCharacter.getMaxHealth());
        System.out.println("Doświadczenie: " + amountOfExperience);
        System.out.println("Wymagane doświadczenie: " + amountOfNeededExperience);
    }

    public int getLevel() {
        return levelOfCharacter.getLevel();
    }

    public int getAttack() {
        return levelOfCharacter.getAttackPower();
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public void useEnergy() {
        stamina -= 5;
    }

    public void restoreEnergy() {
        stamina += 40;
        if (stamina > 100) {
            stamina = 100;
        }
    }

    public void restoreHP() {
        health += 70;
        if (health > levelOfCharacter.getMaxHealth()) {
            health = levelOfCharacter.getMaxHealth();
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
    public int getMaxHealth() {
        return levelOfCharacter.getMaxHealth();
    }


    public void gainExperience(int expGained) {
        amountOfExperience += expGained;
        if (amountOfExperience >= amountOfNeededExperience) {
            levelUp();
        }
    }
    public static LevelOfCharacter getNextLevel(LevelOfCharacter currentLevel) {
        int nextLevel = currentLevel.getLevel() + 1;
        return LevelOfCharacter.getLevelByNumber(nextLevel);
    }
    public LevelOfCharacter getNextLevel() {
        int nextLevel = levelOfCharacter.getLevel() + 1;
        return LevelOfCharacter.getLevelByNumber(nextLevel);
    }
    private void levelUp() {
        System.out.println("Awansowałeś na kolejny poziom!");
        levelOfCharacter = levelOfCharacter.getNextLevel();
        health = levelOfCharacter.getMaxHealth();
    }


}
