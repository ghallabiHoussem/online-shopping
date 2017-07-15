package net.kzn.shoppingbackend.dto;

public class Category {

	
	
	/*
	 * Private attribute
	 *  */
	
	private long id;
	private String name;
	private String description;
	private boolean isActive = true;
	private String imageURL;
	public long getId() {
		return id;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
