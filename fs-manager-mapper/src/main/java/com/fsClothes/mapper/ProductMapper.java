package com.fsClothes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductConditionVO;

/**
 * @author MrDCG
 * @version 创建时间：2019年10月8日 下午4:56:59
 *
 */
public interface ProductMapper {

	List<Product> findAll(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

	void insert(Product product);

	// 总商品条数
	int findAllCount();

	void update(Product product);

	void delete(int id);

	void batchDelete(String[] split);

	int findAllSum();

	int findShelf();

	int findLShelf();

	// 查找符合条件的商品总条数
	int findConditionCount(ProductConditionVO productConditionVO);

	List<Product> findCondition(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize,
			@Param("productConditionVO") ProductConditionVO productConditionVO);
}
