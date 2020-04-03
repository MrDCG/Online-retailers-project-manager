package com.fsClothes.pojo;
/** 
* @author MrDCG 
* @version 创建时间：2020年3月7日 下午4:43:27 
* 分页实现
*/

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page<T> implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 3322298153884734243L;

	// 每页显示条数
	private Integer pageSize;
	// 总条数
	private Integer totalRecord;
	// 当前请求页
	private Integer pageNum;
	// 存放当前页请求数据集合
	List<T> list;
	// 总页数：计算
	private Integer totalPage;
	// 起始下标
	private Integer startIndex;

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
		if (totalRecord % pageSize == 0) {
			totalPage = totalRecord / pageSize;
		} else {
			totalPage = totalRecord / pageSize + 1;
		}
	}

	public Integer getStartIndex() {
		startIndex = (pageNum - 1) * pageSize;
		return startIndex;
	}
}
