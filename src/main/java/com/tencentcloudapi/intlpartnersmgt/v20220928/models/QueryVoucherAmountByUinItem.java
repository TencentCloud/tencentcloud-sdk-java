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

public class QueryVoucherAmountByUinItem extends AbstractModel{

    /**
    * 子客uin
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * 代金券额度
    */
    @SerializedName("TotalAmount")
    @Expose
    private Float TotalAmount;

    /**
    * 代金券余额
    */
    @SerializedName("RemainAmount")
    @Expose
    private Float RemainAmount;

    /**
     * Get 子客uin 
     * @return ClientUin 子客uin
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 子客uin
     * @param ClientUin 子客uin
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 代金券额度 
     * @return TotalAmount 代金券额度
     */
    public Float getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 代金券额度
     * @param TotalAmount 代金券额度
     */
    public void setTotalAmount(Float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 代金券余额 
     * @return RemainAmount 代金券余额
     */
    public Float getRemainAmount() {
        return this.RemainAmount;
    }

    /**
     * Set 代金券余额
     * @param RemainAmount 代金券余额
     */
    public void setRemainAmount(Float RemainAmount) {
        this.RemainAmount = RemainAmount;
    }

    public QueryVoucherAmountByUinItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherAmountByUinItem(QueryVoucherAmountByUinItem source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
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
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "RemainAmount", this.RemainAmount);

    }
}

