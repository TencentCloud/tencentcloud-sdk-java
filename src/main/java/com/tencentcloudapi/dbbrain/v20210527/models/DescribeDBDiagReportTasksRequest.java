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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagReportTasksRequest extends AbstractModel {

    /**
    * <p>第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>实例ID数组，用于筛选指定实例的任务列表。。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 计划任务；&quot;MANUAL&quot; - 手动触发。</p>
    */
    @SerializedName("Sources")
    @Expose
    private String [] Sources;

    /**
    * <p>报告的健康等级，支持的取值包括：&quot;HEALTH&quot; - 健康；&quot;SUB_HEALTH&quot; - 亚健康；&quot;RISK&quot; - 危险；&quot;HIGH_RISK&quot; - 高危。</p>
    */
    @SerializedName("HealthLevels")
    @Expose
    private String HealthLevels;

    /**
    * <p>任务的状态，支持的取值包括：&quot;created&quot; - 新建；&quot;chosen&quot; - 待执行； &quot;running&quot; - 执行中；&quot;failed&quot; - 失败；&quot;finished&quot; - 已完成。</p>
    */
    @SerializedName("TaskStatuses")
    @Expose
    private String TaskStatuses;

    /**
    * <p>偏移量，默认0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>根据任务所属实例的标签信息进行过滤</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilterGroup [] TagFilters;

    /**
     * Get <p>第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p> 
     * @return StartTime <p>第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p>
     * @param StartTime <p>第一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p> 
     * @return EndTime <p>最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p>
     * @param EndTime <p>最后一个任务的开始时间，用于范围查询，时间格式如：2019-09-10 12:13:14。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>实例ID数组，用于筛选指定实例的任务列表。。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p> 
     * @return InstanceIds <p>实例ID数组，用于筛选指定实例的任务列表。。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>实例ID数组，用于筛选指定实例的任务列表。。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     * @param InstanceIds <p>实例ID数组，用于筛选指定实例的任务列表。。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 计划任务；&quot;MANUAL&quot; - 手动触发。</p> 
     * @return Sources <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 计划任务；&quot;MANUAL&quot; - 手动触发。</p>
     */
    public String [] getSources() {
        return this.Sources;
    }

    /**
     * Set <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 计划任务；&quot;MANUAL&quot; - 手动触发。</p>
     * @param Sources <p>任务的触发来源，支持的取值包括：&quot;DAILY_INSPECTION&quot; - 实例巡检；&quot;SCHEDULED&quot; - 计划任务；&quot;MANUAL&quot; - 手动触发。</p>
     */
    public void setSources(String [] Sources) {
        this.Sources = Sources;
    }

    /**
     * Get <p>报告的健康等级，支持的取值包括：&quot;HEALTH&quot; - 健康；&quot;SUB_HEALTH&quot; - 亚健康；&quot;RISK&quot; - 危险；&quot;HIGH_RISK&quot; - 高危。</p> 
     * @return HealthLevels <p>报告的健康等级，支持的取值包括：&quot;HEALTH&quot; - 健康；&quot;SUB_HEALTH&quot; - 亚健康；&quot;RISK&quot; - 危险；&quot;HIGH_RISK&quot; - 高危。</p>
     */
    public String getHealthLevels() {
        return this.HealthLevels;
    }

    /**
     * Set <p>报告的健康等级，支持的取值包括：&quot;HEALTH&quot; - 健康；&quot;SUB_HEALTH&quot; - 亚健康；&quot;RISK&quot; - 危险；&quot;HIGH_RISK&quot; - 高危。</p>
     * @param HealthLevels <p>报告的健康等级，支持的取值包括：&quot;HEALTH&quot; - 健康；&quot;SUB_HEALTH&quot; - 亚健康；&quot;RISK&quot; - 危险；&quot;HIGH_RISK&quot; - 高危。</p>
     */
    public void setHealthLevels(String HealthLevels) {
        this.HealthLevels = HealthLevels;
    }

    /**
     * Get <p>任务的状态，支持的取值包括：&quot;created&quot; - 新建；&quot;chosen&quot; - 待执行； &quot;running&quot; - 执行中；&quot;failed&quot; - 失败；&quot;finished&quot; - 已完成。</p> 
     * @return TaskStatuses <p>任务的状态，支持的取值包括：&quot;created&quot; - 新建；&quot;chosen&quot; - 待执行； &quot;running&quot; - 执行中；&quot;failed&quot; - 失败；&quot;finished&quot; - 已完成。</p>
     */
    public String getTaskStatuses() {
        return this.TaskStatuses;
    }

    /**
     * Set <p>任务的状态，支持的取值包括：&quot;created&quot; - 新建；&quot;chosen&quot; - 待执行； &quot;running&quot; - 执行中；&quot;failed&quot; - 失败；&quot;finished&quot; - 已完成。</p>
     * @param TaskStatuses <p>任务的状态，支持的取值包括：&quot;created&quot; - 新建；&quot;chosen&quot; - 待执行； &quot;running&quot; - 执行中；&quot;failed&quot; - 失败；&quot;finished&quot; - 已完成。</p>
     */
    public void setTaskStatuses(String TaskStatuses) {
        this.TaskStatuses = TaskStatuses;
    }

    /**
     * Get <p>偏移量，默认0。</p> 
     * @return Offset <p>偏移量，默认0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认0。</p>
     * @param Offset <p>偏移量，默认0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认20，最大值为100。</p>
     * @param Limit <p>返回数量，默认20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>根据任务所属实例的标签信息进行过滤</p> 
     * @return TagFilters <p>根据任务所属实例的标签信息进行过滤</p>
     */
    public TagFilterGroup [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>根据任务所属实例的标签信息进行过滤</p>
     * @param TagFilters <p>根据任务所属实例的标签信息进行过滤</p>
     */
    public void setTagFilters(TagFilterGroup [] TagFilters) {
        this.TagFilters = TagFilters;
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
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilterGroup[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilterGroup(source.TagFilters[i]);
            }
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
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

