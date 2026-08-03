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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRayClusterHistoryRequest extends AbstractModel {

    /**
    * <p>集群/数据实验室ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>当前页码（从1开始）</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页数量</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>集群/数据实验室ID</p> 
     * @return Id <p>集群/数据实验室ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>集群/数据实验室ID</p>
     * @param Id <p>集群/数据实验室ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>当前页码（从1开始）</p> 
     * @return Page <p>当前页码（从1开始）</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>当前页码（从1开始）</p>
     * @param Page <p>当前页码（从1开始）</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页数量</p> 
     * @return PageSize <p>每页数量</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量</p>
     * @param PageSize <p>每页数量</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public GetRayClusterHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRayClusterHistoryRequest(GetRayClusterHistoryRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

