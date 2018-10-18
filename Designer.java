public class Designer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Gaji yang anda dapatkan adalah= "+gaji);
		}else{
			System.out.println("Gaji anda melibehi batas yang sudah ditentukakan");
		}
	}
}