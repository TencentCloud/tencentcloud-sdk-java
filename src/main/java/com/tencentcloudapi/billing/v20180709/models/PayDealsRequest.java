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

public class PayDealsRequest extends AbstractModel{

    /**
    * 需要支付的一个或者多个子订单号，与BigDealIds字段两者必须且仅传一个参数
    */
    @SerializedName("OrderIds")
    @Expose
    private String [] OrderIds;

    /**
    * 是否自动使用代金券,1:是,0否,默认0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 代金券ID列表,目前仅支持指定一张代金券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 需要支付的一个或者多个大订单号，与OrderIds字段两者必须且仅传一个参数
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
     * Get 需要支付的一个或者多个子订单号，与BigDealIds字段两者必须且仅传一个参数 
     * @return OrderIds 需要支付的一个或者多个子订单号，与BigDealIds字段两者必须且仅传一个参数
     */
    public String [] getOrderIds() {
        return this.OrderIds;
    }

    /**
     * Set 需要支付的一个或者多个子订单号，与BigDealIds字段两者必须且仅传一个参数
     * @param OrderIds 需要支付的一个或者多个子订单号，与BigDealIds字段两者必须且仅传一个参数
     */
    public void setOrderIds(String [] OrderIds) {
        this.OrderIds = OrderIds;
    }

    /**
     * Get 是否自动使用代金券,1:是,0否,默认0 
     * @return AutoVoucher 是否自动使用代金券,1:是,0否,默认0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券,1:是,0否,默认0
     * @param AutoVoucher 是否自动使用代金券,1:是,0否,默认0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID列表,目前仅支持指定一张代金券 
     * @return VoucherIds 代金券ID列表,目前仅支持指定一张代金券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID列表,目前仅支持指定一张代金券
     * @param VoucherIds 代金券ID列表,目前仅支持指定一张代金券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 需要支付的一个或者多个大订单号，与OrderIds字段两者必须且仅传一个参数 
     * @return BigDealIds 需要支付的一个或者多个大订单号，与OrderIds字段两者必须且仅传一个参数
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set 需要支付的一个或者多个大订单号，与OrderIds字段两者必须且仅传一个参数
     * @param BigDealIds 需要支付的一个或者多个大订单号，与OrderIds字段两者必须且仅传一个参数
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
    }

    public PayDealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayDealsRequest(PayDealsRequest source) {
        if (source.OrderIds != null) {
            this.OrderIds = new String[source.OrderIds.length];
            for (int i = 0; i < source.OrderIds.length; i++) {
                this.OrderIds[i] = new String(source.OrderIds[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.BigDealIds != null) {
            this.BigDealIds = new String[source.BigDealIds.length];
            for (int i = 0; i < source.BigDealIds.length; i++) {
                this.BigDealIds[i] = new String(source.BigDealIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "OrderIds.", this.OrderIds);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);

    }
}

