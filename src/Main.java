public class Main {
    public static void main(String[] args) {
        Wardrobe w = new Wardrobe();
        w.loadClothes();
        //System.out.println(w.getAllClothes());
        Store s = new Store(w);
        s.loadPurchasable();
        s.getPurchasable();
    }
}