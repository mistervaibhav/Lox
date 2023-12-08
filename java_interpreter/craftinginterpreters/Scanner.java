package craftinginterpreters;

import java.util.ArrayList;
import java.util.List;

import static craftinginterpreters.TokenType.*;

public class Scanner {

    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    Scanner(String source) {
        this.source = source;
    }

}
