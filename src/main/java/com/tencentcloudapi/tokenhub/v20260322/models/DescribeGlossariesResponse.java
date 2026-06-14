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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlossariesResponse extends AbstractModel {

    /**
    * 术语库列表。
    */
    @SerializedName("Items")
    @Expose
    private GlossaryItem [] Items;

    /**
    * 符合条件的术语库总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 当前页码。
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
    * 每页大小。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 术语库列表。 
     * @return Items 术语库列表。
     */
    public GlossaryItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 术语库列表。
     * @param Items 术语库列表。
     */
    public void setItems(GlossaryItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 符合条件的术语库总数。 
     * @return TotalCount 符合条件的术语库总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的术语库总数。
     * @param TotalCount 符合条件的术语库总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 当前页码。 
     * @return Current 当前页码。
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set 当前页码。
     * @param Current 当前页码。
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    /**
     * Get 每页大小。 
     * @return PageSize 每页大小。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小。
     * @param PageSize 每页大小。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    public DescribeGlossariesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlossariesResponse(DescribeGlossariesResponse source) {
        if (source.Items != null) {
            this.Items = new GlossaryItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new GlossaryItem(source.Items[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Current != null) {
            this.Current = new Long(source.Current);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Current", this.Current);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

