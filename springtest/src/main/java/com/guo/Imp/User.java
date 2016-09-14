package com.guo.Imp;

import com.guo.dao.IUser;
import org.springframework.stereotype.Service;

/**
 * Created by MengWen Guo on 2016/09/14.
 * Created Date 2016/09/14.
 */
@Service
public class User implements IUser {

    public String getName() {
        return "hello world";
    }
}
