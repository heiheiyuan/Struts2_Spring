package com.snaillemon.ss.action;

import com.opensymphony.xwork2.ActionSupport;
import com.snaillemon.ss.service.CrmService;

/**
 * Created by GoodBoy on 11/8/2016.
 */
public class CrmAction extends ActionSupport {

    public CrmService crmService;

    public String exectue() {
        System.out.println("web层gogogo");
        crmService.add();
        return null;
    }

    public CrmService getCrmService() {
        return crmService;
    }

    public void setCrmService(CrmService crmService) {
        this.crmService = crmService;
    }
}
