package top.ubik.protocol.response;

import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.LOGIN_RESPONSE;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:48 AM
 */

public class LoginResponsePacket extends Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGIN_RESPONSE;
    }
}

