import java.util.ArrayList;

public class Inventory {
    private ArrayList<Clothing> ownedC;
    private static int coins = 1000;

    public Inventory() {
        ownedC = new ArrayList<>();
    }

    public boolean addClothing(Clothing c) {
        if (c != null){
            for (Clothing clothing : ownedC){
                if (clothing.equals(c)){
                    return false;
                }
            }
            ownedC.add(c);
            return true;
        }
        return false;
    }

    public void addCoins(int amount) {
        coins += amount;
    }

    public void payCoins(int amount) {
        coins -= amount;
    }
}
