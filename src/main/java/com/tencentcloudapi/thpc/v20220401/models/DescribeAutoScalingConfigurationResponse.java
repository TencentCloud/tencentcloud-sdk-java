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
package com.tencentcloudapi.thpc.v20220401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoScalingConfigurationResponse extends AbstractModel{

    /**
    * 集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。
    */
    @SerializedName("ExpansionBusyTime")
    @Expose
    private Long ExpansionBusyTime;

    /**
    * 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。
    */
    @SerializedName("ShrinkIdleTime")
    @Expose
    private Long ShrinkIdleTime;

    /**
    * 扩容队列配置概览列表。
    */
    @SerializedName("QueueConfigs")
    @Expose
    private QueueConfigOverview [] QueueConfigs;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。 
     * @return ExpansionBusyTime 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。
     */
    public Long getExpansionBusyTime() {
        return this.ExpansionBusyTime;
    }

    /**
     * Set 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。
     * @param ExpansionBusyTime 任务连续等待时间，队列的任务处于连续等待的时间。单位秒。
     */
    public void setExpansionBusyTime(Long ExpansionBusyTime) {
        this.ExpansionBusyTime = ExpansionBusyTime;
    }

    /**
     * Get 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。 
     * @return ShrinkIdleTime 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。
     */
    public Long getShrinkIdleTime() {
        return this.ShrinkIdleTime;
    }

    /**
     * Set 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。
     * @param ShrinkIdleTime 节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。
     */
    public void setShrinkIdleTime(Long ShrinkIdleTime) {
        this.ShrinkIdleTime = ShrinkIdleTime;
    }

    /**
     * Get 扩容队列配置概览列表。 
     * @return QueueConfigs 扩容队列配置概览列表。
     */
    public QueueConfigOverview [] getQueueConfigs() {
        return this.QueueConfigs;
    }

    /**
     * Set 扩容队列配置概览列表。
     * @param QueueConfigs 扩容队列配置概览列表。
     */
    public void setQueueConfigs(QueueConfigOverview [] QueueConfigs) {
        this.QueueConfigs = QueueConfigs;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAutoScalingConfigurationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingConfigurationResponse(DescribeAutoScalingConfigurationResponse source) {
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
            this.QueueConfigs = new QueueConfigOverview[source.QueueConfigs.length];
            for (int i = 0; i < source.QueueConfigs.length; i++) {
                this.QueueConfigs[i] = new QueueConfigOverview(source.QueueConfigs[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

