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
package com.tencentcloudapi.ig.v20210518;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ig.v20210518.models.*;

public class IgClient extends AbstractClient{
    private static String endpoint = "ig.tencentcloudapi.com";
    private static String service = "ig";
    private static String version = "2021-05-18";

    public IgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IgClient(Credential credential, String region, ClientProfile profile) {
        super(IgClient.endpoint, IgClient.version, credential, region, profile);
    }

    /**
     *查询智能导诊订单列表
     * @param req DescribeIgOrderListRequest
     * @return DescribeIgOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgOrderListResponse DescribeIgOrderList(DescribeIgOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIgOrderList", DescribeIgOrderListResponse.class);
    }

}
