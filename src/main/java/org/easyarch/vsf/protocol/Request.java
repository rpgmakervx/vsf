package org.easyarch.vsf.protocol;

import java.util.Arrays;

/**
 * Created by xingtianyu(code4j) on 2017-8-21.
 */
public class Request {

    private String callId;

    private String lookUp;

    private String methodName;

    private Class<?>[] paramTypes;

    private Object[] paramVals;

    public String getLookUp() {
        return lookUp;
    }

    public void setLookUp(String lookUp) {
        this.lookUp = lookUp;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Class<?>[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class<?>[] paramTypes) {
        this.paramTypes = paramTypes;
    }

    public Object[] getParamVals() {
        return paramVals;
    }

    public void setParamVals(Object[] paramVals) {
        this.paramVals = paramVals;
    }


    @Override
    public String toString() {
        return "Request{" +
                "lookUp='" + lookUp + '\'' +
                ", methodName='" + methodName + '\'' +
                ", paramTypes=" + Arrays.toString(paramTypes) +
                ", paramVals=" + Arrays.toString(paramVals) +
                '}';
    }
}
