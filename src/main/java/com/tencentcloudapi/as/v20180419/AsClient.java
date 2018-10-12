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
package com.tencentcloudapi.as.v20180419;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.as.v20180419.models.*;

public class AsClient extends AbstractClient{
    private static String endpoint = "as.tencentcloudapi.com";
    private static String version = "2018-04-19";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public AsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public AsClient(Credential credential, String region, ClientProfile profile) {
        super(AsClient.endpoint, AsClient.version, credential, region, profile);
    }

    /**
     *本接口（AttachInstances）用于将 CVM 实例添加到伸缩组。

     * @param req AttachInstancesRequest
     * @return AttachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachInstancesResponse  AttachInstances(AttachInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAutoScalingGroup）用于创建伸缩组
     * @param req CreateAutoScalingGroupRequest
     * @return CreateAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalingGroupResponse  CreateAutoScalingGroup(CreateAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateLaunchConfiguration）用于创建新的启动配置。

* 启动配置无法编辑更改。如需使用新的启动配置，只能重新创建启动配置。

* 每个项目最多只能创建20个启动配置，详见[使用限制](https://cloud.tencent.com/document/product/377/3120)。

     * @param req CreateLaunchConfigurationRequest
     * @return CreateLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaunchConfigurationResponse  CreateLaunchConfiguration(CreateLaunchConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLaunchConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLaunchConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLaunchConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateScheduledAction）用于创建定时任务。
     * @param req CreateScheduledActionRequest
     * @return CreateScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduledActionResponse  CreateScheduledAction(CreateScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScheduledActionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScheduledActionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateScheduledAction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAutoScalingGroup）用于删除指定伸缩组，删除前提是伸缩组内无实例且当前未在执行伸缩活动。
     * @param req DeleteAutoScalingGroupRequest
     * @return DeleteAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScalingGroupResponse  DeleteAutoScalingGroup(DeleteAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteLaunchConfiguration）用于删除启动配置。

* 若启动配置在伸缩组中属于生效状态，则该启动配置不允许删除。

     * @param req DeleteLaunchConfigurationRequest
     * @return DeleteLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaunchConfigurationResponse  DeleteLaunchConfiguration(DeleteLaunchConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLaunchConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLaunchConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLaunchConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteScheduledAction）用于删除特定的定时任务。
     * @param req DeleteScheduledActionRequest
     * @return DeleteScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduledActionResponse  DeleteScheduledAction(DeleteScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScheduledActionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScheduledActionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteScheduledAction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAccountLimits）用于查询用户账户在弹性伸缩中的资源限制。
     * @param req DescribeAccountLimitsRequest
     * @return DescribeAccountLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountLimitsResponse  DescribeAccountLimits(DescribeAccountLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountLimitsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountLimitsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccountLimits"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAutoScalingGroups）用于查询伸缩组信息。
     * @param req DescribeAutoScalingGroupsRequest
     * @return DescribeAutoScalingGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingGroupsResponse  DescribeAutoScalingGroups(DescribeAutoScalingGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoScalingGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAutoScalingGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAutoScalingInstances）用于查询弹性伸缩关联实例的信息。


     * @param req DescribeAutoScalingInstancesRequest
     * @return DescribeAutoScalingInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingInstancesResponse  DescribeAutoScalingInstances(DescribeAutoScalingInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoScalingInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAutoScalingInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeLaunchConfigurations）用于查询启动配置的信息。
     * @param req DescribeLaunchConfigurationsRequest
     * @return DescribeLaunchConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaunchConfigurationsResponse  DescribeLaunchConfigurations(DescribeLaunchConfigurationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLaunchConfigurationsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLaunchConfigurationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLaunchConfigurations"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeScheduledActions) 用于查询一个或多个定时任务的详细信息。

* 可以根据定时任务ID、定时任务名称或者伸缩组ID等信息来查询定时任务的详细信息。过滤信息详细请见过滤器Filter。
* 如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的定时任务。
     * @param req DescribeScheduledActionsRequest
     * @return DescribeScheduledActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduledActionsResponse  DescribeScheduledActions(DescribeScheduledActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScheduledActionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScheduledActionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeScheduledActions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DettachInstances）用于从伸缩组移出 CVM 实例，本接口不会被销毁实例。
     * @param req DetachInstancesRequest
     * @return DetachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachInstancesResponse  DetachInstances(DetachInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisableAutoScalingGroup）用于停用指定伸缩组。
     * @param req DisableAutoScalingGroupRequest
     * @return DisableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DisableAutoScalingGroupResponse  DisableAutoScalingGroup(DisableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（EnableAutoScalingGroup）用于启用指定伸缩组。
     * @param req EnableAutoScalingGroupRequest
     * @return EnableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public EnableAutoScalingGroupResponse  EnableAutoScalingGroup(EnableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAutoScalingGroup）用于修改伸缩组。
     * @param req ModifyAutoScalingGroupRequest
     * @return ModifyAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScalingGroupResponse  ModifyAutoScalingGroup(ModifyAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDesiredCapacity）用于修改指定伸缩组的期望实例数
     * @param req ModifyDesiredCapacityRequest
     * @return ModifyDesiredCapacityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDesiredCapacityResponse  ModifyDesiredCapacity(ModifyDesiredCapacityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDesiredCapacityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDesiredCapacityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDesiredCapacity"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyScheduledAction）用于修改定时任务。
     * @param req ModifyScheduledActionRequest
     * @return ModifyScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduledActionResponse  ModifyScheduledAction(ModifyScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyScheduledActionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyScheduledActionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyScheduledAction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RemoveInstances）用于从伸缩组删除 CVM 实例。根据当前的产品逻辑，如果实例由弹性伸缩自动创建，则实例会被销毁；如果实例系创建后加入伸缩组的，则会从伸缩组中移除，保留实例。
     * @param req RemoveInstancesRequest
     * @return RemoveInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveInstancesResponse  RemoveInstances(RemoveInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemoveInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
