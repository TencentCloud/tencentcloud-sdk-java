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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagReportTasksRequest extends AbstractModel{

    /**
    * 第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 实例ID数组，用于筛选指定实例的任务列表。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。
    */
    @SerializedName("Sources")
    @Expose
    private String [] Sources;

    /**
    * 报告的健康等级，支持的取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK" - 危险；"HIGH_RISK" - 高危。
    */
    @SerializedName("HealthLevels")
    @Expose
    private String HealthLevels;

    /**
    * 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。
    */
    @SerializedName("TaskStatuses")
    @Expose
    private String TaskStatuses;

    /**
    * 偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。 
     * @return StartTime 第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。
     * @param StartTime 第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。 
     * @return EndTime 最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。
     * @param EndTime 最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 实例ID数组，用于筛选指定实例的任务列表。 
     * @return InstanceIds 实例ID数组，用于筛选指定实例的任务列表。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID数组，用于筛选指定实例的任务列表。
     * @param InstanceIds 实例ID数组，用于筛选指定实例的任务列表。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。 
     * @return Sources 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。
     */
    public String [] getSources() {
        return this.Sources;
    }

    /**
     * Set 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。
     * @param Sources 任务的触发来源，支持的取值包括："DAILY_INSPECTION" - 实例巡检；"SCHEDULED" - 定时生成；"MANUAL" - 手动触发。
     */
    public void setSources(String [] Sources) {
        this.Sources = Sources;
    }

    /**
     * Get 报告的健康等级，支持的取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK" - 危险；"HIGH_RISK" - 高危。 
     * @return HealthLevels 报告的健康等级，支持的取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK" - 危险；"HIGH_RISK" - 高危。
     */
    public String getHealthLevels() {
        return this.HealthLevels;
    }

    /**
     * Set 报告的健康等级，支持的取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK" - 危险；"HIGH_RISK" - 高危。
     * @param HealthLevels 报告的健康等级，支持的取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK" - 危险；"HIGH_RISK" - 高危。
     */
    public void setHealthLevels(String HealthLevels) {
        this.HealthLevels = HealthLevels;
    }

    /**
     * Get 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。 
     * @return TaskStatuses 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。
     */
    public String getTaskStatuses() {
        return this.TaskStatuses;
    }

    /**
     * Set 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。
     * @param TaskStatuses 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。
     */
    public void setTaskStatuses(String TaskStatuses) {
        this.TaskStatuses = TaskStatuses;
    }

    /**
     * Get 偏移量，默认0。 
     * @return Offset 偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0。
     * @param Offset 偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认20，最大值为100。 
     * @return Limit 返回数量，默认20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认20，最大值为100。
     * @param Limit 返回数量，默认20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeDBDiagReportTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBDiagReportTasksRequest(DescribeDBDiagReportTasksRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Sources != null) {
            this.Sources = new String[source.Sources.length];
            for (int i = 0; i < source.Sources.length; i++) {
                this.Sources[i] = new String(source.Sources[i]);
            }
        }
        if (source.HealthLevels != null) {
            this.HealthLevels = new String(source.HealthLevels);
        }
        if (source.TaskStatuses != null) {
            this.TaskStatuses = new String(source.TaskStatuses);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "Sources.", this.Sources);
        this.setParamSimple(map, prefix + "HealthLevels", this.HealthLevels);
        this.setParamSimple(map, prefix + "TaskStatuses", this.TaskStatuses);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

