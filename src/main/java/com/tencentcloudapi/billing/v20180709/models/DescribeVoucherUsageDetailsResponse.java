/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoucherUsageDetailsResponse extends AbstractModel{

    /**
    * 券总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总已用金额（微分）
    */
    @SerializedName("TotalUsedAmount")
    @Expose
    private Long TotalUsedAmount;

    /**
    * 代金券使用记录细节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsageRecords")
    @Expose
    private UsageRecords [] UsageRecords;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 券总数 
     * @return TotalCount 券总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 券总数
     * @param TotalCount 券总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总已用金额（微分） 
     * @return TotalUsedAmount 总已用金额（微分）
     */
    public Long getTotalUsedAmount() {
        return this.TotalUsedAmount;
    }

    /**
     * Set 总已用金额（微分）
     * @param TotalUsedAmount 总已用金额（微分）
     */
    public void setTotalUsedAmount(Long TotalUsedAmount) {
        this.TotalUsedAmount = TotalUsedAmount;
    }

    /**
     * Get 代金券使用记录细节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsageRecords 代金券使用记录细节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsageRecords [] getUsageRecords() {
        return this.UsageRecords;
    }

    /**
     * Set 代金券使用记录细节
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsageRecords 代金券使用记录细节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsageRecords(UsageRecords [] UsageRecords) {
        this.UsageRecords = UsageRecords;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVoucherUsageDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoucherUsageDetailsResponse(DescribeVoucherUsageDetailsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalUsedAmount != null) {
            this.TotalUsedAmount = new Long(source.TotalUsedAmount);
        }
        if (source.UsageRecords != null) {
            this.UsageRecords = new UsageRecords[source.UsageRecords.length];
            for (int i = 0; i < source.UsageRecords.length; i++) {
                this.UsageRecords[i] = new UsageRecords(source.UsageRecords[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalUsedAmount", this.TotalUsedAmount);
        this.setParamArrayObj(map, prefix + "UsageRecords.", this.UsageRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

