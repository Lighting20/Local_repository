package com.goodsmanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.goodsmanager.dao.GoodsDao;
import com.goodsmanager.dao.impl.GoodsDaoImpl;
import com.goodsmanager.dao.impl.MyBatisUtis;
import com.goodsmanager.entity.Goods;
import com.goodsmanager.service.GoodsService;

public class GoodsServiceImpl implements GoodsService{
	private GoodsDao dao;
	@Override
	public int addGoods(Goods goods){//添加商品
		int result=0;
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			result=dao.insertGoods(session, goods);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
		return result;
	}
	@Override
	public List<Goods> getAll(){//查找所有商品
		List<Goods> result=new ArrayList<Goods>();
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			result=dao.selectAll(session);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
		return result;
	}
	
	public int deleteGoods(int id){//删除商品
		int result=0;
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			result=dao.deleteGoods(session, id);
			session.commit();
	}catch(Exception e){
		e.printStackTrace();
		session.rollback();
	}
		finally{
			if(session!=null){
				session.close();
			}
		}
		return result;
	}
	
	public List<Goods> getOne(String name){//查找单个商品
		List<Goods> result=new ArrayList<Goods>();
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			result=dao.selectByGoodsname(session,name);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
		return result;
	}
	
	public int updateGoods(int id){//修改商品
		int result=0;
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			result=dao.updateGoods(session, id);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
		return result;
	}
}
