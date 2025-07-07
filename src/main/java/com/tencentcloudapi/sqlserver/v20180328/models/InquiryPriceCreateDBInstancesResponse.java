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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateDBInstancesResponse extends AbstractModel {

    /**
    * 未打折前价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
    * 实际需要支付的价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 未打折前价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。 
     * @return OriginalPrice 未打折前价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 未打折前价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。
     * @param OriginalPrice 未打折前价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 实际需要支付的价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。 
     * @return Price 实际需要支付的价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 实际需要支付的价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。
     * @param Price 实际需要支付的价格，其值除以100表示最终的价格。
InstanceChargeType=PREPAID时，单位是"每月"。
InstanceChargeType=POSTPAID时，单位是"每小时"。
例如10010，在InstanceChargeType=PREPAID情况下，表示每月100.10元。
     */
    public void setPrice(Long Price) {
        this.Price = Price;
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

    public InquiryPriceCreateDBInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateDBInstancesResponse(InquiryPriceCreateDBInstancesResponse source) {
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Long(source.OriginalPrice);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

