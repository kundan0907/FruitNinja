import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331FruitNinjaFrame;
import fruitNinjaHelper.cs331FruitNinjaGame;
import fruitNinjaHelper.cs331ScoreController;

public class Game extends cs331FruitNinjaGame {

    private cs331Blade Blade;
    private cs331ScoreController scoreController;
    private cs331FruitNinjaFrame frame;
    private Object currentItem; // Current item being launched

    // You may need to add constructor

    public Game(cs331FruitNinjaFrame frame) {

        this.frame = frame;
        Blade = new cs331Blade("Kundan");//initializing the blade with the name
        addBlade(Blade);//Add blade to the game
        this.scoreController = new cs331ScoreController();//initializing the score controller 
        frame.setTop(scoreController);//Adding the score controller to the game frame

    }

    @Override
    public Object launchItem() {
        // Logic to generate and launch a fruit or bomb
        int randomItem = (int) (Math.random() * 5);
        switch (randomItem) {
            case 0:
                currentItem = new Apple();
                break;
            case 1:
                currentItem = new Lemon();
                break;

            case 2:
                currentItem = new Peach();
                break;

            case 3:
                currentItem = new Pear();
                break;

            case 4:
                currentItem = new Bomb();
                break;

        }
        return currentItem;
    }


    public void updateChoppable(Object object) {
        if (object instanceof Choppable) {
            Choppable choppableItem = (Choppable) object;
            choppableItem.update(Blade, scoreController);//updating the object state, based on the blade contact
        }
    }

 // Do not modify anything below this line
 @Override
 public void updateChoppableHelper() {
     this.updateChoppable(this.getCurrentItem());
  }
}
   