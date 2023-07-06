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
package com.tencentcloudapi.anicloud.v20220923;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.anicloud.v20220923.models.*;

public class AnicloudClient extends AbstractClient{
    private static String endpoint = "anicloud.tencentcloudapi.com";
    private static String service = "anicloud";
    private static String version = "2022-09-23";
    
    public AnicloudClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AnicloudClient(Credential credential, String region, ClientProfile profile) {
        super(AnicloudClient.endpoint, AnicloudClient.version, credential, region, profile);
    }

    /**
     *查看appid是否存在
     * @param req CheckAppidExistRequest
     * @return CheckAppidExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckAppidExistResponse CheckAppidExist(CheckAppidExistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckAppidExistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAppidExistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckAppidExist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询购买资源
     * @param req QueryResourceRequest
     * @return QueryResourceResponse
     * @throws TencentCloudSDKException
     */
    public QueryResourceResponse QueryResource(QueryResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资源信息
     * @param req QueryResourceInfoRequest
     * @return QueryResourceInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryResourceInfoResponse QueryResourceInfo(QueryResourceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryResourceInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryResourceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryResourceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
