class Main {
    public static void main(String[] args) {
        String secretMessage = "It's a secret message";
        TextEncoder encoder = new TextEncoder();
        String encodedText = encoder.encodeText(secretMessage);
        String decodedText = encoder.decodeText(encodedText);

        System.out.println("Original message: " + secretMessage + "\n");
        System.out.println("Encoded message: " + encodedText);
        System.out.println("Decoded message: " + decodedText);
    }
}
