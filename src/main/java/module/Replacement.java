package module;

public class Replacement {

    private String replacement;
    private String source;

    public Replacement(String replacement, String source) {
        this.replacement = replacement;
        this.source = source;
    }

    public String getReplacement() {
        return replacement;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "Replacement{" +
                "replacement='" + replacement + '\'' + "\n" +
                ", source='" + source + '\'' + "\n" +
                '}';
    }

}
