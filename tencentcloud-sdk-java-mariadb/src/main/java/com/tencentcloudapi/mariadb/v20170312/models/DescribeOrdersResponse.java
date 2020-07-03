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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrdersResponse extends AbstractModel{

    /**
    * 返回的订单数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long [] TotalCount;

    /**
    * 订单信息列表。
    */
    @SerializedName("Deals")
    @Expose
    private Deal [] Deals;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的订单数量。 
     * @return TotalCount 返回的订单数量。
     */
    public Long [] getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回的订单数量。
     * @param TotalCount 返回的订单数量。
     */
    public void setTotalCount(Long [] TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 订单信息列表。 
     * @return Deals 订单信息列表。
     */
    public Deal [] getDeals() {
        return this.Deals;
    }

    /**
     * Set 订单信息列表。
     * @param Deals 订单信息列表。
     */
    public void setDeals(Deal [] Deals) {
        this.Deals = Deals;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TotalCount.", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Deals.", this.Deals);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

