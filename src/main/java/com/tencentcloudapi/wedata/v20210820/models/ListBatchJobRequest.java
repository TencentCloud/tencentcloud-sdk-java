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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListBatchJobRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 操作类型
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 操作人Id
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 开始操作时间
    */
    @SerializedName("StartOperateTime")
    @Expose
    private String StartOperateTime;

    /**
    * 截止操作时间
    */
    @SerializedName("EndOperateTime")
    @Expose
    private String EndOperateTime;

    /**
    * 分页，页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 分页，页内条数
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 按更新时间排序排序
--desc
--asc
默认desc
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 排序字段，如创建时间：
CreateTime
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

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
     * Get 操作类型 
     * @return JobType 操作类型
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 操作类型
     * @param JobType 操作类型
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 操作人Id 
     * @return OwnerId 操作人Id
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 操作人Id
     * @param OwnerId 操作人Id
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 开始操作时间 
     * @return StartOperateTime 开始操作时间
     */
    public String getStartOperateTime() {
        return this.StartOperateTime;
    }

    /**
     * Set 开始操作时间
     * @param StartOperateTime 开始操作时间
     */
    public void setStartOperateTime(String StartOperateTime) {
        this.StartOperateTime = StartOperateTime;
    }

    /**
     * Get 截止操作时间 
     * @return EndOperateTime 截止操作时间
     */
    public String getEndOperateTime() {
        return this.EndOperateTime;
    }

    /**
     * Set 截止操作时间
     * @param EndOperateTime 截止操作时间
     */
    public void setEndOperateTime(String EndOperateTime) {
        this.EndOperateTime = EndOperateTime;
    }

    /**
     * Get 分页，页码 
     * @return Page 分页，页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页，页码
     * @param Page 分页，页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 分页，页内条数 
     * @return Size 分页，页内条数
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 分页，页内条数
     * @param Size 分页，页内条数
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 按更新时间排序排序
--desc
--asc
默认desc 
     * @return SortType 按更新时间排序排序
--desc
--asc
默认desc
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 按更新时间排序排序
--desc
--asc
默认desc
     * @param SortType 按更新时间排序排序
--desc
--asc
默认desc
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 排序字段，如创建时间：
CreateTime 
     * @return SortItem 排序字段，如创建时间：
CreateTime
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set 排序字段，如创建时间：
CreateTime
     * @param SortItem 排序字段，如创建时间：
CreateTime
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    public ListBatchJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListBatchJobRequest(ListBatchJobRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.StartOperateTime != null) {
            this.StartOperateTime = new String(source.StartOperateTime);
        }
        if (source.EndOperateTime != null) {
            this.EndOperateTime = new String(source.EndOperateTime);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "StartOperateTime", this.StartOperateTime);
        this.setParamSimple(map, prefix + "EndOperateTime", this.EndOperateTime);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);

    }
}

