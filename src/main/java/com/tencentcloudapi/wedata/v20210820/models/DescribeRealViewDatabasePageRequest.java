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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealViewDatabasePageRequest extends AbstractModel {

    /**
    * 数据源ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 排序字段类型：ASC/DESC
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
    * 指定数据源链接方式，如hive jdbc或者metastore client
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * Keyword过滤
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 【分页参数】页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 【分页参数】分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 资源组ID
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 资源组类型
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * Sort
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * catalog名称
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
     * Get 数据源ID 
     * @return DatasourceId 数据源ID
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
     * @param DatasourceId 数据源ID
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

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
     * Get 排序字段类型：ASC/DESC 
     * @return Asc 排序字段类型：ASC/DESC
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 排序字段类型：ASC/DESC
     * @param Asc 排序字段类型：ASC/DESC
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    /**
     * Get 指定数据源链接方式，如hive jdbc或者metastore client 
     * @return ConnectionType 指定数据源链接方式，如hive jdbc或者metastore client
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set 指定数据源链接方式，如hive jdbc或者metastore client
     * @param ConnectionType 指定数据源链接方式，如hive jdbc或者metastore client
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get Keyword过滤 
     * @return Keyword Keyword过滤
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword过滤
     * @param Keyword Keyword过滤
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 【分页参数】页码 
     * @return PageNumber 【分页参数】页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 【分页参数】页码
     * @param PageNumber 【分页参数】页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 【分页参数】分页大小 
     * @return PageSize 【分页参数】分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 【分页参数】分页大小
     * @param PageSize 【分页参数】分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 资源组ID 
     * @return ResourceGroupId 资源组ID
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组ID
     * @param ResourceGroupId 资源组ID
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 资源组类型 
     * @return ResourceType 资源组类型
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源组类型
     * @param ResourceType 资源组类型
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Sort 
     * @return Sort Sort
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sort
     * @param Sort Sort
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get catalog名称 
     * @return CatalogName catalog名称
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set catalog名称
     * @param CatalogName catalog名称
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    public DescribeRealViewDatabasePageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealViewDatabasePageRequest(DescribeRealViewDatabasePageRequest source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);

    }
}

