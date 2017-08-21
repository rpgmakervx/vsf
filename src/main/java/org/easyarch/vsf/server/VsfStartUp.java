package org.easyarch.vsf.server;

/**
 * Created by xingtianyu(code4j) on 2017-8-20.
 */
public class VsfStartUp {

    public static void main(String[] args) {
        Server server = new Server();
        server.start(8081);
    }
}
