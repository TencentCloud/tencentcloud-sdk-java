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

public class LifecycleHook extends AbstractModel{

    /**
    * 生命周期挂钩ID
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * 生命周期挂钩名称
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 生命周期挂钩默认结果
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * 生命周期挂钩等待超时时间
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * 生命周期挂钩适用场景
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * 通知目标的附加信息
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 通知目标
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * 生命周期挂钩适用场景
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
     * Get 生命周期挂钩ID 
     * @return LifecycleHookId 生命周期挂钩ID
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set 生命周期挂钩ID
     * @param LifecycleHookId 生命周期挂钩ID
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get 生命周期挂钩名称 
     * @return LifecycleHookName 生命周期挂钩名称
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set 生命周期挂钩名称
     * @param LifecycleHookName 生命周期挂钩名称
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get 伸缩组ID 
     * @return AutoScalingGroupId 伸缩组ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID
     * @param AutoScalingGroupId 伸缩组ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 生命周期挂钩默认结果 
     * @return DefaultResult 生命周期挂钩默认结果
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set 生命周期挂钩默认结果
     * @param DefaultResult 生命周期挂钩默认结果
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get 生命周期挂钩等待超时时间 
     * @return HeartbeatTimeout 生命周期挂钩等待超时时间
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set 生命周期挂钩等待超时时间
     * @param HeartbeatTimeout 生命周期挂钩等待超时时间
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get 生命周期挂钩适用场景 
     * @return LifecycleTransition 生命周期挂钩适用场景
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set 生命周期挂钩适用场景
     * @param LifecycleTransition 生命周期挂钩适用场景
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get 通知目标的附加信息 
     * @return NotificationMetadata 通知目标的附加信息
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set 通知目标的附加信息
     * @param NotificationMetadata 通知目标的附加信息
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 通知目标 
     * @return NotificationTarget 通知目标
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set 通知目标
     * @param NotificationTarget 通知目标
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Get 生命周期挂钩适用场景 
     * @return LifecycleTransitionType 生命周期挂钩适用场景
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set 生命周期挂钩适用场景
     * @param LifecycleTransitionType 生命周期挂钩适用场景
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleHookName", this.LifecycleHookName);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);
        this.setParamSimple(map, prefix + "LifecycleTransitionType", this.LifecycleTransitionType);

    }
}

