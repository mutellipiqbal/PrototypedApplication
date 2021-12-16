import java.io.File;

public class FileDelete {
    public void fileDeleting(String fileName){

        String path=System.getProperty("user.dir");
        String fileType=".txt";
        File fileObject= new File(path+File.separator+fileName+fileType);
        if(fileObject.exists()){
            fileObject.delete();
            System.out.println(fileName+" is deleted");
        } else {
            System.out.println(fileName+" is not exist");
        }
    }
}
