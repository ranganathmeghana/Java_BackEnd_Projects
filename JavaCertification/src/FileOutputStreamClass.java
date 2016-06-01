import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamClass {

	public static void main(String[] args) {
	
		String path="//Users/meghana_ranganath/Desktop/FileOutput.txt";
		File file=new File(path);
		FileOutputStream fileOutputStream=null;
		try {
			fileOutputStream=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str="Hi i'm writing useless things into this file";
		byte[] arr=str.getBytes();
		try {
			
			fileOutputStream.write(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
