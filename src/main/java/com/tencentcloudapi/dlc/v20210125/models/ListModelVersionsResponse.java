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

public class ListModelVersionsResponse extends AbstractModel {

    /**
    * <p>模型版本列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private ModelVersionInfo [] Items;

    /**
    * <p>模型总数量</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>当前多少页</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>当前页模型数量</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>结果总页数</p>
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>模型版本列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items <p>模型版本列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelVersionInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>模型版本列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items <p>模型版本列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(ModelVersionInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>模型总数量</p> 
     * @return Total <p>模型总数量</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>模型总数量</p>
     * @param Total <p>模型总数量</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>当前多少页</p> 
     * @return Page <p>当前多少页</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>当前多少页</p>
     * @param Page <p>当前多少页</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>当前页模型数量</p> 
     * @return PageSize <p>当前页模型数量</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>当前页模型数量</p>
     * @param PageSize <p>当前页模型数量</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>结果总页数</p> 
     * @return TotalPages <p>结果总页数</p>
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set <p>结果总页数</p>
     * @param TotalPages <p>结果总页数</p>
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
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

    public ListModelVersionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListModelVersionsResponse(ListModelVersionsResponse source) {
        if (source.Items != null) {
            this.Items = new ModelVersionInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ModelVersionInfo(source.Items[i]);
            }
        }
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

