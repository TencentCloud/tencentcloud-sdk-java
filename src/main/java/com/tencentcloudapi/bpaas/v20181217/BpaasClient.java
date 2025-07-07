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
package com.tencentcloudapi.bpaas.v20181217;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bpaas.v20181217.models.*;

public class BpaasClient extends AbstractClient{
    private static String endpoint = "bpaas.tencentcloudapi.com";
    private static String service = "bpaas";
    private static String version = "2018-12-17";

    public BpaasClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BpaasClient(Credential credential, String region, ClientProfile profile) {
        super(BpaasClient.endpoint, BpaasClient.version, credential, region, profile);
    }

    /**
     *查看审批详情
     * @param req GetBpaasApproveDetailRequest
     * @return GetBpaasApproveDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetBpaasApproveDetailResponse GetBpaasApproveDetail(GetBpaasApproveDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetBpaasApproveDetail", GetBpaasApproveDetailResponse.class);
    }

    /**
     *外部审批申请单
     * @param req OutApproveBpaasApplicationRequest
     * @return OutApproveBpaasApplicationResponse
     * @throws TencentCloudSDKException
     */
    public OutApproveBpaasApplicationResponse OutApproveBpaasApplication(OutApproveBpaasApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OutApproveBpaasApplication", OutApproveBpaasApplicationResponse.class);
    }

}
