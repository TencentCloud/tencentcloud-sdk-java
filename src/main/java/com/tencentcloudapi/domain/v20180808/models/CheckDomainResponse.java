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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckDomainResponse extends AbstractModel{

    /**
    * 所查询域名名称
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否能够注册
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 不能注册原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 是否是溢价词
    */
    @SerializedName("Premium")
    @Expose
    private Boolean Premium;

    /**
    * 域名价格
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 是否是敏感词
    */
    @SerializedName("BlackWord")
    @Expose
    private Boolean BlackWord;

    /**
    * 溢价词描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 溢价词的续费价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeeRenew")
    @Expose
    private Long FeeRenew;

    /**
    * 域名真实价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealPrice")
    @Expose
    private Long RealPrice;

    /**
    * 溢价词的转入价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeeTransfer")
    @Expose
    private Long FeeTransfer;

    /**
    * 溢价词的赎回价格
    */
    @SerializedName("FeeRestore")
    @Expose
    private Long FeeRestore;

    /**
    * 检测年限
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 所查询域名名称 
     * @return DomainName 所查询域名名称
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 所查询域名名称
     * @param DomainName 所查询域名名称
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 是否能够注册 
     * @return Available 是否能够注册
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set 是否能够注册
     * @param Available 是否能够注册
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get 不能注册原因 
     * @return Reason 不能注册原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 不能注册原因
     * @param Reason 不能注册原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 是否是溢价词 
     * @return Premium 是否是溢价词
     */
    public Boolean getPremium() {
        return this.Premium;
    }

    /**
     * Set 是否是溢价词
     * @param Premium 是否是溢价词
     */
    public void setPremium(Boolean Premium) {
        this.Premium = Premium;
    }

    /**
     * Get 域名价格 
     * @return Price 域名价格
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 域名价格
     * @param Price 域名价格
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 是否是敏感词 
     * @return BlackWord 是否是敏感词
     */
    public Boolean getBlackWord() {
        return this.BlackWord;
    }

    /**
     * Set 是否是敏感词
     * @param BlackWord 是否是敏感词
     */
    public void setBlackWord(Boolean BlackWord) {
        this.BlackWord = BlackWord;
    }

    /**
     * Get 溢价词描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describe 溢价词描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 溢价词描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describe 溢价词描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 溢价词的续费价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeeRenew 溢价词的续费价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFeeRenew() {
        return this.FeeRenew;
    }

    /**
     * Set 溢价词的续费价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeeRenew 溢价词的续费价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeeRenew(Long FeeRenew) {
        this.FeeRenew = FeeRenew;
    }

    /**
     * Get 域名真实价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealPrice 域名真实价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealPrice() {
        return this.RealPrice;
    }

    /**
     * Set 域名真实价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealPrice 域名真实价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealPrice(Long RealPrice) {
        this.RealPrice = RealPrice;
    }

    /**
     * Get 溢价词的转入价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeeTransfer 溢价词的转入价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFeeTransfer() {
        return this.FeeTransfer;
    }

    /**
     * Set 溢价词的转入价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeeTransfer 溢价词的转入价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeeTransfer(Long FeeTransfer) {
        this.FeeTransfer = FeeTransfer;
    }

    /**
     * Get 溢价词的赎回价格 
     * @return FeeRestore 溢价词的赎回价格
     */
    public Long getFeeRestore() {
        return this.FeeRestore;
    }

    /**
     * Set 溢价词的赎回价格
     * @param FeeRestore 溢价词的赎回价格
     */
    public void setFeeRestore(Long FeeRestore) {
        this.FeeRestore = FeeRestore;
    }

    /**
     * Get 检测年限 
     * @return Period 检测年限
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 检测年限
     * @param Period 检测年限
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
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
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Premium", this.Premium);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "BlackWord", this.BlackWord);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "FeeRenew", this.FeeRenew);
        this.setParamSimple(map, prefix + "RealPrice", this.RealPrice);
        this.setParamSimple(map, prefix + "FeeTransfer", this.FeeTransfer);
        this.setParamSimple(map, prefix + "FeeRestore", this.FeeRestore);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

