package tw.com.fcb.music;

public class Music {
	
	private String code;
	
	private String name;
	
	private String singerName;

	private int price;
	
	@Override
	public String toString() {
		return "Music [code=" + code + ", name=" + name + ", singerName=" + singerName + ", price=" + price + "]";
	}
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	
	
	
}
