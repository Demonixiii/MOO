import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Wardrobe {
    private TreeSet<Clothing> allClothes;

    public Wardrobe() {
        allClothes = new TreeSet<>();
    }

    public TreeSet<Clothing> getList(){
        return allClothes;
    }

    public String getAllClothes(){
        String all = "";
        for (Clothing c:allClothes){
            all += c.toString() + "\n" + "\n";
        }
        return all;
    }

    public boolean loadClothes() {
        try (BufferedReader b = new BufferedReader(new FileReader("Clothes.txt"))) {
            String line;
            while ((line = b.readLine()) != null) {
                String[] lines = line.split("/");
                Clothing clothing = new Clothing(
                        lines[0], Integer.valueOf(lines[1]), Type.valueOf(lines[2]), Category.valueOf(lines[3]), Category.valueOf(lines[4]),lines[5]
                );
                allClothes.add(clothing);
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
