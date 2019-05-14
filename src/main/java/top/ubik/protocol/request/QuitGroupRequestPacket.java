package top.ubik.protocol.request;

import lombok.Data;
import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
