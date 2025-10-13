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

public class ListResourceGroupsRequest extends AbstractModel {

    /**
    * 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资源组id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 搜索的执行资源组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目空间id查询列表
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组 
     * @return Type 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
     * @param Type 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资源组id 
     * @return Id 资源组id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源组id
     * @param Id 资源组id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 搜索的执行资源组名称 
     * @return Name 搜索的执行资源组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 搜索的执行资源组名称
     * @param Name 搜索的执行资源组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目空间id查询列表 
     * @return ProjectIds 项目空间id查询列表
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目空间id查询列表
     * @param ProjectIds 项目空间id查询列表
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 页数 
     * @return PageNumber 页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页数
     * @param PageNumber 页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListResourceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListResourceGroupsRequest(ListResourceGroupsRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

