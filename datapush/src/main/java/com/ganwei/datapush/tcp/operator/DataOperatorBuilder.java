package com.ganwei.datapush.tcp.operator;


import com.ganwei.datapush.tcp.connect.Connector;
import com.ganwei.datapush.tcp.encrypt.AESEncryptor;

public class DataOperatorBuilder {

    public static Operator getDataOperator(Connector connector) {
        DataOperator dataOperator = new DataOperator(connector, new AESEncryptor());

//        // 身份验证
//        boolean validate = dataOperator.validate(reportConfig);
//        if(validate){
//            // 心跳启动
//            dataOperator.heartBeat(reportConfig);
//        }

        return dataOperator;
    }


}