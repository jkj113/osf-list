package address.list.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressData {
public static final List<Map<String,String>> ADDRESS_LIST = new ArrayList<>();
static {
	Map<String,String> map = new HashMap<>();
	map.put("이름","홍길동");
	map.put("주소","경기도");
	map.put("번호","1111");
	ADDRESS_LIST.add(map);
	map = new HashMap<>();
	map.put("이름","고길동");
	map.put("주소","서울");
	map.put("번호","2222");
	ADDRESS_LIST.add(map);
	map = new HashMap<>();
	map.put("이름","이길동");
	map.put("주소","부산");
	map.put("번호","3333");
	ADDRESS_LIST.add(map);
	map = new HashMap<>();
	map.put("이름","강길동");
	map.put("주소","인천");
	map.put("번호","4444");
	ADDRESS_LIST.add(map);
}

}
