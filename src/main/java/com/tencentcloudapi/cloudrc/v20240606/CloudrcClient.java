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
package com.tencentcloudapi.cloudrc.v20240606;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudrc.v20240606.models.*;

public class CloudrcClient extends AbstractClient{
    private static String endpoint = "cloudrc.tencentcloudapi.com";
    private static String service = "cloudrc";
    private static String version = "2024-06-06";

    public CloudrcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudrcClient(Credential credential, String region, ClientProfile profile) {
        super(CloudrcClient.endpoint, CloudrcClient.version, credential, region, profile);
    }

    /**
     *查询资源详情
     * @param req DescribeResourceRequest
     * @return DescribeResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceResponse DescribeResource(DescribeResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResource", DescribeResourceResponse.class);
    }

    /**
     *搜索资源
     * @param req SearchResourcesRequest
     * @return SearchResourcesResponse
     * @throws TencentCloudSDKException
     */
    public SearchResourcesResponse SearchResources(SearchResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchResources", SearchResourcesResponse.class);
    }

}
