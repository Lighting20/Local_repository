package com.goodsmanager.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.goodsmanager.dao.GoodsDao;
import com.goodsmanager.entity.Goods;


public abstract class GoodsDaoImpl extends MybatisBaseDao implements GoodsDao{
	@Override
	public List<Goods> selectAll(SqlSession session){
		List<Goods>  goodses=super.selectList(session,"GoodsMapper.selectAll");
		return goodses;
	}//查找所有商品
	public List<Goods> selectByGoodsname(SqlSession session,String name){
		List<Goods> goodses=(List<Goods>) super.selectOne(session, "GoodsMapper.selectByGoodsname",name);
		return goodses;
	}//根据商品名查找
	@Override
	public int insertGoods(SqlSession session,Goods goods){
		int result = super.insert(session, "GoodsMapper.inserGoods",goods);
		return result;
	}//增加商品
	public int deleteGoods(SqlSession session,int id){
		int result = super.delete(session,"GoodsMapper.deleteGoods",id);
		return result;
	}//删除商品
	public int updateGoods(SqlSession session,int id){
		int result = super.update(session, "GoodsMapper.updateGoods", id);
		return result;
	}//更新商品
	
}


