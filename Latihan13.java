// pernyataan kondisional 
public class Latihan13{
	public static void main(String[] args){
		int a = 150;
		if (a>=81 && a<=100){
			System.out.println("A");
		}else if (a>=61 && a<=80){
			System.out.println("B");
		}else if (a>=41 && a<=60){
			System.out.println("C");
		}else if (a>=21 && a<=40){
			System.out.println("D");
		}else if (a>=0 && a<=20){
			System.out.println("E");
		}else{
			System.out.println("Salah input");
		}
	}
}