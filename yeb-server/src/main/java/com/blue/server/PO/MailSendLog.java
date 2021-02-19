package com.blue.server.PO;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author blue
 * @since 2021-02-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("mail_send_log")
@ApiModel(value="MailSendLog对象", description="")
public class MailSendLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String msgId;

    private Integer empId;

    @ApiModelProperty(value = "0发送中，1发送成功，2发送失败")
    private Integer status;

    private String routeKey;

    private String exchange;

    @ApiModelProperty(value = "重试次数")
    private Integer count;

    @ApiModelProperty(value = "第一次重试时间")
    private LocalDate tryTime;

    private LocalDate createTime;

    private LocalDate updateTime;


}
