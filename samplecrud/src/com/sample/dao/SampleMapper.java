package com.sample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sample.model.Sample;
import com.sample.util.SampleUtil;

@Repository
public class SampleMapper {
	
	public List<Sample> getAllSamples()
	{
		SqlSession sqlSession = SampleUtil.getSqlSessionFactory().openSession();
		List<Sample> sampleList = sqlSession.selectList("getEmployeeDetail");
		sqlSession.commit();
		sqlSession.close();
		return sampleList;
	}
	
	public int saveSample(Sample sample)
	{
		SqlSession session = SampleUtil.getSqlSessionFactory().openSession();
		
		session.insert("insetValues", sample);
		
		session.commit();
		session.close();
		
		return 0;
	}
	public int deleteSample(int rNo)
	{
		SqlSession session = SampleUtil.getSqlSessionFactory().openSession();
		
		session.delete("deleteSample",rNo);	
		session.commit();
		session.close();
		
		return 0;
	}
	
	public Sample getSample(int rNo)
	{
		SqlSession session = SampleUtil.getSqlSessionFactory().openSession();
		
		Sample sample =(Sample) session.selectOne("getSample",rNo);	
		session.commit();
		session.close();
		
		return sample;
	}
	public int updateSample(Sample sample)
	{
		SqlSession session = SampleUtil.getSqlSessionFactory().openSession();
		
	 session.update("updateSample", sample);
		session.commit();
		session.close();
		
		return 0;
	}

}
