package com.zking.ssm.util;

<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Map;

public class PageBean implements Serializable {

	private static final long serialVersionUID = 2422581023658455731L;

	//页码
	private int page=1;
	//每页显示记录数
	private int rows=3;
	//总记录数
	private int total=0;
	//是否分页
	private boolean isPagination=true;
	//上一次的请求路径
	private String url;
	//获取所有的请求参数
	private Map<String,String[]> map;
	
	public PageBean() {
		super();
	}
	
	//设置请求参数
	public void setRequest(HttpServletRequest req) {
		String page=req.getParameter("page");
		String rows=req.getParameter("rows");
		String pagination=req.getParameter("pagination");
		this.setPage(page);
		this.setRows(rows);
		this.setPagination(pagination);
		this.url=req.getContextPath()+req.getServletPath();
		this.map=req.getParameterMap();
	}
=======
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


public class PageBean {

	/**
	 * 页码
	 */
	private int page = 1;

	/**
	 * 每页显示的记录数
	 */
	private int rows = 10;

	/**
	 * 总记录数
	 */
	private int total = 0;


	/**
	 * 是否分页
	 */
	private boolean pagination = true;

	/**
	 * 分页查询url
	 */
	private String url;


	/**
	 * 存放请求参数，用于生成隐藏域中的元素
	 */
	private Map<String,String[]> parameterMap;

	public Map<String, String[]> getParameterMap() {
		return parameterMap;
	}

	public void setParameterMap(Map<String, String[]> parameterMap) {
		this.parameterMap = parameterMap;
	}

>>>>>>> 19c64af0b4e133bd18664c75c7ff548b7763e373
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

<<<<<<< HEAD
	public Map<String, String[]> getMap() {
		return map;
	}

	public void setMap(Map<String, String[]> map) {
		this.map = map;
=======
	/**
	 * 设置分页公共参数
	 * @return
	 */
	public void setRequest(HttpServletRequest request) {
		if(!StringUtils.isEmpty(request.getParameter("page"))) {
			this.setPage(Integer.valueOf(request.getParameter("page")));
		}
		if(!StringUtils.isEmpty(request.getParameter("rows"))) {
			this.setRows(Integer.valueOf(request.getParameter("rows")));
		}
		if(!StringUtils.isEmpty(request.getParameter("pagination"))) {
			this.setPagination(Boolean.valueOf(request.getParameter("pagination")));
		}
		this.url = request.getRequestURI();
		Map<String,String[]> mm = request.getParameterMap();
		this.parameterMap = request.getParameterMap();
>>>>>>> 19c64af0b4e133bd18664c75c7ff548b7763e373
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
<<<<<<< HEAD
	
	public void setPage(String page) {
		if(null!=page&&!"".equals(page.trim()))
			this.page = Integer.parseInt(page);
	}
=======
>>>>>>> 19c64af0b4e133bd18664c75c7ff548b7763e373

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
<<<<<<< HEAD
	
	public void setRows(String rows) {
		if(null!=rows&&!"".equals(rows.trim()))
			this.rows = Integer.parseInt(rows);
	}
=======
>>>>>>> 19c64af0b4e133bd18664c75c7ff548b7763e373

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
<<<<<<< HEAD
	
	public void setTotal(String total) {
		this.total = Integer.parseInt(total);
	}

	public boolean isPagination() {
		return isPagination;
	}
	
	public void setPagination(boolean isPagination) {
		this.isPagination = isPagination;
	}
	
	public void setPagination(String isPagination) {
		if(null!=isPagination&&!"".equals(isPagination.trim()))
			this.isPagination = Boolean.parseBoolean(isPagination);
	}
	
	/**
	 * 获取分页起始标记位置
	 * @return
	 */
	public int getStartIndex() {
		//(当前页码-1)*显示记录数
		return (this.getPage()-1)*this.rows;
	}
	
	/**
	 * 末页
	 * @return
	 */
	public int getMaxPage() {
		int totalpage=this.total/this.rows;
		if(this.total%this.rows!=0)
			totalpage++;
		return totalpage;
	}
	
	/**
	 * 下一页
	 * @return
	 */
	public int getNextPage() {
		int nextPage=this.page+1;
		if(this.page>=this.getMaxPage())
			nextPage=this.getMaxPage();
		return nextPage;
	}
	
	/**
	 * 上一页
	 * @return
	 */
	public int getPreivousPage() {
		int previousPage=this.page-1;
		if(previousPage<1)
			previousPage=1;
		return previousPage;
=======

	//计算页数据下标
	public int getStartIndex() {
		return (this.page - 1) * this.rows;
	}

	public boolean isPagination() {
		return pagination;
	}

	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}

	//获取总页数
	public int getTotalPageNum() {
		if(this.getTotal() % this.rows == 0) {
			return this.getTotal() / this.rows;
		} else {
			return this.getTotal() / this.rows + 1;
		}
	}

	//获取上一页
	public int getPreviousPageNum() {
		return this.page - 1  > 0 ? this.page - 1 : this.page;
	}

	//获取下一页
	public int getNextPageNum() {
		return this.page + 1 < this.getTotalPageNum() ? this.page +	1 : this.getTotalPageNum();
>>>>>>> 19c64af0b4e133bd18664c75c7ff548b7763e373
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", isPagination=" + isPagination
				+ "]";
	}
=======
		return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
	}

>>>>>>> 19c64af0b4e133bd18664c75c7ff548b7763e373
}
