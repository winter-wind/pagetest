package cc.biibi.setget;

public class Customer {

	private String imgurl = null;//ͼƬurl
	private String name = null;//����
	private String housingprice = null;//ס�޼۸�
	private String eatporice = null;//�Է��۸�
	private String summary = null;//���
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
	//û������չ��캯���޷���ѯ���ݿ��������� �����ǿ��Բ�����
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
