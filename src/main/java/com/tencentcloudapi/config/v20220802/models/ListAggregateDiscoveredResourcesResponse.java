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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAggregateDiscoveredResourcesResponse extends AbstractModel {

    /**
    * <p>详情</p>
    */
    @SerializedName("Items")
    @Expose
    private AggregateResourceInfo [] Items;

    /**
    * <p>下一页</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <p>总数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>详情</p> 
     * @return Items <p>详情</p>
     */
    public AggregateResourceInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>详情</p>
     * @param Items <p>详情</p>
     */
    public void setItems(AggregateResourceInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>下一页</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextToken <p>下一页</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>下一页</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextToken <p>下一页</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <p>总数</p> 
     * @return Count <p>总数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>总数</p>
     * @param Count <p>总数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
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

    public ListAggregateDiscoveredResourcesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAggregateDiscoveredResourcesResponse(ListAggregateDiscoveredResourcesResponse source) {
        if (source.Items != null) {
            this.Items = new AggregateResourceInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new AggregateResourceInfo(source.Items[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

