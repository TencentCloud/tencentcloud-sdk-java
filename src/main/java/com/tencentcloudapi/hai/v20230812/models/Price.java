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
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;

    /**
    * 云盘价格信息
    */
    @SerializedName("CloudDiskPrice")
    @Expose
    private ItemPrice CloudDiskPrice;

    /**
    * 分实例价格
    */
    @SerializedName("PriceDetailSet")
    @Expose
    private ItemPriceDetail [] PriceDetailSet;

    /**
     * Get 实例价格信息 
     * @return InstancePrice 实例价格信息
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set 实例价格信息
     * @param InstancePrice 实例价格信息
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get 云盘价格信息 
     * @return CloudDiskPrice 云盘价格信息
     */
    public ItemPrice getCloudDiskPrice() {
        return this.CloudDiskPrice;
    }

    /**
     * Set 云盘价格信息
     * @param CloudDiskPrice 云盘价格信息
     */
    public void setCloudDiskPrice(ItemPrice CloudDiskPrice) {
        this.CloudDiskPrice = CloudDiskPrice;
    }

    /**
     * Get 分实例价格 
     * @return PriceDetailSet 分实例价格
     */
    public ItemPriceDetail [] getPriceDetailSet() {
        return this.PriceDetailSet;
    }

    /**
     * Set 分实例价格
     * @param PriceDetailSet 分实例价格
     */
    public void setPriceDetailSet(ItemPriceDetail [] PriceDetailSet) {
        this.PriceDetailSet = PriceDetailSet;
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
        if (source.PriceDetailSet != null) {
            this.PriceDetailSet = new ItemPriceDetail[source.PriceDetailSet.length];
            for (int i = 0; i < source.PriceDetailSet.length; i++) {
                this.PriceDetailSet[i] = new ItemPriceDetail(source.PriceDetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "CloudDiskPrice.", this.CloudDiskPrice);
        this.setParamArrayObj(map, prefix + "PriceDetailSet.", this.PriceDetailSet);

    }
}

