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
package com.tencentcloudapi.tts.v20190823;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tts.v20190823.models.*;

public class TtsClient extends AbstractClient{
    private static String endpoint = "tts.tencentcloudapi.com";
    private static String service = "tts";
    private static String version = "2019-08-23";

    public TtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TtsClient(Credential credential, String region, ClientProfile profile) {
        super(TtsClient.endpoint, TtsClient.version, credential, region, profile);
    }

    /**
     *腾讯云语音合成技术（TTS）可以将任意文本转化为语音，实现让机器和应用张口说话。
腾讯TTS技术可以应用到很多场景，比如，移动APP语音播报新闻；智能设备语音提醒；依靠网上现有节目或少量录音，快速合成明星语音，降低邀约成本；支持车载导航语音合成的个性化语音播报。
内测期间免费使用。
     * @param req TextToVoiceRequest
     * @return TextToVoiceResponse
     * @throws TencentCloudSDKException
     */
    public TextToVoiceResponse TextToVoice(TextToVoiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextToVoiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TextToVoiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextToVoice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
