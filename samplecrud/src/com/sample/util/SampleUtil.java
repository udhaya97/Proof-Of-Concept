package com.sample.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SampleUtil {
	private static SqlSessionFactory sessionFactory;
	
	static {
		
		Reader reader;
		try
		{
		 reader=Resources.getResourceAsReader("com/sample/mybatisconfig/mybatis-config.xml");	
		sessionFactory =  new SqlSessionFactoryBuilder().build(reader);
		}catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
	public static SqlSessionFactory getSqlSessionFactory()
	{
		return sessionFactory;
	}
	
	



}
