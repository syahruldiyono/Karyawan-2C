public class Pro extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Gaji yang anda dapatkan adalah = "+gaji);
		}else{
			System.out.println("Gaji anda melibehi batas yang sudah ditentukakan");
		}
	}
}