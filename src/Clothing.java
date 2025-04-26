public class Clothing implements Comparable<Clothing> {
    private String name;
    private int rarity;
    private Type type;
    private Category category1;
    private Category category2;
    private String origin;

    public Clothing(String name, int rarity, Type type, Category category1, Category category2, String origin) {
        this.name = name;
        setRarity(rarity);
        this.type = type;
        this.category1 = category1;
        this.category2 = category2;
        this.origin = origin;
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

    public Category getCategory1() {
        return category1;
    }

    public Category getCategory2() {
        return category2;
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
