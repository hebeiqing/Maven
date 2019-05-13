package com.oaec.ha.service.service;

import com.oaec.ha.entity.USER;

public interface UserService {

    int   create(USER user);
    USER finBYusername(String username);

}
