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

public class ItemPriceDetail extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例价格详情
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;

    /**
    * 磁盘价格详情
    */
    @SerializedName("CloudDiskPrice")
    @Expose
    private ItemPrice CloudDiskPrice;

    /**
    * 该实例的总价钱
    */
    @SerializedName("InstanceTotalPrice")
    @Expose
    private ItemPrice InstanceTotalPrice;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例价格详情 
     * @return InstancePrice 实例价格详情
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set 实例价格详情
     * @param InstancePrice 实例价格详情
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get 磁盘价格详情 
     * @return CloudDiskPrice 磁盘价格详情
     */
    public ItemPrice getCloudDiskPrice() {
        return this.CloudDiskPrice;
    }

    /**
     * Set 磁盘价格详情
     * @param CloudDiskPrice 磁盘价格详情
     */
    public void setCloudDiskPrice(ItemPrice CloudDiskPrice) {
        this.CloudDiskPrice = CloudDiskPrice;
    }

    /**
     * Get 该实例的总价钱 
     * @return InstanceTotalPrice 该实例的总价钱
     */
    public ItemPrice getInstanceTotalPrice() {
        return this.InstanceTotalPrice;
    }

    /**
     * Set 该实例的总价钱
     * @param InstanceTotalPrice 该实例的总价钱
     */
    public void setInstanceTotalPrice(ItemPrice InstanceTotalPrice) {
        this.InstanceTotalPrice = InstanceTotalPrice;
    }

    public ItemPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemPriceDetail(ItemPriceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstancePrice != null) {
            this.InstancePrice = new ItemPrice(source.InstancePrice);
        }
        if (source.CloudDiskPrice != null) {
            this.CloudDiskPrice = new ItemPrice(source.CloudDiskPrice);
        }
        if (source.InstanceTotalPrice != null) {
            this.InstanceTotalPrice = new ItemPrice(source.InstanceTotalPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "CloudDiskPrice.", this.CloudDiskPrice);
        this.setParamObj(map, prefix + "InstanceTotalPrice.", this.InstanceTotalPrice);

    }
}

