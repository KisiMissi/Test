package module;

import java.util.List;

public class Data {

    private List<String> dataList;

    public Data(List<String> dataList) {
        this.dataList = dataList;
    }

    public List<String> getDataList() {
        return dataList;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dataList=" + dataList +
                '}';
    }
}
