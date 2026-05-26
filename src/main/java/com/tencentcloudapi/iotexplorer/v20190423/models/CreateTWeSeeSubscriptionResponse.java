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

public class CreateTWeSeeSubscriptionResponse extends AbstractModel {

    /**
    * 订单 ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 订单状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 资源 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 原价
    */
    @SerializedName("OriginalPrice")
    @Expose
    private String OriginalPrice;

    /**
    * 折后价
    */
    @SerializedName("DiscountPrice")
    @Expose
    private String DiscountPrice;

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
     * Get 订单 ID 
     * @return OrderId 订单 ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单 ID
     * @param OrderId 订单 ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 订单状态 
     * @return Status 订单状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态
     * @param Status 订单状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 资源 ID 
     * @return ResourceId 资源 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 ID
     * @param ResourceId 资源 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 原价 
     * @return OriginalPrice 原价
     */
    public String getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 原价
     * @param OriginalPrice 原价
     */
    public void setOriginalPrice(String OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 折后价 
     * @return DiscountPrice 折后价
     */
    public String getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 折后价
     * @param DiscountPrice 折后价
     */
    public void setDiscountPrice(String DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
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

    public CreateTWeSeeSubscriptionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTWeSeeSubscriptionResponse(CreateTWeSeeSubscriptionResponse source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new String(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new String(source.DiscountPrice);
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
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

