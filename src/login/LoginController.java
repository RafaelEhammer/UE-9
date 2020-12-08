package login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import main.MainController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginController implements Initializable
{
    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private Button login_button;

    private LoginModel model = new LoginModel();

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
    public void setStage(Stage stage)
    {
        this.stage = stage;
    }
    public static void show(Stage stage)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("LoginFXML.fxml"));
            Parent root = fxmlLoader.load();

            //get controller which is connected to this fxml file
            LoginController ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

            stage.setTitle("Welcome");
            stage.setScene(new Scene(root, 400, 400));
            stage.show();
        }
        catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Something wrong with welcome.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }
    @FXML
    private void next ()
    {
        MainController.show(new Stage());

        stage.close();
    }
    public void login()
    {
        boolean login = model.CorrectLogin(name.getText(), password.getText());
        if (login)
        {
            System.out.println("succesful Login");
            next();
        }
        else{
            System.out.println("Login error!");
        }
    }
}