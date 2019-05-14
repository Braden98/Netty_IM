package top.ubik.protocol.request;

import lombok.Data;
import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.LOGOUT_REQUEST;

@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
