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

public class CreateScheduledActionRequest extends AbstractModel {

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
    * <p>定时伸缩任务名称。</p>
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * <p>定时伸缩任务生效起始时间，格式：YYYY-MM-DD HH:MM:SS。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>定时触发后队列期望节点数。</p>
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * <p>定时伸缩任务生效结束时间，格式：YYYY-MM-DD HH:MM:SS。不传则永久有效。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>重复策略，遵循 cron 表达式格式。不传则只执行一次。</p>
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

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
     * Get <p>定时伸缩任务名称。</p> 
     * @return ScheduledActionName <p>定时伸缩任务名称。</p>
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * Set <p>定时伸缩任务名称。</p>
     * @param ScheduledActionName <p>定时伸缩任务名称。</p>
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * Get <p>定时伸缩任务生效起始时间，格式：YYYY-MM-DD HH:MM:SS。</p> 
     * @return StartTime <p>定时伸缩任务生效起始时间，格式：YYYY-MM-DD HH:MM:SS。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>定时伸缩任务生效起始时间，格式：YYYY-MM-DD HH:MM:SS。</p>
     * @param StartTime <p>定时伸缩任务生效起始时间，格式：YYYY-MM-DD HH:MM:SS。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>定时触发后队列期望节点数。</p> 
     * @return DesiredCapacity <p>定时触发后队列期望节点数。</p>
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set <p>定时触发后队列期望节点数。</p>
     * @param DesiredCapacity <p>定时触发后队列期望节点数。</p>
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get <p>定时伸缩任务生效结束时间，格式：YYYY-MM-DD HH:MM:SS。不传则永久有效。</p> 
     * @return EndTime <p>定时伸缩任务生效结束时间，格式：YYYY-MM-DD HH:MM:SS。不传则永久有效。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>定时伸缩任务生效结束时间，格式：YYYY-MM-DD HH:MM:SS。不传则永久有效。</p>
     * @param EndTime <p>定时伸缩任务生效结束时间，格式：YYYY-MM-DD HH:MM:SS。不传则永久有效。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>重复策略，遵循 cron 表达式格式。不传则只执行一次。</p> 
     * @return Recurrence <p>重复策略，遵循 cron 表达式格式。不传则只执行一次。</p>
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set <p>重复策略，遵循 cron 表达式格式。不传则只执行一次。</p>
     * @param Recurrence <p>重复策略，遵循 cron 表达式格式。不传则只执行一次。</p>
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    public CreateScheduledActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScheduledActionRequest(CreateScheduledActionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ScheduledActionName != null) {
            this.ScheduledActionName = new String(source.ScheduledActionName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Recurrence != null) {
            this.Recurrence = new String(source.Recurrence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);

    }
}

