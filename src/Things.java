public class Things {
    private String name;
    private String combatUse;

    public Things(String name, String combatUse){
        this.combatUse = combatUse;
        this.name = name;
    }

    public String getCombatUse(Enemies e){
        return combatUse;
    }
    public String toString() {
        return name;
    }
}
