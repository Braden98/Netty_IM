package top.ubik.protocol.response;

import lombok.Data;
import top.ubik.protocol.Packet;
import top.ubik.session.Session;

import static top.ubik.protocol.command.Command.GROUP_MESSAGE_RESPONSE;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:41 AM
 */

@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
