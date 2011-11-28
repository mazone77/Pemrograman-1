public class EkspresiWajah {
	public String respons() {
		return ("Perhatikan ekspresi wajah saya");
	}
}

class Gembira extends EkspresiWajah {
	public String respons() {
		return("ha ha ha");
	}
}

class Sedih extends EkspresiWajah {
	public String respons() {
		return("hik hiks");
	}
}

class Marah extends EkspresiWajah {
	public String respons() {
		return ("Hai kurang ajar!");
	}
}