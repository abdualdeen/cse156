
public class Game {
	String gName;
	String pub;
	String year;
	String plat;
	public Game(String gName, String pub, String year, String plat) {
		super();
		this.gName = gName;
		this.pub = pub;
		this.year = year;
		this.plat = plat;
	}
	@Override
	public String toString() {
		return gName + "," + pub + "," + year + ","+ plat;
	}
	public String getgName(){
		return this.gName;
	}
	public String getPub() {
		return pub;
	}
	public String getYear() {
		return year;
	}
	public String getPlat() {
		return plat;
	}

}
