package com.goodsmanager.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.goodsmanager.dao.GoodsTypeDao;
import com.goodsmanager.entity.Goods;
import com.goodsmanager.entity.GoodsType;

public class GoodsTypeDaoImpl extends MybatisBaseDao implements GoodsTypeDao{

	@Override
	public List<GoodsType> SelectAll(SqlSession session) {
		// TODO Auto-generated method stub
		List<GoodsType>  goodstype=super.SelectList(session,"GoodsTypeMapper.selectAll");
		return goodstype;
	}//查找所有商品类型
	public List<GoodsType> SelectById(SqlSession session,int typeid){
		List<GoodsType> goodstype=(List<GoodsType>) super.selectOne(session, "GoodsTypeMapper.",typeid);
		return goodstype;
	}//根据商品类型ID查找
	public int InsertGoodsType(SqlSession session,GoodsType goodstype){
		int result = super.update(session, "GoodsTypeMapper.insertGoodsType", goodstype);
		return result;
	}//增加商品类型
	public int DeleteGoodsType(SqlSession session,int typeid){
		int result=super.delete(session, "GoodsTypeMapper.deleteGoodaType", typeid);
		return result;
	}//删除商品类型
	public int UpdateGoodsType(SqlSession session,int typeid){
		int result=super.update(session, "GoodsTypeMapper.updateGoodsType",typeid);
		return result;
	}//修改商品信息
}
