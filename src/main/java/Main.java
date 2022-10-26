import module.*;
import solution.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        RepJsonParser parser = new RepJsonParser();
        CreatingJson createJson = new CreatingJson();
        Request request = new Request();

        Root root = parser.rootParse();
        Data data = parser.dataParser();
        root = new Correction().sortingReplacement(root.getRepList());

        Data data2 = new Data(new Correction().repData(request.dataRequest(), root.getRepList()));
        createJson.resultJson(data2.getDataList());

    }

}
