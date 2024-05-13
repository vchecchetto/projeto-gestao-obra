module gestaodeobras.projetogestaodeobras {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.azure.storage.blob;

    opens gestaodeobras.projetogestaodeobras to javafx.fxml;
    exports gestaodeobras.projetogestaodeobras;
}