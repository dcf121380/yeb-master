package com.quick.server.service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.quick.server.mapper.MailLogMapper;
import com.quick.server.pojo.MailLog;
import com.quick.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
