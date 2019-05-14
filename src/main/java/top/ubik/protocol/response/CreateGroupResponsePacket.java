package top.ubik.protocol.response;

import lombok.Data;
import top.ubik.protocol.Packet;

import java.util.List;

import static top.ubik.protocol.command.Command.CREATE_GROUP_RESPONSE;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:41 AM
 */

@Data
public class CreateGroupResponsePacket extends Packet {
    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_RESPONSE;
    }
}