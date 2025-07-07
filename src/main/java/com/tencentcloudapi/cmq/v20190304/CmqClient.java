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
package com.tencentcloudapi.cmq.v20190304;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cmq.v20190304.models.*;

public class CmqClient extends AbstractClient{
    private static String endpoint = "cmq.tencentcloudapi.com";
    private static String service = "cmq";
    private static String version = "2019-03-04";

    public CmqClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CmqClient(Credential credential, String region, ClientProfile profile) {
        super(CmqClient.endpoint, CmqClient.version, credential, region, profile);
    }

    /**
     *枚举队列列表
     * @param req DescribeQueueDetailRequest
     * @return DescribeQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueueDetailResponse DescribeQueueDetail(DescribeQueueDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQueueDetail", DescribeQueueDetailResponse.class);
    }

    /**
     *查询主题详情
     * @param req DescribeTopicDetailRequest
     * @return DescribeTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicDetailResponse DescribeTopicDetail(DescribeTopicDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicDetail", DescribeTopicDetailResponse.class);
    }

}
