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
package com.tencentcloudapi.tms.v20200713;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tms.v20200713.models.*;

public class TmsClient extends AbstractClient{
    private static String endpoint = "tms.tencentcloudapi.com";
    private static String service = "tms";
    private static String version = "2020-07-13";

    public TmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TmsClient(Credential credential, String region, ClientProfile profile) {
        super(TmsClient.endpoint, TmsClient.version, credential, region, profile);
    }

    /**
     *举报恶意账号
     * @param req AccountTipoffAccessRequest
     * @return AccountTipoffAccessResponse
     * @throws TencentCloudSDKException
     */
    public AccountTipoffAccessResponse AccountTipoffAccess(AccountTipoffAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AccountTipoffAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AccountTipoffAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AccountTipoffAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文本内容检测（Text Moderation）服务使用了深度学习技术，识别涉黄、涉政、涉恐等有害内容，同时支持用户配置词库，打击自定义的违规文本。
     * @param req TextModerationRequest
     * @return TextModerationResponse
     * @throws TencentCloudSDKException
     */
    public TextModerationResponse TextModeration(TextModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextModerationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TextModerationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextModeration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
