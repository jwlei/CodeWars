package sevenKyu;
import java.util.ArrayList;
import java.util.List;
public class LineNumbering {
    public static List<String> number(List<String> lines) {
        //Create arraylist of the list
        List<String> ans = new ArrayList<>();
        int i = 1;


        //for(dataType item : array) {
        //    ...
        //}
        //        array - an array or a collection
        //        item - each item of array/collection is assigned to this variable
        //        dataType - the data type of the array/collection

        //Iterate over the lines list where we iterate through the Strings we define as itemsInList.
        for (String itemInlist : lines) {
            //We add the item to our arrayList ans and add the index i(By the counter)
            // append ": " followed by the itemInlist.
            ans.add(i + ": " + itemInlist);
            i++;
        }  return ans;
    }
}
/*
BEST PRACTICE:
class LineNumbering {

    static List<String> number(List<String> lines) {
        ArrayList<String> result = new ArrayList();
        int i = 0;
        for (String s : lines) {
            result.add(++i + ": " + s);
        }
        return result;
    }
}
_________________________________________________________
class LineNumbering {
    static List<String> number(List<String> lines) {
    if (lines.size() == 0) return lines;
    return IntStream.range(0, lines.size())
            .mapToObj(n -> String.format("%d: %s", n+1, lines.get(n)))
            .collect(Collectors.toList());
    }
 */