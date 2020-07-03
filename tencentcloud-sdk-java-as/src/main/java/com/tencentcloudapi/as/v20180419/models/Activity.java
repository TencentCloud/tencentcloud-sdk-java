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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Activity extends AbstractModel{

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
    * 伸缩活动类型。取值如下：<br>
<li>SCALE_OUT：扩容活动<li>SCALE_IN：缩容活动<li>ATTACH_INSTANCES：添加实例<li>REMOVE_INSTANCES：销毁实例<li>DETACH_INSTANCES：移出实例<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例
<li>START_INSTANCES：开启实例
<li>STOP_INSTANCES：关闭实例
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * 伸缩活动状态。取值如下：<br>
<li>INIT：初始化中
<li>RUNNING：运行中
<li>SUCCESSFUL：活动成功
<li>PARTIALLY_SUCCESSFUL：活动部分成功
<li>FAILED：活动失败
<li>CANCELLED：活动取消
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
    * 伸缩活动相关实例信息集合。
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
     * Get 伸缩活动类型。取值如下：<br>
<li>SCALE_OUT：扩容活动<li>SCALE_IN：缩容活动<li>ATTACH_INSTANCES：添加实例<li>REMOVE_INSTANCES：销毁实例<li>DETACH_INSTANCES：移出实例<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例
<li>START_INSTANCES：开启实例
<li>STOP_INSTANCES：关闭实例 
     * @return ActivityType 伸缩活动类型。取值如下：<br>
<li>SCALE_OUT：扩容活动<li>SCALE_IN：缩容活动<li>ATTACH_INSTANCES：添加实例<li>REMOVE_INSTANCES：销毁实例<li>DETACH_INSTANCES：移出实例<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例
<li>START_INSTANCES：开启实例
<li>STOP_INSTANCES：关闭实例
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 伸缩活动类型。取值如下：<br>
<li>SCALE_OUT：扩容活动<li>SCALE_IN：缩容活动<li>ATTACH_INSTANCES：添加实例<li>REMOVE_INSTANCES：销毁实例<li>DETACH_INSTANCES：移出实例<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例
<li>START_INSTANCES：开启实例
<li>STOP_INSTANCES：关闭实例
     * @param ActivityType 伸缩活动类型。取值如下：<br>
<li>SCALE_OUT：扩容活动<li>SCALE_IN：缩容活动<li>ATTACH_INSTANCES：添加实例<li>REMOVE_INSTANCES：销毁实例<li>DETACH_INSTANCES：移出实例<li>TERMINATE_INSTANCES_UNEXPECTEDLY：实例在CVM控制台被销毁<li>REPLACE_UNHEALTHY_INSTANCE：替换不健康实例
<li>START_INSTANCES：开启实例
<li>STOP_INSTANCES：关闭实例
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 伸缩活动状态。取值如下：<br>
<li>INIT：初始化中
<li>RUNNING：运行中
<li>SUCCESSFUL：活动成功
<li>PARTIALLY_SUCCESSFUL：活动部分成功
<li>FAILED：活动失败
<li>CANCELLED：活动取消 
     * @return StatusCode 伸缩活动状态。取值如下：<br>
<li>INIT：初始化中
<li>RUNNING：运行中
<li>SUCCESSFUL：活动成功
<li>PARTIALLY_SUCCESSFUL：活动部分成功
<li>FAILED：活动失败
<li>CANCELLED：活动取消
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 伸缩活动状态。取值如下：<br>
<li>INIT：初始化中
<li>RUNNING：运行中
<li>SUCCESSFUL：活动成功
<li>PARTIALLY_SUCCESSFUL：活动部分成功
<li>FAILED：活动失败
<li>CANCELLED：活动取消
     * @param StatusCode 伸缩活动状态。取值如下：<br>
<li>INIT：初始化中
<li>RUNNING：运行中
<li>SUCCESSFUL：活动成功
<li>PARTIALLY_SUCCESSFUL：活动部分成功
<li>FAILED：活动失败
<li>CANCELLED：活动取消
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
     * Get 伸缩活动相关实例信息集合。 
     * @return ActivityRelatedInstanceSet 伸缩活动相关实例信息集合。
     */
    public ActivtyRelatedInstance [] getActivityRelatedInstanceSet() {
        return this.ActivityRelatedInstanceSet;
    }

    /**
     * Set 伸缩活动相关实例信息集合。
     * @param ActivityRelatedInstanceSet 伸缩活动相关实例信息集合。
     */
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

    }
}

