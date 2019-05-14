package top.ubik.util;

import java.util.UUID;
/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:56 AM
 */
public class IDUtil {
    public static String randomId() {
        return UUID.randomUUID().toString().split("-")[0];
    }
}
