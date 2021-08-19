package com.tencentcloudapi;

import cls.Cls;
import com.google.protobuf.InvalidProtocolBufferException;
import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.profile.Region;
import net.jpountz.lz4.LZ4Compressor;
import net.jpountz.lz4.LZ4Factory;
import net.jpountz.lz4.LZ4FastDecompressor;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class Demo {

    //腾讯云账户密钥 secretId. TODO 修改为自己账户的secretId
    public static final String SECRET_ID = "";
    //腾讯云账户密钥 secretKey. TODO 修改为自己账户的secretKey
    public static final String SECRET_KEY = "";

    public static final String ENDPOINT = "cls.tencentcloudapi.com";
    public static final String ROOT_DOMAIN = "tencentcloudapi.com";
    public static final String X_CLS_TOPIC_ID = "X-CLS-TopicId";
    public static final String X_CLS_HASH_KEY = "X-CLS-HashKey";
    public static final String X_CLS_COMPRESS_TYPE = "X-CLS-CompressType";
    public static final String LZ_4 = "lz4";
    //TODO 替换为自己业务的 topic
    public static final String TOPIC = "";
    public static final String PRODUCT_NAME_CLS = "cls";
    public static final String UPLOAD_LOG_URL = "UploadLog";
    public static final String VERSION = "2020-10-16";


    /**
     *  java 调用 云api 上传日志 demo
     * @param args
     */
    public static void main( String[] args ) {
        //TODO 入参需要传入腾讯云账户密钥 secretId，secretKey
        Credential cred = new Credential(SECRET_ID, SECRET_KEY);

        //region 设置http选项中的参数
        HttpProfile httpProfile = new HttpProfile();
        // post请求  (默认为post请求)
        httpProfile.setReqMethod(HttpProfile.REQ_POST);
        // 指定接入地域域名(默认就近接入)
        httpProfile.setEndpoint(ENDPOINT);
        httpProfile.setRootDomain(ROOT_DOMAIN);
        // 在外网互通的网络环境下支持http协议(默认是https协议),请选择(https:// or http://)
        httpProfile.setProtocol(HttpProfile.REQ_HTTPS);
        // 设置读取超时时间，单位为秒(默认0秒)
        httpProfile.setReadTimeout(0);
        // 设置写入超时时间，单位为秒(默认0秒)
        httpProfile.setWriteTimeout(0);
        // 请求连接超时时间，单位为秒(默认60秒)
        httpProfile.setConnTimeout(HttpProfile.TM_MINUTE);
        //endregion

        //region 设置client选项中的参数
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);
        // 指定签名算法默认（"TC3-HMAC-SHA256"），它更安全但是会轻微降低性能。
        clientProfile.setSignMethod(ClientProfile.SIGN_TC3_256);
        //打印日志，默认是false
        clientProfile.setDebug(false);
        //endregion

        //region headers 和 body 信息
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put(X_CLS_TOPIC_ID, TOPIC);
        headers.put(X_CLS_HASH_KEY, "");
        // body lz4 压缩
        headers.put(X_CLS_COMPRESS_TYPE, LZ_4);
        byte[] body = compressedByte(getBodyInfo());
        //endregion

        try {
            CommonClient client = new CommonClient(PRODUCT_NAME_CLS, VERSION, cred, Region.GuangzhouOpen.getValue(), clientProfile);
            String resp = client.callOctetStream(UPLOAD_LOG_URL, headers, body);
            System.out.println(resp);
        } catch (TencentCloudSDKException te) {
            System.out.println(te.getMessage());
        }
    }


    /**
     * pom依赖:
     * <dependency>
     *     <groupId>net.jpountz.lz4</groupId>
     *     <artifactId>lz4</artifactId>
     *     <version>1.3.0</version>
     * </dependency>
     *
     * 进行lz4压缩
     * @param srcByte
     * @return
     */
    public static byte[] compressedByte(byte[] srcByte) {
        LZ4Factory factory = LZ4Factory.fastestInstance();
        LZ4Compressor compressor = factory.fastCompressor();
        return compressor.compress(srcByte);
    }

    /**
     * 自测
     * lz4 解压缩
     * @param srcByte  压缩后的数据
     * @param srcLength 压缩之前的数据长度
     * @return
     */
    public static byte[] reCompressedByte(byte[] srcByte, int srcLength) {
        LZ4Factory factory = LZ4Factory.fastestInstance();
        LZ4FastDecompressor lz4FastDecompressor = factory.fastDecompressor();
        return lz4FastDecompressor.decompress(srcByte, srcLength);
    }

    /**
     * pom依赖:
     * <dependency>
     *     <groupId>com.google.protobuf</groupId>
     *     <artifactId>protobuf-java</artifactId>
     *     <version>3.15.3</version>
     * </dependency
     *
     * 构造http body 信息
     * protobuf 序列化为 byte[]
     * @return byte[]
     */
    public static byte[] getBodyInfo() {
        Cls.Log log = Cls.Log.newBuilder()
                .setTime(System.currentTimeMillis()/1000L)
                .addContents(Cls.Log.Content.newBuilder()
                        .setKey("name")
                        .setValue("张三")
                        .build())
                .addContents(Cls.Log.Content.newBuilder()
                        .setKey("age")
                        .setValue("18")
                        .build())
                .build();

        Cls.LogGroup logGroup = Cls.LogGroup.newBuilder()
                .addLogs(log)
                .build();

        Cls.LogGroupList logGroupList = Cls.LogGroupList.newBuilder()
                .addLogGroupList(logGroup)
                .build();

        //这里我们将封装有数据的对象实例，转换为字节数组，用于数据传输、存储等
        return logGroupList.toByteArray();
    }

    /**
     *  自测
     *  protobuf 序列化和反序列化 方法
     *  protobuf  byte array 转 java bean, 打印信息
     * @param data  protobuf 序列化后的byte数组
     */
    public static void protobufParse(byte[] data) {
        try {
            Cls.LogGroupList logGroupList = Cls.LogGroupList.parseFrom(data);
            System.out.println(logGroupList);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }




}
