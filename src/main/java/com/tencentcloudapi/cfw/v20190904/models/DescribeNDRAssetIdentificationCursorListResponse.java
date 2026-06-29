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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNDRAssetIdentificationCursorListResponse extends AbstractModel {

    /**
    * <p>查询结果列表</p>
    */
    @SerializedName("Data")
    @Expose
    private NDRAssetServiceInfo [] Data;

    /**
    * <p>下一页游标</p>
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
    * <p>是否存在更多数据</p>
    */
    @SerializedName("HasMore")
    @Expose
    private Boolean HasMore;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>查询结果列表</p> 
     * @return Data <p>查询结果列表</p>
     */
    public NDRAssetServiceInfo [] getData() {
        return this.Data;
    }

    /**
     * Set <p>查询结果列表</p>
     * @param Data <p>查询结果列表</p>
     */
    public void setData(NDRAssetServiceInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>下一页游标</p> 
     * @return NextCursor <p>下一页游标</p>
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set <p>下一页游标</p>
     * @param NextCursor <p>下一页游标</p>
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    /**
     * Get <p>是否存在更多数据</p> 
     * @return HasMore <p>是否存在更多数据</p>
     */
    public Boolean getHasMore() {
        return this.HasMore;
    }

    /**
     * Set <p>是否存在更多数据</p>
     * @param HasMore <p>是否存在更多数据</p>
     */
    public void setHasMore(Boolean HasMore) {
        this.HasMore = HasMore;
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

    public DescribeNDRAssetIdentificationCursorListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNDRAssetIdentificationCursorListResponse(DescribeNDRAssetIdentificationCursorListResponse source) {
        if (source.Data != null) {
            this.Data = new NDRAssetServiceInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new NDRAssetServiceInfo(source.Data[i]);
            }
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
        if (source.HasMore != null) {
            this.HasMore = new Boolean(source.HasMore);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

