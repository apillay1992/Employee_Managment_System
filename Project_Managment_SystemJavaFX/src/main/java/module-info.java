module org.example.project_managment_systemjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.project_managment_systemjavafx to javafx.fxml;
    exports org.example.project_managment_systemjavafx;
}