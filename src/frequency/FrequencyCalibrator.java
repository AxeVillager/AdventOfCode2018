package frequency;

import java.util.ArrayList;
import java.util.List;

/**
 * FrequencyCalibrator created by Børre A. Opedal Lunde on 2018/12/01.
 */

public class FrequencyCalibrator {

    /**
     * Task one.
     *
     * @param frequencyChanges list of frequency changes.
     * @return resulting frequency after all frequency changes have been added together.
     */
    public static int calculateResultingFrequency(List<Integer> frequencyChanges) {
        int frequency = 0;
        for (int frequencyChange : frequencyChanges) {
            frequency += frequencyChange;
        }
        return frequency;
    }

    /**
     * Task two.
     *
     * @param frequencyChanges list of frequency changes.
     * @return first frequency that repeats itself.
     */
    public static int findFirstRepeatingFrequency(List<Integer> frequencyChanges) {
        final List<Integer> frequencyHistory = new ArrayList<>();
        int frequency = 0;
        // Keep looping until the repeating frequency is found.
        while (true) {
            for (int frequencyChange : frequencyChanges) {
                frequencyHistory.add(frequency += frequencyChange);
                // Starts at +1 and ends at size-1 to prevent testing incorrect same frequencies.
                for (int i = 1; i < frequencyHistory.size() - 1; i++) {
                    if (frequency == frequencyHistory.get(i)) {
                        return frequency;
                    }
                }
            }
        }
    }
}