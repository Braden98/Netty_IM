package top.ubik.server.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import top.ubik.util.SessionUtil;

@ChannelHandler.Sharable
public class AuthHandler extends ChannelInboundHandlerAdapter {
    public static final AuthHandler INSTANCE = new AuthHandler();

    private AuthHandler() {

    }

    /**
     * @Description: 实现权限认证，通过 覆盖 channelRead() 方法处理所有数据，若登陆不成功（或者说无权限），则去除
     * 该handler；若成功，则通过super()传递给下一个handler
     * @Param: ctx: 上下文 msg：传入对象，这里是在protocol定义的 packet
     * @Return: void
     * @Date: 2019/5/14 2:25 PM
     * @Author: Ubique
     */
    @Override

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (!SessionUtil.hasLogin(ctx.channel())) {
            ctx.channel().close();
        } else {
            //实现热插拔：若已登录，则该通道之后不必再验证
            ctx.pipeline().remove(this);
            super.channelRead(ctx, msg);
        }
    }
}
