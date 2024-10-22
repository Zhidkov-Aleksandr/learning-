public class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {
//Явили миру рыцаря
        Knight knight = new Knight();
//Отправляем его за принцессой
        knight.goAndSaveThePrincess();
    }

    public void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        System.out.println("Да иду уже...");
    }

    private void assembleTeam() {
    }

    private void getFood() {

    }

    private void sharpenBlade() {
        
    }
}