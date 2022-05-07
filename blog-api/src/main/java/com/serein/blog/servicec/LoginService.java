package com.serein.blog.servicec;

import com.serein.blog.dao.pojo.SysUser;
import com.serein.blog.vo.Result;
import com.serein.blog.vo.params.LoginParam;



public interface LoginService {
    /**
     * 登录功能
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    /**
     * 退出登录
     * @param token
     * @return
     */
    Result logout(String token);

    /**
     * 注册
     * @param loginParam
     * @return
     */
    Result register(LoginParam loginParam);
}
