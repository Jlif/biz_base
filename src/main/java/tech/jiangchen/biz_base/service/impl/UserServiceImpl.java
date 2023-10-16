package tech.jiangchen.biz_base.service.impl;

import tech.jiangchen.biz_base.entity.User;
import tech.jiangchen.biz_base.dao.UserMapper;
import tech.jiangchen.biz_base.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiangchen
 * @since 2023-10-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
