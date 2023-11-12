
import fruitNinjaHelper.cs331Fruit;
import fruitNinjaHelper.cs331ScoreController;
import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Blade;

public class Apple extends cs331Fruit implements Choppable {

    public Apple() {
        super();
        this.setImage(Constants.APPLE_PATH);//sets the path to the image 
        this.wash();
        this.ripen();
    }

    @Override
    public void moveFruit() {
        super.moveFruit();
    }

    @Override
    public void chopGraphically() {
        super.chopGraphically();//handles chopping
        this.splash();//creates a splash effect
    }

    @Override
    public int getScoreValue() {
        return 2;
    }

    @Override
    public boolean isBomb() {
        return false;
    }

    @Override
    public void update(cs331Blade blade, cs331ScoreController scoreController) {
        this.moveFruit(); // Call moveFruit to update apple's position
        if (blade.checkIntersection(this)) {
            this.chopGraphically(); // Handles chopping visually
            scoreController.addToScore(this.getScoreValue()); // Update the score
        }
    }
}
