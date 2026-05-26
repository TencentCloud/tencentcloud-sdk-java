/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateTWeSeeSubscriptionResponse extends AbstractModel {

    /**
    * 退订订单 ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 退订订单状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 退款金额（退款为负数）
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 币种
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 退订订单 ID 
     * @return OrderId 退订订单 ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 退订订单 ID
     * @param OrderId 退订订单 ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 退订订单状态 
     * @return Status 退订订单状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 退订订单状态
     * @param Status 退订订单状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 退款金额（退款为负数） 
     * @return Price 退款金额（退款为负数）
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 退款金额（退款为负数）
     * @param Price 退款金额（退款为负数）
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 币种 
     * @return Currency 币种
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 币种
     * @param Currency 币种
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public TerminateTWeSeeSubscriptionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateTWeSeeSubscriptionResponse(TerminateTWeSeeSubscriptionResponse source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

