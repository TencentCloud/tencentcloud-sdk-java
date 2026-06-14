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

public class DescribeGlossaryEntriesResponse extends AbstractModel {

    /**
    * 术语条目列表。
    */
    @SerializedName("Entries")
    @Expose
    private GlossaryEntryItem [] Entries;

    /**
    * 符合条件的术语条目总数。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 当前页码。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

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
     * Get 术语条目列表。 
     * @return Entries 术语条目列表。
     */
    public GlossaryEntryItem [] getEntries() {
        return this.Entries;
    }

    /**
     * Set 术语条目列表。
     * @param Entries 术语条目列表。
     */
    public void setEntries(GlossaryEntryItem [] Entries) {
        this.Entries = Entries;
    }

    /**
     * Get 符合条件的术语条目总数。 
     * @return Total 符合条件的术语条目总数。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 符合条件的术语条目总数。
     * @param Total 符合条件的术语条目总数。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 当前页码。 
     * @return Page 当前页码。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 当前页码。
     * @param Page 当前页码。
     */
    public void setPage(Long Page) {
        this.Page = Page;
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

    public DescribeGlossaryEntriesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlossaryEntriesResponse(DescribeGlossaryEntriesResponse source) {
        if (source.Entries != null) {
            this.Entries = new GlossaryEntryItem[source.Entries.length];
            for (int i = 0; i < source.Entries.length; i++) {
                this.Entries[i] = new GlossaryEntryItem(source.Entries[i]);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Entries.", this.Entries);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

