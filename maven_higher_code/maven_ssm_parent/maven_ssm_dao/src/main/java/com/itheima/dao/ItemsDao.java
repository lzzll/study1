package com.itheima.dao;


import com.itheima.domain.Items;

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
}
