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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncUserAndOrderInfoDetail extends AbstractModel{

    /**
    * 腾讯云订单总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 腾讯云订单列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarketOrders")
    @Expose
    private String [] MarketOrders;

    /**
    * 腾讯云用户Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
     * Get 腾讯云订单总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 腾讯云订单总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 腾讯云订单总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 腾讯云订单总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 腾讯云订单列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarketOrders 腾讯云订单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMarketOrders() {
        return this.MarketOrders;
    }

    /**
     * Set 腾讯云订单列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarketOrders 腾讯云订单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarketOrders(String [] MarketOrders) {
        this.MarketOrders = MarketOrders;
    }

    /**
     * Get 腾讯云用户Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 腾讯云用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 腾讯云用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 腾讯云用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public SyncUserAndOrderInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncUserAndOrderInfoDetail(SyncUserAndOrderInfoDetail source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MarketOrders != null) {
            this.MarketOrders = new String[source.MarketOrders.length];
            for (int i = 0; i < source.MarketOrders.length; i++) {
                this.MarketOrders[i] = new String(source.MarketOrders[i]);
            }
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "MarketOrders.", this.MarketOrders);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

