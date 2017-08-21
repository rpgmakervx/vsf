package org.easyarch.vsf.demo;

import org.easyarch.vsf.annotation.Interface;

/**
 * Created by xingtianyu(code4j) on 2017-8-21.
 */
@Interface
public interface IService {

    void helloWorld(String msg);

    int calculate(int a, int b);

}
