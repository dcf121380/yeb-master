package com.quick.server.service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.quick.server.mapper.NationMapper;
import com.quick.server.pojo.Nation;
import com.quick.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
