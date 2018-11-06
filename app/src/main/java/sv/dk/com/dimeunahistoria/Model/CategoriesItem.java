package sv.dk.com.dimeunahistoria.Model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;


public class CategoriesItem implements Serializable {

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("deleted_at")
	private Object deletedAt;

	@SerializedName("story")
	private List<StoryItem> story;

	@SerializedName("url")
	private String url;

	@SerializedName("url_banner")
	private String urlBanner;

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
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

	public void setDeletedAt(Object deletedAt){
		this.deletedAt = deletedAt;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public void setStory(List<StoryItem> story){
		this.story = story;
	}

	public List<StoryItem> getStory(){
		return story;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlBanner() {
		return urlBanner;
	}

	public void setUrlBanner(String urlBanner) {
		this.urlBanner = urlBanner;
	}

	@Override
 	public String toString(){
		return 
			"CategoriesItem{" +
			"updated_at = '" + updatedAt + '\'' + 
			",name = '" + name + '\'' +
			",url = '" + url + '\'' +
			",url_banner = '" + urlBanner + '\'' +
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",deleted_at = '" + deletedAt + '\'' + 
			",story = '" + story + '\'' + 
			"}";
		}
}