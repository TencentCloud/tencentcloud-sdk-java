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

public class Price extends AbstractModel{

    /**
    * 实例价格。
    */
    @SerializedName("InstancePrice")
    @Expose
    private InstancePrice InstancePrice;

    /**
    * 数据盘价格。
    */
    @SerializedName("DataDiskPrices")
    @Expose
    private DataDiskPrice [] DataDiskPrices;

    /**
     * Get 实例价格。 
     * @return InstancePrice 实例价格。
     */
    public InstancePrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set 实例价格。
     * @param InstancePrice 实例价格。
     */
    public void setInstancePrice(InstancePrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get 数据盘价格。 
     * @return DataDiskPrices 数据盘价格。
     */
    public DataDiskPrice [] getDataDiskPrices() {
        return this.DataDiskPrices;
    }

    /**
     * Set 数据盘价格。
     * @param DataDiskPrices 数据盘价格。
     */
    public void setDataDiskPrices(DataDiskPrice [] DataDiskPrices) {
        this.DataDiskPrices = DataDiskPrices;
    }

    public Price() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Price(Price source) {
        if (source.InstancePrice != null) {
            this.InstancePrice = new InstancePrice(source.InstancePrice);
        }
        if (source.DataDiskPrices != null) {
            this.DataDiskPrices = new DataDiskPrice[source.DataDiskPrices.length];
            for (int i = 0; i < source.DataDiskPrices.length; i++) {
                this.DataDiskPrices[i] = new DataDiskPrice(source.DataDiskPrices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamArrayObj(map, prefix + "DataDiskPrices.", this.DataDiskPrices);

    }
}

