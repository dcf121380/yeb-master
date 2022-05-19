package com.quick.server.service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.quick.server.mapper.PositionMapper;
import com.quick.server.pojo.Position;
import com.quick.server.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
