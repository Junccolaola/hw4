
package test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hw2 {

	public static void main(String[] args)throws IOException {
		

	       
		{
			System.out.println("請輸入整數");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int num = Integer.parseInt(br.readLine());

			if(num == 1)
				System.out.println("輸入的是1"); //只有這句在if 裡
			System.out.println("選擇的是1"); //這句在if之外

			System.out.println("結束處理");

		}
	}
	
}

