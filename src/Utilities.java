import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Utilities created by Børre A. Opedal Lunde on 2018/12/01.
 */

public class Utilities {

    /**
     * @param file text file to be read from. Should be .txt file.
     * @return list of strings of text file content.
     * @throws IOException if the file cannot be found.
     */
    public static List<String> createStringListFromTextFile(File file) throws IOException {
        return ImmutableList.copyOf(Files.readLines(file, Charset.forName("utf-8")));
    }

    /**
     * @param inputList list of numbers as string that is to be parsed to a list of integer.
     * @return list of integers.
     */
    public static List<Integer> createIntegerListFromStringList(List<String> inputList) {
        final List<Integer> parsedIntegers = new ArrayList<>();
        for (String input : inputList) {
            parsedIntegers.add(Integer.parseInt(input));
        }
        return ImmutableList.copyOf(parsedIntegers);
    }
}