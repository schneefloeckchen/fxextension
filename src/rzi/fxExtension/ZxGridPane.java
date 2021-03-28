package rzi.fxExtension;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Convenient extnsion for building GridPane layouts.
 *
 * @author rene
 * 
 *  Mar 26t, 2021 - initial
 */
public class ZxGridPane extends GridPane {

    public ZxGridPane() {

    }

    public TextField addLabelAndTextField(
            String label, TextField textField, int col, int row) {
        add(new Label(label+ " : "), col, row);
        add(textField, col + 1, row);
        return textField;
    }

    public TextField addLabelAndTextField(
            String label, TextField textField, int col, int row, int colSpan) {
        GridPane.setColumnSpan(textField, colSpan);
        return addLabelAndTextField(label, textField, col, row);
    }
}
