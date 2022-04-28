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
package com.tencentcloudapi.thpc.v20211109.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindAutoScalingGroupRequest extends AbstractModel{

    /**
    * 集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 弹性伸缩启动配置ID。
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * 弹性伸缩组ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 队列名称。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。
    */
    @SerializedName("ExpansionBusyTime")
    @Expose
    private Long ExpansionBusyTime;

    /**
    * 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。
    */
    @SerializedName("ShrinkIdleTime")
    @Expose
    private Long ShrinkIdleTime;

    /**
    * 是否开启自动扩容，默认值true。
    */
    @SerializedName("EnableAutoExpansion")
    @Expose
    private Boolean EnableAutoExpansion;

    /**
    * 是否开启自动缩容，默认值true。
    */
    @SerializedName("EnableAutoShrink")
    @Expose
    private Boolean EnableAutoShrink;

    /**
    * 是否只预检此次请求。
true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId。
false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 集群ID。 
     * @return ClusterId 集群ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID。
     * @param ClusterId 集群ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 弹性伸缩启动配置ID。 
     * @return LaunchConfigurationId 弹性伸缩启动配置ID。
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set 弹性伸缩启动配置ID。
     * @param LaunchConfigurationId 弹性伸缩启动配置ID。
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get 弹性伸缩组ID。 
     * @return AutoScalingGroupId 弹性伸缩组ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 弹性伸缩组ID。
     * @param AutoScalingGroupId 弹性伸缩组ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 队列名称。 
     * @return QueueName 队列名称。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称。
     * @param QueueName 队列名称。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。 
     * @return ExpansionBusyTime 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。
     */
    public Long getExpansionBusyTime() {
        return this.ExpansionBusyTime;
    }

    /**
     * Set 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。
     * @param ExpansionBusyTime 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。
     */
    public void setExpansionBusyTime(Long ExpansionBusyTime) {
        this.ExpansionBusyTime = ExpansionBusyTime;
    }

    /**
     * Get 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。 
     * @return ShrinkIdleTime 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。
     */
    public Long getShrinkIdleTime() {
        return this.ShrinkIdleTime;
    }

    /**
     * Set 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。
     * @param ShrinkIdleTime 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。
     */
    public void setShrinkIdleTime(Long ShrinkIdleTime) {
        this.ShrinkIdleTime = ShrinkIdleTime;
    }

    /**
     * Get 是否开启自动扩容，默认值true。 
     * @return EnableAutoExpansion 是否开启自动扩容，默认值true。
     */
    public Boolean getEnableAutoExpansion() {
        return this.EnableAutoExpansion;
    }

    /**
     * Set 是否开启自动扩容，默认值true。
     * @param EnableAutoExpansion 是否开启自动扩容，默认值true。
     */
    public void setEnableAutoExpansion(Boolean EnableAutoExpansion) {
        this.EnableAutoExpansion = EnableAutoExpansion;
    }

    /**
     * Get 是否开启自动缩容，默认值true。 
     * @return EnableAutoShrink 是否开启自动缩容，默认值true。
     */
    public Boolean getEnableAutoShrink() {
        return this.EnableAutoShrink;
    }

    /**
     * Set 是否开启自动缩容，默认值true。
     * @param EnableAutoShrink 是否开启自动缩容，默认值true。
     */
    public void setEnableAutoShrink(Boolean EnableAutoShrink) {
        this.EnableAutoShrink = EnableAutoShrink;
    }

    /**
     * Get 是否只预检此次请求。
true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId。
false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。 
     * @return DryRun 是否只预检此次请求。
true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId。
false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检此次请求。
true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId。
false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。
     * @param DryRun 是否只预检此次请求。
true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId。
false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public BindAutoScalingGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindAutoScalingGroupRequest(BindAutoScalingGroupRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ExpansionBusyTime != null) {
            this.ExpansionBusyTime = new Long(source.ExpansionBusyTime);
        }
        if (source.ShrinkIdleTime != null) {
            this.ShrinkIdleTime = new Long(source.ShrinkIdleTime);
        }
        if (source.EnableAutoExpansion != null) {
            this.EnableAutoExpansion = new Boolean(source.EnableAutoExpansion);
        }
        if (source.EnableAutoShrink != null) {
            this.EnableAutoShrink = new Boolean(source.EnableAutoShrink);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "ExpansionBusyTime", this.ExpansionBusyTime);
        this.setParamSimple(map, prefix + "ShrinkIdleTime", this.ShrinkIdleTime);
        this.setParamSimple(map, prefix + "EnableAutoExpansion", this.EnableAutoExpansion);
        this.setParamSimple(map, prefix + "EnableAutoShrink", this.EnableAutoShrink);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

