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
package com.tencentcloudapi.monitor.v20180724;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.monitor.v20180724.models.*;

public class MonitorClient extends AbstractClient{
    private static String endpoint = "monitor.tencentcloudapi.com";
    private static String version = "2018-07-24";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public MonitorClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public MonitorClient(Credential credential, String region, ClientProfile profile) {
        super(MonitorClient.endpoint, MonitorClient.version, credential, region, profile);
    }

    /**
     *获取基础指标详情
     * @param req DescribeBaseMetricsRequest
     * @return DescribeBaseMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseMetricsResponse DescribeBaseMetrics(DescribeBaseMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaseMetricsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaseMetricsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBaseMetrics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云产品的监控数据。传入产品的命名空间、对象维度描述和监控指标即可获得相应的监控数据。
接口调用频率限制为：20次/秒，1200次/分钟。
若您需要调用的指标、对象较多，可能存在因限频出现拉取失败的情况，建议尽量将请求按时间维度均摊。
     * @param req GetMonitorDataRequest
     * @return GetMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public GetMonitorDataResponse GetMonitorData(GetMonitorDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetMonitorDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetMonitorDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetMonitorData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
