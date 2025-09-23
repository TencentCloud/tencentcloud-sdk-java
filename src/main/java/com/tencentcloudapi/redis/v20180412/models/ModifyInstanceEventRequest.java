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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceEventRequest extends AbstractModel {

    /**
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 事件 ID。请通过 [DescribeInstanceEvents](https://cloud.tencent.com/document/product/239/104779) 获取需修改的事件 ID。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 修改事件执行的计划开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 修改事件计划执行的结束时间。开始时间配置之后，结束时间只能选择在开始时间之后的 30 分钟、1 小时、1.5 小时、2 小时和 3 小时之内。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 修改事件执行计划的开始日期。
    */
    @SerializedName("ExecutionDate")
    @Expose
    private String ExecutionDate;

    /**
    * 修改事件的运行状态。该参数当前仅支持设置为 **Canceled**， 即取消执行当前事件。可通过 DescribeInstanceEvents 接口查询当前事件的运行状态与事件级别。
- 事件级别为Critical（关键）或 High（重要）类事件不支持取消。即严重的事件必须执行，不可取消。
- 仅运行状态为 Waiting （待执行的事件）的事件，才能执行取消操作。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 事件 ID。请通过 [DescribeInstanceEvents](https://cloud.tencent.com/document/product/239/104779) 获取需修改的事件 ID。 
     * @return EventId 事件 ID。请通过 [DescribeInstanceEvents](https://cloud.tencent.com/document/product/239/104779) 获取需修改的事件 ID。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件 ID。请通过 [DescribeInstanceEvents](https://cloud.tencent.com/document/product/239/104779) 获取需修改的事件 ID。
     * @param EventId 事件 ID。请通过 [DescribeInstanceEvents](https://cloud.tencent.com/document/product/239/104779) 获取需修改的事件 ID。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 修改事件执行的计划开始时间。 
     * @return StartTime 修改事件执行的计划开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 修改事件执行的计划开始时间。
     * @param StartTime 修改事件执行的计划开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 修改事件计划执行的结束时间。开始时间配置之后，结束时间只能选择在开始时间之后的 30 分钟、1 小时、1.5 小时、2 小时和 3 小时之内。 
     * @return EndTime 修改事件计划执行的结束时间。开始时间配置之后，结束时间只能选择在开始时间之后的 30 分钟、1 小时、1.5 小时、2 小时和 3 小时之内。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 修改事件计划执行的结束时间。开始时间配置之后，结束时间只能选择在开始时间之后的 30 分钟、1 小时、1.5 小时、2 小时和 3 小时之内。
     * @param EndTime 修改事件计划执行的结束时间。开始时间配置之后，结束时间只能选择在开始时间之后的 30 分钟、1 小时、1.5 小时、2 小时和 3 小时之内。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 修改事件执行计划的开始日期。 
     * @return ExecutionDate 修改事件执行计划的开始日期。
     */
    public String getExecutionDate() {
        return this.ExecutionDate;
    }

    /**
     * Set 修改事件执行计划的开始日期。
     * @param ExecutionDate 修改事件执行计划的开始日期。
     */
    public void setExecutionDate(String ExecutionDate) {
        this.ExecutionDate = ExecutionDate;
    }

    /**
     * Get 修改事件的运行状态。该参数当前仅支持设置为 **Canceled**， 即取消执行当前事件。可通过 DescribeInstanceEvents 接口查询当前事件的运行状态与事件级别。
- 事件级别为Critical（关键）或 High（重要）类事件不支持取消。即严重的事件必须执行，不可取消。
- 仅运行状态为 Waiting （待执行的事件）的事件，才能执行取消操作。 
     * @return Status 修改事件的运行状态。该参数当前仅支持设置为 **Canceled**， 即取消执行当前事件。可通过 DescribeInstanceEvents 接口查询当前事件的运行状态与事件级别。
- 事件级别为Critical（关键）或 High（重要）类事件不支持取消。即严重的事件必须执行，不可取消。
- 仅运行状态为 Waiting （待执行的事件）的事件，才能执行取消操作。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 修改事件的运行状态。该参数当前仅支持设置为 **Canceled**， 即取消执行当前事件。可通过 DescribeInstanceEvents 接口查询当前事件的运行状态与事件级别。
- 事件级别为Critical（关键）或 High（重要）类事件不支持取消。即严重的事件必须执行，不可取消。
- 仅运行状态为 Waiting （待执行的事件）的事件，才能执行取消操作。
     * @param Status 修改事件的运行状态。该参数当前仅支持设置为 **Canceled**， 即取消执行当前事件。可通过 DescribeInstanceEvents 接口查询当前事件的运行状态与事件级别。
- 事件级别为Critical（关键）或 High（重要）类事件不支持取消。即严重的事件必须执行，不可取消。
- 仅运行状态为 Waiting （待执行的事件）的事件，才能执行取消操作。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyInstanceEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceEventRequest(ModifyInstanceEventRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExecutionDate != null) {
            this.ExecutionDate = new String(source.ExecutionDate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionDate", this.ExecutionDate);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

