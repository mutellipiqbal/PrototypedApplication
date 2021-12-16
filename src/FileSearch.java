import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileSearch {

    public void fileSearching(String fileName){

        String path=System.getProperty("user.dir");
        File fileObject= new File(path);
        String fileType=".txt";
        boolean found=false;
        String[] fileList=fileObject.list();
        for (int a=0; a<fileList.length;a++){
            if (fileList[a].equalsIgnoreCase(fileName+fileType)){
                System.out.println("your file "+fileName+ " is found");
                found=true;
            }
        }
        if(found==false){
            System.out.println("your file "+fileName+ " is not found");
        }

    }
}
