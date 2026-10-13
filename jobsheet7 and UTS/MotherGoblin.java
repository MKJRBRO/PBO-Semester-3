public class MotherGoblin extends Creature {
    private int goblinArmy;
    private int intelligence;

    public void setGoblinArmy(int goblinArmy) {
        this.goblinArmy = goblinArmy;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getGoblinArmy() {
        return goblinArmy;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String getFavoriteTarget() {
        return "Village";
    }

    public void attack() {
        System.out.println(getType() + " attacks with intelligence " + intelligence);
    }

    public final void commandArmy() {
        System.out.println(getType() + " commands " + goblinArmy + " goblins");
    }
}