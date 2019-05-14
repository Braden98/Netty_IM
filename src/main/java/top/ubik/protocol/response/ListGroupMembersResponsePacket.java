package top.ubik.protocol.response;

import lombok.Data;
import top.ubik.protocol.Packet;
import top.ubik.session.Session;

import java.util.List;

import static top.ubik.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:48 AM
 */
@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}

