package craftinginterpreters;

import java.util.ArrayList;
import java.util.List;

import static craftinginterpreters.TokenType.*;

public class Scanner {

    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    private int start = 0;
    private int current = 0;
    private int line = 1;

    Scanner(String source) {
        this.source = source;
    }

    List<Token> scanTokens() {
        while (!isAtEnd()) {
            // We are at the beginning of the next lexeme.
            start = current;
            scanToken();
        }

        tokens.add(new Token(EOF, "", null, line));
        return tokens;

    }

    private void scanToken() {

        char c = advance();

    }

    private char advance() {
        return 0;
    }

    private boolean isAtEnd() {
        return current >= source.length();
    }

}
