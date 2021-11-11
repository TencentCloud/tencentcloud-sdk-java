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
package com.tencentcloudapi.tcm.v20210413;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcm.v20210413.models.*;

public class TcmClient extends AbstractClient{
    private static String endpoint = "tcm.tencentcloudapi.com";
    private static String service = "tcm";
    private static String version = "2021-04-13";

    public TcmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcmClient(Credential credential, String region, ClientProfile profile) {
        super(TcmClient.endpoint, TcmClient.version, credential, region, profile);
    }

    /**
     *查询网格详情
     * @param req DescribeMeshRequest
     * @return DescribeMeshResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMeshResponse DescribeMesh(DescribeMeshRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMeshResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMeshResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMesh");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询网格列表
     * @param req DescribeMeshListRequest
     * @return DescribeMeshListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMeshListResponse DescribeMeshList(DescribeMeshListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMeshListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMeshListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMeshList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
