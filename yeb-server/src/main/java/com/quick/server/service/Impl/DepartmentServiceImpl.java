package com.quick.server.service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.quick.server.mapper.DepartmentMapper;
import com.quick.server.pojo.Department;
import com.quick.server.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
