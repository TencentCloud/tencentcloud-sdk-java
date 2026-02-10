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

public class DescribeAutoScalingConfigurationResponse extends AbstractModel {

    /**
    * <p>集群ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。</p>
    */
    @SerializedName("ExpansionBusyTime")
    @Expose
    private Long ExpansionBusyTime;

    /**
    * <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。</p>
    */
    @SerializedName("ShrinkIdleTime")
    @Expose
    private Long ShrinkIdleTime;

    /**
    * <p>扩容队列配置概览列表。</p>
    */
    @SerializedName("QueueConfigs")
    @Expose
    private QueueConfigOverview [] QueueConfigs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。</p> 
     * @return ExpansionBusyTime <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。</p>
     */
    public Long getExpansionBusyTime() {
        return this.ExpansionBusyTime;
    }

    /**
     * Set <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。</p>
     * @param ExpansionBusyTime <p>任务连续等待时间，队列的任务处于连续等待的时间。单位秒。</p>
     */
    public void setExpansionBusyTime(Long ExpansionBusyTime) {
        this.ExpansionBusyTime = ExpansionBusyTime;
    }

    /**
     * Get <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。</p> 
     * @return ShrinkIdleTime <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。</p>
     */
    public Long getShrinkIdleTime() {
        return this.ShrinkIdleTime;
    }

    /**
     * Set <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。</p>
     * @param ShrinkIdleTime <p>节点连续空闲（未运行作业）时间，一个节点连续处于空闲状态时间。</p>
     */
    public void setShrinkIdleTime(Long ShrinkIdleTime) {
        this.ShrinkIdleTime = ShrinkIdleTime;
    }

    /**
     * Get <p>扩容队列配置概览列表。</p> 
     * @return QueueConfigs <p>扩容队列配置概览列表。</p>
     */
    public QueueConfigOverview [] getQueueConfigs() {
        return this.QueueConfigs;
    }

    /**
     * Set <p>扩容队列配置概览列表。</p>
     * @param QueueConfigs <p>扩容队列配置概览列表。</p>
     */
    public void setQueueConfigs(QueueConfigOverview [] QueueConfigs) {
        this.QueueConfigs = QueueConfigs;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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

