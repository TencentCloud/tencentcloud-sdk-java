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

public class InquirePriceRenewResponse extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例ID列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 对应的询价结果数组
    */
    @SerializedName("Prices")
    @Expose
    private TradePrice [] Prices;

    /**
    * 续费计算节点的总价格
    */
    @SerializedName("InstanceRealTotalPrice")
    @Expose
    private Long InstanceRealTotalPrice;

    /**
    * 续费存储节点的总价格
    */
    @SerializedName("StorageRealTotalPrice")
    @Expose
    private Long StorageRealTotalPrice;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 实例ID列表 
     * @return InstanceIds 实例ID列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表
     * @param InstanceIds 实例ID列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 对应的询价结果数组 
     * @return Prices 对应的询价结果数组
     */
    public TradePrice [] getPrices() {
        return this.Prices;
    }

    /**
     * Set 对应的询价结果数组
     * @param Prices 对应的询价结果数组
     */
    public void setPrices(TradePrice [] Prices) {
        this.Prices = Prices;
    }

    /**
     * Get 续费计算节点的总价格 
     * @return InstanceRealTotalPrice 续费计算节点的总价格
     */
    public Long getInstanceRealTotalPrice() {
        return this.InstanceRealTotalPrice;
    }

    /**
     * Set 续费计算节点的总价格
     * @param InstanceRealTotalPrice 续费计算节点的总价格
     */
    public void setInstanceRealTotalPrice(Long InstanceRealTotalPrice) {
        this.InstanceRealTotalPrice = InstanceRealTotalPrice;
    }

    /**
     * Get 续费存储节点的总价格 
     * @return StorageRealTotalPrice 续费存储节点的总价格
     */
    public Long getStorageRealTotalPrice() {
        return this.StorageRealTotalPrice;
    }

    /**
     * Set 续费存储节点的总价格
     * @param StorageRealTotalPrice 续费存储节点的总价格
     */
    public void setStorageRealTotalPrice(Long StorageRealTotalPrice) {
        this.StorageRealTotalPrice = StorageRealTotalPrice;
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

    public InquirePriceRenewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewResponse(InquirePriceRenewResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Prices != null) {
            this.Prices = new TradePrice[source.Prices.length];
            for (int i = 0; i < source.Prices.length; i++) {
                this.Prices[i] = new TradePrice(source.Prices[i]);
            }
        }
        if (source.InstanceRealTotalPrice != null) {
            this.InstanceRealTotalPrice = new Long(source.InstanceRealTotalPrice);
        }
        if (source.StorageRealTotalPrice != null) {
            this.StorageRealTotalPrice = new Long(source.StorageRealTotalPrice);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Prices.", this.Prices);
        this.setParamSimple(map, prefix + "InstanceRealTotalPrice", this.InstanceRealTotalPrice);
        this.setParamSimple(map, prefix + "StorageRealTotalPrice", this.StorageRealTotalPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

