package com.fsClothes.mapper.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.fsClothes.mapper.AdvertisementMapper;
import com.fsClothes.mapper.ProductMapper;
import com.fsClothes.pojo.Advertisement;
import com.fsClothes.pojo.Product;

/**
 * @author MrDCG
 * @version 创建时间：2020年3月30日 下午12:56:01
 *
 */
public class AdvertisementMapperImpl extends SqlSessionDaoSupport implements AdvertisementMapper {
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public List<Advertisement> findAllAd() {
		return getSqlSession().getMapper(AdvertisementMapper.class).findAllAd();
	}

	@Override
	public void delete(int id) {
		getSqlSession().getMapper(AdvertisementMapper.class).delete(id);
	}

	@Override
	public void batchDelete(String[] checkId) {
		getSqlSession().getMapper(AdvertisementMapper.class).batchDelete(checkId);
	}

	@Override
	public List<Product> findIsShelf() {
		return getSqlSession().getMapper(AdvertisementMapper.class).findIsShelf();
	}

	@Override
	public void adAdd(Advertisement advertisement) {
		getSqlSession().getMapper(AdvertisementMapper.class).adAdd(advertisement);	
	}

	@Override
	public void update(Advertisement advertisement) {
		getSqlSession().getMapper(AdvertisementMapper.class).update(advertisement);		
	}

}
