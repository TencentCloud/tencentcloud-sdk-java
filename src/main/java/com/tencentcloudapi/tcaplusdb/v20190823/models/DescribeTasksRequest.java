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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel{

    /**
    * 需要查询任务所属的集群ID列表
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 需要查询的任务ID列表
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 过滤条件，本接口支持：Content，TaskType, Operator, Time
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询列表偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询列表返回记录数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 需要查询任务所属的集群ID列表 
     * @return ClusterIds 需要查询任务所属的集群ID列表
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 需要查询任务所属的集群ID列表
     * @param ClusterIds 需要查询任务所属的集群ID列表
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 需要查询的任务ID列表 
     * @return TaskIds 需要查询的任务ID列表
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 需要查询的任务ID列表
     * @param TaskIds 需要查询的任务ID列表
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 过滤条件，本接口支持：Content，TaskType, Operator, Time 
     * @return Filters 过滤条件，本接口支持：Content，TaskType, Operator, Time
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，本接口支持：Content，TaskType, Operator, Time
     * @param Filters 过滤条件，本接口支持：Content，TaskType, Operator, Time
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询列表偏移量 
     * @return Offset 查询列表偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询列表偏移量
     * @param Offset 查询列表偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询列表返回记录数 
     * @return Limit 查询列表返回记录数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询列表返回记录数
     * @param Limit 查询列表返回记录数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

