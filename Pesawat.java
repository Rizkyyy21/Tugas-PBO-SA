public class Pesawat {
	private String kotaTujuan;
	private String namaPesawat;
	
	
	public Pesawat(String kotaTujuan,String namaPesawat){
		this.kotaTujuan = kotaTujuan;
		this.namaPesawat = namaPesawat;
	}
	
// ini method setter
    public void setkotaTujuan(String kotaTujuan){
        this.kotaTujuan = kotaTujuan;
    }

    public void setnamaPesawat(String namaPesawat){
        this.namaPesawat = namaPesawat;
    }

	public void info(){
		System.out.println("kotaTujuan:"+this.kotaTujuan);
		System.out.println("namaPesawat:"+this.namaPesawat);
	}
    // ini method getter
    public String getkotaTujuan(){
        return this.kotaTujuan;
    }

    public String getnamaPesawat(){
        return this.namaPesawat;
    }
}

