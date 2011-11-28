class MainEkspresiWajah {
	public static void main(String [] args) {
		EkspresiWajah objEkspresi = new EkspresiWajah();
		Gembira objGembira = new Gembira();
		Sedih objSedih = new Sedih();
		Marah objMarah = new Marah();
		
		EkspresiWajah[] arrEkspresi = new EkspresiWajah[4];
		arrEkspresi[0] = objEkspresi;
		arrEkspresi[1] = objGembira;
		arrEkspresi[2] = objSedih;
		arrEkspresi[3] = objMarah;
		
		System.out.println("Ekspresi[0] : " + arrEkspresi[0].respons());
		System.out.println("Ekspresi[1] : " + arrEkspresi[1].respons());
		System.out.println("Ekspresi[2] : " + arrEkspresi[2].respons());
		System.out.println("Ekspresi[3] : " + arrEkspresi[3].respons());
	}
}