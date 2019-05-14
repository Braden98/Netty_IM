package top.ubik.protocol.response;

import lombok.Data;
import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.JOIN_GROUP_RESPONSE;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:47 AM
 */

@Data
public class JoinGroupResponsePacket extends Packet {
    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_RESPONSE;
    }
}
