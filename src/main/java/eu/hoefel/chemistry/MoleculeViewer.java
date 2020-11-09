package eu.hoefel.chemistry;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/** Class for visualization of molecules. Blocks until window is closed. */
final class MoleculeViewer extends Application {
 
    @Override
    public void start(final Stage stage) {
    	
        final WebView browser = new WebView();
        final WebEngine engine = browser.getEngine();
        
        String name = getParameters().getRaw().get(0);
 
        String url = MoleculeInfo.REF_URL + name + MoleculeInfo.VISUALIZATION;
        engine.load(url);
 
        VBox root = new VBox();
        root.getChildren().addAll(browser);
 
        Scene scene = new Scene(root);
 
        stage.setTitle(name);
        stage.setScene(scene);
        stage.setWidth(1024);
        stage.setHeight(640);
 
        stage.show();
    }
   
	/**
	 * Displays an interactive view of the molecule. Blocks until window is closed.
	 * 
	 * @param args the name of the molecule. Only the first of the arguments is
	 *             used.
	 */
    public static void main(String... args) {
        launch(args);
    }
}