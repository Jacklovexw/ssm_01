package com.zhidi.base.service;

import org.springframework.stereotype.Service;

import com.zhidi.base.dao.IBaseDao;
import com.zhidi.entity.User;
@Service
public class BaseServiceImpl<T> implements IBaseServcie<T> {

	private IBaseDao<T> baseDao;
	public void setBaseDao(IBaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}
	@Override
	public int deleteByPrimaryKey(Long id) {
		
		return baseDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T record) {
		
		return baseDao.insert(record);
	}

	@Override
	public int insertSelective(T record) {
		
		return baseDao.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		
		return baseDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		
		return baseDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		
		return baseDao.updateByPrimaryKey(record);
	}

}
