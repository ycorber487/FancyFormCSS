module org.example.di_formdesign_cortesyon {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.di_formdesign_cortesyon to javafx.fxml;
    exports org.example.di_formdesign_cortesyon;
}