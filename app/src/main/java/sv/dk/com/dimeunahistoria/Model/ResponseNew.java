package sv.dk.com.dimeunahistoria.Model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class ResponseNew {

	@SerializedName("data")
	private List<CategoriesItem> data;

	@SerializedName("success")
	private boolean success;

	@SerializedName("message")
	private String message;

	public void setData(List<CategoriesItem> data){
		this.data = data;
	}

	public List<CategoriesItem> getData(){
		return data;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"ResponseNew{" +
			"data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}