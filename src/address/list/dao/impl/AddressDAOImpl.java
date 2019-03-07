package address.list.dao.impl;

import java.util.List;
import java.util.Map;

import address.list.dao.AddressDAO;
import address.list.data.AddressData;
import osf.list.data.FoodData;

public class AddressDAOImpl implements AddressDAO {

	@Override
	public List<Map<String, String>> selectAddressList() {
		return AddressData.ADDRESS_LIST;
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> address) {
//		for (int i = 0; i < AddressData.ADDRESS_LIST.size(); i++) {
//			Map<String, String> a = AddressData.ADDRESS_LIST.get(i);
			for(Map<String,String> a : AddressData.ADDRESS_LIST) {
			if (a.get("이름").equals(address.get("이름"))) {
				return a;
			}
			if(a.get("주소").equals(address.get("주소"))){
		return a;
			}
		}
		return null;
	}


	@Override
	public boolean insertAddress(Map<String, String> address) {
		return AddressData.ADDRESS_LIST.add(address);
	}

	@Override
	public boolean updateAddress(Map<String, String> address) {
		for(Map<String,String> a : AddressData.ADDRESS_LIST) {
			if(a.get("이름").equals(address.get("이름"))) {
				if(address.get("이름") != null) {
					a.put("이름",address.get("이름"));
				}
				if(address.get("주소")!= null) {
					a.put("주소",address.get("주소"));
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteAddress(Map<String, String> address) {
		for(int i = 0; i < AddressData.ADDRESS_LIST.size(); i++) {
			Map<String, String> a = AddressData.ADDRESS_LIST.get(i);
//			for(Map<String,String> a : AddressData.ADDRESS_LIST) {
			if(a.get("번호").equals(address.get("번호"))){
				AddressData.ADDRESS_LIST.remove(i);
				return true;
			}
		}
		return false;
	}


}
