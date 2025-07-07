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
package com.tencentcloudapi.eis.v20210601;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.eis.v20210601.models.*;

public class EisClient extends AbstractClient{
    private static String endpoint = "eis.tencentcloudapi.com";
    private static String service = "eis";
    private static String version = "2021-06-01";

    public EisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EisClient(Credential credential, String region, ClientProfile profile) {
        super(EisClient.endpoint, EisClient.version, credential, region, profile);
    }

    /**
     *获取运行时详情
     * @param req GetRuntimeMCRequest
     * @return GetRuntimeMCResponse
     * @throws TencentCloudSDKException
     */
    public GetRuntimeMCResponse GetRuntimeMC(GetRuntimeMCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRuntimeMC", GetRuntimeMCResponse.class);
    }

    /**
     *获取运行时资源监控详情，cpu，memory，bandwidth
     * @param req GetRuntimeResourceMonitorMetricMCRequest
     * @return GetRuntimeResourceMonitorMetricMCResponse
     * @throws TencentCloudSDKException
     */
    public GetRuntimeResourceMonitorMetricMCResponse GetRuntimeResourceMonitorMetricMC(GetRuntimeResourceMonitorMetricMCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRuntimeResourceMonitorMetricMC", GetRuntimeResourceMonitorMetricMCResponse.class);
    }

    /**
     *返回用户可用的运行时列表，发布应用时返回的运行时环境，仅shared和private运行时，无sandbox运行时，并且只有running/scaling状态的
     * @param req ListDeployableRuntimesMCRequest
     * @return ListDeployableRuntimesMCResponse
     * @throws TencentCloudSDKException
     */
    public ListDeployableRuntimesMCResponse ListDeployableRuntimesMC(ListDeployableRuntimesMCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDeployableRuntimesMC", ListDeployableRuntimesMCResponse.class);
    }

    /**
     *获取运行时部署的应用实例列表
     * @param req ListRuntimeDeployedInstancesMCRequest
     * @return ListRuntimeDeployedInstancesMCResponse
     * @throws TencentCloudSDKException
     */
    public ListRuntimeDeployedInstancesMCResponse ListRuntimeDeployedInstancesMC(ListRuntimeDeployedInstancesMCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRuntimeDeployedInstancesMC", ListRuntimeDeployedInstancesMCResponse.class);
    }

    /**
     *返回用户的运行时列表，运行时管理主页使用，包含沙箱、共享运行时及独立运行时环境，不包含已经删除的运行时
     * @param req ListRuntimesMCRequest
     * @return ListRuntimesMCResponse
     * @throws TencentCloudSDKException
     */
    public ListRuntimesMCResponse ListRuntimesMC(ListRuntimesMCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRuntimesMC", ListRuntimesMCResponse.class);
    }

}
