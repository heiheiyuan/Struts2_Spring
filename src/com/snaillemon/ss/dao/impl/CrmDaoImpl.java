package com.snaillemon.ss.dao.impl;

import com.snaillemon.ss.dao.CrmDao;
import org.springframework.stereotype.Repository;

/**
 * Created by GoodBoy on 11/8/2016.
 */
@Repository("crmDaoImpl")
public class CrmDaoImpl implements CrmDao {

    @Override
    public void add() {
        System.out.println("dao层实现类gogogo");
    }
}
