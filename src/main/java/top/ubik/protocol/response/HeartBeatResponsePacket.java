package top.ubik.protocol.response;

import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.HEARTBEAT_RESPONSE;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/14 11:43 AM
 */

public class HeartBeatResponsePacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_RESPONSE;
    }
}

