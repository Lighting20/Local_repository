package com.goodsmanager.service;

import java.util.List;

import com.goodsmanager.entity.Goods;

public interface GoodsService {

	public int addGoods(Goods goods);

	public List<Goods> getAll();
	
	public int deleteGoods(int id);
	
	public List<Goods> getOne(String name);
	
	public int updateGoods(int id);


}
