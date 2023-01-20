public class TokenStream {

    private char[] stream;
    private int next;
    private static final String VARIABLES = "[a-zA-Z_][a-zA-Z_0-9]*";

    public TokenStream(String stream) {
        this.stream = stream.toCharArray();
        this.next = this.stream.length;
        if (this.stream.length != 0) {
            this.next = 0;
        }
    }

    public Token nextToken() {
        if (next >= stream.length) {
            return null;
        }

        String token = "" + stream[next];
        next++;

        if (token.matches("[()\\. ]")) {
            return new Token(TokenKind.PUNCTUATION, token);
        }

        if (token.matches("\\\\")) {
            return new Token(TokenKind.LAMBDA, token);
        }

        if (token.matches(VARIABLES)) {
            while (next < stream.length && ("" + stream[next]).matches(VARIABLES)) {
                token += stream[next];
                next++;
            }
            return new Token(TokenKind.VARIABLE, token);
        }
        return null;
    }

}
