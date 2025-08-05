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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTaskJobLogDetailRequest extends AbstractModel {

    /**
    * 开始运行时间，unix时间戳（毫秒）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束运行时间，unix时间戳（毫秒）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分页大小，最大1000，配合Context一起使用
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 下一次分页参数，第一次传空
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 列表返回的Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 最近1000条日志是否升序排列，true:升序排序，false:倒序，默认false，倒序排列
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
    * 预览日志的通用过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * SparkSQL任务唯一ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 引擎id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 资源组id
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
     * Get 开始运行时间，unix时间戳（毫秒） 
     * @return StartTime 开始运行时间，unix时间戳（毫秒）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始运行时间，unix时间戳（毫秒）
     * @param StartTime 开始运行时间，unix时间戳（毫秒）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束运行时间，unix时间戳（毫秒） 
     * @return EndTime 结束运行时间，unix时间戳（毫秒）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束运行时间，unix时间戳（毫秒）
     * @param EndTime 结束运行时间，unix时间戳（毫秒）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页大小，最大1000，配合Context一起使用 
     * @return Limit 分页大小，最大1000，配合Context一起使用
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，最大1000，配合Context一起使用
     * @param Limit 分页大小，最大1000，配合Context一起使用
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 下一次分页参数，第一次传空 
     * @return Context 下一次分页参数，第一次传空
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 下一次分页参数，第一次传空
     * @param Context 下一次分页参数，第一次传空
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 列表返回的Id 
     * @return TaskId 列表返回的Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 列表返回的Id
     * @param TaskId 列表返回的Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 最近1000条日志是否升序排列，true:升序排序，false:倒序，默认false，倒序排列 
     * @return Asc 最近1000条日志是否升序排列，true:升序排序，false:倒序，默认false，倒序排列
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 最近1000条日志是否升序排列，true:升序排序，false:倒序，默认false，倒序排列
     * @param Asc 最近1000条日志是否升序排列，true:升序排序，false:倒序，默认false，倒序排列
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    /**
     * Get 预览日志的通用过滤条件 
     * @return Filters 预览日志的通用过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 预览日志的通用过滤条件
     * @param Filters 预览日志的通用过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get SparkSQL任务唯一ID 
     * @return BatchId SparkSQL任务唯一ID
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set SparkSQL任务唯一ID
     * @param BatchId SparkSQL任务唯一ID
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 引擎id 
     * @return DataEngineId 引擎id
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎id
     * @param DataEngineId 引擎id
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 资源组id 
     * @return ResourceGroupId 资源组id
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组id
     * @param ResourceGroupId 资源组id
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    public ListTaskJobLogDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskJobLogDetailRequest(ListTaskJobLogDetailRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);

    }
}

