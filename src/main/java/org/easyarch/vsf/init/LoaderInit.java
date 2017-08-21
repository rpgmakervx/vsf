package org.easyarch.vsf.init;

import org.easyarch.vsf.kits.ResourceKits;

import java.util.Set;

/**
 * Created by xingtianyu(code4j) on 2017-8-21.
 */
public class LoaderInit implements Init {

    @Override
    public void init() {
        ClassScanner scanner = new ClassScanner();
//        Set<Class> set = scanner.scanImplementByJar(ResourceKits.getClassPath());
    }
}
