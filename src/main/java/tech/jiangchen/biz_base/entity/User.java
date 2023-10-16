package tech.jiangchen.biz_base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author jiangchen
 * @since 2023-10-16
 */
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private String nickName;

    private String salt;

    private String password;

    private Integer gender;

    private Integer age;

    private LocalDate birthDate;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
