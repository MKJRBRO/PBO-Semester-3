public class Dragon extends Creature {
    private String element;
    private boolean wings;

    public void setElement(String element) {
        this.element = element;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    public String getElement() {
        return element;
    }

    public boolean hasWings() {
        return wings;
    }

    @Override
    public String getFavoriteTarget() {
        return "Castle";
    }

    public void attack() {
        System.out.println(getType() + " attacks with " + element + " breath");
    }

    public final void fly() {
        if (wings) {
            System.out.println(getType() + " is flying");
        } else {
            System.out.println(getType() + " has no wings");
        }
    }
}