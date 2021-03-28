package rzi.fxFacories;

import javafx.event.EventHandler;
import javafx.scene.control.Button;


/**
 * Singleton Class to create Buttons
 * later to be extended to use resource files
 * 
 * @author rene
 */
public class RzFxButtonFactory {

    private static RzFxButtonFactory buttonFactory = null;
    private static EventHandler eventHandler = null;
    
    private RzFxButtonFactory() {
    }
    
    public static RzFxButtonFactory instance(EventHandler handler){
        if (buttonFactory == null) buttonFactory = new RzFxButtonFactory();
        eventHandler = handler;
        return buttonFactory;
    }
    
    public Button createButton(String text) {
        Button button = new Button (text);
        button.setOnAction(eventHandler);
        return button;
    }
}
