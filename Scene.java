public class Scene {
    private String description;
    private String choiceA, choiceB, choiceC, choiceD, choiceE;
    private Scene nextSceneA, nextSceneB, nextSceneC, nextSceneD, nextSceneE;
    private int damageA, damageB, damageC, damageD, damageE;
    private int XPA, XPB, XPC, XPD, XPE;
    private boolean ending;

    public Scene(
        String description, boolean ending, String choiceA, int damageA, int XPA,
        String choiceB, int damageB, int XPB,
        String choiceC, int damageC, int XPC,
        String choiceD, int damageD, int XPD,
        String choiceE, int damageE, int XPE
    ) {
        this.description = description;
        this.ending = ending;
        this.choiceA = choiceA;
        this.damageA = damageA;
        this.XPA = XPA;
        this.choiceB = choiceB;
        this.damageB = damageB;
        this.XPB = XPB;
        this.choiceC = choiceC;
        this.damageC = damageC;
        this.XPC = XPC;
        this.choiceD = choiceD;
        this.damageD = damageD;
        this.XPB = XPD;
        this.choiceE = choiceE;
        this.damageE = damageE;
        this.XPE = XPE;

    }

    public void setOption(
        Scene nextSceneA,
        Scene nextSceneB,
        Scene nextSceneC,
        Scene nextSceneD,
        Scene nextSceneE
    ) {
        this.nextSceneA = nextSceneA;
        this.nextSceneB = nextSceneB;
        this.nextSceneC = nextSceneC;
        this.nextSceneD = nextSceneD;
        this.nextSceneE = nextSceneE;

    }

    public void displayScene() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(description);
        System.out.println("A: " + choiceA);
        System.out.println("B: " + choiceB);
        System.out.println("C: " + choiceC);
        System.out.println("D: " + choiceD);
        System.out.println("E: " + choiceE);
    }

    public void endingScene() {

    }

    public Scene makeChoice(String choice, Character player) {
        player.getEnding(ending);
        if (choice.equalsIgnoreCase("A")) {
            player.takeDamage(damageA);
            player.addXP(XPA);
            return nextSceneA;
        } else if (choice.equalsIgnoreCase("B")) {
            player.takeDamage(damageB);
            player.addXP(XPB);
            return nextSceneB;
        } else if (choice.equalsIgnoreCase("C")) {
            player.takeDamage(damageC);
            player.addXP(XPC);
            return nextSceneC;
        } else if (choice.equalsIgnoreCase("D")) {
            player.takeDamage(damageD);
            player.addXP(XPD);
            return nextSceneD;
        } else if (choice.equalsIgnoreCase("E")) {
            player.takeDamage(damageE);
            player.addXP(XPE);
            return nextSceneE;
        }
        return null;
    }
}