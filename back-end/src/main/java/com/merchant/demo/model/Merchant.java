package com.merchant.demo.model;

public class Merchant {
    private Long id;
    private String country;
    private String name;
    private String mode;
    private Integer price1;
    private Integer price2;
    private String website;
    private String pic;

    public Merchant(Long id, String country, String name, String mode, Integer price1, Integer price2, String website, String pic) {
        this.id=id;
        this.country=country;
        this.name=name;
        this.mode=mode;
        this.price1=price1;
        this.price2=price2;
        this.website=website;
        this.pic=pic;
    	
    }
    public Merchant() {
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getPrice1() {
		return price1;
	}
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	public int getPrice2() {
		return price2;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
}