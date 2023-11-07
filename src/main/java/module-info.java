
module gui {
    requires javafx.scene;
    requires javafx.application;
    requires javafx.fxml;
    requires javafx.stage;
    requires javafx.awt;


    opens gui to javafx.fxml ;
    exports gui;
}


        }