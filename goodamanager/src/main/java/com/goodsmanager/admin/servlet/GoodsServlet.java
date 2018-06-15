package com.goodsmanager.admin.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.goodsmanager.entity.Goods;
import com.goodsmanager.entity.GoodsType;
import com.goodsmanager.service.GoodsService;
import com.goodsmanager.service.GoodsTypeService;
import com.goodsmanager.service.impl.GoodsServiceImpl;
import com.goodsmanager.service.impl.GoodsTypeServiceImpl;

public class GoodsServlet extends HttpServlet {
	private GoodsService service=new GoodsServiceImpl();
	private GoodsTypeService typeservice=new GoodsTypeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {//根据op的值调用对应的方法
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action=request.getParameter("op");
		if("toadd".equals(action)){
			toadd(request, response);
		}else if("doadd".equals(action)){
			doadd(request, response);
		}else if("dolist".equals(action)){
			dolist(request, response);
		}else if("dodelete".equals(action)){
			dodelete(request, response);
		}else if("doupdate".equals(action)){
			doupdate(request, response);
		}else if("toadd".equals(action)){
			toadd(request,response);
		}else if("todelete".equals(action)){
			todelete(request,response);
		}
		else if("toupdate".equals(action)){
			toupdate(request,response);
		}else if("togetall".equals(action)){
			togetAll(request,response);
		}else if("togetone".equals(action)){
			togetone(request,response);
		}
		
		

	}

	private void togetone(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		//根据商品类型ID查找商品类型
		int id=Integer.parseInt(request.getParameter("typeid"));
		List<GoodsType> goodstype=typeservice.SelectById(id);
		request.getRequestDispatcher("/admin/goodstype_list.jsp").forward(request, response);
	}

	private void toadd(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		//增加商品类型
		String typename=request.getParameter("typename");
		GoodsType goodstype=new GoodsType(); 
		goodstype.setTypename(typename);
		int result=typeservice.addGoodsType(goodstype);
		request.getRequestDispatcher("/admin/goodstype.jsp").forward(request, response);
	}

	private void toupdate(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		//更改商品类型
		int typeid=Integer.parseInt(request.getParameter("typeid"));
		String typename=request.getParameter("typename");
		GoodsType goodstype=new GoodsType();
		goodstype.setTypename(typename);
		int result=typeservice.UpdateGoodsType(typeid);
		request.getRequestDispatcher("/admin/goodstype.jsp").forward(request, response);
	}

	private void todelete(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		//删除商品类型
		int typeid=Integer.parseInt(request.getParameter("typeid"));
		typeservice.DeleteGoodsType(typeid);
		request.getRequestDispatcher("/admin/goodstype.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//转到doget
		doGet(req, resp);
	}

	protected void doupdate (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//更改商品信息
		int id=Integer.parseInt(req.getParameter("id"));
		String goods_name=req.getParameter("goods_name");
		int typeid=Integer.parseInt(req.getParameter("typeid"));
		double goods_price=Double.parseDouble(req.getParameter("goods_price"));
		String goods_desc=req.getParameter("goods_desc");
		Goods goods=new Goods();
		goods.setNote(goods_desc);
		goods.setName(goods_name);
		goods.setPrice(goods_price);
		GoodsType goodstype=new GoodsType();
		goodstype.setTypeid(typeid);
		goods.setType(goodstype.getTypename());
		int result = service.updateGoods(id);
		req.getRequestDispatcher("/admin/goods_list.jsp").forward(req, resp);
	}
	
	protected void doselectByName(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		//根据商品名查找
		String name=request.getParameter("name");
		List<Goods> goods=service.getOne(name);
		request.getRequestDispatcher("/admin/goods_list.jsp").forward(request, response);
	}
	
    protected void dodelete(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException  {
    	//删除指定商品
		int id=Integer.parseInt(request.getParameter("id"));
		typeservice.DeleteGoodsType(id);
		response.sendRedirect(request.getContextPath()+"/admin/goods.do");
	}

	
	protected void togetAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//查找所有的商品类型
		List<GoodsType> types= typeservice.getAll();
		req.setAttribute("types", types);
		req.getRequestDispatcher("/admin/goodstype_list.jsp").forward(req, resp);
	}
	protected void dolist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//查找所有的商品
		List<Goods> goods= service.getAll();
		req.setAttribute("goods", goods);
		req.getRequestDispatcher("/admin/goods_list.jsp").forward(req, resp);
	}
	protected void doadd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//增加商品
		String goods_name=request.getParameter("goods_name");
		int typeid=Integer.parseInt(request.getParameter("typeid"));
		double goods_price=Double.parseDouble(request.getParameter("goods_price"));
		String goods_desc=request.getParameter("goods_desc");
		Goods goods=new Goods();
		goods.setNote(goods_desc);
		goods.setName(goods_name);
		goods.setPrice(goods_price);
		GoodsType goodstype=new GoodsType();
		goodstype.setTypeid(typeid);
		goods.setType(goodstype.getTypename());
		int result= service.addGoods(goods);
		if(result>0){
			response.sendRedirect(request.getContextPath()+"/admin/goods_list.jsp");
		}else{
			response.getWriter().println("添加失败");
		}
	}

}
