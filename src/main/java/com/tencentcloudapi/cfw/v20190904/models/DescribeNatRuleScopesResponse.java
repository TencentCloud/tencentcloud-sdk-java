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

public class DescribeNatRuleScopesResponse extends AbstractModel {

    /**
    * 可选生效范围总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 生效范围列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScopeItems")
    @Expose
    private RuleScopeInfo [] ScopeItems;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可选生效范围总数 
     * @return Total 可选生效范围总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 可选生效范围总数
     * @param Total 可选生效范围总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 生效范围列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScopeItems 生效范围列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleScopeInfo [] getScopeItems() {
        return this.ScopeItems;
    }

    /**
     * Set 生效范围列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScopeItems 生效范围列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScopeItems(RuleScopeInfo [] ScopeItems) {
        this.ScopeItems = ScopeItems;
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

    public DescribeNatRuleScopesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatRuleScopesResponse(DescribeNatRuleScopesResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ScopeItems != null) {
            this.ScopeItems = new RuleScopeInfo[source.ScopeItems.length];
            for (int i = 0; i < source.ScopeItems.length; i++) {
                this.ScopeItems[i] = new RuleScopeInfo(source.ScopeItems[i]);
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
        this.setParamArrayObj(map, prefix + "ScopeItems.", this.ScopeItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

