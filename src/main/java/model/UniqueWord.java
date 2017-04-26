package model;

import java.util.Map;

/**
 * Created by mustafa on 26.04.2017.
 */
public class UniqueWord {
    private String word;
    private Map<String, Double> valueMap;

    public UniqueWord(String word) {
        this.word = word;
    }

    //getter - setter
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Map<String, Double> getValueMap() {
        return valueMap;
    }

    public void setValueMap(Map<String, Double> valueMap) {
        this.valueMap = valueMap;
    }
}
