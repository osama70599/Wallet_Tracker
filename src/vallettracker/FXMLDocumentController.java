
package vallettracker;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Button login;

    @FXML
    private Button signup;

    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private Label label;
    
    @FXML
    void login(ActionEvent event) throws IOException {
        String uname,pass;
        uname = email.getText();
        pass = password.getText();
        if(uname.equals("osama")&&pass.equals("123"))
        {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/dashboard/dashboard.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);
        
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
            window.setScene(tableViewScene);
            window.show();
        }
        else if(!(uname.equals("osama")&&pass.equals("123")))
        {
            label.setText("Invalid Login.");
        }
    }

    @FXML
    void signup(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/signup/signup.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Sign-up");
        window.setScene(tableViewScene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        
    }    
    
}
