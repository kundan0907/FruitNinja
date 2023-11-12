import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331ScoreController;

public interface Choppable {
        
    void update(cs331Blade blade, cs331ScoreController scoreController);
    boolean isBomb();
    int getScoreValue();
}
