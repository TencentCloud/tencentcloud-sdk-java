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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMerchantOrderRequest extends AbstractModel{

    /**
    * 进件成功后返给商户方的AppId。
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 平台流水号。平台唯一订单号。
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
     * Get 进件成功后返给商户方的AppId。 
     * @return MerchantAppId 进件成功后返给商户方的AppId。
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 进件成功后返给商户方的AppId。
     * @param MerchantAppId 进件成功后返给商户方的AppId。
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 平台流水号。平台唯一订单号。 
     * @return OrderNo 平台流水号。平台唯一订单号。
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 平台流水号。平台唯一订单号。
     * @param OrderNo 平台流水号。平台唯一订单号。
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public QueryMerchantOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMerchantOrderRequest(QueryMerchantOrderRequest source) {
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);

    }
}

