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

public class CreateOrderResponse extends AbstractModel{

    /**
    * 进件成功后返给商户方的AppId。
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 商户流水号，商户唯一订单号由字母或数字组成。
    */
    @SerializedName("TraceNo")
    @Expose
    private String TraceNo;

    /**
    * 平台流水号，若下单成功则返回。
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * 支付页面跳转地址，若下单成功则返回。
    */
    @SerializedName("PayUrl")
    @Expose
    private String PayUrl;

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
     * Get 商户流水号，商户唯一订单号由字母或数字组成。 
     * @return TraceNo 商户流水号，商户唯一订单号由字母或数字组成。
     */
    public String getTraceNo() {
        return this.TraceNo;
    }

    /**
     * Set 商户流水号，商户唯一订单号由字母或数字组成。
     * @param TraceNo 商户流水号，商户唯一订单号由字母或数字组成。
     */
    public void setTraceNo(String TraceNo) {
        this.TraceNo = TraceNo;
    }

    /**
     * Get 平台流水号，若下单成功则返回。 
     * @return OrderNo 平台流水号，若下单成功则返回。
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 平台流水号，若下单成功则返回。
     * @param OrderNo 平台流水号，若下单成功则返回。
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get 支付页面跳转地址，若下单成功则返回。 
     * @return PayUrl 支付页面跳转地址，若下单成功则返回。
     */
    public String getPayUrl() {
        return this.PayUrl;
    }

    /**
     * Set 支付页面跳转地址，若下单成功则返回。
     * @param PayUrl 支付页面跳转地址，若下单成功则返回。
     */
    public void setPayUrl(String PayUrl) {
        this.PayUrl = PayUrl;
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

    public CreateOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrderResponse(CreateOrderResponse source) {
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.TraceNo != null) {
            this.TraceNo = new String(source.TraceNo);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
        if (source.PayUrl != null) {
            this.PayUrl = new String(source.PayUrl);
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
        this.setParamSimple(map, prefix + "TraceNo", this.TraceNo);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "PayUrl", this.PayUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

