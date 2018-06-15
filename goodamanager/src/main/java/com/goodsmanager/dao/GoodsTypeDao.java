package com.goodsmanager.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.goodsmanager.entity.GoodsType;

public interface GoodsTypeDao {

	List<GoodsType> SelectAll(SqlSession session);

	public List<GoodsType> SelectById(SqlSession session,int typeid);
	
	public int InsertGoodsType(SqlSession session,GoodsType goodstype);
	
	public int DeleteGoodsType(SqlSession session,int typeid);
	
	public int UpdateGoodsType(SqlSession session,int typeid);
	
	
}
