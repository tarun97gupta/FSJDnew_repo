package fsd_Phase1_Project;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class FileActionRunner {
	
	static String fileName;
	static final String projectFilePath="D:\\tarun.gupta23\\eclipse-workspace\\CoreJavaProject\\src\\File_Demo";
	static int option=0;
	//Creating a Static Scanner object to be accessed throughout the program
	
	static Scanner sc1=new Scanner(System.in);
	static final String error_message="Some error has occured, Please contact administrator tarun@gmail.com";
	
	//Display Menu function
	
	public static void display_Mehtod() {
		
		System.out.println("-----------------------------------------------------");
		System.out.println("\t\tWelcome to the FileHandling Program");
		System.out.println("-----------------------------------------------------");
		System.out.println("\t\t1. Display All the Files");
		System.out.println("\t\t2. Add a new File");
		System.out.println("\t\t3. Delete a File");
		System.out.println("\t\t4. Search a File");
		System.out.println("\t\t5. Exit");
	}
	
	//1. Display Files Function

	
	public static void display_files() {
		// Using try and catch blocks
		
		try {
			File search_folder=new File(projectFilePath);
			File[] list_of_files=search_folder.listFiles();
			if(list_of_files.length==0) {
				System.out.println("There are no files present in the directory");
			}
			else {
				for(var k:list_of_files) {
					System.out.println("Files : "+k.getName());
				}
			}
		}
		catch(Exception ex1){
			System.out.println(error_message);
		}
	}
	
	//2.Add a File Function
	public static void create_file(){
		
		int lines_count=0;
		
		try {
			System.out.println("Please Enter the new File name");
			fileName=sc1.nextLine();
			FileWriter write_new=new FileWriter(projectFilePath+"\\"+fileName);
			System.out.println("Enter the number of lines you want to write inside the file");
			lines_count=Integer.parseInt(sc1.nextLine());
			System.out.println("Start entering the content according to the number of lines you have mentioned previously.");
			for (int i=1;i<=lines_count;i++) {
				write_new.write(sc1.nextLine()+"\n");
			}
			System.out.println("File Successfully created");
			write_new.close();
		}
		
		catch (Exception ex2){
			System.out.println(error_message);
		}
		
	}
	
	//3. Delete a file function
	
	public static void delete_file() {
		
		try {
			System.out.println("Enter the file name that you want to Delete");
			fileName=sc1.nextLine();
			File f1=new File(projectFilePath+"\\"+fileName);
			if(f1.exists()) {
				f1.delete();
				System.out.println("File has been Deleted successfully");
			}
			else {
				System.out.println("Entered file name does not exist in the Directory. Please create a file with the name in order to perform the function");
			}
		}
		catch (Exception ex3) {
			System.out.println(error_message);
		}
	}
	
	//4. Search for a file function
	
	public static void search_file() {
		
		try {
			System.out.println("Enter the file name that you want to search");
			fileName=sc1.nextLine();
			File f2=new File(projectFilePath);
			File[] list_of_files=f2.listFiles();
			LinkedList<String> file_names=new LinkedList<String>();
			for(var I:list_of_files) {
				file_names.add(I.getName());
			}
			if(file_names.contains(fileName)) {
				System.out.println("The file name you have entered does exist in the Directory");
			}
			else {
				System.out.println("The file name you have entered does exist in the Directory. Please create a new file with the same name to perform any operations");
			}
			
		}
		catch (Exception ex4) {
			System.out.println(error_message);
		}
		
	}
	
	//Main method to call all the functions
	
	public static void main(String[] args) {
		
		do {
			
			display_Mehtod();
			System.out.println("Please enter any one of the option from above");
			option=Integer.parseInt(sc1.nextLine());
			switch(option) {
			case 1:
				display_files();
				break;
			case 2:
				create_file();
				break;
			case 3:
				delete_file();
				break;
			case 4:
				search_file();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option entered");
			}
			
		}while (option>0);
		
	sc1.close();
	}
	
}
