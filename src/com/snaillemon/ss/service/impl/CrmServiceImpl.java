package com.snaillemon.ss.service.impl;

import com.snaillemon.ss.dao.CrmDao;
import com.snaillemon.ss.service.CrmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GoodBoy on 11/8/2016.
 */
@Service("crmServiceImpl")
public class CrmServiceImpl implements CrmService{

    @Resource(name="crmDaoImpl")
    public CrmDao crmDao;

    @Override
    public void add() {
        System.out.println("service实现类gogogo");
        crmDao.add();
    }

    /*public CrmDao getCrmDao() {
        return crmDao;
    }

    public void setCrmDao(CrmDao crmDao) {
        this.crmDao = crmDao;
    }*/
}
