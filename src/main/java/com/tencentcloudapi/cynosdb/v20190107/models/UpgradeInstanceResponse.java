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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceResponse extends AbstractModel{

    /**
    * 冻结流水ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * 大订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
    * 订单号
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 冻结流水ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranId 冻结流水ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set 冻结流水ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranId 冻结流水ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get 大订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigDealIds 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDealIds 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
    }

    /**
     * Get 订单号 
     * @return DealNames 订单号
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 订单号
     * @param DealNames 订单号
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
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

    public UpgradeInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceResponse(UpgradeInstanceResponse source) {
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.BigDealIds != null) {
            this.BigDealIds = new String[source.BigDealIds.length];
            for (int i = 0; i < source.BigDealIds.length; i++) {
                this.BigDealIds[i] = new String(source.BigDealIds[i]);
            }
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
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
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

