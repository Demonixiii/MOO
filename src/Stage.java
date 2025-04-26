public class Stage {
    private String stageName;
    private Category stageCategory1;
    private Category stageCategory2;
    private String previousStage;
    private String nextStage;
    private boolean isBeaten = false;

    public Stage(String stageName, Category stageCategory1, Category stageCategory2, String previousStage, String nextStage) {
        this.stageName = stageName;
        this.stageCategory1 = stageCategory1;
        this.stageCategory2 = stageCategory2;
        this.previousStage = previousStage;
        this.nextStage = nextStage;
    }

    public Category getStageCategory1() {
        return stageCategory1;
    }

    public Category getStageCategory2() {
        return stageCategory2;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "stageName='" + stageName + '\'' +
                ", stageCategory1='" + stageCategory1 + '\'' +
                ", stageCategory2='" + stageCategory2 + '\'' +
                ", previousStage='" + previousStage + '\'' +
                ", nextStage='" + nextStage + '\'' +
                ", isBeaten=" + isBeaten +
                '}';
    }
}
