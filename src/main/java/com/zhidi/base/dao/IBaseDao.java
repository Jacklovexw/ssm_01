package com.zhidi.base.dao;

import com.zhidi.entity.User;

public interface IBaseDao<T> {
	int deleteByPrimaryKey(Long id);

	int insert(T record);

	int insertSelective(T record);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}
