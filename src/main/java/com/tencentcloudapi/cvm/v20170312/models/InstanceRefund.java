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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceRefund extends AbstractModel{

    /**
    * 实例Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 退款数额。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Refunds")
    @Expose
    private Float Refunds;

    /**
    * 退款详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriceDetail")
    @Expose
    private String PriceDetail;

    /**
     * Get 实例Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 退款数额。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Refunds 退款数额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRefunds() {
        return this.Refunds;
    }

    /**
     * Set 退款数额。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Refunds 退款数额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefunds(Float Refunds) {
        this.Refunds = Refunds;
    }

    /**
     * Get 退款详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriceDetail 退款详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPriceDetail() {
        return this.PriceDetail;
    }

    /**
     * Set 退款详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriceDetail 退款详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriceDetail(String PriceDetail) {
        this.PriceDetail = PriceDetail;
    }

    public InstanceRefund() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceRefund(InstanceRefund source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Refunds != null) {
            this.Refunds = new Float(source.Refunds);
        }
        if (source.PriceDetail != null) {
            this.PriceDetail = new String(source.PriceDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Refunds", this.Refunds);
        this.setParamSimple(map, prefix + "PriceDetail", this.PriceDetail);

    }
}

