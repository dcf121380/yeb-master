package com.quick.server.service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.quick.server.mapper.AdminMapper;
import com.quick.server.pojo.Admin;
import com.quick.server.service.IAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dcf
 * @since 2022-05-19
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
