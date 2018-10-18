public class Karyawan{
	String nama;
	String alamat;
	private int gaji;
	public int getGaji(){
		return this.gaji;
	}
	public void setGaji(int duit){
		this.gaji=duit;
	}
	public void setNama(String nama){
		System.out.println("nama = "+nama);
	}
	public void setAlamat(String alamat){
		System.out.println("alamat = "+alamat);
	}
	public void tampilKar(){
		System.out.println("nama = "+nama);
		System.out.println("alamat = "+alamat);
		System.out.println("gaji = "+gaji);

	}
	public void setGaji(int duit, String pesan){
		gaji = duit;
		System.out.println(duit);
		System.out.println(pesan);
	}
}