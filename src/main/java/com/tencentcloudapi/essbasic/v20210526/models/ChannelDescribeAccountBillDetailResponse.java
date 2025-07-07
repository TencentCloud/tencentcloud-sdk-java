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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeAccountBillDetailResponse extends AbstractModel {

    /**
    * 当前绑定中账号数量
    */
    @SerializedName("BoundAccountsNumber")
    @Expose
    private Long BoundAccountsNumber;

    /**
    * 剩余可绑定账号数量
    */
    @SerializedName("RemainAvailableAccountsNumber")
    @Expose
    private Long RemainAvailableAccountsNumber;

    /**
    * 已失效账号数量
    */
    @SerializedName("InvalidAccountsNumber")
    @Expose
    private Long InvalidAccountsNumber;

    /**
    * 购买数量
    */
    @SerializedName("TotalBuyAccountsNumber")
    @Expose
    private Long TotalBuyAccountsNumber;

    /**
    * 赠送数量
    */
    @SerializedName("TotalGiftAccountsNumber")
    @Expose
    private Long TotalGiftAccountsNumber;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前绑定中账号数量 
     * @return BoundAccountsNumber 当前绑定中账号数量
     */
    public Long getBoundAccountsNumber() {
        return this.BoundAccountsNumber;
    }

    /**
     * Set 当前绑定中账号数量
     * @param BoundAccountsNumber 当前绑定中账号数量
     */
    public void setBoundAccountsNumber(Long BoundAccountsNumber) {
        this.BoundAccountsNumber = BoundAccountsNumber;
    }

    /**
     * Get 剩余可绑定账号数量 
     * @return RemainAvailableAccountsNumber 剩余可绑定账号数量
     */
    public Long getRemainAvailableAccountsNumber() {
        return this.RemainAvailableAccountsNumber;
    }

    /**
     * Set 剩余可绑定账号数量
     * @param RemainAvailableAccountsNumber 剩余可绑定账号数量
     */
    public void setRemainAvailableAccountsNumber(Long RemainAvailableAccountsNumber) {
        this.RemainAvailableAccountsNumber = RemainAvailableAccountsNumber;
    }

    /**
     * Get 已失效账号数量 
     * @return InvalidAccountsNumber 已失效账号数量
     */
    public Long getInvalidAccountsNumber() {
        return this.InvalidAccountsNumber;
    }

    /**
     * Set 已失效账号数量
     * @param InvalidAccountsNumber 已失效账号数量
     */
    public void setInvalidAccountsNumber(Long InvalidAccountsNumber) {
        this.InvalidAccountsNumber = InvalidAccountsNumber;
    }

    /**
     * Get 购买数量 
     * @return TotalBuyAccountsNumber 购买数量
     */
    public Long getTotalBuyAccountsNumber() {
        return this.TotalBuyAccountsNumber;
    }

    /**
     * Set 购买数量
     * @param TotalBuyAccountsNumber 购买数量
     */
    public void setTotalBuyAccountsNumber(Long TotalBuyAccountsNumber) {
        this.TotalBuyAccountsNumber = TotalBuyAccountsNumber;
    }

    /**
     * Get 赠送数量 
     * @return TotalGiftAccountsNumber 赠送数量
     */
    public Long getTotalGiftAccountsNumber() {
        return this.TotalGiftAccountsNumber;
    }

    /**
     * Set 赠送数量
     * @param TotalGiftAccountsNumber 赠送数量
     */
    public void setTotalGiftAccountsNumber(Long TotalGiftAccountsNumber) {
        this.TotalGiftAccountsNumber = TotalGiftAccountsNumber;
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

    public ChannelDescribeAccountBillDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeAccountBillDetailResponse(ChannelDescribeAccountBillDetailResponse source) {
        if (source.BoundAccountsNumber != null) {
            this.BoundAccountsNumber = new Long(source.BoundAccountsNumber);
        }
        if (source.RemainAvailableAccountsNumber != null) {
            this.RemainAvailableAccountsNumber = new Long(source.RemainAvailableAccountsNumber);
        }
        if (source.InvalidAccountsNumber != null) {
            this.InvalidAccountsNumber = new Long(source.InvalidAccountsNumber);
        }
        if (source.TotalBuyAccountsNumber != null) {
            this.TotalBuyAccountsNumber = new Long(source.TotalBuyAccountsNumber);
        }
        if (source.TotalGiftAccountsNumber != null) {
            this.TotalGiftAccountsNumber = new Long(source.TotalGiftAccountsNumber);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BoundAccountsNumber", this.BoundAccountsNumber);
        this.setParamSimple(map, prefix + "RemainAvailableAccountsNumber", this.RemainAvailableAccountsNumber);
        this.setParamSimple(map, prefix + "InvalidAccountsNumber", this.InvalidAccountsNumber);
        this.setParamSimple(map, prefix + "TotalBuyAccountsNumber", this.TotalBuyAccountsNumber);
        this.setParamSimple(map, prefix + "TotalGiftAccountsNumber", this.TotalGiftAccountsNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

