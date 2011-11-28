package main;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;
import java.io.*;

public class MainClass
{
	public static void main (String[] args)
	Scanner input = new Scanner (System.in);
	{
		try
		{
			CalculatorService service = new CalculatorServiceImpl();
			System.out.println("Calculator :-)");
			System.out.println("Masukkan Bilangan 1 :");
			Integer a = input.readLine();
			System.out.println("Masukkan Bilangan 2 :");
			Integer b = input.readLine();
			System.out.println("Pilih operator hitung (1-4) " + "\n\t1.) Operaror tambah (+)" + "\n\t2.) Operator kurang (-)" + "\n\t3.) Operator kali (*)" + "\n\t4.) Operator bagi (/)");  
			System.out.print("Masukkan operator hitung pilihan Anda : ");
			String choose = input.readLine();
			if(choose.equals("1"))
			{
				System.out.println("Hasil perhitungan dari" + (a) + "+" + (b) + "=" + service.tambah(a,b));
			}
			else if(choose.equals("2"))
			{
				System.out.println("Hasil perhitungan dari" + (a) + "-" + (b) + "=" + service.kurang(a,b));
			}
			else if(choose.equals("3"))
			{
				System.out.println("Hasil perhitungan dari" + (a) + "*" + (b) + "=" + service.kali(a,b));
			}
			else if(choose.equals("4"))
			{
				System.out.println("Hasil perhitungan dari" + (a) + "/" + (b) + "=" + service.bagi(a,b));
			}
			else
			{
				throw new Exception("Operator pilihan Anda tidak ada!");				
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}