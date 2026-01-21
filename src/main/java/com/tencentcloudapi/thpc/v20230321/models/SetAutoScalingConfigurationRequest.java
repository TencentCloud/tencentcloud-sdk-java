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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetAutoScalingConfigurationRequest extends AbstractModel {

    /**
    * <p>集群ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。</p>
    */
    @SerializedName("ExpansionBusyTime")
    @Expose
    private Long ExpansionBusyTime;

    /**
    * <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。</p>
    */
    @SerializedName("ShrinkIdleTime")
    @Expose
    private Long ShrinkIdleTime;

    /**
    * <p>扩容队列配置列表。</p>
    */
    @SerializedName("QueueConfigs")
    @Expose
    private QueueConfig [] QueueConfigs;

    /**
    * <p>是否只预检此次请求。<br>true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId。<br>false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get <p>集群ID。</p> 
     * @return ClusterId <p>集群ID。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID。</p>
     * @param ClusterId <p>集群ID。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。</p> 
     * @return ExpansionBusyTime <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。</p>
     */
    public Long getExpansionBusyTime() {
        return this.ExpansionBusyTime;
    }

    /**
     * Set <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。</p>
     * @param ExpansionBusyTime <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。默认值120。</p>
     */
    public void setExpansionBusyTime(Long ExpansionBusyTime) {
        this.ExpansionBusyTime = ExpansionBusyTime;
    }

    /**
     * Get <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。</p> 
     * @return ShrinkIdleTime <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。</p>
     */
    public Long getShrinkIdleTime() {
        return this.ShrinkIdleTime;
    }

    /**
     * Set <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。</p>
     * @param ShrinkIdleTime <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。单位秒。默认值300。</p>
     */
    public void setShrinkIdleTime(Long ShrinkIdleTime) {
        this.ShrinkIdleTime = ShrinkIdleTime;
    }

    /**
     * Get <p>扩容队列配置列表。</p> 
     * @return QueueConfigs <p>扩容队列配置列表。</p>
     */
    public QueueConfig [] getQueueConfigs() {
        return this.QueueConfigs;
    }

    /**
     * Set <p>扩容队列配置列表。</p>
     * @param QueueConfigs <p>扩容队列配置列表。</p>
     */
    public void setQueueConfigs(QueueConfig [] QueueConfigs) {
        this.QueueConfigs = QueueConfigs;
    }

    /**
     * Get <p>是否只预检此次请求。<br>true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId。<br>false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。</p> 
     * @return DryRun <p>是否只预检此次请求。<br>true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId。<br>false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>是否只预检此次请求。<br>true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId。<br>false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。</p>
     * @param DryRun <p>是否只预检此次请求。<br>true：发送检查请求，不会绑定弹性伸缩组。检查项包括是否填写了必需参数，请求格式，业务限制。<br>如果检查不通过，则返回对应错误码；<br>如果检查通过，则返回RequestId。<br>false（默认）：发送正常请求，通过检查后直接绑定弹性伸缩组。</p>
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

