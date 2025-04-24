public class Clothing implements Comparable<Clothing> {
    private String name;
    private int rarity;
    private CType type;
    private CCategory category1;
    private CCategory category2;


    public Clothing(String name, int rarity, CType type, CCategory category1, CCategory category2) {
        this.name = name;
        setRarity(rarity);
        this.type = type;
        this.category1 = category1;
        this.category2 = category2;
    }

    public void setRarity(int rarity) {
        if (rarity < 1) {
            this.rarity = 1;
        } else if (rarity > 10) {
            this.rarity = 10;
        }else {
            this.rarity = rarity;
        }
    }

    @Override
    public String toString() {
        return name +
                "\n" + rarity +
                "\n" + type +
                "\n" + category1 +
                ", " + category2;
    }

    @Override
    public int compareTo(Clothing o) {
        return this.name.compareTo(o.name);
    }
}
