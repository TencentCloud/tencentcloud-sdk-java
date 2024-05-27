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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBiddingSuccessfulDetailResponse extends AbstractModel {

    /**
    * 保证金，是否退款，yes表示退款，no表示不退款
    */
    @SerializedName("BiddingBondRefund")
    @Expose
    private String BiddingBondRefund;

    /**
    * 状态：1 竞价中，2 待出价，3 竞价失败， 4 等待支付 5 等待转移， 6 转移中，7 交易成功，8 持有者索回，9 已违约
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 保证金，是否退款，yes表示退款，no表示不退款 
     * @return BiddingBondRefund 保证金，是否退款，yes表示退款，no表示不退款
     */
    public String getBiddingBondRefund() {
        return this.BiddingBondRefund;
    }

    /**
     * Set 保证金，是否退款，yes表示退款，no表示不退款
     * @param BiddingBondRefund 保证金，是否退款，yes表示退款，no表示不退款
     */
    public void setBiddingBondRefund(String BiddingBondRefund) {
        this.BiddingBondRefund = BiddingBondRefund;
    }

    /**
     * Get 状态：1 竞价中，2 待出价，3 竞价失败， 4 等待支付 5 等待转移， 6 转移中，7 交易成功，8 持有者索回，9 已违约 
     * @return Status 状态：1 竞价中，2 待出价，3 竞价失败， 4 等待支付 5 等待转移， 6 转移中，7 交易成功，8 持有者索回，9 已违约
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：1 竞价中，2 待出价，3 竞价失败， 4 等待支付 5 等待转移， 6 转移中，7 交易成功，8 持有者索回，9 已违约
     * @param Status 状态：1 竞价中，2 待出价，3 竞价失败， 4 等待支付 5 等待转移， 6 转移中，7 交易成功，8 持有者索回，9 已违约
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DescribeBiddingSuccessfulDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBiddingSuccessfulDetailResponse(DescribeBiddingSuccessfulDetailResponse source) {
        if (source.BiddingBondRefund != null) {
            this.BiddingBondRefund = new String(source.BiddingBondRefund);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BiddingBondRefund", this.BiddingBondRefund);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

