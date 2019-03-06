package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.controller.FoodController;
//osf.list
//.. controller, dao, service, vo
public class Execute {
public static void main(String[] args) {
	FoodController fc = new FoodController(); //controller를 호출해야 하니까 메모리 생성
	
	Map<String,String> req = new HashMap<>(); //요청할 객체
	Map<String,Object> res = new HashMap<>(); //응답 받을 객체
	req.put("cmd","food");
	req.put("number","2");
	fc.doGet(req, res);
//	req.put("cmd", "insert");   //cmd에 넣어주세요
//	req.put("number","5");
//	req.put("name","연어");
//	req.put("price","25000");
//	fc.doPost(req, res);
//	System.out.println(res);  
	System.out.println(res);
	
//	req = new HashMap<>();  //2개가 나오니까 초기화 시켜준다.
//	res = new HashMap<>(); 
//	req.put("cmd","foodList");  //내가 원하는 cmd는 foodList야
//	fc.doGet(req, res);
//	System.out.println(res);
}
}
