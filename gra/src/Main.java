import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character player = new Character(LevelOfCharacter.LEVEL_5);



        System.out.println("Witaj! Aby zaatakować, wpisz 'atak'. Aby użyć energii, wpisz 'energia'.");

        while (true) {
            player.printSkills();

            System.out.println("Czy chcesz rozpocząć? (wpisz 'tak' jeśli tak)");
            String response;
            do {
                response = scanner.nextLine();
                if (!response.equalsIgnoreCase("tak") && !response.equalsIgnoreCase("nie")) {
                    System.out.println("Zła komenda, wpisz 'tak' lub 'nie'.");
                }
            } while (!response.equalsIgnoreCase("tak") && !response.equalsIgnoreCase("nie"));

            if (response.equalsIgnoreCase("nie")) {
                System.out.println("Do zobaczenia!");
                break;
            }

            Enemy enemy = new Enemy(player.getLevel());
            System.out.println("Przeciwnik już czeka! Poziom: " + enemy.getLevel() + ", Życie: " + enemy.getHealth() + ", Atak: " + enemy.getAttack());

            while (enemy.getHealth() > 0 && player.getHealth() > 0) {
                System.out.println("Co chcesz zrobić? (wpisz 'atak', 'energia' lub 'zdrowie')");
                String input;
                do {
                    input = scanner.nextLine();
                    if (!input.equalsIgnoreCase("atak") && !input.equalsIgnoreCase("energia") && !input.equalsIgnoreCase("zdrowie")) {
                        System.out.println("Nieprawidłowa komenda. Wpisz 'atak', 'energia' lub 'zdrowie'.");
                    }
                } while (!input.equalsIgnoreCase("atak") && !input.equalsIgnoreCase("energia") && !input.equalsIgnoreCase("zdrowie"));

                if (input.equalsIgnoreCase("atak")) {
                    if (player.getStamina() >= 5) {
                        int playerAttack = player.getAttack();
                        enemy.takeDamage(playerAttack);
                        System.out.println("Zadałeś potworowi " + playerAttack + " obrażeń.");
                        System.out.println("Aktualne zdrowie potwora: " + enemy.getHealth());

                        if (enemy.getHealth() > 0) {
                            int enemyAttack = enemy.getAttack();
                            player.takeDamage(enemyAttack);
                            System.out.println("Potwór zaatakował, zadane obrażenia: " + enemyAttack);
                            System.out.println("Zdrowie gracza: " + player.getHealth());
                        }

                        player.useEnergy();
                        System.out.println("Stamina spadła o 5 punktów. Pozostała energia: " + player.getStamina());
                    } else {
                        System.out.println("Brak wystarczającej ilości energii do ataku!");
                    }
                } else if (input.equalsIgnoreCase("energia")) {
                    player.restoreEnergy();
                    System.out.println("Odnawiasz energię. Aktualna energia gracza: " + player.getStamina());
                } else if (input.equalsIgnoreCase("zdrowie")) {
                    player.restoreHP();
                    System.out.println("Odnawiasz zdrowie. Aktualne zdrowie gracza: " + player.getHealth() + "/" + player.getMaxHealth());
                }

                if (enemy.getHealth() <= 0) {
                    int expGained = player.getLevel() * 50;
                    player.gainExperience(expGained);
                    System.out.println("Pokonałeś potwora! Gratulacje! Otrzymujesz " + expGained + " punktów doświadczenia.");
                    break;
                }
            }

            if (player.getHealth() <= 0) {
                System.out.println("Zostałeś pokonany przez potwora. Koniec gry!");
                break;
            }
        }

        scanner.close();
    }
}
