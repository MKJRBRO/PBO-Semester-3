public class Creature {
    private String size;
    private String habitat;
    private int strength;

    // Overloading: same name, different parameters
    public void setProfile(String size, String habitat) {
        this.size = size;
        this.habitat = habitat;
    }

    public void setProfile(String size, String habitat, int strength) {
        this.size = size;
        this.habitat = habitat;
        this.strength = strength;
    }

    public String getFavoriteTarget() {
        return "Unknown";
    }

    public final String getType() {
        return getClass().getSimpleName();
    }

    public final void showInfo() {
        System.out.println("Size            : " + size);
        System.out.println("Habitat         : " + habitat);
        System.out.println("Strength        : " + strength);
        System.out.println("Favorite target : " + getFavoriteTarget());
    }

    public String getSize() { return size; }
    public String getHabitat() { return habitat; }
    public int getStrength() { return strength; }
}