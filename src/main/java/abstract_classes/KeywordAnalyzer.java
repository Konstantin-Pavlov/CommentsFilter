package abstract_classes;

import enums.Label;
import interfaces.TextAnalyzer;

import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    //String[] keywords; //  is it good idea to add this field here?

    abstract protected String[] getKeywords();

    abstract protected Label getLabel();

    //  using stream api
    @Override
    public Label processText(String text) {
        return Arrays.stream(getKeywords())
                .anyMatch(text::contains) ?
                getLabel() : Label.OK;
    }

    /*
    without streams
    @Override
    public Label processText(String text) {
        for (String sadSmile : getKeywords()) {
            if (text.contains(sadSmile)) {
                return getLabel();
            }
        }
        return Label.OK;
    }*/
}
