import java.util.Random;

public class Main {
	
	/*public static String BlVoCo() {
		Random gen = new Random();
		
		String[] vowels = {"a", "e", "i", "o", "u"};
		String[] consonant = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		String[] blends = {"bl","br","cl","ch","cr","fl","fr","gl","pl","sl","br","cr","dr","fr","gr","pr","tr","sc","sk","sm","sn","sp","st","sw","tw","gr","pr","sh","th","wh","wr","sch","scr","shr","sph","spl","spr","squ","str","thr"};
	
		return blends[gen.nextInt(blends.length)] + vowels[gen.nextInt(vowels.length)] + consonant[gen.nextInt(consonant.length)];
	}
	public static String CoVo() {
		Random gen = new Random();
		
		String[] vowels = {"a", "e", "i", "o", "u"};
		String[] consonant = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		
		return consonant[gen.nextInt(consonant.length)] + vowels[gen.nextInt(vowels.length)];
	}
	public static String VoCo() {
		Random gen = new Random();
		
		String[] vowels = {"a", "e", "i", "o", "u"};
		String[] consonant = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		
		return vowels[gen.nextInt(vowels.length)] + consonant[gen.nextInt(consonant.length)];
	}
	public static String WordGen() {
		
		
		Random gen = new Random();
		
		int words = gen.nextInt(2)+2;
		for (int b = 0; b<words; b++) {
			int syllables = gen.nextInt(1)+2;
			for (int c = 0; c<syllables; c++) {
				int sounds = gen.nextInt(3);
				if (sounds==0) {
					return BlVoCo();
				} else if (sounds==1) {
					return CoVo();
				} else if (sounds==2) {
					return VoCo();
				}
			}
			System.out.print(" ");
		}
		System.out.println("");
		return null;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize arrays and variables
		Random gen = new Random();
		String[] vowels = {"a", "e", "i", "o", "u"};
		String[] consonant = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		String[] blends = {"bl","br","cl","ch","cr","fl","fr","gl","pl","sl","br","cr","dr","fr","gr","pr","tr","sc","sk","sm","sn","sp","st","sw","tw","gr","pr","sh","th","wh","wr","sch","scr","shr","sph","spl","spr","squ","str","thr"};
		//String[element][sub-element] - 2d array
		//generates random "subarray" element from "arrays"
		//String[][] arrays = {vowels, consonant, blends};
		//String[] subarray = arrays[gen.nextInt(arrays.length)];
		//System.out.print(arrays[gen.nextInt(arrays.length)][gen.nextInt(subarray.length)]);
		/*
		
		int letgen = gen.nextInt(letters.length);
		
		String a = vowels[vowgen];
		String b = consonant[congen];
		String c = blends[blengen];
		
		System.out.println(letters);
		
		System.out.println(vowels[vowgen]);
		System.out.println(consonant[congen]);
		System.out.println(blends[blengen]);
*/
		//names
		for (int a = 0; a<10; a++) {
			int words = gen.nextInt(2)+2;
			//Move words to method? String word = Method(); String s1 = str.substring(0, 1).toUpperCase(); String cap = s1 + str.substring(1); System.out.print(cap);
			for (int b = 0; b<words; b++) {
				int syllables = gen.nextInt(1)+2;
				for (int c = 0; c<syllables; c++) {
					int sounds = gen.nextInt(3);
					if (sounds==0) {
						String str = blends[gen.nextInt(blends.length)] + vowels[gen.nextInt(vowels.length)] + consonant[gen.nextInt(consonant.length)];
						String s1 = str.substring(0, 1).toUpperCase();
						String cap = s1 + str.substring(1);
						System.out.print(cap);
					} else if (sounds==1) {
						String str = consonant[gen.nextInt(consonant.length)] + vowels[gen.nextInt(vowels.length)];
						String s1 = str.substring(0, 1).toUpperCase();
						String cap = s1 + str.substring(1);
						System.out.print(cap);
					} else if (sounds==2) {
						String str = vowels[gen.nextInt(vowels.length)] + consonant[gen.nextInt(consonant.length)];
						String s1 = str.substring(0, 1).toUpperCase();
						String cap = s1 + str.substring(1);
						System.out.print(cap);
					}
				}
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}

}
