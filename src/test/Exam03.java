package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Exam03 {
	static final List<Map<String, String>> LIST;
	static {
		LIST = new ArrayList<>();
		Map<String, String> game1 = new HashMap<String, String>(); // 원래는 이렇게 String 써줘야 한다.
		game1.put("이름", "슈퍼마리오");
		game1.put("가격", "30000");
		LIST.add(game1); //안의 공간이 늘어날 뿐 주소값이 바뀌는 것은 아니다.
		game1 = new HashMap<>();
		game1.put("이름", "스트리트파이터2");
		game1.put("가격", "40000");
		LIST.add(game1);
		game1 = new HashMap<>();
		game1.put("이름", "스트리트파이터3");
		game1.put("가격", "35000");
		LIST.add(game1);
	}

	public static Map<String, String> searchGame(String name) {
		for (int i = 0; i < LIST.size(); i++) {
			Map<String, String> game = LIST.get(i); // game을 하나씩 꺼내서
			if (name.equals(game.get("이름"))) {
				return game; //맞으면 (있으면)
			}
		}
		return null; //아니면 (없으면)
	}

	public static List<Map<String, String>> searchGameList(String name) {
		List<Map<String, String>> gameList = new ArrayList<>();
		// List가 있어야 결과를 저장한다.
		for (int i = 0; i < LIST.size(); i++) {
			Map<String, String> game = LIST.get(i);
			if (game.get("이름").indexOf(name) != -1) { 
				gameList.add(game);
			}
		}
		return gameList; 
	}

	public static void main(String[] args) {
//		System.out.println(LIST.size());
//		for(int i = 0; i <LIST.size();i++) {
//			System.out.println(LIST.get(i));
//			Map<String,String> game = LIST.get(i);
//			if(game.get("이름").equals("슈퍼마리오")) {
//				System.out.println(game);
//		if(LIST.get(i).get("이름").equals("슈퍼마리오")) {
//			System.out.println(LIST.get(i));
//		}
//		}
//	}
		Map<String, String> game = searchGame("위닝");
		if (game == null) {
			System.out.println("그런거 없다.");
		} else {
			System.out.println(game);
		}
		List<Map<String, String>> gameList = searchGameList("1945");
		if (gameList.size() == 0) {
			System.out.println("없는 것만 찾아");
		} else {
			System.out.println(gameList);
		}
	}
}