package com.powernode.service.impl;

import com.powernode.vo.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(!StringUtils.hasText(username)){ //用户名为空
            throw new UsernameNotFoundException("用户名不存在！");
        }
        if(!username.equals("thomas")){
            throw new UsernameNotFoundException("用户名不正确！");
        }
        //执行到这里，说明用户名username =thomas
        SecurityUser securityUser=new SecurityUser();
        //测试测试
        System.out.println("你好3");
        System.out.println("hello hot-fix");
        System.out.println("test master");
        System.out.println("test hot-fix");
        System.out.println("test hot-fix1");
        System.out.println("test hot-fix1");
        System.out.println("你好叶一航");
        return securityUser;
    }
}
