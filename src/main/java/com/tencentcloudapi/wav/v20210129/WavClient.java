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
package com.tencentcloudapi.wav.v20210129;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wav.v20210129.models.*;

public class WavClient extends AbstractClient{
    private static String endpoint = "wav.tencentcloudapi.com";
    private static String service = "wav";
    private static String version = "2021-01-29";

    public WavClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WavClient(Credential credential, String region, ClientProfile profile) {
        super(WavClient.endpoint, WavClient.version, credential, region, profile);
    }

    /**
     *根据游标拉取活动活码列表信息
     * @param req QueryActivityLiveCodeListRequest
     * @return QueryActivityLiveCodeListResponse
     * @throws TencentCloudSDKException
     */
    public QueryActivityLiveCodeListResponse QueryActivityLiveCodeList(QueryActivityLiveCodeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryActivityLiveCodeListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryActivityLiveCodeListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryActivityLiveCodeList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
