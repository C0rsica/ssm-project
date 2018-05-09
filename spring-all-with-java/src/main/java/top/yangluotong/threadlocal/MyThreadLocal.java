package top.yangluotong.threadlocal;

import org.apache.shiro.session.Session;

public class MyThreadLocal {

    ThreadLocal<Session> sessionThreadLocal = new ThreadLocal<>();

    public Session getSession() {
        return sessionThreadLocal.get();
    }

    public void setSession(Session session) {
        sessionThreadLocal.set(session);
    }

    public void removeSession() {
        sessionThreadLocal.remove();
    }

}
