package com.bowen.mango.admin.dao;


import com.bowen.mango.admin.model.SysRoleDept;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    SysRoleDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleDept record);

    int updateByPrimaryKey(SysRoleDept record);
}