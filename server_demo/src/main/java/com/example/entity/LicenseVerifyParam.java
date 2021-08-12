package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: zyf
 * @create: 2021-08-11 18:22
 **/
@Data
public class LicenseVerifyParam implements Serializable {
    /**
     * 证书subject
     */
    private String subject;

    /**
     * 公钥别称
     */
    private String publicAlias;

    /**
     * 访问公钥库的密码
     */
    private String storePass;

    /**
     * 证书生成路径
     */
    private String licensePath;

    /**
     * 密钥库存储路径
     */
    private String publicKeysStorePath;
}
