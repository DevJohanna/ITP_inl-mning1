import java.util.ArrayList;

public class Logic {
    //Lista med rader.
    ArrayList<String> rowList = new ArrayList<>();

    // Stop variabel.
    public boolean stop;

    // Lägg till rad till arraylist.
    public void addRow(String row){

        // Om stop lägg inte till i listan.
        if(!row.equals("stop")){
            rowList.add(row);
        }
        else
            stop = true;
    }

    // Räknar rader.
    public int rowCount(){
        return rowList.size();
    }

    // Räknar tecken i raderna från listan.
    public int charCount(){
        int count = 0;
        for (String row:rowList){
            count = count + row.length();
        }
        return count;
    }
}
