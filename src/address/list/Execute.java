package address.list;

import java.util.HashMap;
import java.util.Map;

import address.list.controller.AddressController;

public class Execute {
	public static void main(String[] args) {
		AddressController ac = new AddressController();
		Map<String, String> req = new HashMap<>();
		Map<String, Object> res = new HashMap<>();
//		req.put("cmd", "address");
//		req.put("home", "부산");
//		ac.doGet(req, res);
//		System.out.println(res);
		
//		req = new HashMap<>();
//		res = new HashMap<>();
//		req.put("cmd", "insert");
//		req.put("number", "555");
//		req.put("name", "홍");
//		req.put("home", "수원");
//		ac.doPost(req, res);
//		System.out.println(res);
//		
//		req = new HashMap<>();
//		res = new HashMap<>();
//		req.put("cmd", "update");
//		req.put("name", "홍길동");
//		req.put("home", "수원");
//		ac.doPost(req, res);
//		System.out.println(res);
//		
		req = new HashMap<>();  
		res = new HashMap<>(); 
		req.put("cmd","delete");
		req.put("number","1111");
		ac.doPost(req, res);
		System.out.println(res);

		res = new HashMap<>();
		req.put("cmd","addressList");  
		ac.doGet(req, res);
		System.out.println(res);
	}
}
