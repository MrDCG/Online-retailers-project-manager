package com.fsClothes.service;

import com.fsClothes.pojo.Page;
import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductConditionVO;

/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:08:14
 *
 */
public interface ProductService {
	int insert(Product product);

	Page<Product> findAllByPage(Page<Product> page);

	void update(Product product);

	void delete(int id);

	void batchDelete(String checkedId);

	Page<Product> getProduct(Page<Product> page,ProductConditionVO productConditionVO);

	int findAllCount();

	int findAllSum();

	/**
	 * 查询已上架的商品种类数量
	 * @return 上架商品数
	 */
	int findShelf();
	/**
	 * 查询已下架的商品种类数量
	 * @return 下架商品数
	 */
	int findLShelf();

	void insertPaths(int productId,String productImgpaths, String productExplainImgpaths);
}