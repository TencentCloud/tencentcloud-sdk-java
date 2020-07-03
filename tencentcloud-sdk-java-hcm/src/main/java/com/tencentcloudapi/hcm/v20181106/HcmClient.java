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
package com.tencentcloudapi.hcm.v20181106;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.hcm.v20181106.models.*;

public class HcmClient extends AbstractClient{
    private static String endpoint = "hcm.tencentcloudapi.com";
    private static String version = "2018-11-06";

    public HcmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HcmClient(Credential credential, String region, ClientProfile profile) {
        super(HcmClient.endpoint, HcmClient.version, credential, region, profile);
    }

    /**
     *速算题目批改接口，根据用户上传的图片或图片的URL识别图片中的数学算式，进而给出算式的正确性评估。
     * @param req EvaluationRequest
     * @return EvaluationResponse
     * @throws TencentCloudSDKException
     */
    public EvaluationResponse Evaluation(EvaluationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EvaluationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EvaluationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Evaluation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
