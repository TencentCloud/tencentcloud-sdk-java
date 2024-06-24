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
package com.tencentcloudapi.tsi.v20210325;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tsi.v20210325.models.*;

public class TsiClient extends AbstractClient{
    private static String endpoint = "tsi.tencentcloudapi.com";
    private static String service = "tsi";
    private static String version = "2021-03-25";
    
    public TsiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TsiClient(Credential credential, String region, ClientProfile profile) {
        super(TsiClient.endpoint, TsiClient.version, credential, region, profile);
    }

    /**
     *获取同传结果。
     * @param req TongChuanDisplayRequest
     * @return TongChuanDisplayResponse
     * @throws TencentCloudSDKException
     */
    public TongChuanDisplayResponse TongChuanDisplay(TongChuanDisplayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TongChuanDisplay", TongChuanDisplayResponse.class);
    }

    /**
     *本接口提供上传音频，将音频进行语音识别并翻译成文本的服务，目前开放中英互译的同传服务。 待识别和翻译的音频文件格式是 pcm，pcm采样率要求16kHz、位深16bit、单声道、每个分片时长200ms~500ms，音频内语音清晰。
     * @param req TongChuanRecognizeRequest
     * @return TongChuanRecognizeResponse
     * @throws TencentCloudSDKException
     */
    public TongChuanRecognizeResponse TongChuanRecognize(TongChuanRecognizeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TongChuanRecognize", TongChuanRecognizeResponse.class);
    }

    /**
     *本接口提供上传音频，将音频进行语音识别并翻译成文本的服务，目前开放中英互译的同传服务。 待识别和翻译的音频文件格式是 pcm，pcm采样率要求16kHz、位深16bit、单声道、每个分片时长200ms~500ms，音频内语音清晰。
     * @param req TongChuanSyncRequest
     * @return TongChuanSyncResponse
     * @throws TencentCloudSDKException
     */
    public TongChuanSyncResponse TongChuanSync(TongChuanSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TongChuanSync", TongChuanSyncResponse.class);
    }

}
