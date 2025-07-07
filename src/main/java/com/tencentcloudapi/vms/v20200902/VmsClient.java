/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.vms.v20200902;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vms.v20200902.models.*;

public class VmsClient extends AbstractClient{
    private static String endpoint = "vms.tencentcloudapi.com";
    private static String service = "vms";
    private static String version = "2020-09-02";

    public VmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VmsClient(Credential credential, String region, ClientProfile profile) {
        super(VmsClient.endpoint, VmsClient.version, credential, region, profile);
    }

    /**
     *给用户发语音验证码（仅支持数字）。
     * @param req SendCodeVoiceRequest
     * @return SendCodeVoiceResponse
     * @throws TencentCloudSDKException
     */
    public SendCodeVoiceResponse SendCodeVoice(SendCodeVoiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendCodeVoice", SendCodeVoiceResponse.class);
    }

    /**
     *给用户发送指定模板的语音通知。
     * @param req SendTtsVoiceRequest
     * @return SendTtsVoiceResponse
     * @throws TencentCloudSDKException
     */
    public SendTtsVoiceResponse SendTtsVoice(SendTtsVoiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendTtsVoice", SendTtsVoiceResponse.class);
    }

}
