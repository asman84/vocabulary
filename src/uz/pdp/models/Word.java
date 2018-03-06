package uz.pdp.models;

public class Word {
    private String word;
    private String translation;
    private String example;

    public Word() {
    }

    public Word(String word, String translation, String example) {
        this.word = word;
        this.translation = translation;
        this.example = example;
    }

    public String getWord() {
        return word;
    }

    public String getTranslation() {
        return translation;
    }

    public String getExample() {
        return example;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", translation='" + translation + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
