package top.yangluotong.threadlocal;

import org.apache.shiro.session.Session;

import java.util.Map;

public class MyLocal {

    Map<String, Session> sessionThreadLocal = null;

    public Session getSession(String userid) {
        return sessionThreadLocal.get(userid);
    }

    public void setSession(Session session, String userId) {
        sessionThreadLocal.put(userId, session);
    }

    public void removeSession(String userId) {
        sessionThreadLocal.remove(userId);
    }
}
