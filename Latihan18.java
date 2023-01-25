public class Latihan18{
	// fungsi tanpa parameter dan nilai pengembalian
	private static void hello(){
		System.out.println("Hello World");
	}
	//fungsi dengan parameter
	private static void salam(String nama){
		System.out.println(nama +", selamat datang.");
	}
	
	//fungsi dengan parameter dan nilai pengembalian
	private static int tambah(int a, int b){
		int hasil = a + b;
		return hasil;
	}

	
	public static void main(String[] args){
		/*
		for(int i = 0; i< 5;i++)
			hello();
		*/
		//salam("Andi");
		//int sl = salam("Andi");
		int rs = tambah(5, 7);
		System.out.println(rs);
	}
}