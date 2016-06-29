import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by patrick on 4/21/16.
 */
public class Test {

    public static void main(String args[]){
        Set<String> set = new HashSet<String>();
        Set<String> set1 = new HashSet<String>();
        set1.add("骨");
        set1.add("刺");
        set1.add("胶");
        set1.add("的");
        String filePath = "/usr/local/workspace/thetesting/src/data.txt";
        try {
            String encoding="UTF-8";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file),encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    System.out.println(lineTxt);
                    set.add(lineTxt);
                }
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }



    }

}
