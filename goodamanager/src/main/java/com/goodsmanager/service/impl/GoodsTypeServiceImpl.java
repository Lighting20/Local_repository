package com.goodsmanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.goodsmanager.dao.GoodsTypeDao;
import com.goodsmanager.dao.impl.GoodsTypeDaoImpl;
import com.goodsmanager.dao.impl.MyBatisUtis;
import com.goodsmanager.entity.Goods;
import com.goodsmanager.entity.GoodsType;
import com.goodsmanager.service.GoodsTypeService;

public class GoodsTypeServiceImpl implements GoodsTypeService{
  private GoodsTypeDao dao=new GoodsTypeDaoImpl();
	@Override
	public List<GoodsType> getAll() {//查找所有商品类型
		List<GoodsType> types=new ArrayList<GoodsType>();
		SqlSession session=MyBatisUtis.createSqlSession();
		try {
			 types= dao.SelectAll(session);
			 session.commit();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally {
			if(session!=null){
			session.close();}
		}
		return types;
	}
	public List<GoodsType> SelectById(int typeid){//根据typeid查找商品类型
		List<GoodsType> type=new ArrayList<GoodsType>();
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			type=dao.SelectById(session, typeid);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();	
		}
		finally {
			if(session!=null){
			session.close();}
		}
		return type;
	}
	
	public int DeleteGoodsType(int typeid){//根据typeid删除商品类型
		int result=0;
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			result=dao.DeleteGoodsType(session, typeid);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();	
		}
		finally {
			if(session!=null){
			session.close();
			}
		}
		return result;
	}
	
	public int UpdateGoodsType(int typeid){//根据typeid修改商品类型
		int result=0;
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			result=dao.UpdateGoodsType(session, typeid);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();	
		}
		finally {
			if(session!=null){
			session.close();
			}
		}
		return result;
	}
	
	public int addGoods(GoodsType goodstype){//添加商品类型
		int result=0;
		SqlSession session=MyBatisUtis.createSqlSession();
		try{
			result=dao.InsertGoodsType(session, goodstype);
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
	public int addGoodsType(GoodsType goodstype) {
		// TODO Auto-generated method stub
		return 0;
	}
}