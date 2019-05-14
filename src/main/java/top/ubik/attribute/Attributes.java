package top.ubik.attribute;

import io.netty.util.AttributeKey;
import top.ubik.session.Session;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
