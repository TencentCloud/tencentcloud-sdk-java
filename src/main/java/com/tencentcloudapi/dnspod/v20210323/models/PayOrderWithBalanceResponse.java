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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PayOrderWithBalanceResponse extends AbstractModel{

    /**
    * 此次操作支付成功的订单id数组
    */
    @SerializedName("DealIdList")
    @Expose
    private String [] DealIdList;

    /**
    * 此次操作支付成功的大订单号数组
    */
    @SerializedName("BigDealIdList")
    @Expose
    private String [] BigDealIdList;

    /**
    * 此次操作支付成功的订单号数组
    */
    @SerializedName("DealNameList")
    @Expose
    private String [] DealNameList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 此次操作支付成功的订单id数组 
     * @return DealIdList 此次操作支付成功的订单id数组
     */
    public String [] getDealIdList() {
        return this.DealIdList;
    }

    /**
     * Set 此次操作支付成功的订单id数组
     * @param DealIdList 此次操作支付成功的订单id数组
     */
    public void setDealIdList(String [] DealIdList) {
        this.DealIdList = DealIdList;
    }

    /**
     * Get 此次操作支付成功的大订单号数组 
     * @return BigDealIdList 此次操作支付成功的大订单号数组
     */
    public String [] getBigDealIdList() {
        return this.BigDealIdList;
    }

    /**
     * Set 此次操作支付成功的大订单号数组
     * @param BigDealIdList 此次操作支付成功的大订单号数组
     */
    public void setBigDealIdList(String [] BigDealIdList) {
        this.BigDealIdList = BigDealIdList;
    }

    /**
     * Get 此次操作支付成功的订单号数组 
     * @return DealNameList 此次操作支付成功的订单号数组
     */
    public String [] getDealNameList() {
        return this.DealNameList;
    }

    /**
     * Set 此次操作支付成功的订单号数组
     * @param DealNameList 此次操作支付成功的订单号数组
     */
    public void setDealNameList(String [] DealNameList) {
        this.DealNameList = DealNameList;
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

    public PayOrderWithBalanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayOrderWithBalanceResponse(PayOrderWithBalanceResponse source) {
        if (source.DealIdList != null) {
            this.DealIdList = new String[source.DealIdList.length];
            for (int i = 0; i < source.DealIdList.length; i++) {
                this.DealIdList[i] = new String(source.DealIdList[i]);
            }
        }
        if (source.BigDealIdList != null) {
            this.BigDealIdList = new String[source.BigDealIdList.length];
            for (int i = 0; i < source.BigDealIdList.length; i++) {
                this.BigDealIdList[i] = new String(source.BigDealIdList[i]);
            }
        }
        if (source.DealNameList != null) {
            this.DealNameList = new String[source.DealNameList.length];
            for (int i = 0; i < source.DealNameList.length; i++) {
                this.DealNameList[i] = new String(source.DealNameList[i]);
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
        this.setParamArraySimple(map, prefix + "DealIdList.", this.DealIdList);
        this.setParamArraySimple(map, prefix + "BigDealIdList.", this.BigDealIdList);
        this.setParamArraySimple(map, prefix + "DealNameList.", this.DealNameList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

