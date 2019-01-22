package soe.v20180724;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.UUID;
import com.tencentcloudapi.soe.v20180724.models.*;
import com.tencentcloudapi.soe.v20180724.SoeClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.profile.ClientProfile;

/**
 * 运行步骤：
 * 1 下载测试音频数据到本地
 *   bike.mp3:                                     https://soe-common-1255701415.cos.ap-guangzhou.myqcloud.com/bike.mp3
 *   cn.mp3:                                       https://soe-common-1255701415.cos.ap-guangzhou.myqcloud.com/cn.mp3
 *   Rex was a big dog.wav :                       https://soe-common-1255701415.cos.ap-guangzhou.myqcloud.com/Rex%20was%20a%20big%20dog.wav
 *   I see sixteen eggs and eighteen apples.wav :  https://soe-common-1255701415.cos.ap-guangzhou.myqcloud.com/I%20see%20sixteen%20eggs%20and%20eighteen%20apples.wav
 * 2 配置测试音频数据目录常量 AUDIO_FOR_ONCE、AUDIO_FOR_CN、AUDIO_FOR_SEQ、AUDIO_FOR_ASYNC 为音频下载目录
 * 3 修改密钥常量 SECRET_ID、SECRET_KEY 为腾讯云帐号密钥
 * 4 运行示例程序
 */


public class EvaluationExamples {
    public static final String REGION = "ap-beijing";
    public static final String END_POINT = "soe.ap-beijing.tencentcloudapi.com";
    public static final String SECRET_ID = "";
    public static final String SECRET_KEY = "";

    public static final int EVAL_MODE_WORD = 0;
    public static final int EVAL_MODE_SENTENCE = 1;
    public static final int EVAL_MODE_PARA = 2;
    public static final int EVAL_MODE_FREETALK = 3;

    public static final int WORK_MODE_STREAM = 0;
    public static final int WORK_MODE_ONCE = 1;

    public static final int MP3 = 3;
    public static final int WAV = 2;
    public static final int RAW = 1;

    public static final int CN = 1;
    public static final int EN = 0;


    public static final int PKG_SIZE = 16 * 1024;


    public static final String FINISHED = "Finished";
    public static final String FAILED = "Failed";
    public static final String EVALUATING = "Evaluating";

    /*
     * 测试音频下载地址
     * bike.mp3:                                     https://soe-common-1255701415.cos.ap-guangzhou.myqcloud.com/bike.mp3
     * cn.mp3:                                       https://soe-common-1255701415.cos.ap-guangzhou.myqcloud.com/cn.mp3
     * Rex was a big dog.wav :                       https://soe-common-1255701415.cos.ap-guangzhou.myqcloud.com/Rex%20was%20a%20big%20dog.wav
     * I see sixteen eggs and eighteen apples.wav :  https://soe-common-1255701415.cos.ap-guangzhou.myqcloud.com/I%20see%20sixteen%20eggs%20and%20eighteen%20apples.wav
     *
     */
    public static final String AUDIO_FOR_ONCE = "./bike.mp3";
    public static final String AUDIO_FOR_CN = "./cn.mp3";
    public static final String AUDIO_FOR_SEQ = "Rex was a big dog.wav";
    public static final String AUDIO_FOR_ASYNC = "./I see sixteen eggs and eighteen apples.wav";



    public static String getSessionId() {
        // sessionID 保证唯一性,建议使用时间戳加随机数或者直接使用 uuid
        String sessionId = UUID.randomUUID().toString().replaceAll("-", "");
        return sessionId;
    }

    /**
     * 过长文本转段落模式重试的初始化请求
     * @param client
     * @param req
     * @return
     * @throws TencentCloudSDKException
     */
    public static InitOralProcessResponse InitWithRetry(SoeClient client, InitOralProcessRequest req) throws TencentCloudSDKException {
        if (req == null) {
            return null;
        }
        if (client == null) {
            return null;
        }

        try {
            InitOralProcessResponse resp = client.InitOralProcess(req);
            return resp;
        } catch (TencentCloudSDKException e) {
            // 长字符串采用段落模式，可以根据业务情景修改重试策略
            if (e.getMessage().indexOf("InvalidParameterValue.RefTxtTooLang") >= 0) {
                if (req.getEvalMode() == EVAL_MODE_WORD || req.getEvalMode() == EVAL_MODE_SENTENCE) {
                    req.setEvalMode(EVAL_MODE_PARA);
                    return client.InitOralProcess(req);
                }
            }
            throw e;
        }
    }

    /**
     * 当网络错误导致参数缺失重试数据传输请求
     * @param client
     * @param req
     * @return
     * @throws TencentCloudSDKException
     */
    public static TransmitOralProcessResponse TransmitWithRetry(SoeClient client,TransmitOralProcessRequest req) throws TencentCloudSDKException {
        if (req == null) {
            return null;
        }
        if (client == null) {
            return null;
        }
        try {
            TransmitOralProcessResponse resp = client.TransmitOralProcess(req);
            return resp;
        } catch (TencentCloudSDKException e) {
            // 避免网络丢包数据，可以根据业务情景修改重试策略
            if (e.getMessage().indexOf("MissingParameter") >= 0){
                TransmitOralProcessResponse resp = client.TransmitOralProcess(req);
                return resp;
            }
            throw e;
        }
    }


    /**
     * 一次性评估示例,用于较短时间音频的评估，例如单词或者短句，评估一次性发布所有音频数据
     *
     * @param client
     */
    public static void EvaluationOnce(SoeClient client) {

        System.out.println("----------一次性评估示例------------");

        String sessionId = getSessionId();
        InitOralProcessRequest req = new InitOralProcessRequest();
        //设置初始化，参数详情可见官方文档
        req.setSessionId(sessionId);
        req.setEvalMode(EVAL_MODE_WORD);
        req.setRefText("bike");
        req.setStorageMode(1);
        // 设置为流式评估
        req.setWorkMode(WORK_MODE_ONCE);
        req.setScoreCoeff(1.0f);
        try {
            InitOralProcessResponse resp = InitWithRetry(client,req);
            System.out.println("初始化返回结果:");
            System.out.println(InitOralProcessRequest.toJsonString(resp));
        } catch (Exception e) {
            System.out.println(e.toString());
            return;

        }

        TransmitOralProcessRequest transReq = new TransmitOralProcessRequest();
        transReq.setSessionId(sessionId);
        transReq.setVoiceEncodeType(1);
        transReq.setVoiceFileType(MP3);
        try {
            byte[] buf = Files.readAllBytes(Paths.get(AUDIO_FOR_ONCE));
            String base64Str = new sun.misc.BASE64Encoder().encode(buf);
            //String base64Str = Base64.getEncoder().encodeToString(buf);
            transReq.setUserVoiceData(base64Str);
            transReq.setSeqId(1);
            transReq.setIsEnd(1);
            TransmitOralProcessResponse transResp = TransmitWithRetry(client,transReq);
            System.out.println(transResp.getStatus());
            System.out.println(TransmitOralProcessResponse.toJsonString(transResp));
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
    }


    /**
     * 中文评估示例，除了init参数 ServerType 以外，和英文评估完全一样
     *
     * @param client
     */
    public static void EvaluationCn(SoeClient client) {

        System.out.println("----------中文评估示例------------");

        String sessionId = getSessionId();
        InitOralProcessRequest req = new InitOralProcessRequest();
        //设置初始化，参数详情可见官方文档
        req.setSessionId(sessionId);
        req.setEvalMode(EVAL_MODE_SENTENCE);
        req.setRefText("轻轻的我走了，正如我轻轻的来");
        // 设置为流式评估
        req.setWorkMode(WORK_MODE_ONCE);
        req.setServerType(CN);
        req.setScoreCoeff(1.0f);
        try {
            InitOralProcessResponse resp = InitWithRetry(client,req);
            System.out.println("初始化返回结果:");
            System.out.println(InitOralProcessRequest.toJsonString(resp));
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
        // 传输音频数据到评估服务
        TransmitOralProcessRequest transReq = new TransmitOralProcessRequest();
        transReq.setSessionId(sessionId);
        transReq.setVoiceEncodeType(1);
        transReq.setVoiceFileType(MP3);
        try {
            byte[] buf = Files.readAllBytes(Paths.get(AUDIO_FOR_CN));
            String base64Str = new sun.misc.BASE64Encoder().encode(buf);
            transReq.setUserVoiceData(base64Str);
            transReq.setSeqId(1);
            transReq.setIsEnd(1);
            TransmitOralProcessResponse transResp = TransmitWithRetry(client,transReq);
            System.out.println(TransmitOralProcessResponse.toJsonString(transResp));
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
    }


    /**
     * 流式分片传输评估示例,中等长度的音频或者边录边传模式，将音频分片传输到评估服务
     *
     * @param client
     */
    public static void EvaluationMutipleSeq(SoeClient client) {

        System.out.println("----------流式评估示例------------");
        String sessionId = getSessionId();
        InitOralProcessRequest req = new InitOralProcessRequest();
        //设置初始化，参数详情可见官方文档
        req.setSessionId(sessionId);
        req.setEvalMode(EVAL_MODE_SENTENCE);
        req.setRefText("Rex was a big dog.");
        req.setWorkMode(WORK_MODE_STREAM);
        req.setScoreCoeff(3.5f);
        req.setIsAsync(1);
        try {
            InitOralProcessResponse resp = InitWithRetry(client,req);
            System.out.println("初始化返回结果:");
            System.out.println(InitOralProcessRequest.toJsonString(resp));
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }

        // 获取所有音频数据
        byte[] data;
        try {
            data = Files.readAllBytes(Paths.get(AUDIO_FOR_SEQ));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // 分片传输数据
        int pkgNum = (int) Math.ceil((double) data.length / PKG_SIZE);
        for (int i = 1; i <= pkgNum; i++) {
            int lastIndex = i * PKG_SIZE;
            if (i == pkgNum) {
                lastIndex = data.length;
            }
            byte[] buf = Arrays.copyOfRange(data, (i - 1) * PKG_SIZE, lastIndex);
            try {
                TransmitOralProcessRequest transReq = new TransmitOralProcessRequest();
                String base64Str = new sun.misc.BASE64Encoder().encode(buf);
                transReq.setUserVoiceData(base64Str);
                transReq.setSessionId(sessionId);
                transReq.setVoiceEncodeType(1);
                transReq.setVoiceFileType(WAV);
                transReq.setSeqId(i);
                if (i == pkgNum) {
                    transReq.setIsEnd(1);
                } else {
                    transReq.setIsEnd(0);
                }
                TransmitOralProcessResponse transResp = TransmitWithRetry(client,transReq);
                System.out.println(TransmitOralProcessResponse.toJsonString(transResp));
            } catch (TencentCloudSDKException e) {
                System.out.println(e.toString());
                return;
            }
        }

        // 评估结束或者评估超时可以查询评估结果
        TransmitOralProcessRequest transReq = new TransmitOralProcessRequest();
        transReq.setSessionId(sessionId);
        transReq.setVoiceEncodeType(1);
        transReq.setVoiceFileType(WAV);
        try {
            transReq.setUserVoiceData("");
            transReq.setSeqId(0);
            transReq.setIsEnd(0);
            transReq.setIsQuery(1);
            TransmitOralProcessResponse transResp = TransmitWithRetry(client,transReq);
            System.out.println("查询结果:");
            System.out.println(TransmitOralProcessResponse.toJsonString(transResp));
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
    }

    /**
     * 异步评估示例,较长音频的评估，短时间内获取不了结果(评估时间超过 20s )，采用异步模式，主动轮询评估服务得到评估结果，可用于段落或者离线评估
     *
     * @param client
     */
    public static void EvaluationAsync(SoeClient client) {

        System.out.println("----------异步评估示例------------");
        String sessionId = getSessionId();
        InitOralProcessRequest req = new InitOralProcessRequest();
        //设置初始化，参数详情可见官方文档
        req.setSessionId(sessionId);
        req.setEvalMode(EVAL_MODE_SENTENCE);
        req.setRefText("I see sixteen eggs and eighteen apples.wav");
        req.setWorkMode(WORK_MODE_STREAM);
        req.setScoreCoeff(3.5f);
        req.setIsAsync(1);
        try {
            InitOralProcessResponse resp = InitWithRetry(client,req);
            System.out.println("初始化返回结果:");
            System.out.println(InitOralProcessRequest.toJsonString(resp));
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }

        // 获取所有音频数据
        byte[] data = null;
        try {
            data = Files.readAllBytes(Paths.get(AUDIO_FOR_ASYNC));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }


        TransmitOralProcessResponse transResp;
        int pkgNum = (int) Math.ceil((double) data.length / PKG_SIZE);
        for (int i = 1; i <= pkgNum; i++) {
            int lastIndex = i * PKG_SIZE;
            if (i == pkgNum) {
                lastIndex = data.length;
            }
            byte[] buf = Arrays.copyOfRange(data, (i - 1) * PKG_SIZE, lastIndex);
            try {
                TransmitOralProcessRequest transReq = new TransmitOralProcessRequest();
                String base64Str = new sun.misc.BASE64Encoder().encode(buf);
                transReq.setUserVoiceData(base64Str);
                transReq.setSessionId(sessionId);
                transReq.setVoiceEncodeType(1);
                transReq.setVoiceFileType(WAV);
                transReq.setSeqId(i);
                if (i == pkgNum) {
                    transReq.setIsEnd(1);
                } else {
                    transReq.setIsEnd(0);
                }
                transResp = TransmitWithRetry(client,transReq);
                System.out.println(TransmitOralProcessResponse.toJsonString(transResp));
                if (transResp.getStatus().equals(FINISHED) || transResp.getStatus().equals(FAILED)) {
                    return;
                }
            } catch (TencentCloudSDKException e) {
                System.out.println(e.toString());
                return;
            }
        }


        //查询结果
        for (int i = 0; i < 100; i++) {
            TransmitOralProcessRequest transReq = new TransmitOralProcessRequest();
            transReq.setSessionId(sessionId);
            transReq.setVoiceEncodeType(1);
            transReq.setVoiceFileType(WAV);
            try {
                transReq.setUserVoiceData("");
                transReq.setSeqId(0);
                transReq.setIsEnd(0);
                //设置为查询标识
                transReq.setIsQuery(1);
                transResp = TransmitWithRetry(client,transReq);
                System.out.println("查询结果:");
                System.out.println(TransmitOralProcessResponse.toJsonString(transResp));
                if (transResp.getStatus().equals(FINISHED) || transResp.getStatus().equals(FAILED)) {
                    System.out.println("exit");
                    return;
                }
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e.toString());
                return;
            }
        }
    }


    /**
     * 中文评估示例，除了init参数 ServerType 以外，和英文评估完全一样
     *
     * @param client
     */
    public static void EvaluationTransWithInit(SoeClient client) {

        System.out.println("----------TransWithInit------------");

        String sessionId = getSessionId();
        TransmitOralProcessWithInitRequest req = new TransmitOralProcessWithInitRequest();
        //设置初始化，参数详情可见官方文档
        req.setSessionId(sessionId);
        req.setEvalMode(EVAL_MODE_WORD);
        req.setRefText("bike");
        // 设置为流式评估
        req.setWorkMode(WORK_MODE_ONCE);
        req.setServerType(EN);
        req.setScoreCoeff(1.0f);
        req.setVoiceEncodeType(1);
        req.setVoiceFileType(MP3);

        try {
            byte[] buf = Files.readAllBytes(Paths.get(AUDIO_FOR_ONCE));
            String base64Str = new sun.misc.BASE64Encoder().encode(buf);
            req.setUserVoiceData(base64Str);
            req.setSeqId(1);
            req.setIsEnd(1);
            TransmitOralProcessWithInitResponse transResp = client.TransmitOralProcessWithInit(req);
            System.out.println(TransmitOralProcessResponse.toJsonString(transResp));
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
    }


    public static void main(String[] args) {


        Credential cred = new Credential(SECRET_ID, SECRET_KEY);
        HttpProfile httpProfile = new HttpProfile();

        /**
         *  设置访问域名，如果需要就近部署，可以使用 soe-tencentcloudapi.com, 腾讯云将根据访问的地域解析到合适的服务器上，如果调用服务已确定地域，如华南地区
         *  可以直接使用地域域名，加快访问速度
         */
        httpProfile.setEndpoint(END_POINT);
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);
        SoeClient client = new SoeClient(cred, REGION, clientProfile);

        EvaluationOnce(client);
        EvaluationCn(client);
        EvaluationMutipleSeq(client);
        EvaluationAsync(client);
        EvaluationTransWithInit(client);
    }

}