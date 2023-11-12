
import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331Bomb;
import fruitNinjaHelper.cs331ScoreController;

public class Bomb extends cs331Bomb implements Choppable {

    private int scoreValue = 0;

    public Bomb() {

        super();
        setImage();
    }

    @Override
    public void update(cs331Blade blade, cs331ScoreController scoreController) {
        this.moveBomb();
        if (blade.checkIntersection(this)) {
            this.explode();
        }
    }

    @Override
    public int getScoreValue() {
        return scoreValue;
    }

    @Override
    public boolean isBomb() {
        return true;
    }
}
