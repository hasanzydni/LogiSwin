package openBrowser;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class Condi 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int i=sc.nextInt();
		
		if (i==1)
		{
			try 
			{
				   
				   URI uri= new URI("https://www.irctc.co.in/nget/train-search"); 
				   java.awt.Desktop.getDesktop().browse(uri);
				    System.out.println("Web page opened in browser");
			}
				    catch (Exception e)
			{
						   
						   e.printStackTrace();
						  }
		}
		else 
		{
			System.out.println("Wrong Input");
		}

	}

}
