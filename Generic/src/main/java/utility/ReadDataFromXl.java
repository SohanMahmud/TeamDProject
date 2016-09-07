package utility;

import java.io.IOException;

/**
 * Created by admin on 9/3/2016.
 */
public class ReadDataFromXl {

    DataReader dr = new DataReader();
    public String [] getData()throws IOException{
        String path = System.getProperty("user.dir")+"./data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
