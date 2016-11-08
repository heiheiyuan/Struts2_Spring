package com.snaillemon.ss.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.snaillemon.ss.service.CrmService;
import com.snaillemon.ss.service.impl.CrmServiceImpl;

/**
 * Created by GoodBoy on 11/8/2016.
 */
public class CrmAction implements Action {

    public CrmServiceImpl crmService;

    public CrmService getCrmService() {
        return crmService;
    }

    public void setCrmService(CrmServiceImpl crmService) {
        this.crmService = crmService;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("web层gogogo");
        crmService.add();
        return "success";
    }
}
