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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRateLimitsV2Response extends AbstractModel {

    /**
    * 查询结果中规则数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 操作结果
    */
    @SerializedName("BaseInfo")
    @Expose
    private RateLimitCommonRsp BaseInfo;

    /**
    * 规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimits")
    @Expose
    private LimitRuleV2 [] RateLimits;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询结果中规则数量 
     * @return Total 查询结果中规则数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 查询结果中规则数量
     * @param Total 查询结果中规则数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 操作结果 
     * @return BaseInfo 操作结果
     */
    public RateLimitCommonRsp getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set 操作结果
     * @param BaseInfo 操作结果
     */
    public void setBaseInfo(RateLimitCommonRsp BaseInfo) {
        this.BaseInfo = BaseInfo;
    }

    /**
     * Get 规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimits 规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LimitRuleV2 [] getRateLimits() {
        return this.RateLimits;
    }

    /**
     * Set 规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimits 规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimits(LimitRuleV2 [] RateLimits) {
        this.RateLimits = RateLimits;
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

    public DescribeRateLimitsV2Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRateLimitsV2Response(DescribeRateLimitsV2Response source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.BaseInfo != null) {
            this.BaseInfo = new RateLimitCommonRsp(source.BaseInfo);
        }
        if (source.RateLimits != null) {
            this.RateLimits = new LimitRuleV2[source.RateLimits.length];
            for (int i = 0; i < source.RateLimits.length; i++) {
                this.RateLimits[i] = new LimitRuleV2(source.RateLimits[i]);
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
        this.setParamObj(map, prefix + "BaseInfo.", this.BaseInfo);
        this.setParamArrayObj(map, prefix + "RateLimits.", this.RateLimits);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

