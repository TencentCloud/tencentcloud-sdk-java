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

public class QueryMerchantOrderResponse extends AbstractModel{

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
    * 订单支付状态。0-下单失败 1-下单成功未支付 2-支付成功 3-支付失败 4-退款中 5-退款成功 6-退款失败 7-待付款 8-待确认。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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

    /**
     * Get 订单支付状态。0-下单失败 1-下单成功未支付 2-支付成功 3-支付失败 4-退款中 5-退款成功 6-退款失败 7-待付款 8-待确认。 
     * @return Status 订单支付状态。0-下单失败 1-下单成功未支付 2-支付成功 3-支付失败 4-退款中 5-退款成功 6-退款失败 7-待付款 8-待确认。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订单支付状态。0-下单失败 1-下单成功未支付 2-支付成功 3-支付失败 4-退款中 5-退款成功 6-退款失败 7-待付款 8-待确认。
     * @param Status 订单支付状态。0-下单失败 1-下单成功未支付 2-支付成功 3-支付失败 4-退款中 5-退款成功 6-退款失败 7-待付款 8-待确认。
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public QueryMerchantOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMerchantOrderResponse(QueryMerchantOrderResponse source) {
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

