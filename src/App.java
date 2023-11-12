import fruitNinjaHelper.cs331FruitNinjaFrame;
import fruitNinjaHelper.cs331ScoreController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public void start(Stage primaryStage) {
        cs331FruitNinjaFrame frame = new cs331FruitNinjaFrame(primaryStage);

        Game game = new Game(frame);
        frame.addGame(game);

        cs331ScoreController scoreController = new cs331ScoreController();

        // Start the game
        game.startGame();

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
