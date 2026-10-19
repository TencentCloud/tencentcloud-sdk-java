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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkflowRunSummaryListRequest extends AbstractModel {

    /**
    * <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>每页数量(取值范围1-200)</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>页码(必须大于0)</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>运行环境。1:开发域，2:生产域    -</p>
    */
    @SerializedName("Domain")
    @Expose
    private Long Domain;

    /**
    * <p>参数过滤</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
     * Get <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p> 
     * @return AppId <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     * @param AppId <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>每页数量(取值范围1-200)</p> 
     * @return PageSize <p>每页数量(取值范围1-200)</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量(取值范围1-200)</p>
     * @param PageSize <p>每页数量(取值范围1-200)</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>页码(必须大于0)</p> 
     * @return PageNumber <p>页码(必须大于0)</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码(必须大于0)</p>
     * @param PageNumber <p>页码(必须大于0)</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>运行环境。1:开发域，2:生产域    -</p> 
     * @return Domain <p>运行环境。1:开发域，2:生产域    -</p>
     */
    public Long getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>运行环境。1:开发域，2:生产域    -</p>
     * @param Domain <p>运行环境。1:开发域，2:生产域    -</p>
     */
    public void setDomain(Long Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>参数过滤</p> 
     * @return FilterList <p>参数过滤</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>参数过滤</p>
     * @param FilterList <p>参数过滤</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    public DescribeWorkflowRunSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkflowRunSummaryListRequest(DescribeWorkflowRunSummaryListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Domain != null) {
            this.Domain = new Long(source.Domain);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);

    }
}

