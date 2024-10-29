
package test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hw6 {

	public static void main(String[] args)throws IOException {
		

	       
		{
			System.out.println("請輸入整數");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int num = Integer.parseInt(br.readLine());

			switch (num)
			{
				case 1:
				{
					System.out.println("輸入的是1");
					//沒有break;
				}
				case 2:
				{
					System.out.println("輸入的是2");
					//沒有break;
				}
				default:
				{
					System.out.println("請輸入1或2");
					//沒有break;
				}
	}}
	
}}

