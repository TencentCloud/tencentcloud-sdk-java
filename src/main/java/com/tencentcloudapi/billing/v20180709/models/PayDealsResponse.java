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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PayDealsResponse extends AbstractModel{

    /**
    * 此次操作支付成功的子订单号数组
    */
    @SerializedName("OrderIds")
    @Expose
    private String [] OrderIds;

    /**
    * 此次操作支付成功的资源Id数组
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 此次操作支付成功的大订单号数组
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 此次操作支付成功的子订单号数组 
     * @return OrderIds 此次操作支付成功的子订单号数组
     */
    public String [] getOrderIds() {
        return this.OrderIds;
    }

    /**
     * Set 此次操作支付成功的子订单号数组
     * @param OrderIds 此次操作支付成功的子订单号数组
     */
    public void setOrderIds(String [] OrderIds) {
        this.OrderIds = OrderIds;
    }

    /**
     * Get 此次操作支付成功的资源Id数组 
     * @return ResourceIds 此次操作支付成功的资源Id数组
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 此次操作支付成功的资源Id数组
     * @param ResourceIds 此次操作支付成功的资源Id数组
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 此次操作支付成功的大订单号数组 
     * @return BigDealIds 此次操作支付成功的大订单号数组
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set 此次操作支付成功的大订单号数组
     * @param BigDealIds 此次操作支付成功的大订单号数组
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
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

    public PayDealsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayDealsResponse(PayDealsResponse source) {
        if (source.OrderIds != null) {
            this.OrderIds = new String[source.OrderIds.length];
            for (int i = 0; i < source.OrderIds.length; i++) {
                this.OrderIds[i] = new String(source.OrderIds[i]);
            }
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.BigDealIds != null) {
            this.BigDealIds = new String[source.BigDealIds.length];
            for (int i = 0; i < source.BigDealIds.length; i++) {
                this.BigDealIds[i] = new String(source.BigDealIds[i]);
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
        this.setParamArraySimple(map, prefix + "OrderIds.", this.OrderIds);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

