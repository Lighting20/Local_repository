package com.goodsmanager.service;

import java.util.List;

import com.goodsmanager.entity.GoodsType;

public interface GoodsTypeService {

	List<GoodsType> getAll();

	public List<GoodsType> SelectById(int typeid);
	
	public int DeleteGoodsType(int typeid);
	
	public int UpdateGoodsType(int typeid);
	
	public int addGoodsType(GoodsType goodstype);
}
