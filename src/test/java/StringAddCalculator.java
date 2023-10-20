import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] numbers = getTokens(text);

        return sum(numbers);
    }

    private static String[] getTokens(String text) {
        if(text.startsWith("//")) {
            String[] parts = text.split("\n", 2);
            String delimiter = parts[0].substring(2);
            return parts[1].split(Pattern.quote(delimiter));
        }
        return text.split(",|:");
    }

    private static int sum(String[] numbers) {
        int total = 0;
        for (String num : numbers) {
            total += validateAndParse(num);
        }
        return total;
    }

    private static int validateAndParse(String number) {
        int parsedNum = Integer.parseInt(number);
        if (parsedNum < 0) {
            throw new RuntimeException("Negatives not allowed: " + parsedNum);
        }
        return parsedNum;
    }
}