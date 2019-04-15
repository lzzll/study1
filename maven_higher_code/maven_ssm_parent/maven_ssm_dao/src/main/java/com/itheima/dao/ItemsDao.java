package com.itheima.dao;


import com.itheima.domain.Items;

import java.util.List;

/**
 * 指定一个操作items表的接口
 */

public interface ItemsDao {

    /**
     * 根据id查找指定的items对象
     * @param id
     * @return
     */
    public Items findByID(int id);

    /**
     * 查找所有的items对象
     * @return
     */
    public List<Items> findAll();

    /**
     * 保存items对象
     * @param items
     */
    public void saveItems(Items items);
}
