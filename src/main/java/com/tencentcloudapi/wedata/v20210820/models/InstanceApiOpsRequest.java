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

public class InstanceApiOpsRequest extends AbstractModel{

    /**
    * 单个查询条件
    */
    @SerializedName("Instance")
    @Expose
    private InstanceOpsDto Instance;

    /**
    * 排序字段，目前包含：重试次数，实例数据时间，运行耗时
    */
    @SerializedName("SortCol")
    @Expose
    private String SortCol;

    /**
    * 任务id列表
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * 按照taskName模糊查询
    */
    @SerializedName("TaskNameList")
    @Expose
    private String [] TaskNameList;

    /**
    * 文件夹列表
    */
    @SerializedName("FolderList")
    @Expose
    private String [] FolderList;

    /**
    * 升序或者降序
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 实例状态列表
    */
    @SerializedName("StateList")
    @Expose
    private Long [] StateList;

    /**
    * 实例类型列表
    */
    @SerializedName("TaskTypeList")
    @Expose
    private Long [] TaskTypeList;

    /**
    * 周期类型
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
    * 数据时间
    */
    @SerializedName("DateFrom")
    @Expose
    private String DateFrom;

    /**
    * 数据时间
    */
    @SerializedName("DateTo")
    @Expose
    private String DateTo;

    /**
    * 实例入库时间
    */
    @SerializedName("CreateTimeFrom")
    @Expose
    private String CreateTimeFrom;

    /**
    * 实例入库时间
    */
    @SerializedName("CreateTimeTo")
    @Expose
    private String CreateTimeTo;

    /**
    *  开始执行时间
    */
    @SerializedName("StartFrom")
    @Expose
    private String StartFrom;

    /**
    *  开始执行时间
    */
    @SerializedName("StartTo")
    @Expose
    private String StartTo;

    /**
    * 所属工作流
    */
    @SerializedName("WorkflowIdList")
    @Expose
    private String [] WorkflowIdList;

    /**
    * 按照workflowName模糊查询
    */
    @SerializedName("WorkflowNameList")
    @Expose
    private String [] WorkflowNameList;

    /**
    * 关键字模糊查询
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * searchColumns是搜索的字段名列表
    */
    @SerializedName("SearchColumns")
    @Expose
    private String [] SearchColumns;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 任务类型映射关系, 存储任务类型id和任务类型描述信息
    */
    @SerializedName("TaskTypeMap")
    @Expose
    private TaskTypeMap [] TaskTypeMap;

    /**
    * 0 补录类型 1 周期实例 2 非周期实例
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 是否dag
    */
    @SerializedName("DagDeal")
    @Expose
    private Boolean DagDeal;

    /**
    *  1 父实例 2 子实例
    */
    @SerializedName("DagType")
    @Expose
    private String DagType;

    /**
    * 1 自依赖 2 任务依赖  3 所有依赖
    */
    @SerializedName("DagDependent")
    @Expose
    private String DagDependent;

    /**
    * dag深度 默认为1，取值 1-6
    */
    @SerializedName("DagDepth")
    @Expose
    private Long DagDepth;

    /**
    * 租户id
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 根据当前数据时间或者是下一个数据时间查询, 默认当前数据时间
    */
    @SerializedName("DataTimeCycle")
    @Expose
    private String DataTimeCycle;

    /**
     * Get 单个查询条件 
     * @return Instance 单个查询条件
     */
    public InstanceOpsDto getInstance() {
        return this.Instance;
    }

    /**
     * Set 单个查询条件
     * @param Instance 单个查询条件
     */
    public void setInstance(InstanceOpsDto Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 排序字段，目前包含：重试次数，实例数据时间，运行耗时 
     * @return SortCol 排序字段，目前包含：重试次数，实例数据时间，运行耗时
     */
    public String getSortCol() {
        return this.SortCol;
    }

    /**
     * Set 排序字段，目前包含：重试次数，实例数据时间，运行耗时
     * @param SortCol 排序字段，目前包含：重试次数，实例数据时间，运行耗时
     */
    public void setSortCol(String SortCol) {
        this.SortCol = SortCol;
    }

    /**
     * Get 任务id列表 
     * @return TaskIdList 任务id列表
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 任务id列表
     * @param TaskIdList 任务id列表
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 按照taskName模糊查询 
     * @return TaskNameList 按照taskName模糊查询
     */
    public String [] getTaskNameList() {
        return this.TaskNameList;
    }

    /**
     * Set 按照taskName模糊查询
     * @param TaskNameList 按照taskName模糊查询
     */
    public void setTaskNameList(String [] TaskNameList) {
        this.TaskNameList = TaskNameList;
    }

    /**
     * Get 文件夹列表 
     * @return FolderList 文件夹列表
     */
    public String [] getFolderList() {
        return this.FolderList;
    }

    /**
     * Set 文件夹列表
     * @param FolderList 文件夹列表
     */
    public void setFolderList(String [] FolderList) {
        this.FolderList = FolderList;
    }

    /**
     * Get 升序或者降序 
     * @return Sort 升序或者降序
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 升序或者降序
     * @param Sort 升序或者降序
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 实例状态列表 
     * @return StateList 实例状态列表
     */
    public Long [] getStateList() {
        return this.StateList;
    }

    /**
     * Set 实例状态列表
     * @param StateList 实例状态列表
     */
    public void setStateList(Long [] StateList) {
        this.StateList = StateList;
    }

    /**
     * Get 实例类型列表 
     * @return TaskTypeList 实例类型列表
     */
    public Long [] getTaskTypeList() {
        return this.TaskTypeList;
    }

    /**
     * Set 实例类型列表
     * @param TaskTypeList 实例类型列表
     */
    public void setTaskTypeList(Long [] TaskTypeList) {
        this.TaskTypeList = TaskTypeList;
    }

    /**
     * Get 周期类型 
     * @return CycleList 周期类型
     */
    public String [] getCycleList() {
        return this.CycleList;
    }

    /**
     * Set 周期类型
     * @param CycleList 周期类型
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
     * Get 数据时间 
     * @return DateFrom 数据时间
     */
    public String getDateFrom() {
        return this.DateFrom;
    }

    /**
     * Set 数据时间
     * @param DateFrom 数据时间
     */
    public void setDateFrom(String DateFrom) {
        this.DateFrom = DateFrom;
    }

    /**
     * Get 数据时间 
     * @return DateTo 数据时间
     */
    public String getDateTo() {
        return this.DateTo;
    }

    /**
     * Set 数据时间
     * @param DateTo 数据时间
     */
    public void setDateTo(String DateTo) {
        this.DateTo = DateTo;
    }

    /**
     * Get 实例入库时间 
     * @return CreateTimeFrom 实例入库时间
     */
    public String getCreateTimeFrom() {
        return this.CreateTimeFrom;
    }

    /**
     * Set 实例入库时间
     * @param CreateTimeFrom 实例入库时间
     */
    public void setCreateTimeFrom(String CreateTimeFrom) {
        this.CreateTimeFrom = CreateTimeFrom;
    }

    /**
     * Get 实例入库时间 
     * @return CreateTimeTo 实例入库时间
     */
    public String getCreateTimeTo() {
        return this.CreateTimeTo;
    }

    /**
     * Set 实例入库时间
     * @param CreateTimeTo 实例入库时间
     */
    public void setCreateTimeTo(String CreateTimeTo) {
        this.CreateTimeTo = CreateTimeTo;
    }

    /**
     * Get  开始执行时间 
     * @return StartFrom  开始执行时间
     */
    public String getStartFrom() {
        return this.StartFrom;
    }

    /**
     * Set  开始执行时间
     * @param StartFrom  开始执行时间
     */
    public void setStartFrom(String StartFrom) {
        this.StartFrom = StartFrom;
    }

    /**
     * Get  开始执行时间 
     * @return StartTo  开始执行时间
     */
    public String getStartTo() {
        return this.StartTo;
    }

    /**
     * Set  开始执行时间
     * @param StartTo  开始执行时间
     */
    public void setStartTo(String StartTo) {
        this.StartTo = StartTo;
    }

    /**
     * Get 所属工作流 
     * @return WorkflowIdList 所属工作流
     */
    public String [] getWorkflowIdList() {
        return this.WorkflowIdList;
    }

    /**
     * Set 所属工作流
     * @param WorkflowIdList 所属工作流
     */
    public void setWorkflowIdList(String [] WorkflowIdList) {
        this.WorkflowIdList = WorkflowIdList;
    }

    /**
     * Get 按照workflowName模糊查询 
     * @return WorkflowNameList 按照workflowName模糊查询
     */
    public String [] getWorkflowNameList() {
        return this.WorkflowNameList;
    }

    /**
     * Set 按照workflowName模糊查询
     * @param WorkflowNameList 按照workflowName模糊查询
     */
    public void setWorkflowNameList(String [] WorkflowNameList) {
        this.WorkflowNameList = WorkflowNameList;
    }

    /**
     * Get 关键字模糊查询 
     * @return Keyword 关键字模糊查询
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字模糊查询
     * @param Keyword 关键字模糊查询
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get searchColumns是搜索的字段名列表 
     * @return SearchColumns searchColumns是搜索的字段名列表
     */
    public String [] getSearchColumns() {
        return this.SearchColumns;
    }

    /**
     * Set searchColumns是搜索的字段名列表
     * @param SearchColumns searchColumns是搜索的字段名列表
     */
    public void setSearchColumns(String [] SearchColumns) {
        this.SearchColumns = SearchColumns;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 限制 
     * @return Limit 限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制
     * @param Limit 限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 任务类型映射关系, 存储任务类型id和任务类型描述信息 
     * @return TaskTypeMap 任务类型映射关系, 存储任务类型id和任务类型描述信息
     */
    public TaskTypeMap [] getTaskTypeMap() {
        return this.TaskTypeMap;
    }

    /**
     * Set 任务类型映射关系, 存储任务类型id和任务类型描述信息
     * @param TaskTypeMap 任务类型映射关系, 存储任务类型id和任务类型描述信息
     */
    public void setTaskTypeMap(TaskTypeMap [] TaskTypeMap) {
        this.TaskTypeMap = TaskTypeMap;
    }

    /**
     * Get 0 补录类型 1 周期实例 2 非周期实例 
     * @return InstanceType 0 补录类型 1 周期实例 2 非周期实例
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 0 补录类型 1 周期实例 2 非周期实例
     * @param InstanceType 0 补录类型 1 周期实例 2 非周期实例
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 是否dag 
     * @return DagDeal 是否dag
     */
    public Boolean getDagDeal() {
        return this.DagDeal;
    }

    /**
     * Set 是否dag
     * @param DagDeal 是否dag
     */
    public void setDagDeal(Boolean DagDeal) {
        this.DagDeal = DagDeal;
    }

    /**
     * Get  1 父实例 2 子实例 
     * @return DagType  1 父实例 2 子实例
     */
    public String getDagType() {
        return this.DagType;
    }

    /**
     * Set  1 父实例 2 子实例
     * @param DagType  1 父实例 2 子实例
     */
    public void setDagType(String DagType) {
        this.DagType = DagType;
    }

    /**
     * Get 1 自依赖 2 任务依赖  3 所有依赖 
     * @return DagDependent 1 自依赖 2 任务依赖  3 所有依赖
     */
    public String getDagDependent() {
        return this.DagDependent;
    }

    /**
     * Set 1 自依赖 2 任务依赖  3 所有依赖
     * @param DagDependent 1 自依赖 2 任务依赖  3 所有依赖
     */
    public void setDagDependent(String DagDependent) {
        this.DagDependent = DagDependent;
    }

    /**
     * Get dag深度 默认为1，取值 1-6 
     * @return DagDepth dag深度 默认为1，取值 1-6
     */
    public Long getDagDepth() {
        return this.DagDepth;
    }

    /**
     * Set dag深度 默认为1，取值 1-6
     * @param DagDepth dag深度 默认为1，取值 1-6
     */
    public void setDagDepth(Long DagDepth) {
        this.DagDepth = DagDepth;
    }

    /**
     * Get 租户id 
     * @return TenantId 租户id
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
     * @param TenantId 租户id
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 根据当前数据时间或者是下一个数据时间查询, 默认当前数据时间 
     * @return DataTimeCycle 根据当前数据时间或者是下一个数据时间查询, 默认当前数据时间
     */
    public String getDataTimeCycle() {
        return this.DataTimeCycle;
    }

    /**
     * Set 根据当前数据时间或者是下一个数据时间查询, 默认当前数据时间
     * @param DataTimeCycle 根据当前数据时间或者是下一个数据时间查询, 默认当前数据时间
     */
    public void setDataTimeCycle(String DataTimeCycle) {
        this.DataTimeCycle = DataTimeCycle;
    }

    public InstanceApiOpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceApiOpsRequest(InstanceApiOpsRequest source) {
        if (source.Instance != null) {
            this.Instance = new InstanceOpsDto(source.Instance);
        }
        if (source.SortCol != null) {
            this.SortCol = new String(source.SortCol);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.TaskNameList != null) {
            this.TaskNameList = new String[source.TaskNameList.length];
            for (int i = 0; i < source.TaskNameList.length; i++) {
                this.TaskNameList[i] = new String(source.TaskNameList[i]);
            }
        }
        if (source.FolderList != null) {
            this.FolderList = new String[source.FolderList.length];
            for (int i = 0; i < source.FolderList.length; i++) {
                this.FolderList[i] = new String(source.FolderList[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.StateList != null) {
            this.StateList = new Long[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new Long(source.StateList[i]);
            }
        }
        if (source.TaskTypeList != null) {
            this.TaskTypeList = new Long[source.TaskTypeList.length];
            for (int i = 0; i < source.TaskTypeList.length; i++) {
                this.TaskTypeList[i] = new Long(source.TaskTypeList[i]);
            }
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
        if (source.DateFrom != null) {
            this.DateFrom = new String(source.DateFrom);
        }
        if (source.DateTo != null) {
            this.DateTo = new String(source.DateTo);
        }
        if (source.CreateTimeFrom != null) {
            this.CreateTimeFrom = new String(source.CreateTimeFrom);
        }
        if (source.CreateTimeTo != null) {
            this.CreateTimeTo = new String(source.CreateTimeTo);
        }
        if (source.StartFrom != null) {
            this.StartFrom = new String(source.StartFrom);
        }
        if (source.StartTo != null) {
            this.StartTo = new String(source.StartTo);
        }
        if (source.WorkflowIdList != null) {
            this.WorkflowIdList = new String[source.WorkflowIdList.length];
            for (int i = 0; i < source.WorkflowIdList.length; i++) {
                this.WorkflowIdList[i] = new String(source.WorkflowIdList[i]);
            }
        }
        if (source.WorkflowNameList != null) {
            this.WorkflowNameList = new String[source.WorkflowNameList.length];
            for (int i = 0; i < source.WorkflowNameList.length; i++) {
                this.WorkflowNameList[i] = new String(source.WorkflowNameList[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SearchColumns != null) {
            this.SearchColumns = new String[source.SearchColumns.length];
            for (int i = 0; i < source.SearchColumns.length; i++) {
                this.SearchColumns[i] = new String(source.SearchColumns[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskTypeMap != null) {
            this.TaskTypeMap = new TaskTypeMap[source.TaskTypeMap.length];
            for (int i = 0; i < source.TaskTypeMap.length; i++) {
                this.TaskTypeMap[i] = new TaskTypeMap(source.TaskTypeMap[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DagDeal != null) {
            this.DagDeal = new Boolean(source.DagDeal);
        }
        if (source.DagType != null) {
            this.DagType = new String(source.DagType);
        }
        if (source.DagDependent != null) {
            this.DagDependent = new String(source.DagDependent);
        }
        if (source.DagDepth != null) {
            this.DagDepth = new Long(source.DagDepth);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.DataTimeCycle != null) {
            this.DataTimeCycle = new String(source.DataTimeCycle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamSimple(map, prefix + "SortCol", this.SortCol);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamArraySimple(map, prefix + "TaskNameList.", this.TaskNameList);
        this.setParamArraySimple(map, prefix + "FolderList.", this.FolderList);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);
        this.setParamArraySimple(map, prefix + "TaskTypeList.", this.TaskTypeList);
        this.setParamArraySimple(map, prefix + "CycleList.", this.CycleList);
        this.setParamArraySimple(map, prefix + "OwnerList.", this.OwnerList);
        this.setParamSimple(map, prefix + "DateFrom", this.DateFrom);
        this.setParamSimple(map, prefix + "DateTo", this.DateTo);
        this.setParamSimple(map, prefix + "CreateTimeFrom", this.CreateTimeFrom);
        this.setParamSimple(map, prefix + "CreateTimeTo", this.CreateTimeTo);
        this.setParamSimple(map, prefix + "StartFrom", this.StartFrom);
        this.setParamSimple(map, prefix + "StartTo", this.StartTo);
        this.setParamArraySimple(map, prefix + "WorkflowIdList.", this.WorkflowIdList);
        this.setParamArraySimple(map, prefix + "WorkflowNameList.", this.WorkflowNameList);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "SearchColumns.", this.SearchColumns);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "TaskTypeMap.", this.TaskTypeMap);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DagDeal", this.DagDeal);
        this.setParamSimple(map, prefix + "DagType", this.DagType);
        this.setParamSimple(map, prefix + "DagDependent", this.DagDependent);
        this.setParamSimple(map, prefix + "DagDepth", this.DagDepth);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "DataTimeCycle", this.DataTimeCycle);

    }
}

