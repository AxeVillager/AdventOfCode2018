import frequency.FrequencyCalibrator;

import java.io.IOException;
import java.util.List;

/**
 * Main created by Børre A. Opedal Lunde on 2018/12/01.
 */

public class Main {

    public static void main(String[] args) {
        final List<Integer> frequencyChanges;

        try {
            frequencyChanges = Utilities.createIntegerListFromStringList(Utilities.createStringListFromTextFile(Constants.FREQUENCY_CHANGES_INPUT_FILE));
        } catch (IOException e) {
            System.out.println(String.format("Input file \"%s\" could not be found!", Constants.FREQUENCY_CHANGES_INPUT_FILE.getAbsolutePath()));
            e.printStackTrace();
            return;
        }

        // Task one answer.
        System.out.println(String.format("Resulting Frequency: %s.", FrequencyCalibrator.calculateResultingFrequency(frequencyChanges)));
        // Task two answer.
        System.out.println(String.format("First Repeating Frequency: %s.", FrequencyCalibrator.findFirstRepeatingFrequency(frequencyChanges)));
    }
}