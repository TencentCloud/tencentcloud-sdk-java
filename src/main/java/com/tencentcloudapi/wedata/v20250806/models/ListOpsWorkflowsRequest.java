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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListOpsWorkflowsRequest extends AbstractModel {

    /**
    * <p>项目Id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>分页页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>分页大小</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>文件Id</p>
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>工作流状态筛选</p><ul><li>ALL_RUNNING : 全部调度中</li><li>ALL_FREEZED : 全部已暂停</li><li>ALL_STOPPTED : 全部已下线</li><li>PART_RUNNING : 部分调度中</li><li>ALL_NO_RUNNING : 全部未调度</li><li>ALL_INVALID : 全部已失效</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>负责人Id</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle</p>
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * <p>工作流关键词过滤，支持工作流 Id/name 模糊匹配</p>
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * <p>排序项，可选CreateTime、TaskCount</p>
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * <p>排序方式，DESC或ASC, 大写</p>
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * <p>创建人Id</p>
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>更新时间，格式yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>创建时间，格式yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>项目Id</p> 
     * @return ProjectId <p>项目Id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目Id</p>
     * @param ProjectId <p>项目Id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>分页页码</p> 
     * @return PageNumber <p>分页页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码</p>
     * @param PageNumber <p>分页页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>分页大小</p> 
     * @return PageSize <p>分页大小</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小</p>
     * @param PageSize <p>分页大小</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>文件Id</p> 
     * @return FolderId <p>文件Id</p>
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件Id</p>
     * @param FolderId <p>文件Id</p>
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>工作流状态筛选</p><ul><li>ALL_RUNNING : 全部调度中</li><li>ALL_FREEZED : 全部已暂停</li><li>ALL_STOPPTED : 全部已下线</li><li>PART_RUNNING : 部分调度中</li><li>ALL_NO_RUNNING : 全部未调度</li><li>ALL_INVALID : 全部已失效</li></ul> 
     * @return Status <p>工作流状态筛选</p><ul><li>ALL_RUNNING : 全部调度中</li><li>ALL_FREEZED : 全部已暂停</li><li>ALL_STOPPTED : 全部已下线</li><li>PART_RUNNING : 部分调度中</li><li>ALL_NO_RUNNING : 全部未调度</li><li>ALL_INVALID : 全部已失效</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>工作流状态筛选</p><ul><li>ALL_RUNNING : 全部调度中</li><li>ALL_FREEZED : 全部已暂停</li><li>ALL_STOPPTED : 全部已下线</li><li>PART_RUNNING : 部分调度中</li><li>ALL_NO_RUNNING : 全部未调度</li><li>ALL_INVALID : 全部已失效</li></ul>
     * @param Status <p>工作流状态筛选</p><ul><li>ALL_RUNNING : 全部调度中</li><li>ALL_FREEZED : 全部已暂停</li><li>ALL_STOPPTED : 全部已下线</li><li>PART_RUNNING : 部分调度中</li><li>ALL_NO_RUNNING : 全部未调度</li><li>ALL_INVALID : 全部已失效</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>负责人Id</p> 
     * @return OwnerUin <p>负责人Id</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>负责人Id</p>
     * @param OwnerUin <p>负责人Id</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle</p> 
     * @return WorkflowType <p>工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle</p>
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set <p>工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle</p>
     * @param WorkflowType <p>工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle</p>
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get <p>工作流关键词过滤，支持工作流 Id/name 模糊匹配</p> 
     * @return KeyWord <p>工作流关键词过滤，支持工作流 Id/name 模糊匹配</p>
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set <p>工作流关键词过滤，支持工作流 Id/name 模糊匹配</p>
     * @param KeyWord <p>工作流关键词过滤，支持工作流 Id/name 模糊匹配</p>
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get <p>排序项，可选CreateTime、TaskCount</p> 
     * @return SortItem <p>排序项，可选CreateTime、TaskCount</p>
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set <p>排序项，可选CreateTime、TaskCount</p>
     * @param SortItem <p>排序项，可选CreateTime、TaskCount</p>
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get <p>排序方式，DESC或ASC, 大写</p> 
     * @return SortType <p>排序方式，DESC或ASC, 大写</p>
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>排序方式，DESC或ASC, 大写</p>
     * @param SortType <p>排序方式，DESC或ASC, 大写</p>
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>创建人Id</p> 
     * @return CreateUserUin <p>创建人Id</p>
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人Id</p>
     * @param CreateUserUin <p>创建人Id</p>
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>更新时间，格式yyyy-MM-dd HH:mm:ss</p> 
     * @return ModifyTime <p>更新时间，格式yyyy-MM-dd HH:mm:ss</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>更新时间，格式yyyy-MM-dd HH:mm:ss</p>
     * @param ModifyTime <p>更新时间，格式yyyy-MM-dd HH:mm:ss</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>创建时间，格式yyyy-MM-dd HH:mm:ss</p> 
     * @return CreateTime <p>创建时间，格式yyyy-MM-dd HH:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，格式yyyy-MM-dd HH:mm:ss</p>
     * @param CreateTime <p>创建时间，格式yyyy-MM-dd HH:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ListOpsWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOpsWorkflowsRequest(ListOpsWorkflowsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

