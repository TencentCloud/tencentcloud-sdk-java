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
package com.tencentcloudapi.hai.v20230812;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.hai.v20230812.models.*;

public class HaiClient extends AbstractClient{
    private static String endpoint = "hai.tencentcloudapi.com";
    private static String service = "hai";
    private static String version = "2023-08-12";
    
    public HaiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HaiClient(Credential credential, String region, ClientProfile profile) {
        super(HaiClient.endpoint, HaiClient.version, credential, region, profile);
    }

    /**
     *本接口（CreateApplication）用于对HAI实例制作自定义应用。
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplication", CreateApplicationResponse.class);
    }

    /**
     *创建musk prompt 任务
     * @param req CreateMuskPromptRequest
     * @return CreateMuskPromptResponse
     * @throws TencentCloudSDKException
     */
    public CreateMuskPromptResponse CreateMuskPrompt(CreateMuskPromptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMuskPrompt", CreateMuskPromptResponse.class);
    }

    /**
     *本接口（DescribeApplications）用于查询应用
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplications", DescribeApplicationsResponse.class);
    }

    /**
     *本接口（DescribeInstanceNetworkStatus）用于查询实例的网络配置及消耗情况
     * @param req DescribeInstanceNetworkStatusRequest
     * @return DescribeInstanceNetworkStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNetworkStatusResponse DescribeInstanceNetworkStatus(DescribeInstanceNetworkStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNetworkStatus", DescribeInstanceNetworkStatusResponse.class);
    }

    /**
     *本接口（DescribeInstances）用户查询实例
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *获取prompt任务列表
     * @param req DescribeMuskPromptsRequest
     * @return DescribeMuskPromptsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMuskPromptsResponse DescribeMuskPrompts(DescribeMuskPromptsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMuskPrompts", DescribeMuskPromptsResponse.class);
    }

    /**
     *本接口（DescribeRegions）用于查询地域列表
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *本接口（DescribeScenes）用于查询场景
     * @param req DescribeScenesRequest
     * @return DescribeScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenesResponse DescribeScenes(DescribeScenesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenes", DescribeScenesResponse.class);
    }

    /**
     *本接口（DescribeServiceLoginSettings）用于查询服务登录配置
     * @param req DescribeServiceLoginSettingsRequest
     * @return DescribeServiceLoginSettingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceLoginSettingsResponse DescribeServiceLoginSettings(DescribeServiceLoginSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceLoginSettings", DescribeServiceLoginSettingsResponse.class);
    }

    /**
     *本接口 (InquirePriceRunInstances) 用于实例询价。
     * @param req InquirePriceRunInstancesRequest
     * @return InquirePriceRunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRunInstancesResponse InquirePriceRunInstances(InquirePriceRunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRunInstances", InquirePriceRunInstancesResponse.class);
    }

    /**
     *本接口 (ResetInstancesPassword) 用于重置实例的用户密码。
     * @param req ResetInstancesPasswordRequest
     * @return ResetInstancesPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesPasswordResponse ResetInstancesPassword(ResetInstancesPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesPassword", ResetInstancesPasswordResponse.class);
    }

    /**
     *本接口 (RunInstances) 用于创建一个或多个指定配置的实例。
     * @param req RunInstancesRequest
     * @return RunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunInstancesResponse RunInstances(RunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunInstances", RunInstancesResponse.class);
    }

    /**
     *本接口 (StartInstance) 用于主动启动实例。
‘运行中’、‘预付费’的实例不支持启动实例
     * @param req StartInstanceRequest
     * @return StartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartInstanceResponse StartInstance(StartInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstance", StartInstanceResponse.class);
    }

    /**
     *本接口 (StopInstance) 用于主动关闭实例。
‘已关机’、‘预付费’的实例不支持关机
     * @param req StopInstanceRequest
     * @return StopInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StopInstanceResponse StopInstance(StopInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstance", StopInstanceResponse.class);
    }

    /**
     *本接口 (TerminateInstances) 用于主动退还实例。
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

}
