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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyRiskAccountProductStatsResponse extends AbstractModel {

    /**
    * 按账号分组的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountStats")
    @Expose
    private AccountStatsGroup [] AccountStats;

    /**
    * 满足条件的账号总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 超时未体检的账号数
    */
    @SerializedName("OverdueAccountCount")
    @Expose
    private Long OverdueAccountCount;

    /**
    * 超时未体检的产品数
    */
    @SerializedName("OverdueProductCount")
    @Expose
    private Long OverdueProductCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 按账号分组的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountStats 按账号分组的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccountStatsGroup [] getAccountStats() {
        return this.AccountStats;
    }

    /**
     * Set 按账号分组的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountStats 按账号分组的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountStats(AccountStatsGroup [] AccountStats) {
        this.AccountStats = AccountStats;
    }

    /**
     * Get 满足条件的账号总数 
     * @return TotalCount 满足条件的账号总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 满足条件的账号总数
     * @param TotalCount 满足条件的账号总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 超时未体检的账号数 
     * @return OverdueAccountCount 超时未体检的账号数
     */
    public Long getOverdueAccountCount() {
        return this.OverdueAccountCount;
    }

    /**
     * Set 超时未体检的账号数
     * @param OverdueAccountCount 超时未体检的账号数
     */
    public void setOverdueAccountCount(Long OverdueAccountCount) {
        this.OverdueAccountCount = OverdueAccountCount;
    }

    /**
     * Get 超时未体检的产品数 
     * @return OverdueProductCount 超时未体检的产品数
     */
    public Long getOverdueProductCount() {
        return this.OverdueProductCount;
    }

    /**
     * Set 超时未体检的产品数
     * @param OverdueProductCount 超时未体检的产品数
     */
    public void setOverdueProductCount(Long OverdueProductCount) {
        this.OverdueProductCount = OverdueProductCount;
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

    public DescribePolicyRiskAccountProductStatsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyRiskAccountProductStatsResponse(DescribePolicyRiskAccountProductStatsResponse source) {
        if (source.AccountStats != null) {
            this.AccountStats = new AccountStatsGroup[source.AccountStats.length];
            for (int i = 0; i < source.AccountStats.length; i++) {
                this.AccountStats[i] = new AccountStatsGroup(source.AccountStats[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OverdueAccountCount != null) {
            this.OverdueAccountCount = new Long(source.OverdueAccountCount);
        }
        if (source.OverdueProductCount != null) {
            this.OverdueProductCount = new Long(source.OverdueProductCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccountStats.", this.AccountStats);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "OverdueAccountCount", this.OverdueAccountCount);
        this.setParamSimple(map, prefix + "OverdueProductCount", this.OverdueProductCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

