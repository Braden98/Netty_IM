package top.ubik.protocol.response;

import lombok.Data;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:51 AM
 */

@Data
public class QuitGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_RESPONSE;
    }
}

