/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.soe.v20180724;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.soe.v20180724.models.*;

public class SoeClient extends AbstractClient{
    private static String endpoint = "soe.tencentcloudapi.com";
    private static String service = "soe";
    private static String version = "2018-07-24";

    public SoeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SoeClient(Credential credential, String region, ClientProfile profile) {
        super(SoeClient.endpoint, SoeClient.version, credential, region, profile);
    }

    /**
     *初始化发音评估过程，每一轮评估前进行调用。语音输入模式分为流式模式和非流式模式，流式模式支持数据分片传输，可以加快评估响应速度。评估模式分为词模式和句子模式，词模式会标注每个音节的详细信息；句子模式会有完整度和流利度的评估。
     * @param req InitOralProcessRequest
     * @return InitOralProcessResponse
     * @throws TencentCloudSDKException
     */
    public InitOralProcessResponse InitOralProcess(InitOralProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitOralProcessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InitOralProcessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InitOralProcess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *指定主题关键词词汇评估，分析语音与关键词的切合程度，可指定多个关键词，支持中文英文同时评测。分片传输时，尽量保证纯异步调用，即不等待上一个分片的传输结果边录边传，这样可以尽可能早的提供音频数据。音频源目前仅支持16k采样率16bit单声道编码方式，如有不一致可能导致评估不准确或失败。
     * @param req KeywordEvaluateRequest
     * @return KeywordEvaluateResponse
     * @throws TencentCloudSDKException
     */
    public KeywordEvaluateResponse KeywordEvaluate(KeywordEvaluateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KeywordEvaluateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<KeywordEvaluateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KeywordEvaluate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传输音频数据，必须在完成发音评估初始化接口之后调用，且SessonId要与初始化接口保持一致。分片传输时，尽量保证SeqId顺序传输。音频源目前仅支持16k采样率16bit单声道编码方式，如有不一致可能导致评估不准确或失败。
     * @param req TransmitOralProcessRequest
     * @return TransmitOralProcessResponse
     * @throws TencentCloudSDKException
     */
    public TransmitOralProcessResponse TransmitOralProcess(TransmitOralProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransmitOralProcessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransmitOralProcessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransmitOralProcess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *初始化并传输音频数据，分片传输时，尽量保证SeqId顺序传输。音频源目前仅支持16k采样率16bit单声道编码方式，如有不一致可能导致评估不准确或失败。
     * @param req TransmitOralProcessWithInitRequest
     * @return TransmitOralProcessWithInitResponse
     * @throws TencentCloudSDKException
     */
    public TransmitOralProcessWithInitResponse TransmitOralProcessWithInit(TransmitOralProcessWithInitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransmitOralProcessWithInitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransmitOralProcessWithInitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransmitOralProcessWithInit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
