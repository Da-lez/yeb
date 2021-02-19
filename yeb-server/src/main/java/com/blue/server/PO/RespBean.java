package com.blue.server.PO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private long code;
    private String msg;
    private Object obj;

    /**
     * 成功返回
     *
     * @param msg
     * @return
     */
    public static RespBean success(String msg) {
        return new RespBean(200, msg, null);
    }

    /**
     * 成功返回
     *
     * @param msg
     * @return
     */
    public static RespBean success(String msg, Object obj) {
        return new RespBean(200, msg, obj);
    }

    /**
     * 失败返回
     *
     * @param msg
     * @return
     */
    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    /**
     * 失败返回
     *
     * @param msg
     * @return
     */
    public static RespBean error(String msg, Object obj) {
        return new RespBean(500, msg, obj);
    }
}
