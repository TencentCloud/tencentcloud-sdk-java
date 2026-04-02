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
package com.tencentcloudapi.ga2.v20250115;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ga2.v20250115.models.*;

public class Ga2Client extends AbstractClient{
    private static String endpoint = "ga2.tencentcloudapi.com";
    private static String service = "ga2";
    private static String version = "2025-01-15";

    public Ga2Client(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public Ga2Client(Credential credential, String region, ClientProfile profile) {
        super(Ga2Client.endpoint, Ga2Client.version, credential, region, profile);
    }

    /**
     *创建全球加速实例
     * @param req CreateGlobalAcceleratorRequest
     * @return CreateGlobalAcceleratorResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalAcceleratorResponse CreateGlobalAccelerator(CreateGlobalAcceleratorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalAccelerator", CreateGlobalAcceleratorResponse.class);
    }

    /**
     *查询跨境账单
     * @param req DescribeCrossBorderSettlementRequest
     * @return DescribeCrossBorderSettlementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderSettlementResponse DescribeCrossBorderSettlement(DescribeCrossBorderSettlementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossBorderSettlement", DescribeCrossBorderSettlementResponse.class);
    }

}
