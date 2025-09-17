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

public class DescribeInstanceEventsRequest extends AbstractModel {

    /**
    * 配置查询事件执行计划的起始日期，查询日期最大跨度30天。
    */
    @SerializedName("ExecutionStartDate")
    @Expose
    private String ExecutionStartDate;

    /**
    * 配置查询事件执行计划的结束日期，查询日期最大跨度30天。
    */
    @SerializedName("ExecutionEndDate")
    @Expose
    private String ExecutionEndDate;

    /**
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 输出每页显示事件的数量。
- 默认值：10。
- 取值范围：[1,100]。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 配置查询事件的输出页码，即支持根据PageNo（页码）与 PageSize （每页输出数量）查询某一页的事件。
- 默认值：1。
- 取值范围：大于0 的正整数。
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
    */
    @SerializedName("EventTypes")
    @Expose
    private String [] EventTypes;

    /**
    * 配置查询事件等级。事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
    */
    @SerializedName("Grades")
    @Expose
    private String [] Grades;

    /**
     * Get 配置查询事件执行计划的起始日期，查询日期最大跨度30天。 
     * @return ExecutionStartDate 配置查询事件执行计划的起始日期，查询日期最大跨度30天。
     */
    public String getExecutionStartDate() {
        return this.ExecutionStartDate;
    }

    /**
     * Set 配置查询事件执行计划的起始日期，查询日期最大跨度30天。
     * @param ExecutionStartDate 配置查询事件执行计划的起始日期，查询日期最大跨度30天。
     */
    public void setExecutionStartDate(String ExecutionStartDate) {
        this.ExecutionStartDate = ExecutionStartDate;
    }

    /**
     * Get 配置查询事件执行计划的结束日期，查询日期最大跨度30天。 
     * @return ExecutionEndDate 配置查询事件执行计划的结束日期，查询日期最大跨度30天。
     */
    public String getExecutionEndDate() {
        return this.ExecutionEndDate;
    }

    /**
     * Set 配置查询事件执行计划的结束日期，查询日期最大跨度30天。
     * @param ExecutionEndDate 配置查询事件执行计划的结束日期，查询日期最大跨度30天。
     */
    public void setExecutionEndDate(String ExecutionEndDate) {
        this.ExecutionEndDate = ExecutionEndDate;
    }

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 输出每页显示事件的数量。
- 默认值：10。
- 取值范围：[1,100]。 
     * @return PageSize 输出每页显示事件的数量。
- 默认值：10。
- 取值范围：[1,100]。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 输出每页显示事件的数量。
- 默认值：10。
- 取值范围：[1,100]。
     * @param PageSize 输出每页显示事件的数量。
- 默认值：10。
- 取值范围：[1,100]。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 配置查询事件的输出页码，即支持根据PageNo（页码）与 PageSize （每页输出数量）查询某一页的事件。
- 默认值：1。
- 取值范围：大于0 的正整数。 
     * @return PageNo 配置查询事件的输出页码，即支持根据PageNo（页码）与 PageSize （每页输出数量）查询某一页的事件。
- 默认值：1。
- 取值范围：大于0 的正整数。
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 配置查询事件的输出页码，即支持根据PageNo（页码）与 PageSize （每页输出数量）查询某一页的事件。
- 默认值：1。
- 取值范围：大于0 的正整数。
     * @param PageNo 配置查询事件的输出页码，即支持根据PageNo（页码）与 PageSize （每页输出数量）查询某一页的事件。
- 默认值：1。
- 取值范围：大于0 的正整数。
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。 
     * @return Status 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
     * @param Status 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。 
     * @return EventTypes 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
     */
    public String [] getEventTypes() {
        return this.EventTypes;
    }

    /**
     * Set 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
     * @param EventTypes 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
     */
    public void setEventTypes(String [] EventTypes) {
        this.EventTypes = EventTypes;
    }

    /**
     * Get 配置查询事件等级。事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般 
     * @return Grades 配置查询事件等级。事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
     */
    public String [] getGrades() {
        return this.Grades;
    }

    /**
     * Set 配置查询事件等级。事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
     * @param Grades 配置查询事件等级。事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
     */
    public void setGrades(String [] Grades) {
        this.Grades = Grades;
    }

    public DescribeInstanceEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceEventsRequest(DescribeInstanceEventsRequest source) {
        if (source.ExecutionStartDate != null) {
            this.ExecutionStartDate = new String(source.ExecutionStartDate);
        }
        if (source.ExecutionEndDate != null) {
            this.ExecutionEndDate = new String(source.ExecutionEndDate);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.EventTypes != null) {
            this.EventTypes = new String[source.EventTypes.length];
            for (int i = 0; i < source.EventTypes.length; i++) {
                this.EventTypes[i] = new String(source.EventTypes[i]);
            }
        }
        if (source.Grades != null) {
            this.Grades = new String[source.Grades.length];
            for (int i = 0; i < source.Grades.length; i++) {
                this.Grades[i] = new String(source.Grades[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionStartDate", this.ExecutionStartDate);
        this.setParamSimple(map, prefix + "ExecutionEndDate", this.ExecutionEndDate);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "EventTypes.", this.EventTypes);
        this.setParamArraySimple(map, prefix + "Grades.", this.Grades);

    }
}

