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

public class DescribeOpsWorkflowsRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务产品类型名称列表，以 ',' 号分割
    */
    @SerializedName("ProductNameList")
    @Expose
    private String ProductNameList;

    /**
    * 文件id列表，以 ',' 号分割
    */
    @SerializedName("FolderIdList")
    @Expose
    private String FolderIdList;

    /**
    * 工作流id，以 ',' 号分割
    */
    @SerializedName("WorkFlowIdList")
    @Expose
    private String WorkFlowIdList;

    /**
    * 工作流名称列表，以 ',' 号分割
    */
    @SerializedName("WorkFlowNameList")
    @Expose
    private String WorkFlowNameList;

    /**
    * 任务名称列表，以 ',' 号分割
    */
    @SerializedName("TaskNameList")
    @Expose
    private String TaskNameList;

    /**
    * 任务id列表，以 ',' 号分割
    */
    @SerializedName("TaskIdList")
    @Expose
    private String TaskIdList;

    /**
    * 状态列表，以 ',' 号分割
    */
    @SerializedName("StatusList")
    @Expose
    private String StatusList;

    /**
    * 负责人列表，以 ',' 号分割
    */
    @SerializedName("InChargeList")
    @Expose
    private String InChargeList;

    /**
    * 分页页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序项
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * 排序方式，DESC或ASC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

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
     * Get 任务产品类型名称列表，以 ',' 号分割 
     * @return ProductNameList 任务产品类型名称列表，以 ',' 号分割
     */
    public String getProductNameList() {
        return this.ProductNameList;
    }

    /**
     * Set 任务产品类型名称列表，以 ',' 号分割
     * @param ProductNameList 任务产品类型名称列表，以 ',' 号分割
     */
    public void setProductNameList(String ProductNameList) {
        this.ProductNameList = ProductNameList;
    }

    /**
     * Get 文件id列表，以 ',' 号分割 
     * @return FolderIdList 文件id列表，以 ',' 号分割
     */
    public String getFolderIdList() {
        return this.FolderIdList;
    }

    /**
     * Set 文件id列表，以 ',' 号分割
     * @param FolderIdList 文件id列表，以 ',' 号分割
     */
    public void setFolderIdList(String FolderIdList) {
        this.FolderIdList = FolderIdList;
    }

    /**
     * Get 工作流id，以 ',' 号分割 
     * @return WorkFlowIdList 工作流id，以 ',' 号分割
     */
    public String getWorkFlowIdList() {
        return this.WorkFlowIdList;
    }

    /**
     * Set 工作流id，以 ',' 号分割
     * @param WorkFlowIdList 工作流id，以 ',' 号分割
     */
    public void setWorkFlowIdList(String WorkFlowIdList) {
        this.WorkFlowIdList = WorkFlowIdList;
    }

    /**
     * Get 工作流名称列表，以 ',' 号分割 
     * @return WorkFlowNameList 工作流名称列表，以 ',' 号分割
     */
    public String getWorkFlowNameList() {
        return this.WorkFlowNameList;
    }

    /**
     * Set 工作流名称列表，以 ',' 号分割
     * @param WorkFlowNameList 工作流名称列表，以 ',' 号分割
     */
    public void setWorkFlowNameList(String WorkFlowNameList) {
        this.WorkFlowNameList = WorkFlowNameList;
    }

    /**
     * Get 任务名称列表，以 ',' 号分割 
     * @return TaskNameList 任务名称列表，以 ',' 号分割
     */
    public String getTaskNameList() {
        return this.TaskNameList;
    }

    /**
     * Set 任务名称列表，以 ',' 号分割
     * @param TaskNameList 任务名称列表，以 ',' 号分割
     */
    public void setTaskNameList(String TaskNameList) {
        this.TaskNameList = TaskNameList;
    }

    /**
     * Get 任务id列表，以 ',' 号分割 
     * @return TaskIdList 任务id列表，以 ',' 号分割
     */
    public String getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 任务id列表，以 ',' 号分割
     * @param TaskIdList 任务id列表，以 ',' 号分割
     */
    public void setTaskIdList(String TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 状态列表，以 ',' 号分割 
     * @return StatusList 状态列表，以 ',' 号分割
     */
    public String getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 状态列表，以 ',' 号分割
     * @param StatusList 状态列表，以 ',' 号分割
     */
    public void setStatusList(String StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get 负责人列表，以 ',' 号分割 
     * @return InChargeList 负责人列表，以 ',' 号分割
     */
    public String getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set 负责人列表，以 ',' 号分割
     * @param InChargeList 负责人列表，以 ',' 号分割
     */
    public void setInChargeList(String InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get 分页页码 
     * @return PageNumber 分页页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码
     * @param PageNumber 分页页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序项 
     * @return SortItem 排序项
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set 排序项
     * @param SortItem 排序项
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get 排序方式，DESC或ASC 
     * @return SortType 排序方式，DESC或ASC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序方式，DESC或ASC
     * @param SortType 排序方式，DESC或ASC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    public DescribeOpsWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOpsWorkflowsRequest(DescribeOpsWorkflowsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProductNameList != null) {
            this.ProductNameList = new String(source.ProductNameList);
        }
        if (source.FolderIdList != null) {
            this.FolderIdList = new String(source.FolderIdList);
        }
        if (source.WorkFlowIdList != null) {
            this.WorkFlowIdList = new String(source.WorkFlowIdList);
        }
        if (source.WorkFlowNameList != null) {
            this.WorkFlowNameList = new String(source.WorkFlowNameList);
        }
        if (source.TaskNameList != null) {
            this.TaskNameList = new String(source.TaskNameList);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String(source.TaskIdList);
        }
        if (source.StatusList != null) {
            this.StatusList = new String(source.StatusList);
        }
        if (source.InChargeList != null) {
            this.InChargeList = new String(source.InChargeList);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProductNameList", this.ProductNameList);
        this.setParamSimple(map, prefix + "FolderIdList", this.FolderIdList);
        this.setParamSimple(map, prefix + "WorkFlowIdList", this.WorkFlowIdList);
        this.setParamSimple(map, prefix + "WorkFlowNameList", this.WorkFlowNameList);
        this.setParamSimple(map, prefix + "TaskNameList", this.TaskNameList);
        this.setParamSimple(map, prefix + "TaskIdList", this.TaskIdList);
        this.setParamSimple(map, prefix + "StatusList", this.StatusList);
        this.setParamSimple(map, prefix + "InChargeList", this.InChargeList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

