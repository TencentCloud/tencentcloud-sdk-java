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

public class DescribeBatchOperateTaskRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private String Page;

    /**
    * 页号
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 状态列表
草稿：'NS'，'N','P','R'
运行：''Y'
停止：'F'
冻结：'O'
停止中：'T'
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

    /**
    * 责任人名列表
    */
    @SerializedName("OwnerNameList")
    @Expose
    private String [] OwnerNameList;

    /**
    * 工作流列表
    */
    @SerializedName("WorkflowIdList")
    @Expose
    private String [] WorkflowIdList;

    /**
    * 任务名称搜索
    */
    @SerializedName("TaskNameFilter")
    @Expose
    private String TaskNameFilter;

    /**
    * 任务类型列表
    */
    @SerializedName("TaskTypeList")
    @Expose
    private String [] TaskTypeList;

    /**
    * 文件夹列表
    */
    @SerializedName("FordIdList")
    @Expose
    private String [] FordIdList;

    /**
    * 任务Id搜索
    */
    @SerializedName("TaskIdFilter")
    @Expose
    private String TaskIdFilter;

    /**
    * 责任人搜索
    */
    @SerializedName("OwnerNameFilter")
    @Expose
    private String OwnerNameFilter;

    /**
    * 排序字段：
UpdateTime
CreateTime
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * asc:升序
desc:降序
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 引擎类型列表：三种
SparkJob
SparkSql
presto
    */
    @SerializedName("DataEngineList")
    @Expose
    private String [] DataEngineList;

    /**
    * 操作人名
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 1
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 1
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 数据源ID列表
    */
    @SerializedName("DatasourceIdList")
    @Expose
    private String [] DatasourceIdList;

    /**
    * 数据源类型列表
    */
    @SerializedName("DatasourceTypeList")
    @Expose
    private String [] DatasourceTypeList;

    /**
    * 调度单位类型列表
    */
    @SerializedName("CycleUnitList")
    @Expose
    private String [] CycleUnitList;

    /**
    * 是否筛选出可提交的任务
    */
    @SerializedName("CanSubmit")
    @Expose
    private Boolean CanSubmit;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public String getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(String Page) {
        this.Page = Page;
    }

    /**
     * Get 页号 
     * @return Size 页号
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 页号
     * @param Size 页号
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 状态列表
草稿：'NS'，'N','P','R'
运行：''Y'
停止：'F'
冻结：'O'
停止中：'T' 
     * @return StatusList 状态列表
草稿：'NS'，'N','P','R'
运行：''Y'
停止：'F'
冻结：'O'
停止中：'T'
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 状态列表
草稿：'NS'，'N','P','R'
运行：''Y'
停止：'F'
冻结：'O'
停止中：'T'
     * @param StatusList 状态列表
草稿：'NS'，'N','P','R'
运行：''Y'
停止：'F'
冻结：'O'
停止中：'T'
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get 责任人名列表 
     * @return OwnerNameList 责任人名列表
     */
    public String [] getOwnerNameList() {
        return this.OwnerNameList;
    }

    /**
     * Set 责任人名列表
     * @param OwnerNameList 责任人名列表
     */
    public void setOwnerNameList(String [] OwnerNameList) {
        this.OwnerNameList = OwnerNameList;
    }

    /**
     * Get 工作流列表 
     * @return WorkflowIdList 工作流列表
     */
    public String [] getWorkflowIdList() {
        return this.WorkflowIdList;
    }

    /**
     * Set 工作流列表
     * @param WorkflowIdList 工作流列表
     */
    public void setWorkflowIdList(String [] WorkflowIdList) {
        this.WorkflowIdList = WorkflowIdList;
    }

    /**
     * Get 任务名称搜索 
     * @return TaskNameFilter 任务名称搜索
     */
    public String getTaskNameFilter() {
        return this.TaskNameFilter;
    }

    /**
     * Set 任务名称搜索
     * @param TaskNameFilter 任务名称搜索
     */
    public void setTaskNameFilter(String TaskNameFilter) {
        this.TaskNameFilter = TaskNameFilter;
    }

    /**
     * Get 任务类型列表 
     * @return TaskTypeList 任务类型列表
     */
    public String [] getTaskTypeList() {
        return this.TaskTypeList;
    }

    /**
     * Set 任务类型列表
     * @param TaskTypeList 任务类型列表
     */
    public void setTaskTypeList(String [] TaskTypeList) {
        this.TaskTypeList = TaskTypeList;
    }

    /**
     * Get 文件夹列表 
     * @return FordIdList 文件夹列表
     */
    public String [] getFordIdList() {
        return this.FordIdList;
    }

    /**
     * Set 文件夹列表
     * @param FordIdList 文件夹列表
     */
    public void setFordIdList(String [] FordIdList) {
        this.FordIdList = FordIdList;
    }

    /**
     * Get 任务Id搜索 
     * @return TaskIdFilter 任务Id搜索
     */
    public String getTaskIdFilter() {
        return this.TaskIdFilter;
    }

    /**
     * Set 任务Id搜索
     * @param TaskIdFilter 任务Id搜索
     */
    public void setTaskIdFilter(String TaskIdFilter) {
        this.TaskIdFilter = TaskIdFilter;
    }

    /**
     * Get 责任人搜索 
     * @return OwnerNameFilter 责任人搜索
     */
    public String getOwnerNameFilter() {
        return this.OwnerNameFilter;
    }

    /**
     * Set 责任人搜索
     * @param OwnerNameFilter 责任人搜索
     */
    public void setOwnerNameFilter(String OwnerNameFilter) {
        this.OwnerNameFilter = OwnerNameFilter;
    }

    /**
     * Get 排序字段：
UpdateTime
CreateTime 
     * @return SortItem 排序字段：
UpdateTime
CreateTime
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set 排序字段：
UpdateTime
CreateTime
     * @param SortItem 排序字段：
UpdateTime
CreateTime
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get asc:升序
desc:降序 
     * @return SortType asc:升序
desc:降序
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set asc:升序
desc:降序
     * @param SortType asc:升序
desc:降序
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 引擎类型列表：三种
SparkJob
SparkSql
presto 
     * @return DataEngineList 引擎类型列表：三种
SparkJob
SparkSql
presto
     */
    public String [] getDataEngineList() {
        return this.DataEngineList;
    }

    /**
     * Set 引擎类型列表：三种
SparkJob
SparkSql
presto
     * @param DataEngineList 引擎类型列表：三种
SparkJob
SparkSql
presto
     */
    public void setDataEngineList(String [] DataEngineList) {
        this.DataEngineList = DataEngineList;
    }

    /**
     * Get 操作人名 
     * @return UserId 操作人名
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 操作人名
     * @param UserId 操作人名
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 1 
     * @return OwnerId 1
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 1
     * @param OwnerId 1
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 1 
     * @return TenantId 1
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 1
     * @param TenantId 1
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 数据源ID列表 
     * @return DatasourceIdList 数据源ID列表
     */
    public String [] getDatasourceIdList() {
        return this.DatasourceIdList;
    }

    /**
     * Set 数据源ID列表
     * @param DatasourceIdList 数据源ID列表
     */
    public void setDatasourceIdList(String [] DatasourceIdList) {
        this.DatasourceIdList = DatasourceIdList;
    }

    /**
     * Get 数据源类型列表 
     * @return DatasourceTypeList 数据源类型列表
     */
    public String [] getDatasourceTypeList() {
        return this.DatasourceTypeList;
    }

    /**
     * Set 数据源类型列表
     * @param DatasourceTypeList 数据源类型列表
     */
    public void setDatasourceTypeList(String [] DatasourceTypeList) {
        this.DatasourceTypeList = DatasourceTypeList;
    }

    /**
     * Get 调度单位类型列表 
     * @return CycleUnitList 调度单位类型列表
     */
    public String [] getCycleUnitList() {
        return this.CycleUnitList;
    }

    /**
     * Set 调度单位类型列表
     * @param CycleUnitList 调度单位类型列表
     */
    public void setCycleUnitList(String [] CycleUnitList) {
        this.CycleUnitList = CycleUnitList;
    }

    /**
     * Get 是否筛选出可提交的任务 
     * @return CanSubmit 是否筛选出可提交的任务
     */
    public Boolean getCanSubmit() {
        return this.CanSubmit;
    }

    /**
     * Set 是否筛选出可提交的任务
     * @param CanSubmit 是否筛选出可提交的任务
     */
    public void setCanSubmit(Boolean CanSubmit) {
        this.CanSubmit = CanSubmit;
    }

    public DescribeBatchOperateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchOperateTaskRequest(DescribeBatchOperateTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Page != null) {
            this.Page = new String(source.Page);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
        if (source.OwnerNameList != null) {
            this.OwnerNameList = new String[source.OwnerNameList.length];
            for (int i = 0; i < source.OwnerNameList.length; i++) {
                this.OwnerNameList[i] = new String(source.OwnerNameList[i]);
            }
        }
        if (source.WorkflowIdList != null) {
            this.WorkflowIdList = new String[source.WorkflowIdList.length];
            for (int i = 0; i < source.WorkflowIdList.length; i++) {
                this.WorkflowIdList[i] = new String(source.WorkflowIdList[i]);
            }
        }
        if (source.TaskNameFilter != null) {
            this.TaskNameFilter = new String(source.TaskNameFilter);
        }
        if (source.TaskTypeList != null) {
            this.TaskTypeList = new String[source.TaskTypeList.length];
            for (int i = 0; i < source.TaskTypeList.length; i++) {
                this.TaskTypeList[i] = new String(source.TaskTypeList[i]);
            }
        }
        if (source.FordIdList != null) {
            this.FordIdList = new String[source.FordIdList.length];
            for (int i = 0; i < source.FordIdList.length; i++) {
                this.FordIdList[i] = new String(source.FordIdList[i]);
            }
        }
        if (source.TaskIdFilter != null) {
            this.TaskIdFilter = new String(source.TaskIdFilter);
        }
        if (source.OwnerNameFilter != null) {
            this.OwnerNameFilter = new String(source.OwnerNameFilter);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.DataEngineList != null) {
            this.DataEngineList = new String[source.DataEngineList.length];
            for (int i = 0; i < source.DataEngineList.length; i++) {
                this.DataEngineList[i] = new String(source.DataEngineList[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.DatasourceIdList != null) {
            this.DatasourceIdList = new String[source.DatasourceIdList.length];
            for (int i = 0; i < source.DatasourceIdList.length; i++) {
                this.DatasourceIdList[i] = new String(source.DatasourceIdList[i]);
            }
        }
        if (source.DatasourceTypeList != null) {
            this.DatasourceTypeList = new String[source.DatasourceTypeList.length];
            for (int i = 0; i < source.DatasourceTypeList.length; i++) {
                this.DatasourceTypeList[i] = new String(source.DatasourceTypeList[i]);
            }
        }
        if (source.CycleUnitList != null) {
            this.CycleUnitList = new String[source.CycleUnitList.length];
            for (int i = 0; i < source.CycleUnitList.length; i++) {
                this.CycleUnitList[i] = new String(source.CycleUnitList[i]);
            }
        }
        if (source.CanSubmit != null) {
            this.CanSubmit = new Boolean(source.CanSubmit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamArraySimple(map, prefix + "OwnerNameList.", this.OwnerNameList);
        this.setParamArraySimple(map, prefix + "WorkflowIdList.", this.WorkflowIdList);
        this.setParamSimple(map, prefix + "TaskNameFilter", this.TaskNameFilter);
        this.setParamArraySimple(map, prefix + "TaskTypeList.", this.TaskTypeList);
        this.setParamArraySimple(map, prefix + "FordIdList.", this.FordIdList);
        this.setParamSimple(map, prefix + "TaskIdFilter", this.TaskIdFilter);
        this.setParamSimple(map, prefix + "OwnerNameFilter", this.OwnerNameFilter);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamArraySimple(map, prefix + "DataEngineList.", this.DataEngineList);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamArraySimple(map, prefix + "DatasourceIdList.", this.DatasourceIdList);
        this.setParamArraySimple(map, prefix + "DatasourceTypeList.", this.DatasourceTypeList);
        this.setParamArraySimple(map, prefix + "CycleUnitList.", this.CycleUnitList);
        this.setParamSimple(map, prefix + "CanSubmit", this.CanSubmit);

    }
}

