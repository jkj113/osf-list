package osf.list.dao;

import java.util.List;
import java.util.Map;

import osf.list.vo.FoodVO;

public interface FoodDAO { 
	public List<FoodVO> selectFoodList();
    public FoodVO selectFood(FoodVO food); //C
	public boolean insertFood(FoodVO food); //R
	public boolean updateFood(FoodVO food);  //U
	public boolean deleteFood(FoodVO food);  //D
	//기본 틀
}
