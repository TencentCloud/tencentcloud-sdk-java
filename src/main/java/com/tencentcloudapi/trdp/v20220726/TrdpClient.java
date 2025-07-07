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
package com.tencentcloudapi.trdp.v20220726;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trdp.v20220726.models.*;

public class TrdpClient extends AbstractClient{
    private static String endpoint = "trdp.tencentcloudapi.com";
    private static String service = "trdp";
    private static String version = "2022-07-26";

    public TrdpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrdpClient(Credential credential, String region, ClientProfile profile) {
        super(TrdpClient.endpoint, TrdpClient.version, credential, region, profile);
    }

    /**
     *用户风险质量接口
     * @param req EvaluateUserRiskRequest
     * @return EvaluateUserRiskResponse
     * @throws TencentCloudSDKException
     */
    public EvaluateUserRiskResponse EvaluateUserRisk(EvaluateUserRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EvaluateUserRisk", EvaluateUserRiskResponse.class);
    }

}
