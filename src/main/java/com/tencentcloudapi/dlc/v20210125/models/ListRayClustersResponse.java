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

public class ListRayClustersResponse extends AbstractModel {

    /**
    * <p>总记录数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

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
    * <p>总页数</p>
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * <p>Ray cluster列表</p>
    */
    @SerializedName("Items")
    @Expose
    private RayClusterEntity [] Items;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总记录数</p> 
     * @return Total <p>总记录数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>总记录数</p>
     * @param Total <p>总记录数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    /**
     * Get <p>总页数</p> 
     * @return TotalPages <p>总页数</p>
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set <p>总页数</p>
     * @param TotalPages <p>总页数</p>
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get <p>Ray cluster列表</p> 
     * @return Items <p>Ray cluster列表</p>
     */
    public RayClusterEntity [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>Ray cluster列表</p>
     * @param Items <p>Ray cluster列表</p>
     */
    public void setItems(RayClusterEntity [] Items) {
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

    public ListRayClustersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRayClustersResponse(ListRayClustersResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
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
            this.Items = new RayClusterEntity[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new RayClusterEntity(source.Items[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

