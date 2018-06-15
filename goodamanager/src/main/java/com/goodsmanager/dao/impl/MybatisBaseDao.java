package com.goodsmanager.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.goodsmanager.entity.Goods;
import com.goodsmanager.entity.GoodsType;


public class MybatisBaseDao {
	public int insert(SqlSession session,String sqlid,Object values){
		int result=0;
		result=session.insert(sqlid, values);
		return result;
	}
	public int update(SqlSession session,String sqlid,Object values){
		int result=0;
		result=session.update(sqlid, values);
		return result;
	}
	public List<Goods> selectList(SqlSession session, String string) {
		return null;
	}
	public List<GoodsType> SelectList(SqlSession session, String string){
		return null;
	}
	public List<Goods> selectAll(SqlSession session) {
		return null;
	}
	public List<GoodsType> SelectAll(SqlSession session){
		return null;
	}
	public int delete(SqlSession session,String sqlid,Object ... values){
		int result=0;
		result= session.update(sqlid,values);
		return result;
	}
	public Object selectOne(SqlSession session,String sqlid,Object ... values){
		Object result;
		result= session.selectOne(sqlid,values);
		return result;
	}
}
