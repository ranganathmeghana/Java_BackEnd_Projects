import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class WriteAndReadClass {
	public static void main(String[] args) {


		try{
			String fileinpath="//Users/meghana_ranganath/Desktop/FileInput.txt";
			FileReader fileReader=new FileReader(fileinpath);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String fileoutpath="//Users/meghana_ranganath/Desktop/FileOutput.txt";
			FileWriter fileWriter=new FileWriter(fileoutpath);
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			String str;
			do{
				str=bufferedReader.readLine();
				bufferedWriter.write(str);
				System.out.println(str);
			}while(bufferedReader.readLine()!=null);
			fileReader.close();
			fileWriter.close();
			bufferedReader.close();
			bufferedWriter.close();
	

		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}



	}

}


