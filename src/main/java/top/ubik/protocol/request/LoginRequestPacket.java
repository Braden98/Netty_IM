package top.ubik.protocol.request;

import lombok.Data;
import top.ubik.protocol.Packet;

import static top.ubik.protocol.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {
    private String userName;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
