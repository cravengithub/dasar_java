public class Latihan19{
	// rekursif (fungsi di dalam fungsi)
	private static String terbilang(int bil){
	//  index			0	 1		2		3		4 dst	
		String arr[] ={"" ,"satu", "dua", "tiga", "empat", "lima", "enam"
		, "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
		if (bil > 0 && bil < 12){
			return arr[bil];
		}else if (bil > 11 && bil < 20){
			int st = bil % 10;
			return terbilang(st) + " belas";
		}else if (bil >= 20 && bil < 100){
			int pl = bil / 10;
			int st = bil % 10;
			return terbilang(pl) + " puluh " + terbilang(st);
		}else if (bil >= 100 && bil < 200){
			int st = bil % 100;
			return "seratus " + terbilang(st);
		}
		return "";
	}
	public static void main(String[] args){
		String hasil = terbilang(153);
		System.out.println(hasil);
	}
}
/*
2 7 = 
pl = 27 \ 10 -> 2
pl = 2
st = 27 % 10 -> 7

dua puluh tujuh
https://youtu.be/1NK5zneCbf0

*/


