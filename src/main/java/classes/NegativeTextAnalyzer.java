package classes;

import abstract_classes.KeywordAnalyzer;
import enums.Label;


public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;

    {
        keywords = new String[]{":(", "=(", ":|"};
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
