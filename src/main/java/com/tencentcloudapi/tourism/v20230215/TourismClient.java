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
package com.tencentcloudapi.tourism.v20230215;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tourism.v20230215.models.*;

public class TourismClient extends AbstractClient{
    private static String endpoint = "tourism.tencentcloudapi.com";
    private static String service = "tourism";
    private static String version = "2023-02-15";

    public TourismClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TourismClient(Credential credential, String region, ClientProfile profile) {
        super(TourismClient.endpoint, TourismClient.version, credential, region, profile);
    }

    /**
     *依据客户的Uin查询开通的资源列表
     * @param req DescribeDrawResourceListRequest
     * @return DescribeDrawResourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrawResourceListResponse DescribeDrawResourceList(DescribeDrawResourceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrawResourceList", DescribeDrawResourceListResponse.class);
    }

}
