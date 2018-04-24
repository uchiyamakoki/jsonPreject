package com.json.tools;

import com.google.gson.Gson;

import net.sf.json.JSONObject;

public class JsonTools {

	
	public JsonTools(){
		
	}
	/**
	 * @param args
	 * key
	 *   	表示json字符串的头信息
	 * object
	 * 		是对解析的集合的类型
	 * String key,Object value 
	 * Gson使用时不用String key
	 */
	public static String createJsonString(Object value){
		//JSONObject jsonObject=new JSONObject();
		//jsonObject.put(key, value);
		//return jsonObject.toString();//生成json的字符串
		Gson gson=new Gson();
		String str=gson.toJson(value);
		
		return str;
	}

}
