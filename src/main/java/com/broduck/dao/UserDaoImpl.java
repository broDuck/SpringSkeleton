package com.broduck.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.broduck.model.UserVo;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.broduck.mapper.UserMapper";

	@Override
	public void insertUser(UserVo vo) {
		// TODO Auto-generated method stub
	
		sqlSession.insert(namespace + ".insertUser", vo);
	}
}
