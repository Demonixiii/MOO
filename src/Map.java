import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Map {
    private String start = "Stage1";
    private String currentStage = start;
    private HashMap<String,Stage> map;

    public Map() {
        map = new HashMap<>();
    }

    public boolean loadMap(){
        try (BufferedReader b = new BufferedReader(new FileReader("Stages.txt"))){
            String line;
            while ((line = b.readLine()) != null){
                String[] lines = line.split("/");
                if (lines[3].equals("null")) {
                    Stage stage = new Stage(
                            lines[0],Category.valueOf(lines[1]),Category.valueOf(lines[2]),null,lines[4]
                    );
                    map.put(lines[0], stage);
                } else if (lines[4].equals("null")) {
                    Stage stage = new Stage(
                            lines[0],Category.valueOf(lines[1]),Category.valueOf(lines[2]),lines[3],null
                    );
                    map.put(lines[0], stage);
                } else {
                    Stage stage = new Stage(
                            lines[0],Category.valueOf(lines[1]),Category.valueOf(lines[2]),lines[3],lines[4]
                    );
                    map.put(lines[0], stage);
                }
            }
            return true;
        }catch (IOException e){
            return false;
        }
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public HashMap<String, Stage> getMap() {
        return map;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }
}
