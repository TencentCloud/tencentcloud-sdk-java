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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceUserGroupPageListRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 页面Id
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 是否分页
    */
    @SerializedName("AllPage")
    @Expose
    private Long AllPage;

    /**
    * 模糊搜索关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 每页条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 标签过滤条件
    */
    @SerializedName("TagValueList")
    @Expose
    private ResourceTagValue [] TagValueList;

    /**
    * 角色
    */
    @SerializedName("ModuleCollection")
    @Expose
    private String ModuleCollection;

    /**
    * 是否授权
    */
    @SerializedName("ResourceValue")
    @Expose
    private String ResourceValue;

    /**
    * 权限类型
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 父id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 资源id
    */
    @SerializedName("EntityId")
    @Expose
    private Long EntityId;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页面Id 
     * @return PageId 页面Id
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set 页面Id
     * @param PageId 页面Id
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 是否分页 
     * @return AllPage 是否分页
     */
    public Long getAllPage() {
        return this.AllPage;
    }

    /**
     * Set 是否分页
     * @param AllPage 是否分页
     */
    public void setAllPage(Long AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 模糊搜索关键字 
     * @return Keyword 模糊搜索关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 模糊搜索关键字
     * @param Keyword 模糊搜索关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 页码 
     * @return PageNo 页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码
     * @param PageNo 页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 每页条数 
     * @return PageSize 每页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数
     * @param PageSize 每页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 标签过滤条件 
     * @return TagValueList 标签过滤条件
     */
    public ResourceTagValue [] getTagValueList() {
        return this.TagValueList;
    }

    /**
     * Set 标签过滤条件
     * @param TagValueList 标签过滤条件
     */
    public void setTagValueList(ResourceTagValue [] TagValueList) {
        this.TagValueList = TagValueList;
    }

    /**
     * Get 角色 
     * @return ModuleCollection 角色
     */
    public String getModuleCollection() {
        return this.ModuleCollection;
    }

    /**
     * Set 角色
     * @param ModuleCollection 角色
     */
    public void setModuleCollection(String ModuleCollection) {
        this.ModuleCollection = ModuleCollection;
    }

    /**
     * Get 是否授权 
     * @return ResourceValue 是否授权
     */
    public String getResourceValue() {
        return this.ResourceValue;
    }

    /**
     * Set 是否授权
     * @param ResourceValue 是否授权
     */
    public void setResourceValue(String ResourceValue) {
        this.ResourceValue = ResourceValue;
    }

    /**
     * Get 权限类型 
     * @return ResourceName 权限类型
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 权限类型
     * @param ResourceName 权限类型
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 父id 
     * @return ParentId 父id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父id
     * @param ParentId 父id
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 资源id 
     * @return EntityId 资源id
     */
    public Long getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 资源id
     * @param EntityId 资源id
     */
    public void setEntityId(Long EntityId) {
        this.EntityId = EntityId;
    }

    public DescribeResourceUserGroupPageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceUserGroupPageListRequest(DescribeResourceUserGroupPageListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.AllPage != null) {
            this.AllPage = new Long(source.AllPage);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TagValueList != null) {
            this.TagValueList = new ResourceTagValue[source.TagValueList.length];
            for (int i = 0; i < source.TagValueList.length; i++) {
                this.TagValueList[i] = new ResourceTagValue(source.TagValueList[i]);
            }
        }
        if (source.ModuleCollection != null) {
            this.ModuleCollection = new String(source.ModuleCollection);
        }
        if (source.ResourceValue != null) {
            this.ResourceValue = new String(source.ResourceValue);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.EntityId != null) {
            this.EntityId = new Long(source.EntityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "TagValueList.", this.TagValueList);
        this.setParamSimple(map, prefix + "ModuleCollection", this.ModuleCollection);
        this.setParamSimple(map, prefix + "ResourceValue", this.ResourceValue);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);

    }
}

