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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskListData extends AbstractModel{

    /**
    * 查询分页页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 查询分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 任务列表总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 任务列表
    */
    @SerializedName("TaskList")
    @Expose
    private ListModel [] TaskList;

    /**
     * Get 查询分页页码 
     * @return PageNumber 查询分页页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 查询分页页码
     * @param PageNumber 查询分页页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 查询分页大小 
     * @return PageSize 查询分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 查询分页大小
     * @param PageSize 查询分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 任务列表总记录数 
     * @return TotalCount 任务列表总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 任务列表总记录数
     * @param TotalCount 任务列表总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 任务列表 
     * @return TaskList 任务列表
     */
    public ListModel [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set 任务列表
     * @param TaskList 任务列表
     */
    public void setTaskList(ListModel [] TaskList) {
        this.TaskList = TaskList;
    }

    public TaskListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskListData(TaskListData source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TaskList != null) {
            this.TaskList = new ListModel[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new ListModel(source.TaskList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);

    }
}

