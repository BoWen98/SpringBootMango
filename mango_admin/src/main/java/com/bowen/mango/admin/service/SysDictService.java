package com.bowen.mango.admin.service;

import java.util.List;

import com.bowen.mango.admin.model.SysDict;
import com.bowen.mango.core.service.CurdService;

/**
 * 字典管理
 * @author bowen
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
