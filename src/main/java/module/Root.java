package module;

import java.util.List;

public class Root {

    private List<Replacement> repList;

    public Root(List<Replacement> replacementList) {
        repList = replacementList;
    }

    public List<Replacement> getRepList() {
        return repList;
    }

    @Override
    public String toString() {
        return "Root{" +
                "repList=" + repList +
                '}';
    }
}
