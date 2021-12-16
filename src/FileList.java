import java.io.File;
import java.util.Arrays;

public class FileList {

    public void fileList(){

        String path=System.getProperty("user.dir");
        File fileObject= new File(path);
        String[] list=fileObject.list();

        for (int a=0; a<list.length; a++) {
            if (list[a].endsWith(".txt")){
                System.out.println(list[a]);
                Arrays.sort(list);
            }
        }
    }

}
