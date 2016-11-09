package com.snaillemon.ss.action;

import com.snaillemon.ss.service.impl.CrmServiceImpl;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by GoodBoy on 11/8/2016.
 */
@Controller("crmAction")
public class CrmAction {

    @Resource(name="crmServiceImpl")
    public CrmServiceImpl crmService;

    public String execute() throws Exception {
        System.out.println("web层gogogo");
        crmService.add();
        return "success";
    }

/*
    public CrmService getCrmService() {
        return crmService;
    }

    public void setCrmService(CrmServiceImpl crmService) {
        this.crmService = crmService;
    }*/

}
