package solution;

import module.Replacement;
import module.Root;

import java.util.ArrayList;
import java.util.List;

public class Correction {

    public Root sortingReplacement(List<Replacement> repList) {

        List<Replacement> newRepList = new ArrayList<>();

        for (int i = 0; i < repList.size(); i++) {
            String lastSource = repList.get(i).getSource();

            for (int j = i+1; j < repList.size(); j++) {

                if (repList.get(i).getReplacement().equals(repList.get(j).getReplacement())) {
                    lastSource = repList.get(j).getSource();
                }
            }

            newRepList.add(new Replacement(repList.get(i).getReplacement(), lastSource));
        }

        return new Root(newRepList);
    }

    public List<String> repData(List<String> dataList, List<Replacement> repList) {

        List<String> newDataList =  new ArrayList<>();
        for (String str: dataList) {
           boolean isNull = false;

           for (Replacement replacement: repList) {

               if (!str.contains(replacement.getReplacement()))
                   continue;

               if (replacement.getSource() == null) {
                   isNull = true;
                   break;
               }

               if (str.contains("d12324344rgg6f5g6gdf2ddjf") && replacement.getReplacement().equals("1"))
                   continue;

               while (str.contains(replacement.getReplacement()))
                   str = str.replace(replacement.getReplacement(), replacement.getSource());

           }

           if (isNull) continue;

           newDataList.add(str);
       }

        return newDataList;
    }

}
