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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllocationTrendByMonthResponse extends AbstractModel {

    /**
    * 当月费用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Current")
    @Expose
    private AllocationBillTrendDetail Current;

    /**
    * 之前月份费用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Previous")
    @Expose
    private AllocationBillTrendDetail [] Previous;

    /**
    * 费用统计信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stat")
    @Expose
    private AllocationStat Stat;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当月费用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Current 当月费用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllocationBillTrendDetail getCurrent() {
        return this.Current;
    }

    /**
     * Set 当月费用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Current 当月费用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrent(AllocationBillTrendDetail Current) {
        this.Current = Current;
    }

    /**
     * Get 之前月份费用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Previous 之前月份费用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllocationBillTrendDetail [] getPrevious() {
        return this.Previous;
    }

    /**
     * Set 之前月份费用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Previous 之前月份费用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrevious(AllocationBillTrendDetail [] Previous) {
        this.Previous = Previous;
    }

    /**
     * Get 费用统计信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stat 费用统计信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllocationStat getStat() {
        return this.Stat;
    }

    /**
     * Set 费用统计信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stat 费用统计信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStat(AllocationStat Stat) {
        this.Stat = Stat;
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

    public DescribeAllocationTrendByMonthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationTrendByMonthResponse(DescribeAllocationTrendByMonthResponse source) {
        if (source.Current != null) {
            this.Current = new AllocationBillTrendDetail(source.Current);
        }
        if (source.Previous != null) {
            this.Previous = new AllocationBillTrendDetail[source.Previous.length];
            for (int i = 0; i < source.Previous.length; i++) {
                this.Previous[i] = new AllocationBillTrendDetail(source.Previous[i]);
            }
        }
        if (source.Stat != null) {
            this.Stat = new AllocationStat(source.Stat);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Current.", this.Current);
        this.setParamArrayObj(map, prefix + "Previous.", this.Previous);
        this.setParamObj(map, prefix + "Stat.", this.Stat);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

