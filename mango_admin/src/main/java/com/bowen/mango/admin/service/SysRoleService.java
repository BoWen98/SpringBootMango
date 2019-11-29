package com.bowen.mango.admin.service;

import com.bowen.mango.admin.model.SysMenu;
import com.bowen.mango.admin.model.SysRole;
import com.bowen.mango.admin.model.SysRoleMenu;
import com.bowen.mango.core.service.CurdService;

import java.util.List;

/**
 * 角色管理
 * @author bowen
 * @date Jan 13, 2019
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
