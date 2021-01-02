
package signup;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SignupController implements Initializable {

    @FXML
    private TextField uname;

    @FXML
    private TextField email;

    @FXML
    private PasswordField pass;

    @FXML
    private PasswordField cpass;

    @FXML
    private TextField name;
     
    @FXML
    private Label label;

    @FXML
    private Button signup;
    
    @FXML
    private Button back;
    
    @FXML
    void signup(ActionEvent event) throws IOException {
        String Name = name.getText();
        String Uname = uname.getText();
        String Email = email.getText();
        String Pass = pass.getText();
        String Cpass = cpass.getText();
        if(name.getText().equals(""))
        {
            label.setText("Name is required.");
        }
        else if(uname.getText().equals(""))
        {
            label.setText("User-Name is required.");
        }
        else if((email.getText().equals("")))
        {
            label.setText("Email is required.");
        }
        else if((pass.getText().equals("")))
        {
            label.setText("Password is required.");
        }
        else if((cpass.getText().equals("")))
        {
            label.setText("Please Confirm Password.");
        }
        else if(!(Pass.equals(Cpass)))
        {
            label.setText("Password did not matched.");
        }
        else if(!(email.getText().equals("")))
        {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/dashboard/dashboard.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);
        
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
            window.setScene(tableViewScene);
            window.show();
        }
        
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/vallettracker/FXMLDocument.fxml"));
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
