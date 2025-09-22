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
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
    * 文件Id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 工作流状态筛选
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 负责人Id
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * 工作流关键词过滤，支持工作流 Id/name 模糊匹配
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 排序项，可选CreateTime、TaskCount
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * 排序方式，DESC或ASC, 大写
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 创建人Id
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 更新时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get 文件Id 
     * @return FolderId 文件Id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件Id
     * @param FolderId 文件Id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 工作流状态筛选
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效 
     * @return Status 工作流状态筛选
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 工作流状态筛选
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
     * @param Status 工作流状态筛选
* ALL_RUNNING : 全部调度中
* ALL_FREEZED : 全部已暂停
* ALL_STOPPTED : 全部已下线
* PART_RUNNING : 部分调度中
* ALL_NO_RUNNING : 全部未调度
* ALL_INVALID : 全部已失效
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 负责人Id 
     * @return OwnerUin 负责人Id
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 负责人Id
     * @param OwnerUin 负责人Id
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle 
     * @return WorkflowType 工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set 工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle
     * @param WorkflowType 工作流类型筛选, 支持值 Cycle或Manual. 默认只查询 Cycle
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get 工作流关键词过滤，支持工作流 Id/name 模糊匹配 
     * @return KeyWord 工作流关键词过滤，支持工作流 Id/name 模糊匹配
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 工作流关键词过滤，支持工作流 Id/name 模糊匹配
     * @param KeyWord 工作流关键词过滤，支持工作流 Id/name 模糊匹配
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 排序项，可选CreateTime、TaskCount 
     * @return SortItem 排序项，可选CreateTime、TaskCount
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set 排序项，可选CreateTime、TaskCount
     * @param SortItem 排序项，可选CreateTime、TaskCount
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get 排序方式，DESC或ASC, 大写 
     * @return SortType 排序方式，DESC或ASC, 大写
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序方式，DESC或ASC, 大写
     * @param SortType 排序方式，DESC或ASC, 大写
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 创建人Id 
     * @return CreateUserUin 创建人Id
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人Id
     * @param CreateUserUin 创建人Id
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 更新时间，格式yyyy-MM-dd HH:mm:ss 
     * @return ModifyTime 更新时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间，格式yyyy-MM-dd HH:mm:ss
     * @param ModifyTime 更新时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建时间，格式yyyy-MM-dd HH:mm:ss 
     * @return CreateTime 创建时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，格式yyyy-MM-dd HH:mm:ss
     * @param CreateTime 创建时间，格式yyyy-MM-dd HH:mm:ss
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

