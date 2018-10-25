package sv.dk.com.dimeunahistoria.Modelos;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class ResponseData {

	@SerializedName("data")
	private List<Story> data;

	@SerializedName("success")
	private boolean success;

	@SerializedName("message")
	private String message;

	public void setData(List<Story> data){
		this.data = data;
	}

	public List<Story> getData(){
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
			"ResponseData{" +
			"data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}