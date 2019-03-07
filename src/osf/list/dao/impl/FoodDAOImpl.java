package osf.list.dao.impl;

import java.util.List;

import osf.list.dao.FoodDAO;
import osf.list.data.FoodData;
import osf.list.vo.FoodVO;

public class FoodDAOImpl implements FoodDAO {
//FOOD_LIST의 구성원은 MAP
	@Override
	public List<FoodVO> selectFoodList() {
		return FoodData.FOOD_LIST; // 오라클 대신에 만든 것
	}
	@Override
	public boolean insertFood(FoodVO food) {
		return FoodData.FOOD_LIST.add(food);
	}
	@Override
	public FoodVO selectFood(FoodVO food) {
		for (int i = 0; i < FoodData.FOOD_LIST.size(); i++) {
			FoodVO f = FoodData.FOOD_LIST.get(i);
//		for(Map<String,String> f : FoodData.FOOD_LIST) {
			if (f.getNumber().equals(food.getNumber())) {
				return f;
			}
		}
		return null;
	}
	@Override // 내용을 찾아서 수정 2가지
	public boolean updateFood(FoodVO food) {
		for (int i = 0; i < FoodData.FOOD_LIST.size(); i++) {
			FoodVO f = FoodData.FOOD_LIST.get(i);
			if (f.getNumber().equals(food.getNumber())) {
				if (food.getName() != null) {
					f.setName(food.getName());
				}
				if (food.getPrice() != null) {
					f.setPrice(food.getPrice());
				}
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean deleteFood(FoodVO food) {
		for (int i = 0; i < FoodData.FOOD_LIST.size(); i++) {
			FoodVO f = FoodData.FOOD_LIST.get(i);
			if (f.getNumber().equals(food.getNumber())) {
				FoodData.FOOD_LIST.remove(i);
				return true;  //같을 때만
			}
		}
		return false;
	}

}
