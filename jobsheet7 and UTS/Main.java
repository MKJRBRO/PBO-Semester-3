public class Main {
    public static void main(String[] args) {
        System.out.println("--- Cyclops ---");
        Cyclops cyclops = new Cyclops();
        cyclops.setProfile("Large", "Cave", 90);
        cyclops.setWeapon("Club");
        cyclops.showInfo();
        cyclops.attack();
        cyclops.useWeapon();

        System.out.println("--- Dragon ---");
        Dragon dragon = new Dragon();
        dragon.setProfile("Huge", "Mountains", 100);
        dragon.setElement("fire");
        dragon.setWings(true);
        dragon.showInfo();
        dragon.attack();
        dragon.fly();

        System.out.println("--- Mother Goblin ---");
        MotherGoblin mg = new MotherGoblin();
        mg.setProfile("Small", "Swamp");
        mg.setGoblinArmy(50);
        mg.setIntelligence(80);
        mg.showInfo();
        mg.attack();
        mg.commandArmy();

        System.out.println("--- Goblin ---");
        Goblin goblin = new Goblin();
        goblin.setProfile("Tiny", "Swamp", 10);
        goblin.setGoblinArmy(0);
        goblin.setIntelligence(20);
        goblin.setGoblinType("Soldier");
        goblin.showInfo();
        goblin.attack();
    }
}