package com.mr.todo.gwt.client;

import com.vaadin.shared.communication.ServerRpc;

public interface ToDoPersistToServerRpc extends ServerRpc {
    void persistToServer();
}
