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

public class PreAuctionInfo extends AbstractModel {

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 竞价倒计时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BiddingTime")
    @Expose
    private String BiddingTime;

    /**
    * 出价次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BidCount")
    @Expose
    private Long BidCount;

    /**
    * 当前价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * 用户操作 bid：出价 "noAction"：无法操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 业务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 竞价倒计时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BiddingTime 竞价倒计时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBiddingTime() {
        return this.BiddingTime;
    }

    /**
     * Set 竞价倒计时
注意：此字段可能返回 null，表示取不到有效值。
     * @param BiddingTime 竞价倒计时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBiddingTime(String BiddingTime) {
        this.BiddingTime = BiddingTime;
    }

    /**
     * Get 出价次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BidCount 出价次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBidCount() {
        return this.BidCount;
    }

    /**
     * Set 出价次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param BidCount 出价次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBidCount(Long BidCount) {
        this.BidCount = BidCount;
    }

    /**
     * Get 当前价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Price 当前价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set 当前价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Price 当前价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get 用户操作 bid：出价 "noAction"：无法操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Op 用户操作 bid：出价 "noAction"：无法操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 用户操作 bid：出价 "noAction"：无法操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Op 用户操作 bid：出价 "noAction"：无法操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 业务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessId 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessId 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    public PreAuctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreAuctionInfo(PreAuctionInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.BiddingTime != null) {
            this.BiddingTime = new String(source.BiddingTime);
        }
        if (source.BidCount != null) {
            this.BidCount = new Long(source.BidCount);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "BiddingTime", this.BiddingTime);
        this.setParamSimple(map, prefix + "BidCount", this.BidCount);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);

    }
}

