package top.ubik.util;

import java.util.UUID;
/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:56 AM
 */
public class IDUtil {
    /**
     * @Description: 生成全局唯一ID
     * @Param: []
     * @Return: java.lang.String
     * @Date: 2019/5/14 2:20 PM
     * @Author: Ubique
     */
    public static String randomId() {
        return UUID.randomUUID().toString().split("-")[0];
    }
}
