package service;

import model.Label;

public class SpamAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords.clone();
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
