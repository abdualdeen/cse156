
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
		return "Game [gName=" + gName + ", pub=" + pub + ", year=" + year + ", plat=" + plat + "]";
	}
	public String getgName(){
		return this.gName;
	}
	public void setgName(String name) {
		this.gName = name;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPlat() {
		return plat;
	}
	public void setPlat(String plat) {
		this.plat = plat;
	}

}
