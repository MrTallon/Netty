package com.netty.second;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

/**
 * This is Description
 *
 * @author YangBo
 * @date 2019/08/08
 */
public class MyServerInitializer extends ChannelInitializer<SocketChannel> {

    /**
     * 客户端一旦跟服务器端连接则该方法就会被调用
     * @param ch
     * @throws Exception
     */
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        // LengthFieldBasedFrameDecoder:解码器
        pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4));

        // LengthFieldPrepender：编码器
        pipeline.addLast(new LengthFieldPrepender(4));

        // 字符串编解码
        pipeline.addLast(new StringDecoder(CharsetUtil.UTF_8));
        pipeline.addLast(new StringEncoder(CharsetUtil.UTF_8));

        // 自定义处理器
        pipeline.addLast(new MyServerHandler());
    }
}
