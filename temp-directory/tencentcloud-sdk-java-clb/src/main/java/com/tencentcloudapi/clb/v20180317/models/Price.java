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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel {

    /**
    * 描述了实例价格。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;

    /**
    * 描述了网络价格。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthPrice")
    @Expose
    private ItemPrice BandwidthPrice;

    /**
    * 描述了lcu价格。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LcuPrice")
    @Expose
    private ItemPrice LcuPrice;

    /**
     * Get 描述了实例价格。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstancePrice 描述了实例价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set 描述了实例价格。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstancePrice 描述了实例价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get 描述了网络价格。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthPrice 描述了网络价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ItemPrice getBandwidthPrice() {
        return this.BandwidthPrice;
    }

    /**
     * Set 描述了网络价格。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthPrice 描述了网络价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthPrice(ItemPrice BandwidthPrice) {
        this.BandwidthPrice = BandwidthPrice;
    }

    /**
     * Get 描述了lcu价格。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LcuPrice 描述了lcu价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ItemPrice getLcuPrice() {
        return this.LcuPrice;
    }

    /**
     * Set 描述了lcu价格。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LcuPrice 描述了lcu价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLcuPrice(ItemPrice LcuPrice) {
        this.LcuPrice = LcuPrice;
    }

    public Price() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Price(Price source) {
        if (source.InstancePrice != null) {
            this.InstancePrice = new ItemPrice(source.InstancePrice);
        }
        if (source.BandwidthPrice != null) {
            this.BandwidthPrice = new ItemPrice(source.BandwidthPrice);
        }
        if (source.LcuPrice != null) {
            this.LcuPrice = new ItemPrice(source.LcuPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "BandwidthPrice.", this.BandwidthPrice);
        this.setParamObj(map, prefix + "LcuPrice.", this.LcuPrice);

    }
}

