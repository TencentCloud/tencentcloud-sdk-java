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

public class DescribeTasksRequest  extends AbstractModel{

    /**
    * 需要查询任务所属的应用ID列表
    */
    @SerializedName("ApplicationIds")
    @Expose
    private String [] ApplicationIds;

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
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 任务列表大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * 获取需要查询任务所属的应用ID列表
     * @return ApplicationIds 需要查询任务所属的应用ID列表
     */
    public String [] getApplicationIds() {
        return this.ApplicationIds;
    }

    /**
     * 设置需要查询任务所属的应用ID列表
     * @param ApplicationIds 需要查询任务所属的应用ID列表
     */
    public void setApplicationIds(String [] ApplicationIds) {
        this.ApplicationIds = ApplicationIds;
    }

    /**
     * 获取需要查询的任务ID列表
     * @return TaskIds 需要查询的任务ID列表
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * 设置需要查询的任务ID列表
     * @param TaskIds 需要查询的任务ID列表
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * 获取过滤条件，本接口支持：Content，TaskType, Operator, Time
     * @return Filters 过滤条件，本接口支持：Content，TaskType, Operator, Time
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件，本接口支持：Content，TaskType, Operator, Time
     * @param Filters 过滤条件，本接口支持：Content，TaskType, Operator, Time
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取任务列表大小
     * @return Limit 任务列表大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置任务列表大小
     * @param Limit 任务列表大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApplicationIds.", this.ApplicationIds);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

