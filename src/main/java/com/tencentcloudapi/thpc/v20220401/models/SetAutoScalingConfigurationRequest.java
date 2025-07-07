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
package com.tencentcloudapi.thpc.v20220401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetAutoScalingConfigurationRequest extends AbstractModel {

    /**
    * 集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * 扩容队列配置列表。
    */
    @SerializedName("QueueConfigs")
    @Expose
    private QueueConfig [] QueueConfigs;

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
     * Get 扩容队列配置列表。 
     * @return QueueConfigs 扩容队列配置列表。
     */
    public QueueConfig [] getQueueConfigs() {
        return this.QueueConfigs;
    }

    /**
     * Set 扩容队列配置列表。
     * @param QueueConfigs 扩容队列配置列表。
     */
    public void setQueueConfigs(QueueConfig [] QueueConfigs) {
        this.QueueConfigs = QueueConfigs;
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

    public SetAutoScalingConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetAutoScalingConfigurationRequest(SetAutoScalingConfigurationRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ExpansionBusyTime != null) {
            this.ExpansionBusyTime = new Long(source.ExpansionBusyTime);
        }
        if (source.ShrinkIdleTime != null) {
            this.ShrinkIdleTime = new Long(source.ShrinkIdleTime);
        }
        if (source.QueueConfigs != null) {
            this.QueueConfigs = new QueueConfig[source.QueueConfigs.length];
            for (int i = 0; i < source.QueueConfigs.length; i++) {
                this.QueueConfigs[i] = new QueueConfig(source.QueueConfigs[i]);
            }
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
        this.setParamSimple(map, prefix + "ExpansionBusyTime", this.ExpansionBusyTime);
        this.setParamSimple(map, prefix + "ShrinkIdleTime", this.ShrinkIdleTime);
        this.setParamArrayObj(map, prefix + "QueueConfigs.", this.QueueConfigs);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

