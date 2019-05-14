package top.ubik.protocol.request;

import lombok.Data;
import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}
