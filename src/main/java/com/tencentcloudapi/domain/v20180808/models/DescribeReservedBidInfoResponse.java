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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReservedBidInfoResponse extends AbstractModel {

    /**
    * 竞价领先价格
    */
    @SerializedName("UpPrice")
    @Expose
    private Long UpPrice;

    /**
    * 请求用户当前价格
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 领先用户
    */
    @SerializedName("UpUser")
    @Expose
    private String UpUser;

    /**
    * 竞价详细数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BidList")
    @Expose
    private ReserveBidInfo [] BidList;

    /**
    * 竞价结束时间
    */
    @SerializedName("BidEndTime")
    @Expose
    private String BidEndTime;

    /**
    * 是否领先
    */
    @SerializedName("IsUp")
    @Expose
    private Boolean IsUp;

    /**
    * 下次出价金额
    */
    @SerializedName("NextPrice")
    @Expose
    private Long NextPrice;

    /**
    * 状态：1. 等待竞价 2.竞价中 3.竞价结束
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
     * Get 竞价领先价格 
     * @return UpPrice 竞价领先价格
     */
    public Long getUpPrice() {
        return this.UpPrice;
    }

    /**
     * Set 竞价领先价格
     * @param UpPrice 竞价领先价格
     */
    public void setUpPrice(Long UpPrice) {
        this.UpPrice = UpPrice;
    }

    /**
     * Get 请求用户当前价格 
     * @return Price 请求用户当前价格
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 请求用户当前价格
     * @param Price 请求用户当前价格
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 领先用户 
     * @return UpUser 领先用户
     */
    public String getUpUser() {
        return this.UpUser;
    }

    /**
     * Set 领先用户
     * @param UpUser 领先用户
     */
    public void setUpUser(String UpUser) {
        this.UpUser = UpUser;
    }

    /**
     * Get 竞价详细数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BidList 竞价详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReserveBidInfo [] getBidList() {
        return this.BidList;
    }

    /**
     * Set 竞价详细数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param BidList 竞价详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBidList(ReserveBidInfo [] BidList) {
        this.BidList = BidList;
    }

    /**
     * Get 竞价结束时间 
     * @return BidEndTime 竞价结束时间
     */
    public String getBidEndTime() {
        return this.BidEndTime;
    }

    /**
     * Set 竞价结束时间
     * @param BidEndTime 竞价结束时间
     */
    public void setBidEndTime(String BidEndTime) {
        this.BidEndTime = BidEndTime;
    }

    /**
     * Get 是否领先 
     * @return IsUp 是否领先
     */
    public Boolean getIsUp() {
        return this.IsUp;
    }

    /**
     * Set 是否领先
     * @param IsUp 是否领先
     */
    public void setIsUp(Boolean IsUp) {
        this.IsUp = IsUp;
    }

    /**
     * Get 下次出价金额 
     * @return NextPrice 下次出价金额
     */
    public Long getNextPrice() {
        return this.NextPrice;
    }

    /**
     * Set 下次出价金额
     * @param NextPrice 下次出价金额
     */
    public void setNextPrice(Long NextPrice) {
        this.NextPrice = NextPrice;
    }

    /**
     * Get 状态：1. 等待竞价 2.竞价中 3.竞价结束 
     * @return Status 状态：1. 等待竞价 2.竞价中 3.竞价结束
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：1. 等待竞价 2.竞价中 3.竞价结束
     * @param Status 状态：1. 等待竞价 2.竞价中 3.竞价结束
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

    public DescribeReservedBidInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReservedBidInfoResponse(DescribeReservedBidInfoResponse source) {
        if (source.UpPrice != null) {
            this.UpPrice = new Long(source.UpPrice);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.UpUser != null) {
            this.UpUser = new String(source.UpUser);
        }
        if (source.BidList != null) {
            this.BidList = new ReserveBidInfo[source.BidList.length];
            for (int i = 0; i < source.BidList.length; i++) {
                this.BidList[i] = new ReserveBidInfo(source.BidList[i]);
            }
        }
        if (source.BidEndTime != null) {
            this.BidEndTime = new String(source.BidEndTime);
        }
        if (source.IsUp != null) {
            this.IsUp = new Boolean(source.IsUp);
        }
        if (source.NextPrice != null) {
            this.NextPrice = new Long(source.NextPrice);
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
        this.setParamSimple(map, prefix + "UpPrice", this.UpPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "UpUser", this.UpUser);
        this.setParamArrayObj(map, prefix + "BidList.", this.BidList);
        this.setParamSimple(map, prefix + "BidEndTime", this.BidEndTime);
        this.setParamSimple(map, prefix + "IsUp", this.IsUp);
        this.setParamSimple(map, prefix + "NextPrice", this.NextPrice);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

