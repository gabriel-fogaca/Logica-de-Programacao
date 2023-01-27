package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void takeDamage(Champion attacker){
        if(attacker.attack <= this.armor){
            this.life -= 1;
        }else{
            this.life -= (attacker.attack - this.armor);
        }

    }
    public String status(){
        if(getLife() <= 0){
            return getName() + ": 0 de vida (morreu)";
        }
        else{
            return getName() + ": " + getLife() + " de vida";
        }
    }
}
