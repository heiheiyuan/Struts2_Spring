package com.snaillemon.ss.service.impl;

import com.snaillemon.ss.dao.CrmDao;
import com.snaillemon.ss.service.CrmService;

/**
 * Created by GoodBoy on 11/8/2016.
 */
public class CrmServiceImpl implements CrmService{
    public CrmDao crmDao;
    @Override
    public void add() {
        System.out.println("service实现类gogogo");
        crmDao.add();
    }

    public CrmDao getCrmDao() {
        return crmDao;
    }

    public void setCrmDao(CrmDao crmDao) {
        this.crmDao = crmDao;
    }
}
