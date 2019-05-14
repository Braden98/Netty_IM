package top.ubik.protocol.request;

import lombok.Data;
import top.ubik.protocol.Packet;

import java.util.List;

import static top.ubik.protocol.command.Command.CREATE_GROUP_REQUEST;

@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
