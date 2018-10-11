package com.mta.dao;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class BaseDao<T> {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public Integer save(String key, Object entity) throws SQLException {
		return sqlSessionTemplate.insert(key, entity);
	}

	public Integer deleteByKeyword(String key, Object keyword) throws SQLException {
		return sqlSessionTemplate.delete(key, keyword);
	}

	public Integer update(String key, Object entity) throws SQLException {
		return sqlSessionTemplate.update(key, entity);
	}

	@SuppressWarnings("unchecked")
	public T getByKeyword(String key, Object keyword) throws SQLException {
		return (T) sqlSessionTemplate.selectOne(key, keyword);
	}

	public List<T> getByList(String key) throws SQLException {
		return sqlSessionTemplate.selectList(key);
	}

	public List<T> getByList(String key, Object entity) throws SQLException {
		return sqlSessionTemplate.selectList(key, entity);
	}

	public Object getByCallable(String key, Object entity) throws SQLException {
		return sqlSessionTemplate.selectOne(key, entity);
	}

}
