package org.easyarch.vsf.context;

import org.easyarch.vsf.server.Processor;

/**
 * Created by xingtianyu(code4j) on 2017-8-24.
 */
abstract public class AppContext {

    private Processor processor;

    public AppContext(){
        this.processor = new Processor();
    }

    public void start(int port){
        processor.start(port);
    }

    abstract public void loadApi();
}
