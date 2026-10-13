public class Goblin extends MotherGoblin {
    private String type;

    public void setGoblinType(String type) {
        this.type = type;
    }

    public String getGoblinType() {
        return type;
    }

    @Override
    public String getFavoriteTarget() {
        return "Treasure";
    }

    @Override
    public final void attack() {
        System.out.println(type + " Goblin attacks with a club");
    }
}