package java_projects;
import java.util.*;

public class program10 {
//Occurence of words
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter string");
		//String str=sc.nextLine();
		String str="Sai Sruthi sruthi Sai Can";
		String[] strArray=str.split(" ");
		ArrayList<String> arlist=new ArrayList<String>();
		for(int i=0;i<strArray.length;i++)
		{
			int count=0;
			if(!(arlist.contains(strArray[i])))
			{
				arlist.add(strArray[i]);
				count++;
				for(int j=i+1;j<strArray.length;j++)
				{
					if(strArray[i].equals(strArray[j]))
					{ 
						count++; 
					}
						
				}

				System.out.println("Occurrence of "+strArray[i]+" "+count);
			}
		}
		
	}

}
