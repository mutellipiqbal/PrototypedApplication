import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Prototyped Application.");
        System.out.println("Author is Yikebali.");
        System.out.println("All rights preserved!");
        System.out.println();

        int options;

        do{
            System.out.println();
            System.out.println("Please enter 1-4 for following options:");
            System.out.println("Enter 1 for creating file.");
            System.out.println("Enter 2 for searching file.");
            System.out.println("Enter 3 for deleting file.");
            System.out.println("Enter 4 for displaying all files.");

            options=scanner.nextInt();

            switch (options) {
                case 1:
                    System.out.println("Please enter file name:");
                    FileCreate fileCreate = new FileCreate();
                    Scanner scanner1 = new Scanner(System.in);
                    fileCreate.creatingFile(scanner1.nextLine());
                    break;

                case 2:
                    System.out.println("Please enter file name for searching");
                    FileSearch fileSearch= new FileSearch();
                    Scanner scanner2= new Scanner(System.in);
                    fileSearch.fileSearching(scanner2.nextLine());
                    break;

                case 3:
                    System.out.println("Please enter file name for deleting");
                    FileDelete fileDelete= new FileDelete();
                    Scanner scanner3= new Scanner(System.in);
                    fileDelete.fileDeleting(scanner3.nextLine());
                    break;

                case 4:
                    System.out.println("All files listed below:");
                    FileList fileList = new FileList();
                    fileList.fileList();
                    break;

                default:
                   System.out.println("System exit!");
                }
            } while(options>0&&options<5);
        }
    }

