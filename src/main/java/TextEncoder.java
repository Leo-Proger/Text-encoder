import java.util.Random;

public class TextEncoder {
    private final long secretKey;

    public TextEncoder() {
        this.secretKey = new Random().nextInt(0x10FFFF + 1);
    }

    public String encodeText(String text) {
        if (text.isBlank()) return "";

        StringBuilder result = new StringBuilder();

        for (char el : text.toCharArray()) {
            char encodedChar = (char) ((long) el ^ this.secretKey);
            result.append(encodedChar);
        }
        return result.toString();
    }

    public String decodeText(String text) {
        return encodeText(text);
    }
}
