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

public class PayOrderWithBalanceRequest extends AbstractModel{

    /**
    * 需要支付的大订单号数组
    */
    @SerializedName("BigDealIdList")
    @Expose
    private String [] BigDealIdList;

    /**
    * 代金券ID数组
    */
    @SerializedName("VoucherIdList")
    @Expose
    private String [] VoucherIdList;

    /**
     * Get 需要支付的大订单号数组 
     * @return BigDealIdList 需要支付的大订单号数组
     */
    public String [] getBigDealIdList() {
        return this.BigDealIdList;
    }

    /**
     * Set 需要支付的大订单号数组
     * @param BigDealIdList 需要支付的大订单号数组
     */
    public void setBigDealIdList(String [] BigDealIdList) {
        this.BigDealIdList = BigDealIdList;
    }

    /**
     * Get 代金券ID数组 
     * @return VoucherIdList 代金券ID数组
     */
    public String [] getVoucherIdList() {
        return this.VoucherIdList;
    }

    /**
     * Set 代金券ID数组
     * @param VoucherIdList 代金券ID数组
     */
    public void setVoucherIdList(String [] VoucherIdList) {
        this.VoucherIdList = VoucherIdList;
    }

    public PayOrderWithBalanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayOrderWithBalanceRequest(PayOrderWithBalanceRequest source) {
        if (source.BigDealIdList != null) {
            this.BigDealIdList = new String[source.BigDealIdList.length];
            for (int i = 0; i < source.BigDealIdList.length; i++) {
                this.BigDealIdList[i] = new String(source.BigDealIdList[i]);
            }
        }
        if (source.VoucherIdList != null) {
            this.VoucherIdList = new String[source.VoucherIdList.length];
            for (int i = 0; i < source.VoucherIdList.length; i++) {
                this.VoucherIdList[i] = new String(source.VoucherIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BigDealIdList.", this.BigDealIdList);
        this.setParamArraySimple(map, prefix + "VoucherIdList.", this.VoucherIdList);

    }
}

