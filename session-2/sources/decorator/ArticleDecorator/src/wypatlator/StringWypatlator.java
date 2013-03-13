package wypatlator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class StringWypatlator {

    private static final Map<Character, Character> replacements;
    private static final List<String> periods;

    static {
        replacements = new HashMap<>();
        replacements.put('v', 'w');
        replacements.put('k', 'q');

        periods = new ArrayList<>();
        periods.add("* LoVE* kiss :***");
        periods.add("*MUUUUCK*");
    }
    
    private StringWypatlator() {
    }

    public static String wypatlej(String text) {
        String wypatlanyText = text.toLowerCase();
        wypatlanyText = replaceCharacters(wypatlanyText);
        wypatlanyText = zigzagSize(wypatlanyText);
        wypatlanyText = appendInteligentPeriod(wypatlanyText);
        return wypatlanyText;
    }

    private static String replaceCharacters(String text) {
        for (Character character : replacements.keySet()) {
            text = text.replace(character, replacements.get(character));
        }
        return text;
    }

    private static String zigzagSize(String text) {
        int textLength = text.length();
        StringBuilder sb = new StringBuilder(textLength);

        for (int i = 0; i < textLength; i++) {
            char character = text.charAt(i);
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(character));
            } else {
                sb.append(Character.toLowerCase(character));
            }
        }

        return sb.toString();
    }

    private static String appendInteligentPeriod(String wypatlanyText) {
        int randomPeriodIndex = new Random().nextInt(periods.size());
        String randomPeriod = periods.get(randomPeriodIndex);
        return wypatlanyText + " " + randomPeriod;
    }
}