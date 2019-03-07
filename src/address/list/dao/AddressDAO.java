package address.list.dao;

import java.util.List;
import java.util.Map;

public interface AddressDAO {

	public List<Map<String,String>> selectAddressList();
	public Map<String,String> selectAddress(Map<String,String> address);
    public boolean insertAddress(Map<String,String> address);
    public boolean updateAddress(Map<String,String> address);
    public boolean deleteAddress(Map<String,String> address);
    
}
