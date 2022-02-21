package service;

import model.Label;
import api.TextAnalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }
}