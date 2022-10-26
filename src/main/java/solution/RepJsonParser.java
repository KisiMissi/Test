package solution;

import module.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepJsonParser {

    private static final String REPLACEMENT_FILE_PATH = "D:/Projects/Java2/MyTest/replacement.json";
    private static final String DATA_FILE_PATH = "D:\\Projects\\Java2\\MyTest\\data.json";

    //����� ��� �������� ����� � ����������� ��������
    public Root rootParse() {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(REPLACEMENT_FILE_PATH)) {

            JSONArray jsonArray = (JSONArray) parser.parse(reader);

            List<Replacement> repList = new ArrayList<>();

            for (Object it: jsonArray) { //���������� ������� �� ������ ��������
                JSONObject replacementObject = (JSONObject) it; //����������� ������ � ������ json

                String replacement = (String) replacementObject.get("replacement");
                String source = (String) replacementObject.get("source");

                Replacement rep = new Replacement(replacement, source);
                repList.add(rep);
            }
            return new Root(repList);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }


    //����� ��� �������� ������ data.json
    public Data dataParser() {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(DATA_FILE_PATH)) {

            JSONArray dataArray = (JSONArray) parser.parse(reader);

            List<String> dataList = new ArrayList<>();
            for (Object str: dataArray) {
                dataList.add((String) str);
            }
            return new Data(dataList);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
