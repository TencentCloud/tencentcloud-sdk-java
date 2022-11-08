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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskReportDetailListRequest extends AbstractModel{

    /**
    * WeData项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 统计周期的开始日期，格式为 yyyy-MM-dd
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 统计周期的结束日期，格式为 yyyy-MM-dd
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 任务状态，多个状态用逗号连接
    */
    @SerializedName("StateList")
    @Expose
    private String StateList;

    /**
    * 排序字段名
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * 升序或降序，传ASC或DESC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 页数，从1开始
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 每页的记录条数，默认10条
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get WeData项目id 
     * @return ProjectId WeData项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set WeData项目id
     * @param ProjectId WeData项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 统计周期的开始日期，格式为 yyyy-MM-dd 
     * @return BeginDate 统计周期的开始日期，格式为 yyyy-MM-dd
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 统计周期的开始日期，格式为 yyyy-MM-dd
     * @param BeginDate 统计周期的开始日期，格式为 yyyy-MM-dd
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 统计周期的结束日期，格式为 yyyy-MM-dd 
     * @return EndDate 统计周期的结束日期，格式为 yyyy-MM-dd
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 统计周期的结束日期，格式为 yyyy-MM-dd
     * @param EndDate 统计周期的结束日期，格式为 yyyy-MM-dd
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 任务状态，多个状态用逗号连接 
     * @return StateList 任务状态，多个状态用逗号连接
     */
    public String getStateList() {
        return this.StateList;
    }

    /**
     * Set 任务状态，多个状态用逗号连接
     * @param StateList 任务状态，多个状态用逗号连接
     */
    public void setStateList(String StateList) {
        this.StateList = StateList;
    }

    /**
     * Get 排序字段名 
     * @return SortItem 排序字段名
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set 排序字段名
     * @param SortItem 排序字段名
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get 升序或降序，传ASC或DESC 
     * @return SortType 升序或降序，传ASC或DESC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 升序或降序，传ASC或DESC
     * @param SortType 升序或降序，传ASC或DESC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 页数，从1开始 
     * @return PageIndex 页数，从1开始
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页数，从1开始
     * @param PageIndex 页数，从1开始
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 每页的记录条数，默认10条 
     * @return PageSize 每页的记录条数，默认10条
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页的记录条数，默认10条
     * @param PageSize 每页的记录条数，默认10条
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeTaskReportDetailListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskReportDetailListRequest(DescribeTaskReportDetailListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.StateList != null) {
            this.StateList = new String(source.StateList);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "StateList", this.StateList);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

