package sv.dk.com.dimeunahistoria.Modelos;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class SectionsItem implements Serializable {

	@SerializedName("id_story")
	private int idStory;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("deleted_at")
	private Object deletedAt;

	@SerializedName("audio_url")
	private String audioUrl;



	@SerializedName("url")
	private String url;

	protected SectionsItem(Parcel in) {
		idStory = in.readInt();
		updatedAt = in.readString();
		name = in.readString();
		description = in.readString();
		createdAt = in.readString();
		id = in.readInt();
		url = in.readString();
	}

	public String getAudioUrl() {
		return audioUrl;
	}

	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}
	public void setIdStory(int idStory){
		this.idStory = idStory;
	}

	public int getIdStory(){
		return idStory;
	}

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

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
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

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return
			"SectionsItem{" +
			"id_story = '" + idStory + '\'' +
			",updated_at = '" + updatedAt + '\'' +
			",name = '" + name + '\'' +
			",description = '" + description + '\'' +
			",created_at = '" + createdAt + '\'' +
			",id = '" + id + '\'' +
			",deleted_at = '" + deletedAt + '\'' +
			",url = '" + url + '\'' +
			"}";
		}
}