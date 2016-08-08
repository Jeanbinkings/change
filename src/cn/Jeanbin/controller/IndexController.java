package cn.Jeanbin.controller;

import java.sql.SQLException;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

import cn.Jeanbin.dao.EntityDao;
import cn.Jeanbin.service.EntityService;

public class IndexController extends Controller {

	public void index() throws ClassNotFoundException, SQLException {
		// render("index");
		int pageNumber = 1;
		int pageSize = 10;
		EntityService es = new EntityService();
		Page<EntityDao> list = es.showAll(pageNumber, pageSize,"v_91porn");
		setAttr("tables", es.showtabls());
		setAttr("list", list);
		render("index.html");
	}

	public void search_all() throws ClassNotFoundException, SQLException {
		boolean flag = getPara("pageNumber") == null ? true : false;
		int pageNumber = getPara("pageNumber") == null ? 1 : getParaToInt("pageNumber");
		int pageSize = getPara("pageSize") == null ? 10 : getParaToInt("pageNumber");
		String table = getPara("from") == null?"v_91porn" : getPara("from");
		EntityService es = new EntityService();
		Page<EntityDao> list = es.showAll(pageNumber, pageSize,table);

		if (flag) {
			setAttr("tables", es.showtabls());
			setAttr("list", list);
			render("index.html");
		} else {
			renderJson(list);
		}
	}

	public void search_weicaiji() throws ClassNotFoundException, SQLException {
		boolean flag = getPara("pageNumber") == null ? true : false;
		int pageNumber = getPara("pageNumber") == null ? 1 : getParaToInt("pageNumber");
		int pageSize = getPara("pageSize") == null ? 10 : getParaToInt("pageNumber");
		String table = getPara("from") == null?"v_91porn" : getPara("from");
		EntityService es = new EntityService();
		Page<EntityDao> list = es.showBycaiji(pageNumber, pageSize,table);

		if (flag) {
			setAttr("tables", es.showtabls());
			setAttr("list", list);
			render("index.html");
		} else {
			renderJson(list);
		}
	}

	public void search_weichuli() throws ClassNotFoundException, SQLException {
		boolean flag = getPara("pageNumber") == null ? true : false;
		int pageNumber = getPara("pageNumber") == null ? 1 : getParaToInt("pageNumber");
		int pageSize = getPara("pageSize") == null ? 10 : getParaToInt("pageNumber");
		String table = getPara("from") == null?"v_91porn" : getPara("from");
		EntityService es = new EntityService();
		Page<EntityDao> list = es.showBychuli(pageNumber, pageSize,table);

		if (flag) {
			setAttr("tables", es.showtabls());
			setAttr("list", list);
			render("index.html");
		} else {
			renderJson(list);
		}
	}

	public void search_caijied() throws ClassNotFoundException, SQLException {
		boolean flag = getPara("pageNumber") == null ? true : false;
		int pageNumber = getPara("pageNumber") == null ? 1 : getParaToInt("pageNumber");
		int pageSize = getPara("pageSize") == null ? 10 : getParaToInt("pageNumber");
		String table = getPara("from") == null?"v_91porn" : getPara("from");
		EntityService es = new EntityService();
		Page<EntityDao> list = es.showBycaijied(pageNumber, pageSize,table);

		if (flag) {
			setAttr("tables", es.showtabls());
			setAttr("list", list);
			render("index.html");
		} else {
			renderJson(list);
		}
	}

	public void search_chulied() throws ClassNotFoundException, SQLException {
		boolean flag = getPara("pageNumber") == null ? true : false;
		int pageNumber = getPara("pageNumber") == null ? 1 : getParaToInt("pageNumber");
		int pageSize = getPara("pageSize") == null ? 10 : getParaToInt("pageNumber");
		String table = getPara("from") == null?"v_91porn" : getPara("from");
		EntityService es = new EntityService();
		Page<EntityDao> list = es.showBychulied(pageNumber, pageSize,table);

		if (flag) {
			setAttr("tables", es.showtabls());
			setAttr("list", list);
			render("index.html");
		} else {
			renderJson(list);
		}
	}
}
