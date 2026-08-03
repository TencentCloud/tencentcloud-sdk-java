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

public class ListRayClusterJobsResponse extends AbstractModel {

    /**
    * 当前页码（从1开始）
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总页数
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * 该集群下的Ray作业列表
    */
    @SerializedName("Items")
    @Expose
    private RayJobSubmitEntity [] Items;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前页码（从1开始） 
     * @return Page 当前页码（从1开始）
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 当前页码（从1开始）
     * @param Page 当前页码（从1开始）
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页数量 
     * @return PageSize 每页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量
     * @param PageSize 每页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总页数 
     * @return TotalPages 总页数
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 总页数
     * @param TotalPages 总页数
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get 该集群下的Ray作业列表 
     * @return Items 该集群下的Ray作业列表
     */
    public RayJobSubmitEntity [] getItems() {
        return this.Items;
    }

    /**
     * Set 该集群下的Ray作业列表
     * @param Items 该集群下的Ray作业列表
     */
    public void setItems(RayJobSubmitEntity [] Items) {
        this.Items = Items;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListRayClusterJobsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRayClusterJobsResponse(ListRayClusterJobsResponse source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
        if (source.Items != null) {
            this.Items = new RayJobSubmitEntity[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new RayJobSubmitEntity(source.Items[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

