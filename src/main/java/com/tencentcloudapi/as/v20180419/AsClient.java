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
    private static String service = "as";
    private static String version = "2018-04-19";
    
    public AsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AsClient(Credential credential, String region, ClientProfile profile) {
        super(AsClient.endpoint, AsClient.version, credential, region, profile);
    }

    /**
     *本接口（AttachInstances）用于将 CVM 实例添加到伸缩组。
* 仅支持添加处于`RUNNING`（运行中）或`STOPPED`（已关机）状态的 CVM 实例
* 添加的 CVM 实例需要和伸缩组 VPC 网络一致
     * @param req AttachInstancesRequest
     * @return AttachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachInstancesResponse AttachInstances(AttachInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachInstances", AttachInstancesResponse.class);
    }

    /**
     *此接口（AttachLoadBalancers）用于将负载均衡器添加到伸缩组。
     * @param req AttachLoadBalancersRequest
     * @return AttachLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public AttachLoadBalancersResponse AttachLoadBalancers(AttachLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachLoadBalancers", AttachLoadBalancersResponse.class);
    }

    /**
     *取消伸缩组的实例刷新活动。
* 已刷新的批次不受影响，待刷新批次被取消
* 如存在正在刷新的批次，不允许取消；可先暂停活动，等待当前批次结束后再取消
* 刷新失败的实例保持备用中状态，需用户手动处理后尝试退出备用中状态或销毁
* 取消后不允许回滚操作，也不支持恢复操作
* 因 maxSurge 参数而临时扩容的实例在取消后会自动销毁
* 进行缩容时，所有实例都已经更新完成，此时无法取消
     * @param req CancelInstanceRefreshRequest
     * @return CancelInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public CancelInstanceRefreshResponse CancelInstanceRefresh(CancelInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelInstanceRefresh", CancelInstanceRefreshResponse.class);
    }

    /**
     *本接口（ClearLaunchConfigurationAttributes）用于将启动配置内的特定属性完全清空。
     * @param req ClearLaunchConfigurationAttributesRequest
     * @return ClearLaunchConfigurationAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ClearLaunchConfigurationAttributesResponse ClearLaunchConfigurationAttributes(ClearLaunchConfigurationAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearLaunchConfigurationAttributes", ClearLaunchConfigurationAttributesResponse.class);
    }

    /**
     *本接口（CompleteLifecycleAction）用于完成生命周期动作。

* 用户通过调用本接口，指定一个具体的生命周期挂钩的结果（“CONITNUE”或者“ABANDON”）。如果一直不调用本接口，则生命周期挂钩会在超时后按照“DefaultResult”进行处理。
     * @param req CompleteLifecycleActionRequest
     * @return CompleteLifecycleActionResponse
     * @throws TencentCloudSDKException
     */
    public CompleteLifecycleActionResponse CompleteLifecycleAction(CompleteLifecycleActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteLifecycleAction", CompleteLifecycleActionResponse.class);
    }

    /**
     *本接口（CreateAutoScalingGroup）用于创建伸缩组
     * @param req CreateAutoScalingGroupRequest
     * @return CreateAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalingGroupResponse CreateAutoScalingGroup(CreateAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoScalingGroup", CreateAutoScalingGroupResponse.class);
    }

    /**
     *本接口（CreateAutoScalingGroupFromInstance）用于根据实例创建启动配置及伸缩组。

说明：根据按包年包月计费的实例所创建的伸缩组，其扩容的实例为按量计费实例。
     * @param req CreateAutoScalingGroupFromInstanceRequest
     * @return CreateAutoScalingGroupFromInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalingGroupFromInstanceResponse CreateAutoScalingGroupFromInstance(CreateAutoScalingGroupFromInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoScalingGroupFromInstance", CreateAutoScalingGroupFromInstanceResponse.class);
    }

    /**
     *本接口（CreateLaunchConfiguration）用于创建新的启动配置。

* 启动配置，可以通过 `ModifyLaunchConfigurationAttributes` 修改少量字段。如需使用新的启动配置，建议重新创建启动配置。

* 每个项目最多只能创建20个启动配置，详见[使用限制](https://cloud.tencent.com/document/product/377/3120)。
     * @param req CreateLaunchConfigurationRequest
     * @return CreateLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaunchConfigurationResponse CreateLaunchConfiguration(CreateLaunchConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLaunchConfiguration", CreateLaunchConfigurationResponse.class);
    }

    /**
     *本接口（CreateLifecycleHook）用于创建生命周期挂钩。

* 您可以为生命周期挂钩配置消息通知或执行自动化助手命令。

如果您配置了通知消息，弹性伸缩会通知您的TDMQ消息队列，通知内容形如：

```
{
	"Service": "Tencent Cloud Auto Scaling",
	"Time": "2019-03-14T10:15:11Z",
	"AppId": "1251783334",
	"ActivityId": "asa-fznnvrja",
	"AutoScalingGroupId": "asg-rrrrtttt",
	"LifecycleHookId": "ash-xxxxyyyy",
	"LifecycleHookName": "my-hook",
	"LifecycleActionToken": "3080e1c9-0efe-4dd7-ad3b-90cd6618298f",
	"InstanceId": "ins-aaaabbbb",
	"LifecycleTransition": "INSTANCE_LAUNCHING",
	"NotificationMetadata": ""
}
```
     * @param req CreateLifecycleHookRequest
     * @return CreateLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifecycleHookResponse CreateLifecycleHook(CreateLifecycleHookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLifecycleHook", CreateLifecycleHookResponse.class);
    }

    /**
     *本接口（CreateNotificationConfiguration）用于创建通知。
通知到 CMQ 主题或队列时，消息内容如下：
```
{
    "Service": "Tencent Cloud Auto Scaling",
    "CreatedTime": "2021-10-11T10:15:11Z", // 活动创建时间
    "AppId": "100000000",
    "ActivityId": "asa-fznnvrja", // 伸缩活动ID
    "AutoScalingGroupId": "asg-pc2oqu2z", // 伸缩组ID
    "ActivityType": "SCALE_OUT",  // 伸缩活动类型
    "StatusCode": "SUCCESSFUL",   // 伸缩活动结果
    "Description": "Activity was launched in response to a difference between desired capacity and actual capacity,
    scale out 1 instance(s).", // 伸缩活动描述
    "StartTime": "2021-10-11T10:15:11Z",  // 活动开始时间
    "EndTime": "2021-10-11T10:15:32Z",    // 活动结束时间
    "DetailedStatusMessageSet": [ // 活动内部错误集合（非空不代表活动失败）
        {
            "Code": "InvalidInstanceType",
            "Zone": "ap-guangzhou-2",
            "InstanceId": "",
            "InstanceChargeType": "POSTPAID_BY_HOUR",
            "SubnetId": "subnet-4t5mgeuu",
            "Message": "The specified instance type `S5.LARGE8` is invalid in `subnet-4t5mgeuu`, `ap-guangzhou-2`.",
            "InstanceType": "S5.LARGE8"
        }
    ]
}
```
     * @param req CreateNotificationConfigurationRequest
     * @return CreateNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotificationConfigurationResponse CreateNotificationConfiguration(CreateNotificationConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotificationConfiguration", CreateNotificationConfigurationResponse.class);
    }

    /**
     *本接口（CreateScalingPolicy）用于创建告警触发策略。
     * @param req CreateScalingPolicyRequest
     * @return CreateScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateScalingPolicyResponse CreateScalingPolicy(CreateScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScalingPolicy", CreateScalingPolicyResponse.class);
    }

    /**
     *本接口（CreateScheduledAction）用于创建定时任务。
     * @param req CreateScheduledActionRequest
     * @return CreateScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduledActionResponse CreateScheduledAction(CreateScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScheduledAction", CreateScheduledActionResponse.class);
    }

    /**
     *本接口（DeleteAutoScalingGroup）用于删除指定伸缩组，删除前提是伸缩组内无运行中（IN_SERVICE）状态的实例且当前未在执行伸缩活动。删除伸缩组后，创建失败（CREATION_FAILED）、中止失败（TERMINATION_FAILED）、解绑失败（DETACH_FAILED）等非运行中状态的实例不会被销毁。
     * @param req DeleteAutoScalingGroupRequest
     * @return DeleteAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScalingGroupResponse DeleteAutoScalingGroup(DeleteAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoScalingGroup", DeleteAutoScalingGroupResponse.class);
    }

    /**
     *本接口（DeleteLaunchConfiguration）用于删除启动配置。

* 若启动配置在伸缩组中属于生效状态，则该启动配置不允许删除。

     * @param req DeleteLaunchConfigurationRequest
     * @return DeleteLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaunchConfigurationResponse DeleteLaunchConfiguration(DeleteLaunchConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLaunchConfiguration", DeleteLaunchConfigurationResponse.class);
    }

    /**
     *本接口（DeleteLifecycleHook）用于删除生命周期挂钩。
     * @param req DeleteLifecycleHookRequest
     * @return DeleteLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLifecycleHookResponse DeleteLifecycleHook(DeleteLifecycleHookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLifecycleHook", DeleteLifecycleHookResponse.class);
    }

    /**
     *本接口（DeleteNotificationConfiguration）用于删除特定的通知。
     * @param req DeleteNotificationConfigurationRequest
     * @return DeleteNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotificationConfigurationResponse DeleteNotificationConfiguration(DeleteNotificationConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNotificationConfiguration", DeleteNotificationConfigurationResponse.class);
    }

    /**
     *本接口（DeleteScalingPolicy）用于删除告警触发策略。
     * @param req DeleteScalingPolicyRequest
     * @return DeleteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScalingPolicyResponse DeleteScalingPolicy(DeleteScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScalingPolicy", DeleteScalingPolicyResponse.class);
    }

    /**
     *本接口（DeleteScheduledAction）用于删除特定的定时任务。
     * @param req DeleteScheduledActionRequest
     * @return DeleteScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduledActionResponse DeleteScheduledAction(DeleteScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScheduledAction", DeleteScheduledActionResponse.class);
    }

    /**
     *本接口（DescribeAccountLimits）用于查询用户账户在弹性伸缩中的资源限制。
     * @param req DescribeAccountLimitsRequest
     * @return DescribeAccountLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountLimitsResponse DescribeAccountLimits(DescribeAccountLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountLimits", DescribeAccountLimitsResponse.class);
    }

    /**
     *本接口（DescribeAutoScalingActivities）用于查询伸缩组的伸缩活动记录。
     * @param req DescribeAutoScalingActivitiesRequest
     * @return DescribeAutoScalingActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingActivitiesResponse DescribeAutoScalingActivities(DescribeAutoScalingActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingActivities", DescribeAutoScalingActivitiesResponse.class);
    }

    /**
     *此接口用于查询伸缩组配置建议。
     * @param req DescribeAutoScalingAdvicesRequest
     * @return DescribeAutoScalingAdvicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingAdvicesResponse DescribeAutoScalingAdvices(DescribeAutoScalingAdvicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingAdvices", DescribeAutoScalingAdvicesResponse.class);
    }

    /**
     *本接口（DescribeAutoScalingGroupLastActivities）用于查询伸缩组的最新一次伸缩活动记录。
     * @param req DescribeAutoScalingGroupLastActivitiesRequest
     * @return DescribeAutoScalingGroupLastActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingGroupLastActivitiesResponse DescribeAutoScalingGroupLastActivities(DescribeAutoScalingGroupLastActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingGroupLastActivities", DescribeAutoScalingGroupLastActivitiesResponse.class);
    }

    /**
     *本接口（DescribeAutoScalingGroups）用于查询伸缩组信息。

* 可以根据伸缩组ID、伸缩组名称或者启动配置ID等信息来查询伸缩组的详细信息。过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的伸缩组。
     * @param req DescribeAutoScalingGroupsRequest
     * @return DescribeAutoScalingGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingGroupsResponse DescribeAutoScalingGroups(DescribeAutoScalingGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingGroups", DescribeAutoScalingGroupsResponse.class);
    }

    /**
     *本接口（DescribeAutoScalingInstances）用于查询弹性伸缩关联实例的信息。

* 可以根据实例ID、伸缩组ID等信息来查询实例的详细信息。过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的实例。
     * @param req DescribeAutoScalingInstancesRequest
     * @return DescribeAutoScalingInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingInstancesResponse DescribeAutoScalingInstances(DescribeAutoScalingInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingInstances", DescribeAutoScalingInstancesResponse.class);
    }

    /**
     *本接口（DescribeLaunchConfigurations）用于查询启动配置的信息。

* 可以根据启动配置ID、启动配置名称等信息来查询启动配置的详细信息。过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的启动配置。
     * @param req DescribeLaunchConfigurationsRequest
     * @return DescribeLaunchConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaunchConfigurationsResponse DescribeLaunchConfigurations(DescribeLaunchConfigurationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLaunchConfigurations", DescribeLaunchConfigurationsResponse.class);
    }

    /**
     *本接口（DescribeLifecycleHooks）用于查询生命周期挂钩信息。

* 可以根据伸缩组ID、生命周期挂钩ID或者生命周期挂钩名称等信息来查询生命周期挂钩的详细信息。过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的生命周期挂钩。
     * @param req DescribeLifecycleHooksRequest
     * @return DescribeLifecycleHooksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLifecycleHooksResponse DescribeLifecycleHooks(DescribeLifecycleHooksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLifecycleHooks", DescribeLifecycleHooksResponse.class);
    }

    /**
     *本接口 (DescribeNotificationConfigurations) 用于查询一个或多个通知的详细信息。

可以根据通知ID、伸缩组ID等信息来查询通知的详细信息。过滤信息详细请见过滤器`Filter`。
如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的通知。
     * @param req DescribeNotificationConfigurationsRequest
     * @return DescribeNotificationConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotificationConfigurationsResponse DescribeNotificationConfigurations(DescribeNotificationConfigurationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotificationConfigurations", DescribeNotificationConfigurationsResponse.class);
    }

    /**
     *本接口（DescribeRefreshActivities）用于查询伸缩组的实例刷新活动记录。
     * @param req DescribeRefreshActivitiesRequest
     * @return DescribeRefreshActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRefreshActivitiesResponse DescribeRefreshActivities(DescribeRefreshActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRefreshActivities", DescribeRefreshActivitiesResponse.class);
    }

    /**
     *本接口（DescribeScalingPolicies）用于查询告警触发策略。
     * @param req DescribeScalingPoliciesRequest
     * @return DescribeScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScalingPoliciesResponse DescribeScalingPolicies(DescribeScalingPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScalingPolicies", DescribeScalingPoliciesResponse.class);
    }

    /**
     *本接口 (DescribeScheduledActions) 用于查询一个或多个定时任务的详细信息。

* 可以根据定时任务ID、定时任务名称或者伸缩组ID等信息来查询定时任务的详细信息。过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的定时任务。
     * @param req DescribeScheduledActionsRequest
     * @return DescribeScheduledActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduledActionsResponse DescribeScheduledActions(DescribeScheduledActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScheduledActions", DescribeScheduledActionsResponse.class);
    }

    /**
     *本接口（DetachInstances）用于从伸缩组移出 CVM 实例，本接口不会销毁实例。
* 如果移出指定实例后，伸缩组内处于`IN_SERVICE`状态的实例数量小于伸缩组最小值，接口将报错
* 如果伸缩组处于`DISABLED`状态，移出操作不校验`IN_SERVICE`实例数量和最小值的关系
* 对于伸缩组配置的 CLB，实例在离开伸缩组时，AS 会进行解挂载动作
     * @param req DetachInstancesRequest
     * @return DetachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachInstancesResponse DetachInstances(DetachInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachInstances", DetachInstancesResponse.class);
    }

    /**
     *本接口（DetachLoadBalancers）用于从伸缩组移出负载均衡器，本接口不会销毁负载均衡器。
     * @param req DetachLoadBalancersRequest
     * @return DetachLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DetachLoadBalancersResponse DetachLoadBalancers(DetachLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachLoadBalancers", DetachLoadBalancersResponse.class);
    }

    /**
     *本接口（DisableAutoScalingGroup）用于停用指定伸缩组。
* 停用伸缩组后，自动触发的伸缩活动不再进行，包括：
    - 告警策略触发的伸缩活动
    - 匹配期望实例数的伸缩活动
    - 不健康实例替换活动
    - 定时任务
* 停用伸缩组后，手动触发的伸缩活动允许进行，包括：
    - 指定数量扩容实例（ScaleOutInstances）
    - 指定数量缩容实例（ScaleInInstances）
    - 从伸缩组中移出 CVM 实例（DetachInstances）
    - 从伸缩组中删除 CVM 实例（RemoveInstances）
    - 添加 CVM 实例到伸缩组（AttachInstances）
    - 关闭伸缩组内 CVM 实例（StopAutoScalingInstances）
    - 开启伸缩组内 CVM 实例（StartAutoScalingInstances）
     * @param req DisableAutoScalingGroupRequest
     * @return DisableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DisableAutoScalingGroupResponse DisableAutoScalingGroup(DisableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableAutoScalingGroup", DisableAutoScalingGroupResponse.class);
    }

    /**
     *本接口（EnableAutoScalingGroup）用于启用指定伸缩组。
     * @param req EnableAutoScalingGroupRequest
     * @return EnableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public EnableAutoScalingGroupResponse EnableAutoScalingGroup(EnableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableAutoScalingGroup", EnableAutoScalingGroupResponse.class);
    }

    /**
     *伸缩组内实例进入备用中状态。
* 备用中状态实例的 CLB 权重值为 0，不会被自动缩容、不健康替换、实例刷新操作选中
* 调用弹性伸缩开关机接口会使得备用中状态发生变化，而云服务器开关机接口不会影响
* 实例进入备用中状态后，伸缩组会尝试下调期望实例数，新期望数不会小于最小值
     * @param req EnterStandbyRequest
     * @return EnterStandbyResponse
     * @throws TencentCloudSDKException
     */
    public EnterStandbyResponse EnterStandby(EnterStandbyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnterStandby", EnterStandbyResponse.class);
    }

    /**
     *本接口（ExecuteScalingPolicy）用于执行伸缩策略。

* 可以根据伸缩策略ID执行伸缩策略。
* 伸缩策略所属伸缩组处于伸缩活动时，会拒绝执行伸缩策略。
* 本接口不支持执行目标追踪策略。
     * @param req ExecuteScalingPolicyRequest
     * @return ExecuteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteScalingPolicyResponse ExecuteScalingPolicy(ExecuteScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteScalingPolicy", ExecuteScalingPolicyResponse.class);
    }

    /**
     *伸缩组内实例退出备用中状态。
* 退出备用中状态后，实例会进入运行中状态，CLB 权重值恢复为预设值
* 调用弹性伸缩开关机接口会使得备用中状态发生变化，而云服务器开关机接口不会影响
* 实例退出备用中状态后，伸缩组会上调期望实例数，新期望数不能大于最大值
     * @param req ExitStandbyRequest
     * @return ExitStandbyResponse
     * @throws TencentCloudSDKException
     */
    public ExitStandbyResponse ExitStandby(ExitStandbyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExitStandby", ExitStandbyResponse.class);
    }

    /**
     *本接口（ModifyAutoScalingGroup）用于修改伸缩组。
     * @param req ModifyAutoScalingGroupRequest
     * @return ModifyAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScalingGroupResponse ModifyAutoScalingGroup(ModifyAutoScalingGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoScalingGroup", ModifyAutoScalingGroupResponse.class);
    }

    /**
     *本接口（ModifyDesiredCapacity）用于修改指定伸缩组的期望实例数
     * @param req ModifyDesiredCapacityRequest
     * @return ModifyDesiredCapacityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDesiredCapacityResponse ModifyDesiredCapacity(ModifyDesiredCapacityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDesiredCapacity", ModifyDesiredCapacityResponse.class);
    }

    /**
     *本接口（ModifyLaunchConfigurationAttributes）用于修改启动配置部分属性。

* 修改启动配置后，已经使用该启动配置扩容的存量实例不会发生变更，此后使用该启动配置的新增实例会按照新的配置进行扩容。
* 本接口支持修改部分简单类型。
     * @param req ModifyLaunchConfigurationAttributesRequest
     * @return ModifyLaunchConfigurationAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLaunchConfigurationAttributesResponse ModifyLaunchConfigurationAttributes(ModifyLaunchConfigurationAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLaunchConfigurationAttributes", ModifyLaunchConfigurationAttributesResponse.class);
    }

    /**
     *此接口用于修改生命周期挂钩。
     * @param req ModifyLifecycleHookRequest
     * @return ModifyLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLifecycleHookResponse ModifyLifecycleHook(ModifyLifecycleHookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLifecycleHook", ModifyLifecycleHookResponse.class);
    }

    /**
     *本接口（ModifyLoadBalancerTargetAttributes）用于修改伸缩组内负载均衡器的目标规则属性。
     * @param req ModifyLoadBalancerTargetAttributesRequest
     * @return ModifyLoadBalancerTargetAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerTargetAttributesResponse ModifyLoadBalancerTargetAttributes(ModifyLoadBalancerTargetAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerTargetAttributes", ModifyLoadBalancerTargetAttributesResponse.class);
    }

    /**
     *本接口（ModifyLoadBalancers）用于修改伸缩组的负载均衡器。

* 本接口用于为伸缩组指定新的负载均衡器配置，采用`完全覆盖`风格，无论之前配置如何，`统一按照接口参数配置为新的负载均衡器`。
* 如果要为伸缩组清空负载均衡器，则在调用本接口时仅指定伸缩组ID，不指定具体负载均衡器。
* 本接口会立即修改伸缩组的负载均衡器，并生成一个伸缩活动，异步修改存量实例的负载均衡器。
     * @param req ModifyLoadBalancersRequest
     * @return ModifyLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancersResponse ModifyLoadBalancers(ModifyLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancers", ModifyLoadBalancersResponse.class);
    }

    /**
     *本接口（ModifyNotificationConfiguration）用于修改通知。
* 通知的接收端类型不支持修改。
     * @param req ModifyNotificationConfigurationRequest
     * @return ModifyNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotificationConfigurationResponse ModifyNotificationConfiguration(ModifyNotificationConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotificationConfiguration", ModifyNotificationConfigurationResponse.class);
    }

    /**
     *本接口（ModifyScalingPolicy）用于修改告警触发策略。
     * @param req ModifyScalingPolicyRequest
     * @return ModifyScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScalingPolicyResponse ModifyScalingPolicy(ModifyScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyScalingPolicy", ModifyScalingPolicyResponse.class);
    }

    /**
     *本接口（ModifyScheduledAction）用于修改定时任务。
     * @param req ModifyScheduledActionRequest
     * @return ModifyScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduledActionResponse ModifyScheduledAction(ModifyScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyScheduledAction", ModifyScheduledActionResponse.class);
    }

    /**
     *本接口（RemoveInstances）用于从伸缩组删除 CVM 实例。根据当前的产品逻辑，如果实例由弹性伸缩自动创建，则实例会被销毁；如果实例系创建后加入伸缩组的，则会从伸缩组中移除，保留实例。
* 如果删除指定实例后，伸缩组内处于`IN_SERVICE`状态的实例数量小于伸缩组最小值，接口将报错
* 如果伸缩组处于`DISABLED`状态，删除操作不校验`IN_SERVICE`实例数量和最小值的关系
* 对于伸缩组配置的 CLB，实例在离开伸缩组时，AS 会进行解挂载动作
     * @param req RemoveInstancesRequest
     * @return RemoveInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveInstancesResponse RemoveInstances(RemoveInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveInstances", RemoveInstancesResponse.class);
    }

    /**
     *恢复暂停状态的实例刷新活动，使其重试当前批次刷新失败实例或继续刷新后续批次，非暂停状态下调用该接口无效。

- 使用 MaxSurge 参数时活动可能会处于扩容或缩容失败导致的暂停状态，也可以使用该接口重试扩缩容。
     * @param req ResumeInstanceRefreshRequest
     * @return ResumeInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public ResumeInstanceRefreshResponse ResumeInstanceRefresh(ResumeInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeInstanceRefresh", ResumeInstanceRefreshResponse.class);
    }

    /**
     *回滚操作会生成一个新的实例刷新活动，该活动也支持分批次刷新以及暂停、恢复、取消操作，接口返回回滚活动的 RefreshActivityId。
* 原活动中待刷新实例变更为已取消，忽略不存在实例，其他状态实例进入回滚流程
* 原活动中正在刷新的实例不会立刻终止，刷新结束后再执行回滚活动
* 暂停状态或最近一次成功的刷新活动支持回滚，其他状态不支持回滚
* 原活动刷新方式为重装实例时，对于 ImageId参数，会自动恢复到回滚前镜像 ID；对于 UserData、EnhancedService、LoginSettings、 HostName 参数，依然会从启动配置中读取，需用户在回滚前自行修改启动配置
* 回滚活动暂不支持 MaxSurge 参数
     * @param req RollbackInstanceRefreshRequest
     * @return RollbackInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public RollbackInstanceRefreshResponse RollbackInstanceRefresh(RollbackInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackInstanceRefresh", RollbackInstanceRefreshResponse.class);
    }

    /**
     *为伸缩组指定数量缩容实例，返回缩容活动的 ActivityId。
* 伸缩组需要未处于活动中
* 伸缩组处于停用状态时，该接口也会生效，可参考[停用伸缩组](https://cloud.tencent.com/document/api/377/20435)文档查看伸缩组停用状态的影响范围
* 根据伸缩组的`TerminationPolicies`策略，选择被缩容的实例，可参考[缩容处理](https://cloud.tencent.com/document/product/377/8563)
* 接口只会选择`IN_SERVICE`实例缩容，如果需要缩容其他状态实例，可以使用 [DetachInstances](https://cloud.tencent.com/document/api/377/20436) 或 [RemoveInstances](https://cloud.tencent.com/document/api/377/20431) 接口
* 接口会减少期望实例数，新的期望实例数需要大于等于最小实例数
* 缩容如果失败或者部分成功，最后期望实例数只会扣减实际缩容成功的实例数量
     * @param req ScaleInInstancesRequest
     * @return ScaleInInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ScaleInInstancesResponse ScaleInInstances(ScaleInInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleInInstances", ScaleInInstancesResponse.class);
    }

    /**
     *为伸缩组指定数量扩容实例，返回扩容活动的 ActivityId。
* 伸缩组需要未处于活动中
* 伸缩组处于停用状态时，该接口也会生效，可参考[停用伸缩组](https://cloud.tencent.com/document/api/377/20435)文档查看伸缩组停用状态的影响范围
* 接口会增加期望实例数，新的期望实例数需要小于等于最大实例数
* 扩容如果失败或者部分成功，最后期望实例数只会增加实际成功的实例数量
* 竞价混合模式中一次扩容可能触发多个伸缩活动，该接口仅返回第一个伸缩活动的 ActivityId
     * @param req ScaleOutInstancesRequest
     * @return ScaleOutInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstancesResponse ScaleOutInstances(ScaleOutInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstances", ScaleOutInstancesResponse.class);
    }

    /**
     *本接口（SetInstancesProtection）用于设置实例保护。
实例设置保护之后，当发生不健康替换、报警策略、期望值变更等触发缩容时，将不对此实例缩容操作。
     * @param req SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetInstancesProtectionResponse SetInstancesProtection(SetInstancesProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetInstancesProtection", SetInstancesProtectionResponse.class);
    }

    /**
     *本接口（StartAutoScalingInstances）用于开启伸缩组内 CVM 实例。
* 开机成功，实例转为`IN_SERVICE`状态后，会增加期望实例数，期望实例数不可超过设置的最大值
* 本接口支持批量操作，每次请求开机实例的上限为100
     * @param req StartAutoScalingInstancesRequest
     * @return StartAutoScalingInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartAutoScalingInstancesResponse StartAutoScalingInstances(StartAutoScalingInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartAutoScalingInstances", StartAutoScalingInstancesResponse.class);
    }

    /**
     *根据启动配置中参数，刷新伸缩组内运行中状态 CVM 实例，返回实例刷新活动的 RefreshActivityId。
* 对于重装实例的刷新方式（目前仅支持重装），重装时仅会从启动配置中获取 ImageId、UserData、EnhancedService、 HostName、LoginSettings 参数进行刷新，实例的其他参数不会刷新
* 实例刷新期间（包括暂停状态），伸缩组会被停用。不建议刷新期间修改关联启动配置，否则会影响刷新参数，造成实例配置不一致
* 滚动更新模式会分成多批次进行刷新实例，单批次中若存在刷新失败实例，活动会进入失败暂停状态
* 若待刷新实例被移出或销毁，会被标记为 NOT_FOUND 状态，不阻塞实例刷新活动
* 运行中状态实例与最新启动配置参数一致，实例也会再次刷新
     * @param req StartInstanceRefreshRequest
     * @return StartInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public StartInstanceRefreshResponse StartInstanceRefresh(StartInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstanceRefresh", StartInstanceRefreshResponse.class);
    }

    /**
     *本接口（StopAutoScalingInstances）用于关闭伸缩组内 CVM 实例。
* 关机方式采用`SOFT_FIRST`方式，表示在正常关闭失败后进行强制关闭
* 关闭`IN_SERVICE`状态的实例，会减少期望实例数，期望实例数不可低于设置的最小值
* 使用`STOP_CHARGING`选项关机，待关机的实例需要满足[关机不收费条件](https://cloud.tencent.com/document/product/213/19918)
* 本接口支持批量操作，每次请求关机实例的上限为100
     * @param req StopAutoScalingInstancesRequest
     * @return StopAutoScalingInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopAutoScalingInstancesResponse StopAutoScalingInstances(StopAutoScalingInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAutoScalingInstances", StopAutoScalingInstancesResponse.class);
    }

    /**
     *暂停正在执行的实例刷新活动。
* 暂停状态下，伸缩组也会处于停用中状态
* 当前正在更新或扩容的实例不会暂停，待更新的实例会暂停更新
* 进行缩容时，所有实例都已经更新完成，此时无法暂停
     * @param req StopInstanceRefreshRequest
     * @return StopInstanceRefreshResponse
     * @throws TencentCloudSDKException
     */
    public StopInstanceRefreshResponse StopInstanceRefresh(StopInstanceRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstanceRefresh", StopInstanceRefreshResponse.class);
    }

    /**
     *已有替代接口ModifyLaunchConfiguration。该接口存在覆盖参数风险，目前官网已隐藏

本接口（UpgradeLaunchConfiguration）用于升级启动配置。

* 本接口用于升级启动配置，采用“完全覆盖”风格，无论之前参数如何，统一按照接口参数设置为新的配置。对于非必填字段，不填写则按照默认值赋值。
* 升级修改启动配置后，已经使用该启动配置扩容的存量实例不会发生变更，此后使用该启动配置的新增实例会按照新的配置进行扩容。
     * @param req UpgradeLaunchConfigurationRequest
     * @return UpgradeLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLaunchConfigurationResponse UpgradeLaunchConfiguration(UpgradeLaunchConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeLaunchConfiguration", UpgradeLaunchConfigurationResponse.class);
    }

    /**
     *本接口（UpgradeLifecycleHook）用于升级生命周期挂钩。

* 本接口用于升级生命周期挂钩，采用“完全覆盖”风格，无论之前参数如何，统一按照接口参数设置为新的配置。对于非必填字段，不填写则按照默认值赋值。
     * @param req UpgradeLifecycleHookRequest
     * @return UpgradeLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLifecycleHookResponse UpgradeLifecycleHook(UpgradeLifecycleHookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeLifecycleHook", UpgradeLifecycleHookResponse.class);
    }

}
