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
package com.tencentcloudapi.tchd.v20230306;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tchd.v20230306.models.*;

public class TchdClient extends AbstractClient{
    private static String endpoint = "tchd.tencentcloudapi.com";
    private static String service = "tchd";
    private static String version = "2023-03-06";

    public TchdClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TchdClient(Credential credential, String region, ClientProfile profile) {
        super(TchdClient.endpoint, TchdClient.version, credential, region, profile);
    }

    /**
     *本接口用于查询腾讯云健康看板的实时可用性事件信息，可以通过产品列表、地域进行过滤查询。
可以参考健康看板历史事件页面来获取查询案例（链接：https://status.cloud.tencent.com/history）。
     * @param req DescribeEventStatisticsRequest
     * @return DescribeEventStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventStatisticsResponse DescribeEventStatistics(DescribeEventStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventStatistics", DescribeEventStatisticsResponse.class);
    }

    /**
     *本接口用于查询腾讯云健康看板的可用性事件信息，可以通过产品列表、地域列表和事件发生日期进行过滤查询。
当查询的产品对应时间内无事件时将返回空结果。
可以参考健康看板历史事件页面来获取查询案例（链接：https://status.cloud.tencent.com/history）。
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvents", DescribeEventsResponse.class);
    }

}
