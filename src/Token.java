public class Token {

    private TokenKind kind;
    private String token;

    public Token(TokenKind kind, String token) {
        this.kind = kind;
        this.token = token;
    }

    public TokenKind getTokenKind() { return kind; }

    public String getToken() { return token; }

    public String toString() { return kind + " " + token; }

}
