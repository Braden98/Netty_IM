package top.ubik.protocol.request;

import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
