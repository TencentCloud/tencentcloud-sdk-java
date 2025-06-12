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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoScalingActivitiesRequest extends AbstractModel {

    /**
    * 按照一个或者多个伸缩活动ID查询。伸缩活动ID形如：`asa-5l2ejpfo`。每次请求的上限为100。参数不支持同时指定`ActivityIds`和`Filters`。
    */
    @SerializedName("ActivityIds")
    @Expose
    private String [] ActivityIds;

    /**
    * 过滤条件。过滤字段取值范围如下：
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>按照【<strong>伸缩组ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asg-kiju7yt5</li></ul></li><li><strong>activity-status-code</strong><ul><li>按照【<strong>伸缩活动状态</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>PARTIALLY_SUCCESSFUL：活动部分成功</li><li>FAILED：活动失败</li><li>CANCELLED：活动取消</li></ul></ul></li><li><strong>activity-type</strong><ul><li>按照【<strong>伸缩活动类型</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>SCALE_OUT：扩容活动</li><li>SCALE_IN：缩容活动</li><li>ATTACH_INSTANCES：添加实例</li><li>REMOVE_INSTANCES：销毁实例</li><li>DETACH_INSTANCES：移出实例</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li><li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li><li>START_INSTANCES：开启实例</li><li>STOP_INSTANCES：关闭实例</li><li>INVOKE_COMMAND：执行命令</li></ul></ul></li><li><strong>activity-id</strong><ul><li>按照【<strong>伸缩活动ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取伸缩活动ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asa-hy6tr4ed</li></ul></li></ul>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`ActivityIds`和`Filters`。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 伸缩活动最早的开始时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 伸缩活动最晚的结束时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 按照一个或者多个伸缩活动ID查询。伸缩活动ID形如：`asa-5l2ejpfo`。每次请求的上限为100。参数不支持同时指定`ActivityIds`和`Filters`。 
     * @return ActivityIds 按照一个或者多个伸缩活动ID查询。伸缩活动ID形如：`asa-5l2ejpfo`。每次请求的上限为100。参数不支持同时指定`ActivityIds`和`Filters`。
     */
    public String [] getActivityIds() {
        return this.ActivityIds;
    }

    /**
     * Set 按照一个或者多个伸缩活动ID查询。伸缩活动ID形如：`asa-5l2ejpfo`。每次请求的上限为100。参数不支持同时指定`ActivityIds`和`Filters`。
     * @param ActivityIds 按照一个或者多个伸缩活动ID查询。伸缩活动ID形如：`asa-5l2ejpfo`。每次请求的上限为100。参数不支持同时指定`ActivityIds`和`Filters`。
     */
    public void setActivityIds(String [] ActivityIds) {
        this.ActivityIds = ActivityIds;
    }

    /**
     * Get 过滤条件。过滤字段取值范围如下：
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>按照【<strong>伸缩组ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asg-kiju7yt5</li></ul></li><li><strong>activity-status-code</strong><ul><li>按照【<strong>伸缩活动状态</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>PARTIALLY_SUCCESSFUL：活动部分成功</li><li>FAILED：活动失败</li><li>CANCELLED：活动取消</li></ul></ul></li><li><strong>activity-type</strong><ul><li>按照【<strong>伸缩活动类型</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>SCALE_OUT：扩容活动</li><li>SCALE_IN：缩容活动</li><li>ATTACH_INSTANCES：添加实例</li><li>REMOVE_INSTANCES：销毁实例</li><li>DETACH_INSTANCES：移出实例</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li><li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li><li>START_INSTANCES：开启实例</li><li>STOP_INSTANCES：关闭实例</li><li>INVOKE_COMMAND：执行命令</li></ul></ul></li><li><strong>activity-id</strong><ul><li>按照【<strong>伸缩活动ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取伸缩活动ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asa-hy6tr4ed</li></ul></li></ul>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`ActivityIds`和`Filters`。 
     * @return Filters 过滤条件。过滤字段取值范围如下：
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>按照【<strong>伸缩组ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asg-kiju7yt5</li></ul></li><li><strong>activity-status-code</strong><ul><li>按照【<strong>伸缩活动状态</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>PARTIALLY_SUCCESSFUL：活动部分成功</li><li>FAILED：活动失败</li><li>CANCELLED：活动取消</li></ul></ul></li><li><strong>activity-type</strong><ul><li>按照【<strong>伸缩活动类型</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>SCALE_OUT：扩容活动</li><li>SCALE_IN：缩容活动</li><li>ATTACH_INSTANCES：添加实例</li><li>REMOVE_INSTANCES：销毁实例</li><li>DETACH_INSTANCES：移出实例</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li><li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li><li>START_INSTANCES：开启实例</li><li>STOP_INSTANCES：关闭实例</li><li>INVOKE_COMMAND：执行命令</li></ul></ul></li><li><strong>activity-id</strong><ul><li>按照【<strong>伸缩活动ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取伸缩活动ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asa-hy6tr4ed</li></ul></li></ul>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`ActivityIds`和`Filters`。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。过滤字段取值范围如下：
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>按照【<strong>伸缩组ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asg-kiju7yt5</li></ul></li><li><strong>activity-status-code</strong><ul><li>按照【<strong>伸缩活动状态</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>PARTIALLY_SUCCESSFUL：活动部分成功</li><li>FAILED：活动失败</li><li>CANCELLED：活动取消</li></ul></ul></li><li><strong>activity-type</strong><ul><li>按照【<strong>伸缩活动类型</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>SCALE_OUT：扩容活动</li><li>SCALE_IN：缩容活动</li><li>ATTACH_INSTANCES：添加实例</li><li>REMOVE_INSTANCES：销毁实例</li><li>DETACH_INSTANCES：移出实例</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li><li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li><li>START_INSTANCES：开启实例</li><li>STOP_INSTANCES：关闭实例</li><li>INVOKE_COMMAND：执行命令</li></ul></ul></li><li><strong>activity-id</strong><ul><li>按照【<strong>伸缩活动ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取伸缩活动ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asa-hy6tr4ed</li></ul></li></ul>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`ActivityIds`和`Filters`。
     * @param Filters 过滤条件。过滤字段取值范围如下：
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>按照【<strong>伸缩组ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asg-kiju7yt5</li></ul></li><li><strong>activity-status-code</strong><ul><li>按照【<strong>伸缩活动状态</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>PARTIALLY_SUCCESSFUL：活动部分成功</li><li>FAILED：活动失败</li><li>CANCELLED：活动取消</li></ul></ul></li><li><strong>activity-type</strong><ul><li>按照【<strong>伸缩活动类型</strong>】进行过滤</li><li>类型：String</li><li>必选：否</li><li>可选项: </li><ul><li>SCALE_OUT：扩容活动</li><li>SCALE_IN：缩容活动</li><li>ATTACH_INSTANCES：添加实例</li><li>REMOVE_INSTANCES：销毁实例</li><li>DETACH_INSTANCES：移出实例</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li><li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li><li>START_INSTANCES：开启实例</li><li>STOP_INSTANCES：关闭实例</li><li>INVOKE_COMMAND：执行命令</li></ul></ul></li><li><strong>activity-id</strong><ul><li>按照【<strong>伸缩活动ID</strong>】进行过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取伸缩活动ID。</li><li>类型：String</li><li>必选：否</li><li>示例值: asa-hy6tr4ed</li></ul></li></ul>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`ActivityIds`和`Filters`。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 伸缩活动最早的开始时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return StartTime 伸缩活动最早的开始时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 伸缩活动最早的开始时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。
     * @param StartTime 伸缩活动最早的开始时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 伸缩活动最晚的结束时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return EndTime 伸缩活动最晚的结束时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 伸缩活动最晚的结束时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。
     * @param EndTime 伸缩活动最晚的结束时间，如果指定了ActivityIds，此参数将被忽略。取值为`UTC`时间，按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeAutoScalingActivitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingActivitiesRequest(DescribeAutoScalingActivitiesRequest source) {
        if (source.ActivityIds != null) {
            this.ActivityIds = new String[source.ActivityIds.length];
            for (int i = 0; i < source.ActivityIds.length; i++) {
                this.ActivityIds[i] = new String(source.ActivityIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ActivityIds.", this.ActivityIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

