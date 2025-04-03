public class Character {
    private String name;
    private int health;
    private int XP;
    private String item;
    private boolean statusEnding;

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }
    
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.XP = 0;
        this.item = "";
    }

    public void addXP(int additionalXP) {
        this.XP += additionalXP;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean getEnding(boolean ending) {
        statusEnding = ending;
        return true;
    }

    public boolean statusEnd() {
        return statusEnding;
    }

    public int getXP() {
        return XP;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}