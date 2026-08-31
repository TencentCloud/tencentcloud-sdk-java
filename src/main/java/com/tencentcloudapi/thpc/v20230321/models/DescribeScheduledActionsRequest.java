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

public class DescribeScheduledActionsRequest extends AbstractModel {

    /**
    * <p>集群 ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>队列名称。</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>定时伸缩任务 ID 列表。</p>
    */
    @SerializedName("ScheduledActionIds")
    @Expose
    private String [] ScheduledActionIds;

    /**
    * <p>任务状态过滤条件。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>集群 ID。</p> 
     * @return ClusterId <p>集群 ID。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID。</p>
     * @param ClusterId <p>集群 ID。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>队列名称。</p> 
     * @return QueueName <p>队列名称。</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称。</p>
     * @param QueueName <p>队列名称。</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>定时伸缩任务 ID 列表。</p> 
     * @return ScheduledActionIds <p>定时伸缩任务 ID 列表。</p>
     */
    public String [] getScheduledActionIds() {
        return this.ScheduledActionIds;
    }

    /**
     * Set <p>定时伸缩任务 ID 列表。</p>
     * @param ScheduledActionIds <p>定时伸缩任务 ID 列表。</p>
     */
    public void setScheduledActionIds(String [] ScheduledActionIds) {
        this.ScheduledActionIds = ScheduledActionIds;
    }

    /**
     * Get <p>任务状态过滤条件。</p> 
     * @return Status <p>任务状态过滤条件。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态过滤条件。</p>
     * @param Status <p>任务状态过滤条件。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DescribeScheduledActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScheduledActionsRequest(DescribeScheduledActionsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ScheduledActionIds != null) {
            this.ScheduledActionIds = new String[source.ScheduledActionIds.length];
            for (int i = 0; i < source.ScheduledActionIds.length; i++) {
                this.ScheduledActionIds[i] = new String(source.ScheduledActionIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamArraySimple(map, prefix + "ScheduledActionIds.", this.ScheduledActionIds);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

