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

public class DescribeDataSourceInfoListRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤条件（暂不支持）
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * 排序配置
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField OrderFields;

    /**
    * 数据源类型，必选（如MYSQL、DLC等）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源名称过滤
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

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
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页数 
     * @return PageSize 页数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页数
     * @param PageSize 页数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 过滤条件（暂不支持） 
     * @return Filters 过滤条件（暂不支持）
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件（暂不支持）
     * @param Filters 过滤条件（暂不支持）
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序配置 
     * @return OrderFields 排序配置
     */
    public OrderField getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序配置
     * @param OrderFields 排序配置
     */
    public void setOrderFields(OrderField OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 数据源类型，必选（如MYSQL、DLC等） 
     * @return Type 数据源类型，必选（如MYSQL、DLC等）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型，必选（如MYSQL、DLC等）
     * @param Type 数据源类型，必选（如MYSQL、DLC等）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源名称过滤 
     * @return DatasourceName 数据源名称过滤
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set 数据源名称过滤
     * @param DatasourceName 数据源名称过滤
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    public DescribeDataSourceInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataSourceInfoListRequest(DescribeDataSourceInfoListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField(source.OrderFields);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);

    }
}

