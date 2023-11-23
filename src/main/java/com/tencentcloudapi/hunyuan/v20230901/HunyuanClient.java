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
package com.tencentcloudapi.hunyuan.v20230901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.hunyuan.v20230901.models.*;

public class HunyuanClient extends AbstractClient{
    private static String endpoint = "hunyuan.tencentcloudapi.com";
    private static String service = "hunyuan";
    private static String version = "2023-09-01";
    
    public HunyuanClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HunyuanClient(Credential credential, String region, ClientProfile profile) {
        super(HunyuanClient.endpoint, HunyuanClient.version, credential, region, profile);
    }

    /**
     *腾讯混元大模型高级版是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口为SSE协议。

 1.本接口暂不支持返回图片内容。
 2.默认单账号限制并发数为5路，如您有提高并发限制的需求请 [联系我们](https://cloud.tencent.com/act/event/Online_service) 。
     * @param req ChatProRequest
     * @return ChatProResponse
     * @throws TencentCloudSDKException
     */
    public ChatProResponse ChatPro(ChatProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatPro", ChatProResponse.class);
    }

    /**
     *腾讯混元大模型标准版是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口为SSE协议。

 1.本接口暂不支持返回图片内容。
 2.默认单账号限制并发数为5路，如您有提高并发限制的需求请 [联系我们](https://cloud.tencent.com/act/event/Online_service) 。
     * @param req ChatStdRequest
     * @return ChatStdResponse
     * @throws TencentCloudSDKException
     */
    public ChatStdResponse ChatStd(ChatStdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatStd", ChatStdResponse.class);
    }

    /**
     *该接口用于计算文本对应Token数、字符数。
     * @param req GetTokenCountRequest
     * @return GetTokenCountResponse
     * @throws TencentCloudSDKException
     */
    public GetTokenCountResponse GetTokenCount(GetTokenCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTokenCount", GetTokenCountResponse.class);
    }

}
