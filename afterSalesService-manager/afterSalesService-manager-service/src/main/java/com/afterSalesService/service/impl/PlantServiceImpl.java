package com.afterSalesService.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.plugins.Page;
import com.afterSalesService.service.IPlantService;
import com.afterSalesService.pojo.Plant;
import com.afterSalesService.common.base.service.BaseService;

/**
 * <p>
 * 工作计划  接口实现类
 * </p>
 *
 * @author wjx
 * @param <Plant>
 * @since 2018-10-20
 */
@Component
@Service(interfaceName = "com.afterSalesService.service.IPlantService")
public class PlantServiceImpl extends BaseService<Plant> implements IPlantService{

	// 查询单条
	public Object queryById(Long id) {
		return super.queryById(id);
	}

	// 分页查询
	public Page queryPage(Map<String, Object> param) {
		return super.queryPage(param);
	}
	
	// 查询全部列表
	public List queryList(Map<String, Object> param) {
		return super.queryList(param);
	}

	// 删除
	public void delete(Long id) {
		super.delete(id);
	}
	
	// 增加与修改
	public Object update(Map<String, Object> param) {
		return super.update(param);
	}
}