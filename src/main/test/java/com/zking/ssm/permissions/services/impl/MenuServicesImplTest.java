package com.zking.ssm.permissions.services.impl;

import com.zking.ssm.permissions.model.Menu;
import com.zking.ssm.permissions.services.IMenuServices;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.BasJunit;

import java.util.List;

public class MenuServicesImplTest extends BasJunit{

    @Autowired
    private IMenuServices iMenuServices;

    @Test
    public void testQueryIndexMenu() {
        List<Menu> menus = iMenuServices.queryIndexMenu();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
}