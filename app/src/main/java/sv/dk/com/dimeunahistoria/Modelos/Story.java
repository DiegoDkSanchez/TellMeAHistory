package sv.dk.com.dimeunahistoria.Modelos;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Story implements Serializable{

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("id_category")
	private int idCategory;

	@SerializedName("name")
	private String name;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("state")
	private int state;

	@SerializedName("url")
	private String url;

	@SerializedName("url_banner")
	private String urlBanner;

	@SerializedName("category")
	private Category category;

	@SerializedName("deleted_at")
	private Object deletedAt;

	@SerializedName("sections")
	private List<SectionsItem> sections;

	protected Story(Parcel in) {
		updatedAt = in.readString();
		idCategory = in.readInt();
		name = in.readString();
		createdAt = in.readString();
		id = in.readInt();
		state = in.readInt();
		url = in.readString();
		urlBanner = in.readString();
	}


	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setIdCategory(int idCategory){
		this.idCategory = idCategory;
	}

	public int getIdCategory(){
		return idCategory;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setState(int state){
		this.state = state;
	}

	public int getState(){
		return state;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public String getUrlBanner() {
		return urlBanner;
	}

	public void setUrlBanner(String urlBanner) {
		this.urlBanner = urlBanner;
	}

	public void setDeletedAt(Object deletedAt){
		this.deletedAt = deletedAt;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public void setSections(List<SectionsItem> sections){
		this.sections = sections;
	}

	public List<SectionsItem> getSections(){
		return sections;
	}

	@Override
 	public String toString(){
		return 
			"Story{" +
			"updated_at = '" + updatedAt + '\'' + 
			",id_category = '" + idCategory + '\'' + 
			",name = '" + name + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",state = '" + state + '\'' +
			",url = '" + url + '\'' +
			",category = '" + category + '\'' + 
			",deleted_at = '" + deletedAt + '\'' + 
			",sections = '" + sections + '\'' + 
			"}";
		}
}