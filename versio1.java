class Versio1 {
	// tässä lasketaan summia s=a^2+b^2 ja selvitetään
	// onko luku sqrt(s) kokonaisluku
	public static void main(String[] arks) {
		long t1 = System.currentTimeMillis();
		// ajetaan m minuuttia
		int m = 10;
		// muuttujien alustus
		int a = 1;
		int kolmikoita = 0;
		while (System.currentTimeMillis()-t1 < m*60*1e3) {
			for (int b = 1; b <= a; b++) {
				int s = a*a+b*b;
				int u = (int)Math.sqrt(s);
				if (u*u == s) {
					kolmikoita++;
				}
			}
			a++;
		}
		System.out.println("Kolmikoita löytyi ajalla " + (System.currentTimeMillis()-t1)
					+ " ms yhteensä " + kolmikoita);
	}
}