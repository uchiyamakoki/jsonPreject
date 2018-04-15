package com.json.test;

import com.json.domain.Person;
import com.json.service.JsonService;
import com.json.tools.JsonTools;

public class TestJson {

	public TestJson() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="";
		JsonService service=new JsonService();
		//Person person=service.getPerson();
		//msg=JsonTools.createJsonString("person", person);
		//System.out.println(msg);
		msg=JsonTools.createJsonString("persons", service.getListMaps());
		System.out.println(msg);
	}

}
