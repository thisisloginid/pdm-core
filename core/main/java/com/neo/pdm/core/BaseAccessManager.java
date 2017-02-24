package com.neo.pdm.core;

import com.neo.pdm.core.model.DefaultUserInfo;

public class BaseAccessManager {
    protected DefaultUserInfo userinfo;
    
    public BaseAccessManager(DefaultUserInfo userinfo){
        this.userinfo = userinfo;
    }
}
