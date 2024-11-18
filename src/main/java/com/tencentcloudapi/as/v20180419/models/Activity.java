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

public class Activity extends AbstractModel {

    /**
    * 伸缩组ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 伸缩活动ID。
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 伸缩活动类型。取值如下：
<li>SCALE_OUT：扩容活动</li>
<li>SCALE_IN：缩容活动</li>
<li>ATTACH_INSTANCES：添加实例</li>
<li>REMOVE_INSTANCES：销毁实例</li>
<li>DETACH_INSTANCES：移出实例</li>
<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li>
<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li>
<li>START_INSTANCES：开启实例</li>
<li>STOP_INSTANCES：关闭实例</li>
<li>INVOKE_COMMAND：执行命令</li>
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * 伸缩活动状态。取值如下
<li>INIT：初始化中</li>
<li>RUNNING：运行中</li>
<li>SUCCESSFUL：活动成功</li>
<li>PARTIALLY_SUCCESSFUL：活动部分成功</li>
<li>FAILED：活动失败</li>
<li>CANCELLED：活动取消</li>
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * 伸缩活动状态描述。
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * 伸缩活动起因。
    */
    @SerializedName("Cause")
    @Expose
    private String Cause;

    /**
    * 伸缩活动描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 伸缩活动开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 伸缩活动结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 伸缩活动创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 该参数已废弃，请勿使用。
    */
    @SerializedName("ActivityRelatedInstanceSet")
    @Expose
    private ActivtyRelatedInstance [] ActivityRelatedInstanceSet;

    /**
    * 伸缩活动状态简要描述。
    */
    @SerializedName("StatusMessageSimplified")
    @Expose
    private String StatusMessageSimplified;

    /**
    * 伸缩活动中生命周期挂钩的执行结果。
    */
    @SerializedName("LifecycleActionResultSet")
    @Expose
    private LifecycleActionResultInfo [] LifecycleActionResultSet;

    /**
    * 伸缩活动状态详细描述。
    */
    @SerializedName("DetailedStatusMessageSet")
    @Expose
    private DetailedStatusMessage [] DetailedStatusMessageSet;

    /**
    * 执行命令结果。
    */
    @SerializedName("InvocationResultSet")
    @Expose
    private InvocationResult [] InvocationResultSet;

    /**
    * 伸缩活动相关实例信息集合。
    */
    @SerializedName("RelatedInstanceSet")
    @Expose
    private RelatedInstance [] RelatedInstanceSet;

    /**
     * Get 伸缩组ID。 
     * @return AutoScalingGroupId 伸缩组ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。
     * @param AutoScalingGroupId 伸缩组ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 伸缩活动ID。 
     * @return ActivityId 伸缩活动ID。
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 伸缩活动ID。
     * @param ActivityId 伸缩活动ID。
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 伸缩活动类型。取值如下：
<li>SCALE_OUT：扩容活动</li>
<li>SCALE_IN：缩容活动</li>
<li>ATTACH_INSTANCES：添加实例</li>
<li>REMOVE_INSTANCES：销毁实例</li>
<li>DETACH_INSTANCES：移出实例</li>
<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li>
<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li>
<li>START_INSTANCES：开启实例</li>
<li>STOP_INSTANCES：关闭实例</li>
<li>INVOKE_COMMAND：执行命令</li> 
     * @return ActivityType 伸缩活动类型。取值如下：
<li>SCALE_OUT：扩容活动</li>
<li>SCALE_IN：缩容活动</li>
<li>ATTACH_INSTANCES：添加实例</li>
<li>REMOVE_INSTANCES：销毁实例</li>
<li>DETACH_INSTANCES：移出实例</li>
<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li>
<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li>
<li>START_INSTANCES：开启实例</li>
<li>STOP_INSTANCES：关闭实例</li>
<li>INVOKE_COMMAND：执行命令</li>
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 伸缩活动类型。取值如下：
<li>SCALE_OUT：扩容活动</li>
<li>SCALE_IN：缩容活动</li>
<li>ATTACH_INSTANCES：添加实例</li>
<li>REMOVE_INSTANCES：销毁实例</li>
<li>DETACH_INSTANCES：移出实例</li>
<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li>
<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li>
<li>START_INSTANCES：开启实例</li>
<li>STOP_INSTANCES：关闭实例</li>
<li>INVOKE_COMMAND：执行命令</li>
     * @param ActivityType 伸缩活动类型。取值如下：
<li>SCALE_OUT：扩容活动</li>
<li>SCALE_IN：缩容活动</li>
<li>ATTACH_INSTANCES：添加实例</li>
<li>REMOVE_INSTANCES：销毁实例</li>
<li>DETACH_INSTANCES：移出实例</li>
<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁</li>
<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例</li>
<li>START_INSTANCES：开启实例</li>
<li>STOP_INSTANCES：关闭实例</li>
<li>INVOKE_COMMAND：执行命令</li>
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 伸缩活动状态。取值如下
<li>INIT：初始化中</li>
<li>RUNNING：运行中</li>
<li>SUCCESSFUL：活动成功</li>
<li>PARTIALLY_SUCCESSFUL：活动部分成功</li>
<li>FAILED：活动失败</li>
<li>CANCELLED：活动取消</li> 
     * @return StatusCode 伸缩活动状态。取值如下
<li>INIT：初始化中</li>
<li>RUNNING：运行中</li>
<li>SUCCESSFUL：活动成功</li>
<li>PARTIALLY_SUCCESSFUL：活动部分成功</li>
<li>FAILED：活动失败</li>
<li>CANCELLED：活动取消</li>
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 伸缩活动状态。取值如下
<li>INIT：初始化中</li>
<li>RUNNING：运行中</li>
<li>SUCCESSFUL：活动成功</li>
<li>PARTIALLY_SUCCESSFUL：活动部分成功</li>
<li>FAILED：活动失败</li>
<li>CANCELLED：活动取消</li>
     * @param StatusCode 伸缩活动状态。取值如下
<li>INIT：初始化中</li>
<li>RUNNING：运行中</li>
<li>SUCCESSFUL：活动成功</li>
<li>PARTIALLY_SUCCESSFUL：活动部分成功</li>
<li>FAILED：活动失败</li>
<li>CANCELLED：活动取消</li>
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 伸缩活动状态描述。 
     * @return StatusMessage 伸缩活动状态描述。
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set 伸缩活动状态描述。
     * @param StatusMessage 伸缩活动状态描述。
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get 伸缩活动起因。 
     * @return Cause 伸缩活动起因。
     */
    public String getCause() {
        return this.Cause;
    }

    /**
     * Set 伸缩活动起因。
     * @param Cause 伸缩活动起因。
     */
    public void setCause(String Cause) {
        this.Cause = Cause;
    }

    /**
     * Get 伸缩活动描述。 
     * @return Description 伸缩活动描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 伸缩活动描述。
     * @param Description 伸缩活动描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 伸缩活动开始时间。 
     * @return StartTime 伸缩活动开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 伸缩活动开始时间。
     * @param StartTime 伸缩活动开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 伸缩活动结束时间。 
     * @return EndTime 伸缩活动结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 伸缩活动结束时间。
     * @param EndTime 伸缩活动结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 伸缩活动创建时间。 
     * @return CreatedTime 伸缩活动创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 伸缩活动创建时间。
     * @param CreatedTime 伸缩活动创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 该参数已废弃，请勿使用。 
     * @return ActivityRelatedInstanceSet 该参数已废弃，请勿使用。
     * @deprecated
     */
    @Deprecated
    public ActivtyRelatedInstance [] getActivityRelatedInstanceSet() {
        return this.ActivityRelatedInstanceSet;
    }

    /**
     * Set 该参数已废弃，请勿使用。
     * @param ActivityRelatedInstanceSet 该参数已废弃，请勿使用。
     * @deprecated
     */
    @Deprecated
    public void setActivityRelatedInstanceSet(ActivtyRelatedInstance [] ActivityRelatedInstanceSet) {
        this.ActivityRelatedInstanceSet = ActivityRelatedInstanceSet;
    }

    /**
     * Get 伸缩活动状态简要描述。 
     * @return StatusMessageSimplified 伸缩活动状态简要描述。
     */
    public String getStatusMessageSimplified() {
        return this.StatusMessageSimplified;
    }

    /**
     * Set 伸缩活动状态简要描述。
     * @param StatusMessageSimplified 伸缩活动状态简要描述。
     */
    public void setStatusMessageSimplified(String StatusMessageSimplified) {
        this.StatusMessageSimplified = StatusMessageSimplified;
    }

    /**
     * Get 伸缩活动中生命周期挂钩的执行结果。 
     * @return LifecycleActionResultSet 伸缩活动中生命周期挂钩的执行结果。
     */
    public LifecycleActionResultInfo [] getLifecycleActionResultSet() {
        return this.LifecycleActionResultSet;
    }

    /**
     * Set 伸缩活动中生命周期挂钩的执行结果。
     * @param LifecycleActionResultSet 伸缩活动中生命周期挂钩的执行结果。
     */
    public void setLifecycleActionResultSet(LifecycleActionResultInfo [] LifecycleActionResultSet) {
        this.LifecycleActionResultSet = LifecycleActionResultSet;
    }

    /**
     * Get 伸缩活动状态详细描述。 
     * @return DetailedStatusMessageSet 伸缩活动状态详细描述。
     */
    public DetailedStatusMessage [] getDetailedStatusMessageSet() {
        return this.DetailedStatusMessageSet;
    }

    /**
     * Set 伸缩活动状态详细描述。
     * @param DetailedStatusMessageSet 伸缩活动状态详细描述。
     */
    public void setDetailedStatusMessageSet(DetailedStatusMessage [] DetailedStatusMessageSet) {
        this.DetailedStatusMessageSet = DetailedStatusMessageSet;
    }

    /**
     * Get 执行命令结果。 
     * @return InvocationResultSet 执行命令结果。
     */
    public InvocationResult [] getInvocationResultSet() {
        return this.InvocationResultSet;
    }

    /**
     * Set 执行命令结果。
     * @param InvocationResultSet 执行命令结果。
     */
    public void setInvocationResultSet(InvocationResult [] InvocationResultSet) {
        this.InvocationResultSet = InvocationResultSet;
    }

    /**
     * Get 伸缩活动相关实例信息集合。 
     * @return RelatedInstanceSet 伸缩活动相关实例信息集合。
     */
    public RelatedInstance [] getRelatedInstanceSet() {
        return this.RelatedInstanceSet;
    }

    /**
     * Set 伸缩活动相关实例信息集合。
     * @param RelatedInstanceSet 伸缩活动相关实例信息集合。
     */
    public void setRelatedInstanceSet(RelatedInstance [] RelatedInstanceSet) {
        this.RelatedInstanceSet = RelatedInstanceSet;
    }

    public Activity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Activity(Activity source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new String(source.StatusCode);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
        if (source.Cause != null) {
            this.Cause = new String(source.Cause);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ActivityRelatedInstanceSet != null) {
            this.ActivityRelatedInstanceSet = new ActivtyRelatedInstance[source.ActivityRelatedInstanceSet.length];
            for (int i = 0; i < source.ActivityRelatedInstanceSet.length; i++) {
                this.ActivityRelatedInstanceSet[i] = new ActivtyRelatedInstance(source.ActivityRelatedInstanceSet[i]);
            }
        }
        if (source.StatusMessageSimplified != null) {
            this.StatusMessageSimplified = new String(source.StatusMessageSimplified);
        }
        if (source.LifecycleActionResultSet != null) {
            this.LifecycleActionResultSet = new LifecycleActionResultInfo[source.LifecycleActionResultSet.length];
            for (int i = 0; i < source.LifecycleActionResultSet.length; i++) {
                this.LifecycleActionResultSet[i] = new LifecycleActionResultInfo(source.LifecycleActionResultSet[i]);
            }
        }
        if (source.DetailedStatusMessageSet != null) {
            this.DetailedStatusMessageSet = new DetailedStatusMessage[source.DetailedStatusMessageSet.length];
            for (int i = 0; i < source.DetailedStatusMessageSet.length; i++) {
                this.DetailedStatusMessageSet[i] = new DetailedStatusMessage(source.DetailedStatusMessageSet[i]);
            }
        }
        if (source.InvocationResultSet != null) {
            this.InvocationResultSet = new InvocationResult[source.InvocationResultSet.length];
            for (int i = 0; i < source.InvocationResultSet.length; i++) {
                this.InvocationResultSet[i] = new InvocationResult(source.InvocationResultSet[i]);
            }
        }
        if (source.RelatedInstanceSet != null) {
            this.RelatedInstanceSet = new RelatedInstance[source.RelatedInstanceSet.length];
            for (int i = 0; i < source.RelatedInstanceSet.length; i++) {
                this.RelatedInstanceSet[i] = new RelatedInstance(source.RelatedInstanceSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "Cause", this.Cause);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "ActivityRelatedInstanceSet.", this.ActivityRelatedInstanceSet);
        this.setParamSimple(map, prefix + "StatusMessageSimplified", this.StatusMessageSimplified);
        this.setParamArrayObj(map, prefix + "LifecycleActionResultSet.", this.LifecycleActionResultSet);
        this.setParamArrayObj(map, prefix + "DetailedStatusMessageSet.", this.DetailedStatusMessageSet);
        this.setParamArrayObj(map, prefix + "InvocationResultSet.", this.InvocationResultSet);
        this.setParamArrayObj(map, prefix + "RelatedInstanceSet.", this.RelatedInstanceSet);

    }
}

