package GeneralSetting;

import javax.swing.*;

public class StringUtils {
    public static final String COMMA  =",";
    public static final String CSV = ".csv";

    public static String comcat(String [] content,String character ){
        StringBuffer outString = new StringBuffer(content[0]);

        for(int i =1;i<content.length;i++){
            outString.append(character);
            outString.append(content[i]);
        }
        return outString+".csv";
    }
}
