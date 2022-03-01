package com.github.kelly.http;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Session {

    private final String id;
    private final Map<String, Object> attributeMap = new HashMap<>();


    public Session(String id) {
        this.id = id;
    }

    /**
     *
     * @param name      Session id
     * @param value     Object 식별자 (User id)
     */
    public void setAttribute(String name, Object value) {
        attributeMap.put(name, value);
    }

    public String getId() {
        return id;
    }

    public Object getAttribute(String sessionId) {
        System.out.println("Session.getAttribute - sessionId = " + sessionId);
        return attributeMap.get(sessionId);
    }

    /**
     * Session Id 가 일치하면 동일성 인정
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return Objects.equals(id, session.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
