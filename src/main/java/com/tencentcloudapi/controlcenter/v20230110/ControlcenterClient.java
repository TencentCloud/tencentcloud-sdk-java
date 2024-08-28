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
package com.tencentcloudapi.controlcenter.v20230110;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.controlcenter.v20230110.models.*;

public class ControlcenterClient extends AbstractClient{
    private static String endpoint = "controlcenter.tencentcloudapi.com";
    private static String service = "controlcenter";
    private static String version = "2023-01-10";
    
    public ControlcenterClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ControlcenterClient(Credential credential, String region, ClientProfile profile) {
        super(ControlcenterClient.endpoint, ControlcenterClient.version, credential, region, profile);
    }

    /**
     *批量对存量账号应用基线
     * @param req BatchApplyAccountBaselinesRequest
     * @return BatchApplyAccountBaselinesResponse
     * @throws TencentCloudSDKException
     */
    public BatchApplyAccountBaselinesResponse BatchApplyAccountBaselines(BatchApplyAccountBaselinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchApplyAccountBaselines", BatchApplyAccountBaselinesResponse.class);
    }

}
