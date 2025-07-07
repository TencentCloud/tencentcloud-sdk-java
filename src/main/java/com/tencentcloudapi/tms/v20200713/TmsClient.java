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
        req.setSkipSign(false);
        return this.internalRequest(req, "AccountTipoffAccess", AccountTipoffAccessResponse.class);
    }

    /**
     *控制台获取用户词库列表
     * @param req DescribeTextLibRequest
     * @return DescribeTextLibResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTextLibResponse DescribeTextLib(DescribeTextLibRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTextLib", DescribeTextLibResponse.class);
    }

    /**
     *控制台识别统计
     * @param req DescribeTextStatRequest
     * @return DescribeTextStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTextStatResponse DescribeTextStat(DescribeTextStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTextStat", DescribeTextStatResponse.class);
    }

    /**
     *文本内容检测（Text Moderation）服务使用了深度学习技术，识别可能令人反感、不安全或不适宜的文本内容，同时支持用户配置词库黑白名单，打击自定义识别类型的图片。
     * @param req TextModerationRequest
     * @return TextModerationResponse
     * @throws TencentCloudSDKException
     */
    public TextModerationResponse TextModeration(TextModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextModeration", TextModerationResponse.class);
    }

}
