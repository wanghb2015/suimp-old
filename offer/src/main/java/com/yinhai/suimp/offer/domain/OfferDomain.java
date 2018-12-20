package com.yinhai.suimp.offer.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Description:
 *
 * @author wanghb
 * @version 1.0
 * @Date 2018/12/20 11:36
 */
@Data
public class OfferDomain {
    private String idcard;
    private String name;
    private String sex;
    private String birthday;
    private String category;
    private BigDecimal account;
    private String email;
    private String arg1;
    private String arg2;
    private String arg3;
}
