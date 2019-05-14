package top.ubik.server.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import top.ubik.protocol.request.HeartBeatRequestPacket;
import top.ubik.protocol.response.HeartBeatResponsePacket;

@ChannelHandler.Sharable
public class HeartBeatRequestHandler extends SimpleChannelInboundHandler<HeartBeatRequestPacket> {
    public static final HeartBeatRequestHandler INSTANCE = new HeartBeatRequestHandler();

    private HeartBeatRequestHandler() {

    }

    @Override
    /**
     * @Description: HeartBeatRequestPacket的唯一作用是保持连接，确保没有假死误判（确实没有发送数据）。
     * @Param: [ctx, requestPacket]
     * @Return: void
     * @Date: 2019/5/14 3:14 PM
     * @Author: Ubique
     */
    protected void channelRead0(ChannelHandlerContext ctx, HeartBeatRequestPacket requestPacket) {
        ctx.writeAndFlush(new HeartBeatResponsePacket());
    }
}
