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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel {

    /**
    * 实例价格信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;

    /**
    * 云盘价格信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudDiskPrice")
    @Expose
    private ItemPrice CloudDiskPrice;

    /**
     * Get 实例价格信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstancePrice 实例价格信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set 实例价格信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstancePrice 实例价格信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get 云盘价格信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudDiskPrice 云盘价格信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ItemPrice getCloudDiskPrice() {
        return this.CloudDiskPrice;
    }

    /**
     * Set 云盘价格信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudDiskPrice 云盘价格信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudDiskPrice(ItemPrice CloudDiskPrice) {
        this.CloudDiskPrice = CloudDiskPrice;
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
        if (source.CloudDiskPrice != null) {
            this.CloudDiskPrice = new ItemPrice(source.CloudDiskPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "CloudDiskPrice.", this.CloudDiskPrice);

    }
}

