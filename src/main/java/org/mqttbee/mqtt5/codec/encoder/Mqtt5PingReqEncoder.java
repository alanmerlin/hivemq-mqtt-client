package org.mqttbee.mqtt5.codec.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.mqttbee.annotations.NotNull;
import org.mqttbee.mqtt5.message.Mqtt5MessageType;
import org.mqttbee.mqtt5.message.ping.Mqtt5PingReqImpl;

import javax.inject.Singleton;

/**
 * @author Silvio Giebl
 */
@Singleton
public class Mqtt5PingReqEncoder implements Mqtt5MessageEncoder<Mqtt5PingReqImpl> {

    public static final Mqtt5PingReqEncoder INSTANCE = new Mqtt5PingReqEncoder();
    public static final int ENCODED_LENGTH = 2;
    public static final ByteBuf PACKET =
            Unpooled.directBuffer(ENCODED_LENGTH).writeByte(Mqtt5MessageType.PINGREQ.getCode() << 4).writeByte(0);

    @Override
    public void encode(
            @NotNull final Mqtt5PingReqImpl pingReq, @NotNull final Channel channel, @NotNull final ByteBuf out) {
        throw new UnsupportedOperationException();
    }

}
