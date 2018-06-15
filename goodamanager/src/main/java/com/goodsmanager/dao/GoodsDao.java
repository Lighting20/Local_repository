package com.goodsmanager.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.goodsmanager.entity.Goods;

public interface GoodsDao {

 	public List<Goods> selectAll(SqlSession session);

	public int insertGoods(SqlSession session, Goods goods);

	public List<Goods> selectByGoodsname(SqlSession session,String name);
	
	public int deleteGoods(SqlSession session,int id);
	
	public int updateGoods(SqlSession session,int id);

}
