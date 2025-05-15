import java.util.ArrayList;
import java.util.TreeSet;

public class Store {
    Wardrobe w;
    private TreeSet<Clothing> purchasable;

    public Store(Wardrobe w) {
        this.w = w;
        purchasable = new TreeSet<>();
    }

    public boolean addPurchasable(Clothing c) {
        if (c != null){
            purchasable.add(c);
            return true;
        }
        return false;
    }

    public boolean loadPurchasable(){
        for (Clothing c: w.getList()){
            if (c.getOrigin().equals("Store")){
                addPurchasable(c);
            }
        }
        return false;
    }

    public void getPurchasable(){
        for (Clothing c: purchasable){
            System.out.println(c.toString());
        }
    }
}
