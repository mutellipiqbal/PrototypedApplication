import java.io.File;
import java.io.IOException;

public class FileCreate {

    public void creatingFile(String fileName){
        String fileType=".txt";
        try{
            File fileObject=new File(fileName+fileType);

            if(!fileObject.exists()){
                if(fileObject.createNewFile()) {
                    System.out.println(fileObject.getName()+" is created");
                }
            }else {
                System.out.println(fileName+" is exist");
            }

        } catch (IOException e){
            System.out.println("Some error happened");
            e.printStackTrace();
        }
    }
}
