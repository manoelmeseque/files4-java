package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o caminho: ");
		String strpath = sc.next();
		
		File path = new File(strpath);	
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for(File folder :folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File file: files) {
			System.out.println(file);
		}
		
		
		boolean success = new File(strpath + "\\subdir").mkdir();
		System.out.println("A pasta foi criada com sucesso? " + success);
	}

}
