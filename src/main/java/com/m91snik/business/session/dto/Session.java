/**
 * Created by nikolay.garbuzov on 23.02.15.
 */
package com.m91snik.business.session.dto;

import org.springframework.beans.factory.annotation.Configurable;

//NOTE: for Spring AOP usage
//@Configurable
public class Session {
    private final String id;
    private final Group group;

    public Session(String id, Group group) {
        this.group = group;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }
}