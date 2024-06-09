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

public class BiddingResult extends AbstractModel {

    /**
    * business_id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessID")
    @Expose
    private String BusinessID;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 当前价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentPrice")
    @Expose
    private Long CurrentPrice;

    /**
    * 当前用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentNickname")
    @Expose
    private String CurrentNickname;

    /**
    * 我的出价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BiddingPrice")
    @Expose
    private Long BiddingPrice;

    /**
    * 竞价保证金
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BiddingBondPrice")
    @Expose
    private Long BiddingBondPrice;

    /**
    * 竞价结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BiddingEndTime")
    @Expose
    private String BiddingEndTime;

    /**
    * 竞价标识，1 领先，2 落后
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BiddingFlag")
    @Expose
    private Long BiddingFlag;

    /**
    * 出价次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BiddingNum")
    @Expose
    private Long BiddingNum;

    /**
    * 1 已预约，2 竞价中，3 支付尾款 4 交割 5 交易失败 6 交易成功，7 已过期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get business_id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessID business_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessID() {
        return this.BusinessID;
    }

    /**
     * Set business_id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessID business_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessID(String BusinessID) {
        this.BusinessID = BusinessID;
    }

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
     * Get 当前价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentPrice 当前价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentPrice() {
        return this.CurrentPrice;
    }

    /**
     * Set 当前价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentPrice 当前价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentPrice(Long CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }

    /**
     * Get 当前用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentNickname 当前用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrentNickname() {
        return this.CurrentNickname;
    }

    /**
     * Set 当前用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentNickname 当前用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentNickname(String CurrentNickname) {
        this.CurrentNickname = CurrentNickname;
    }

    /**
     * Get 我的出价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BiddingPrice 我的出价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBiddingPrice() {
        return this.BiddingPrice;
    }

    /**
     * Set 我的出价
注意：此字段可能返回 null，表示取不到有效值。
     * @param BiddingPrice 我的出价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBiddingPrice(Long BiddingPrice) {
        this.BiddingPrice = BiddingPrice;
    }

    /**
     * Get 竞价保证金
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BiddingBondPrice 竞价保证金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBiddingBondPrice() {
        return this.BiddingBondPrice;
    }

    /**
     * Set 竞价保证金
注意：此字段可能返回 null，表示取不到有效值。
     * @param BiddingBondPrice 竞价保证金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBiddingBondPrice(Long BiddingBondPrice) {
        this.BiddingBondPrice = BiddingBondPrice;
    }

    /**
     * Get 竞价结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BiddingEndTime 竞价结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBiddingEndTime() {
        return this.BiddingEndTime;
    }

    /**
     * Set 竞价结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BiddingEndTime 竞价结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBiddingEndTime(String BiddingEndTime) {
        this.BiddingEndTime = BiddingEndTime;
    }

    /**
     * Get 竞价标识，1 领先，2 落后
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BiddingFlag 竞价标识，1 领先，2 落后
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBiddingFlag() {
        return this.BiddingFlag;
    }

    /**
     * Set 竞价标识，1 领先，2 落后
注意：此字段可能返回 null，表示取不到有效值。
     * @param BiddingFlag 竞价标识，1 领先，2 落后
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBiddingFlag(Long BiddingFlag) {
        this.BiddingFlag = BiddingFlag;
    }

    /**
     * Get 出价次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BiddingNum 出价次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBiddingNum() {
        return this.BiddingNum;
    }

    /**
     * Set 出价次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param BiddingNum 出价次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBiddingNum(Long BiddingNum) {
        this.BiddingNum = BiddingNum;
    }

    /**
     * Get 1 已预约，2 竞价中，3 支付尾款 4 交割 5 交易失败 6 交易成功，7 已过期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 1 已预约，2 竞价中，3 支付尾款 4 交割 5 交易失败 6 交易成功，7 已过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1 已预约，2 竞价中，3 支付尾款 4 交割 5 交易失败 6 交易成功，7 已过期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 1 已预约，2 竞价中，3 支付尾款 4 交割 5 交易失败 6 交易成功，7 已过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public BiddingResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BiddingResult(BiddingResult source) {
        if (source.BusinessID != null) {
            this.BusinessID = new String(source.BusinessID);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CurrentPrice != null) {
            this.CurrentPrice = new Long(source.CurrentPrice);
        }
        if (source.CurrentNickname != null) {
            this.CurrentNickname = new String(source.CurrentNickname);
        }
        if (source.BiddingPrice != null) {
            this.BiddingPrice = new Long(source.BiddingPrice);
        }
        if (source.BiddingBondPrice != null) {
            this.BiddingBondPrice = new Long(source.BiddingBondPrice);
        }
        if (source.BiddingEndTime != null) {
            this.BiddingEndTime = new String(source.BiddingEndTime);
        }
        if (source.BiddingFlag != null) {
            this.BiddingFlag = new Long(source.BiddingFlag);
        }
        if (source.BiddingNum != null) {
            this.BiddingNum = new Long(source.BiddingNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessID", this.BusinessID);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CurrentPrice", this.CurrentPrice);
        this.setParamSimple(map, prefix + "CurrentNickname", this.CurrentNickname);
        this.setParamSimple(map, prefix + "BiddingPrice", this.BiddingPrice);
        this.setParamSimple(map, prefix + "BiddingBondPrice", this.BiddingBondPrice);
        this.setParamSimple(map, prefix + "BiddingEndTime", this.BiddingEndTime);
        this.setParamSimple(map, prefix + "BiddingFlag", this.BiddingFlag);
        this.setParamSimple(map, prefix + "BiddingNum", this.BiddingNum);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

