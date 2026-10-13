public class Cyclops extends Creature {
    private String weapon;

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void attack() {
        System.out.println(getType() + " attacks with strength " + getStrength());
    }

    public final void useWeapon() {
        System.out.println(getType() + " uses a " + weapon);
    }
}