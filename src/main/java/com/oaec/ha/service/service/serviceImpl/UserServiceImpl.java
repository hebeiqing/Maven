package com.oaec.ha.service.service.serviceImpl;

import com.oaec.ha.dao.Impl.userdaoImpl;
import com.oaec.ha.dao.Userdao;
import com.oaec.ha.entity.USER;
import com.oaec.ha.service.service.UserService;

public class UserServiceImpl  implements UserService {

    private Userdao userdao;

    public UserServiceImpl() {
        userdao= new userdaoImpl();
    }

    @Override
    public int create(USER user) {
        return  userdao.create(user);
    }

    @Override
    public USER finBYusername(String username) {
        return  userdao.finBYusername(username);
    }
}
