package com.itheima.service;

import com.itheima.domain.Items;

/**
 * 处理items表中的业务逻辑
 */
public interface ItemsService {

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    public Items findByID(int id);


}
