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

public class DescribeInstanceListRequest extends AbstractModel{

    /**
    * 项目/工作空间id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页码
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 一页展示的条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 周期列表（如天，一次性），可选
    */
    @SerializedName("CycleList")
    @Expose
    private String [] CycleList;

    /**
    * 责任人
    */
    @SerializedName("OwnerList")
    @Expose
    private String [] OwnerList;

    /**
    * 跟之前保持一致
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 排序顺序（asc，desc）
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间）
    */
    @SerializedName("SortCol")
    @Expose
    private String SortCol;

    /**
    * 类型列表（如python任务类型：30
pyspark任务类型：31
hivesql任务类型：34
shell任务类型：35
sparksql任务类型：36 jdbcsql任务类型：21 dlc任务类型：32），可选
    */
    @SerializedName("TaskTypeList")
    @Expose
    private Long [] TaskTypeList;

    /**
    * 状态列表（如成功 2，正在执行 1），可选
    */
    @SerializedName("StateList")
    @Expose
    private Long [] StateList;

    /**
    * 任务名称
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 项目/工作空间id 
     * @return ProjectId 项目/工作空间id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目/工作空间id
     * @param ProjectId 项目/工作空间id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页码 
     * @return PageIndex 页码
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页码
     * @param PageIndex 页码
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 一页展示的条数 
     * @return PageSize 一页展示的条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 一页展示的条数
     * @param PageSize 一页展示的条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 周期列表（如天，一次性），可选 
     * @return CycleList 周期列表（如天，一次性），可选
     */
    public String [] getCycleList() {
        return this.CycleList;
    }

    /**
     * Set 周期列表（如天，一次性），可选
     * @param CycleList 周期列表（如天，一次性），可选
     */
    public void setCycleList(String [] CycleList) {
        this.CycleList = CycleList;
    }

    /**
     * Get 责任人 
     * @return OwnerList 责任人
     */
    public String [] getOwnerList() {
        return this.OwnerList;
    }

    /**
     * Set 责任人
     * @param OwnerList 责任人
     */
    public void setOwnerList(String [] OwnerList) {
        this.OwnerList = OwnerList;
    }

    /**
     * Get 跟之前保持一致 
     * @return InstanceType 跟之前保持一致
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 跟之前保持一致
     * @param InstanceType 跟之前保持一致
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 排序顺序（asc，desc） 
     * @return Sort 排序顺序（asc，desc）
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序顺序（asc，desc）
     * @param Sort 排序顺序（asc，desc）
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间） 
     * @return SortCol 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间）
     */
    public String getSortCol() {
        return this.SortCol;
    }

    /**
     * Set 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间）
     * @param SortCol 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间）
     */
    public void setSortCol(String SortCol) {
        this.SortCol = SortCol;
    }

    /**
     * Get 类型列表（如python任务类型：30
pyspark任务类型：31
hivesql任务类型：34
shell任务类型：35
sparksql任务类型：36 jdbcsql任务类型：21 dlc任务类型：32），可选 
     * @return TaskTypeList 类型列表（如python任务类型：30
pyspark任务类型：31
hivesql任务类型：34
shell任务类型：35
sparksql任务类型：36 jdbcsql任务类型：21 dlc任务类型：32），可选
     */
    public Long [] getTaskTypeList() {
        return this.TaskTypeList;
    }

    /**
     * Set 类型列表（如python任务类型：30
pyspark任务类型：31
hivesql任务类型：34
shell任务类型：35
sparksql任务类型：36 jdbcsql任务类型：21 dlc任务类型：32），可选
     * @param TaskTypeList 类型列表（如python任务类型：30
pyspark任务类型：31
hivesql任务类型：34
shell任务类型：35
sparksql任务类型：36 jdbcsql任务类型：21 dlc任务类型：32），可选
     */
    public void setTaskTypeList(Long [] TaskTypeList) {
        this.TaskTypeList = TaskTypeList;
    }

    /**
     * Get 状态列表（如成功 2，正在执行 1），可选 
     * @return StateList 状态列表（如成功 2，正在执行 1），可选
     */
    public Long [] getStateList() {
        return this.StateList;
    }

    /**
     * Set 状态列表（如成功 2，正在执行 1），可选
     * @param StateList 状态列表（如成功 2，正在执行 1），可选
     */
    public void setStateList(Long [] StateList) {
        this.StateList = StateList;
    }

    /**
     * Get 任务名称 
     * @return Keyword 任务名称
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 任务名称
     * @param Keyword 任务名称
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceListRequest(DescribeInstanceListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.CycleList != null) {
            this.CycleList = new String[source.CycleList.length];
            for (int i = 0; i < source.CycleList.length; i++) {
                this.CycleList[i] = new String(source.CycleList[i]);
            }
        }
        if (source.OwnerList != null) {
            this.OwnerList = new String[source.OwnerList.length];
            for (int i = 0; i < source.OwnerList.length; i++) {
                this.OwnerList[i] = new String(source.OwnerList[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SortCol != null) {
            this.SortCol = new String(source.SortCol);
        }
        if (source.TaskTypeList != null) {
            this.TaskTypeList = new Long[source.TaskTypeList.length];
            for (int i = 0; i < source.TaskTypeList.length; i++) {
                this.TaskTypeList[i] = new Long(source.TaskTypeList[i]);
            }
        }
        if (source.StateList != null) {
            this.StateList = new Long[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new Long(source.StateList[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "CycleList.", this.CycleList);
        this.setParamArraySimple(map, prefix + "OwnerList.", this.OwnerList);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortCol", this.SortCol);
        this.setParamArraySimple(map, prefix + "TaskTypeList.", this.TaskTypeList);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

