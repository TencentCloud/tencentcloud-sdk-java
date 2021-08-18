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
package com.tencentcloudapi.pds.v20210701;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.pds.v20210701.models.*;

public class PdsClient extends AbstractClient{
    private static String endpoint = "pds.tencentcloudapi.com";
    private static String service = "pds";
    private static String version = "2021-07-01";

    public PdsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PdsClient(Credential credential, String region, ClientProfile profile) {
        super(PdsClient.endpoint, PdsClient.version, credential, region, profile);
    }

    /**
     *判断新用户信誉值
     * @param req DescribeNewUserAcquisitionRequest
     * @return DescribeNewUserAcquisitionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewUserAcquisitionResponse DescribeNewUserAcquisition(DescribeNewUserAcquisitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNewUserAcquisitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNewUserAcquisitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNewUserAcquisition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询存量判断服务
     * @param req DescribeStockEstimationRequest
     * @return DescribeStockEstimationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStockEstimationResponse DescribeStockEstimation(DescribeStockEstimationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStockEstimationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStockEstimationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStockEstimation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
