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

public class PayDealsRequest  extends AbstractModel{

    /**
    * 需要支付的一个或者多个订单号
    */
    @SerializedName("OrderIds")
    @Expose
    private String [] OrderIds;

    /**
    * 是否自动使用代金券,1:是,0否,默认0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Integer AutoVoucher;

    /**
    * 代金券ID列表,目前仅支持指定一张代金券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * 获取需要支付的一个或者多个订单号
     * @return OrderIds 需要支付的一个或者多个订单号
     */
    public String [] getOrderIds() {
        return this.OrderIds;
    }

    /**
     * 设置需要支付的一个或者多个订单号
     * @param OrderIds 需要支付的一个或者多个订单号
     */
    public void setOrderIds(String [] OrderIds) {
        this.OrderIds = OrderIds;
    }

    /**
     * 获取是否自动使用代金券,1:是,0否,默认0
     * @return AutoVoucher 是否自动使用代金券,1:是,0否,默认0
     */
    public Integer getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * 设置是否自动使用代金券,1:是,0否,默认0
     * @param AutoVoucher 是否自动使用代金券,1:是,0否,默认0
     */
    public void setAutoVoucher(Integer AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * 获取代金券ID列表,目前仅支持指定一张代金券
     * @return VoucherIds 代金券ID列表,目前仅支持指定一张代金券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * 设置代金券ID列表,目前仅支持指定一张代金券
     * @param VoucherIds 代金券ID列表,目前仅支持指定一张代金券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "OrderIds.", this.OrderIds);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

