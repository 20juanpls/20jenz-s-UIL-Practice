import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Madison {

   Scanner s = new Scanner(System.in);
   public static void main(String args[]){
   		File f = new File("C://Users//s106020//Desktop//MahMeems//Madison.txt");
   		try{
   			BufferedReader in = new BufferedReader(new FileReader(f));
   			ArrayList<String> ListNum = new ArrayList<String>();
   				
   			String deLine;
   			//int Counter = 0;
   			while((deLine = in.readLine())!= null){
   					System.out.println(deLine);
   					for(int i =0; i < deLine.length();i++){
   						String letter = deLine.substring(i,i+1);
   						if(letter.equals("1")||letter.equals("0")){
   						//	Counter++;
   							ListNum.add(letter);
   						}	
   					}
   				}
   			System.out.println(ListNum);
   		}
   		catch(IOException e){
   			e.printStackTrace();
   		}
   	
   }
}