public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pro p = new Pro();
	p.setNama("Syahrul Diyono");
	p.setAlamat("Bangkir City");
	p.setGaji(110);
	System.out.println(" ");

	System.out.println("Jabatan Programer");
	Programmer pr = new Programmer();
	pr.setNama("Iyan Lowe");
	pr.setAlamat("JuntiNyuat");
	pr.setGaji(99);
	System.out.println(" ");

	System.out.println("Jabatan Designer");
	Designer d = new Designer();
	d.setNama("Kukuh Ajie");
	d.setAlamat("Terisi");
	d.setGaji(89);
	}
}