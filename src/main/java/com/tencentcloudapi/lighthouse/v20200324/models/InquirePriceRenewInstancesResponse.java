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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceRenewInstancesResponse extends AbstractModel{

    /**
    * 询价信息。
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * 数据盘价格信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDiskPriceSet")
    @Expose
    private DataDiskPrice [] DataDiskPriceSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 询价信息。 
     * @return Price 询价信息。
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set 询价信息。
     * @param Price 询价信息。
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get 数据盘价格信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDiskPriceSet 数据盘价格信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataDiskPrice [] getDataDiskPriceSet() {
        return this.DataDiskPriceSet;
    }

    /**
     * Set 数据盘价格信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDiskPriceSet 数据盘价格信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDiskPriceSet(DataDiskPrice [] DataDiskPriceSet) {
        this.DataDiskPriceSet = DataDiskPriceSet;
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

    public InquirePriceRenewInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewInstancesResponse(InquirePriceRenewInstancesResponse source) {
        if (source.Price != null) {
            this.Price = new Price(source.Price);
        }
        if (source.DataDiskPriceSet != null) {
            this.DataDiskPriceSet = new DataDiskPrice[source.DataDiskPriceSet.length];
            for (int i = 0; i < source.DataDiskPriceSet.length; i++) {
                this.DataDiskPriceSet[i] = new DataDiskPrice(source.DataDiskPriceSet[i]);
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
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamArrayObj(map, prefix + "DataDiskPriceSet.", this.DataDiskPriceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

