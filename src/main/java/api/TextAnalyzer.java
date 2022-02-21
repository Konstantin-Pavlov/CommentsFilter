package api;

import model.Label;

public interface TextAnalyzer {
    Label processText(String text);
}
