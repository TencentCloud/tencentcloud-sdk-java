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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchStudioProductRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 列表Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 列表Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 产品Status
    */
    @SerializedName("DevStatus")
    @Expose
    private String DevStatus;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 每次请求的Filters的上限为10，Filter.Values的上限为1。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 列表Limit 
     * @return Limit 列表Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表Limit
     * @param Limit 列表Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 列表Offset 
     * @return Offset 列表Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 列表Offset
     * @param Offset 列表Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 产品Status 
     * @return DevStatus 产品Status
     */
    public String getDevStatus() {
        return this.DevStatus;
    }

    /**
     * Set 产品Status
     * @param DevStatus 产品Status
     */
    public void setDevStatus(String DevStatus) {
        this.DevStatus = DevStatus;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 每次请求的Filters的上限为10，Filter.Values的上限为1。 
     * @return Filters 每次请求的Filters的上限为10，Filter.Values的上限为1。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的Filters的上限为10，Filter.Values的上限为1。
     * @param Filters 每次请求的Filters的上限为10，Filter.Values的上限为1。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public SearchStudioProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchStudioProductRequest(SearchStudioProductRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DevStatus != null) {
            this.DevStatus = new String(source.DevStatus);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DevStatus", this.DevStatus);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

