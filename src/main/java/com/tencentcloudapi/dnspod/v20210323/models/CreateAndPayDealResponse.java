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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndPayDealResponse extends AbstractModel {

    /**
    * <p>大订单号，一个大订单号下可以有多个子订单，说明是同一次下单</p>
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * <p>子订单列表</p>
    */
    @SerializedName("DealList")
    @Expose
    private Deals [] DealList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>大订单号，一个大订单号下可以有多个子订单，说明是同一次下单</p> 
     * @return BigDealId <p>大订单号，一个大订单号下可以有多个子订单，说明是同一次下单</p>
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set <p>大订单号，一个大订单号下可以有多个子订单，说明是同一次下单</p>
     * @param BigDealId <p>大订单号，一个大订单号下可以有多个子订单，说明是同一次下单</p>
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get <p>子订单列表</p> 
     * @return DealList <p>子订单列表</p>
     */
    public Deals [] getDealList() {
        return this.DealList;
    }

    /**
     * Set <p>子订单列表</p>
     * @param DealList <p>子订单列表</p>
     */
    public void setDealList(Deals [] DealList) {
        this.DealList = DealList;
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

    public CreateAndPayDealResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndPayDealResponse(CreateAndPayDealResponse source) {
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.DealList != null) {
            this.DealList = new Deals[source.DealList.length];
            for (int i = 0; i < source.DealList.length; i++) {
                this.DealList[i] = new Deals(source.DealList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamArrayObj(map, prefix + "DealList.", this.DealList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

