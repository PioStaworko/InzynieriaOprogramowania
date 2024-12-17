package Prezenter;
import java.util.HashMap;

public abstract class Wniosek {

	private HashMap<String,String> data;

	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void setkey(String key, String value) {
		data.put(key, value);
	}

	/**
	 * 
	 * @param key
	 */
	public String getkey(String key) {
		return data.get(key);
	}

	public String[] getkeys() {
		return data.keySet().toArray(new String[0]);
	}

}