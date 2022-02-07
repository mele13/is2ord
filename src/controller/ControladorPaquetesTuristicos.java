package controller;

import file.PaquetesTuristicosFile;
import view.PaqueteTuristico;

/**
 * @author Mele13 v1.0.0 created at 07/02/2022
 */
public class ControladorPaquetesTuristicos {

    public static void main(String[] args) {

        PaqueteTuristico paqTur = new PaqueteTuristico();

        PaqueteTuristico paqTurForm = new PaqueteTuristico();
        paqTurForm.setVisible(true);
        paqTurForm.paqTur = paqTurForm;
//        paqTur.clearFields();

        PaquetesTuristicosFile file = new PaquetesTuristicosFile();
        paqTurForm.file = file;
    }

}
