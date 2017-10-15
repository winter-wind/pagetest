package cc.biibi.setget;

public class Customer {

	private String imgurl = null;//图片url
	private String name = null;//店名
	private String housingprice = null;//住宿价格
	private String eatporice = null;//吃饭价格
	private String summary = null;//简介
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHousingprice() {
		return housingprice;
	}
	public void setHousingprice(String housingprice) {
		this.housingprice = housingprice;
	}
	public String getEatporice() {
		return eatporice;
	}
	public void setEatporice(String eatporice) {
		this.eatporice = eatporice;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	//没有这个空构造函数无法查询数据库所有数据 ，但是可以查总数
	public Customer() {
		//super();
	}
	public Customer(String imgurl, String name, String housingprice, String eatporice, String summary) {
		//super();
		this.imgurl = imgurl;
		this.name = name;
		this.housingprice = housingprice;
		this.eatporice = eatporice;
		this.summary = summary;
	}
	@Override
	public String toString() {
		return "Customer [imgurl=" + imgurl + ", name=" + name + ", housingprice=" + housingprice + ", eatporice="
				+ eatporice + ", summary=" + summary + "]";
	}
	
	

}
