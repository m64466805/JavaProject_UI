
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MainController  {

    Boolean Win;

    //return to Main Menu
    public void returnToMenu(ActionEvent event ) throws Exception{
        Stage primaryStage= new Stage();
        Parent root= FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene= new Scene(root,400,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //checked for Victory
    public void checkedVictory(ActionEvent event) throws Exception {
        if(Win== true){
            Stage primaryStage= new Stage();
            Parent root= FXMLLoader.load(getClass().getResource("VictoryPage.fxml"));
            Scene scene= new Scene(root,400,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        if(Win== false){
            Stage primaryStage= new Stage();
            Parent root= FXMLLoader.load(getClass().getResource("Defeated.fxml"));
            Scene scene= new Scene(root,400,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
    public void BattleMoving(KeyEvent event) {
        switch(event.getCode()){
            case UP:
            //object move up
                break;
            case DOWN:
            //object move down
                break;
            case LEFT:
            //object move left
                break;
            case RIGHT:
            //object move right
                break;
            case SPACE:
            //object attack1
                break;
            case Z:
            //object switchWeapon
                break;   
            case P:
            //Game Pause
                break;
            default:
                break;
        }
    }
    
}
    //
    
