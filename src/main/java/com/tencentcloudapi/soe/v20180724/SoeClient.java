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
    private static String version = "2018-07-24";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public SoeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public SoeClient(Credential credential, String region, ClientProfile profile) {
        super(SoeClient.endpoint, SoeClient.version, credential, region, profile);
    }

    /**
     *初始化发音评估过程，每一轮评估前进行调用。语音输入模式分为流式模式和非流式模式，流式模式支持数据分片传输，可以加快评估响应速度。评估模式分为词模式和句子模式，词模式会标注每个音节的详细信息；句子模式会有完整度和流利度的评估。
     * @param req InitOralProcessRequest
     * @return InitOralProcessResponse
     * @throws TencentCloudSDKException
     */
    public InitOralProcessResponse  InitOralProcess(InitOralProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitOralProcessResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InitOralProcessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InitOralProcess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传输音频数据，必须在完成发音评估初始化接口只有，且SessonId要与初始化接口保持一致。分片传输时，尽量保证SeqId顺序传输。当使用mp3格式时目前仅支持16k采样率16bit单声道编码方式。
     * @param req TransmitOralProcessRequest
     * @return TransmitOralProcessResponse
     * @throws TencentCloudSDKException
     */
    public TransmitOralProcessResponse  TransmitOralProcess(TransmitOralProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransmitOralProcessResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TransmitOralProcessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TransmitOralProcess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
