package com.bowen.mango.admin.service;

import com.bowen.mango.admin.model.SysConfig;
import com.bowen.mango.core.service.CurdService;

import java.util.List;

/**
 * 系统配置管理
 * @author bowen
 * @date Jan 13, 2019
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
