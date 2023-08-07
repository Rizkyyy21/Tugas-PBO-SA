public class TestPesawat{
	public static void main (String[] args){
		
		Pesawat penumpang1 = new Pesawat("Solo","Garuda");
		penumpang1.setkotaTujuan("Solo");
		penumpang1.getkotaTujuan();
		penumpang1.setnamaPesawat("Garuda");
		penumpang1.getnamaPesawat();
		penumpang1.info();
		
		Pesawat penumpang2 = new Pesawat("Semarang","Lion");
		penumpang2.setkotaTujuan("Semarang");
		penumpang2.getkotaTujuan();
		penumpang2.setnamaPesawat("Lion");
		penumpang2.getnamaPesawat();
		penumpang2.info();
	}
}
