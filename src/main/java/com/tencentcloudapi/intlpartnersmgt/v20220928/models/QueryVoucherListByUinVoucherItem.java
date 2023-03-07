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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryVoucherListByUinVoucherItem extends AbstractModel{

    /**
    * 券号
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * 状态
    */
    @SerializedName("VoucherStatus")
    @Expose
    private String VoucherStatus;

    /**
    * 面额
    */
    @SerializedName("TotalAmount")
    @Expose
    private Float TotalAmount;

    /**
    * 余额
    */
    @SerializedName("RemainAmount")
    @Expose
    private Float RemainAmount;

    /**
     * Get 券号 
     * @return VoucherId 券号
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set 券号
     * @param VoucherId 券号
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get 状态 
     * @return VoucherStatus 状态
     */
    public String getVoucherStatus() {
        return this.VoucherStatus;
    }

    /**
     * Set 状态
     * @param VoucherStatus 状态
     */
    public void setVoucherStatus(String VoucherStatus) {
        this.VoucherStatus = VoucherStatus;
    }

    /**
     * Get 面额 
     * @return TotalAmount 面额
     */
    public Float getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 面额
     * @param TotalAmount 面额
     */
    public void setTotalAmount(Float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 余额 
     * @return RemainAmount 余额
     */
    public Float getRemainAmount() {
        return this.RemainAmount;
    }

    /**
     * Set 余额
     * @param RemainAmount 余额
     */
    public void setRemainAmount(Float RemainAmount) {
        this.RemainAmount = RemainAmount;
    }

    public QueryVoucherListByUinVoucherItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherListByUinVoucherItem(QueryVoucherListByUinVoucherItem source) {
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.VoucherStatus != null) {
            this.VoucherStatus = new String(source.VoucherStatus);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Float(source.TotalAmount);
        }
        if (source.RemainAmount != null) {
            this.RemainAmount = new Float(source.RemainAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "VoucherStatus", this.VoucherStatus);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "RemainAmount", this.RemainAmount);

    }
}

