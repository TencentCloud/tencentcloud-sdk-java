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
package com.tencentcloudapi.mvj.v20190926;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mvj.v20190926.models.*;

public class MvjClient extends AbstractClient{
    private static String endpoint = "mvj.tencentcloudapi.com";
    private static String service = "mvj";
    private static String version = "2019-09-26";

    public MvjClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MvjClient(Credential credential, String region, ClientProfile profile) {
        super(MvjClient.endpoint, MvjClient.version, credential, region, profile);
    }

    /**
     *欢迎使用营销价值判断（Marketing Value Judgement，简称 MVJ）。

营销价值判断（MVJ）是针对零售场景的风控服务，通过识别高价值顾客，以帮助零售商保障营销资金
     * @param req MarketingValueJudgementRequest
     * @return MarketingValueJudgementResponse
     * @throws TencentCloudSDKException
     */
    public MarketingValueJudgementResponse MarketingValueJudgement(MarketingValueJudgementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MarketingValueJudgement", MarketingValueJudgementResponse.class);
    }

}
