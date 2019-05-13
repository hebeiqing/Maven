package com.oaec.ha.dao;

import com.oaec.ha.entity.USER;

public interface Userdao {

     int   create(USER user);
    USER finBYusername(String username);
}
