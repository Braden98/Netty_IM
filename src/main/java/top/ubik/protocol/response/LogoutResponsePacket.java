package top.ubik.protocol.response;

import lombok.Data;
import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.LOGOUT_RESPONSE;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:49 AM
 */

@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
