package solution;

import org.json.JSONException;
import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class CreatingJson {

    public void resultJson(List<String> dataList) {

        JSONArray jsonArray = new JSONArray();
        try {
            jsonArray.addAll(dataList);
        } catch (JSONException ex) {
            ex.printStackTrace();
        }

        try (PrintWriter out = new PrintWriter(new FileWriter("result.json"))) {
            out.write(jsonArray.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
