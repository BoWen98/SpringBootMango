package com.bowen.mango.admin.service;

import com.bowen.mango.admin.model.SysDept;
import com.bowen.mango.core.service.CurdService;

import java.util.List;

/**
 * 机构管理
 * @author bowen
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
