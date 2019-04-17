package com.itheima.service;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 分模块开发之service层:(jar工程)
 *      一、创建一个基于父模块的子模块service,pom中引入dao层模块jar包的坐标(可以从父模块的pom配置文件中找到坐标);
 *      二、在service层编写基于业务处理逻辑的接口和实现类,实现类中声明dao的实现类并注入依赖;
 *      三、在配置文件中,指定service层会用到的核心配置,包括(组件扫描(基于service包下),事务管理器,事务类,事务织入service的接口方法中);
 * 注意:
 *      一、service层是基于dao层的依赖进行开发,所以service层的pom中需要引入dao层的坐标依赖,注意dao的spring依赖的目录结构一定要和service层中spring依赖的目录结构保持一致
 *      二、service层也是jar工程,是作为web的依赖来使用;
 *      三、service层对于junit包也是属于传递依赖,如果需要在service中进行相关测试,需要额外导入junit包;
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-service.xml"})
public class ItemsServiceTest {

    @Autowired
    private ItemsService itemsService;

    @Test
    public void testService(){
        Items items = itemsService.findByID(1);
        System.out.println(items);
    }

    @Autowired
    private ItemsDao itemsDao;

    @Test
    public void testDao() {
        Items items = itemsDao.findByID(1);
        System.out.println(items);
    }

}
