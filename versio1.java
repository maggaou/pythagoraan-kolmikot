import java.util.*;
import java.io.*;
class Versio1 {
	// tässä lasketaan summia s=a^2+b^2 ja selvitetään
	// onko luku sqrt(s) kokonaisluku
	public static void main(String[] arks) throws Exception {
		long t1 = System.currentTimeMillis();
		// ajetaan m minuuttia
		int m = 10;
		// muuttujien alustus
		int a = 1;
		int kolmikoita = 0;
		List<int[]> kolmikot = new ArrayList((int)3e6);
		while (System.currentTimeMillis()-t1 < m*60*1e3
					&& 2*a*a <= Double.MAX_VALUE )
		{
			for (int b = 1; b <= a; b++) {
				int s = a*a+b*b;
				int c = (int)Math.sqrt(s);
				if (c*c == s) {
					kolmikoita++;
					kolmikot.add(new int[]{a,b,c});
				}
			}
			a++;
		}
		System.out.println("Kolmikoita löytyi ajalla " + (System.currentTimeMillis()-t1)
					+ " ms yhteensä " + kolmikoita);
		FileWriter tiedosto = new FileWriter("kolmikot.data");
		for (int[] kolmikko : kolmikot) {
			tiedosto.write("("+kolmikko[0]+","+kolmikko[1]+","+kolmikko[2]+")\n");
		}
		tiedosto.close();
		System.out.println("Kolmikot kirjoitettiin tiedostoon kolmikot.data");
	}
}
