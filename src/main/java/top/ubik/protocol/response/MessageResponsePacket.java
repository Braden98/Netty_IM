package top.ubik.protocol.response;

import lombok.Data;
import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:49 AM
 */

@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}