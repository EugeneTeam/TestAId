package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.eclipse.egit.github.core.Authorization;
import org.eclipse.egit.github.core.service.GistService;
import org.eclipse.egit.github.core.service.OAuthService;

import java.io.IOException;
import java.util.Arrays;

public class Controller {
    @FXML private PasswordField password;
    @FXML private TextField email;

    @FXML void authorization(ActionEvent event) {
        if(password.getText().equals("") || email.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Error ...");
            alert.show();
        }else{
//            Platform.runLater(new Runnable() {
//                @Override
//                public void run() {
//                    OAuthService oauthService = new OAuthService();
//                }
//            });


//            oauthService.getClient().setCredentials(email.getText(), password.getText());
//
//            // Create authorization with 'gist' scope only
//            Authorization auth = new Authorization();
//            auth.setScopes(Arrays.asList("gist"));
//            try {
//                auth = oauthService.createAuthorization(auth);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            // Create Gist service configured with OAuth2 token
//            GistService gistService = new GistService();
//            gistService.getClient().setOAuth2Token(auth.getToken());
        }
    }
}
