public class Programmer extends Karyawan{
	public void setGaji(int uang){
		if(uang<=90){
			System.out.println("Gaji yang anda dapatkan adalah = "+uang);
		}else{
			System.out.println("Gaji anda melibehi batas yang sudah ditentukakan");
		}
	}
}