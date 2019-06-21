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
package com.tencentcloudapi.asr.v20190614;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.asr.v20190614.models.*;

public class AsrClient extends AbstractClient{
    private static String endpoint = "asr.tencentcloudapi.com";
    private static String version = "2019-06-14";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public AsrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public AsrClient(Credential credential, String region, ClientProfile profile) {
        super(AsrClient.endpoint, AsrClient.version, credential, region, profile);
    }

    /**
     *识别60s内的短语音。当音频文件通过请求中body内容上传时，请求大小不能超过600KB；当音频以url方式传输时，音频时长不可超过60s。所有请求参数放在POST请求的body中，编码类型采用采用x-www-form-urlencoded，参数进行urlencode编码后传输。现暂只支持中文普通话识别，支持识别8k16bit和16k16bit的mp3或者wav音频。
     * @param req SentenceRecognitionRequest
     * @return SentenceRecognitionResponse
     * @throws TencentCloudSDKException
     */
    public SentenceRecognitionResponse SentenceRecognition(SentenceRecognitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentenceRecognitionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SentenceRecognitionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SentenceRecognition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
