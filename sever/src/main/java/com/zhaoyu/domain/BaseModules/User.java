package com.zhaoyu.domain.BaseModules;

import lombok.Data;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    @Comment("用户id")
    private String id;

    @Comment("用户昵称")
    private String name;

    @Comment("用户性别")
    private String gender;

    @Column(unique = true)
    @Comment("手机号")
    private String mobile;

    @Comment("密码")
    private String password;

    @Comment("民族")
    private String ethnic;

    @Comment("地址")
    private String address;

}
