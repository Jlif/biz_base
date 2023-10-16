package tech.jiangchen.biz_base.controller;

import io.jsonwebtoken.Jwts;
import jakarta.annotation.Resource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.jiangchen.biz_base.dto.SignInReq;

import javax.crypto.SecretKey;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jiangchen
 * @since 2023-10-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public String login(@RequestBody SignInReq req) {

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword());
        authenticationManager.authenticate(authenticationToken);

        //上一步没有抛出异常说明认证成功，我们向用户颁发jwt令牌
        SecretKey key = Jwts.SIG.HS256.key().build();
        return Jwts.builder().subject(req.getUsername()).signWith(key).compact();
    }
}
