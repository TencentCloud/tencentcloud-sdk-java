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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryOpenBankVerificationResult extends AbstractModel {

    /**
    * 云企付渠道核销订单号
    */
    @SerializedName("ChannelVerificationId")
    @Expose
    private String ChannelVerificationId;

    /**
    * 第三方支付渠道核销订单号
    */
    @SerializedName("ThirdVerificationId")
    @Expose
    private String ThirdVerificationId;

    /**
    * 核销金额，单位分
    */
    @SerializedName("VerificationAmount")
    @Expose
    private Long VerificationAmount;

    /**
    * 核销状态
INIT("INIT","初始化"),
SUCCESS("SUCCESS","核销成功"),
FAILED("FAILED","核销失败"),
PROCESSING("PROCESSING","核销中");
    */
    @SerializedName("VerificationStatus")
    @Expose
    private String VerificationStatus;

    /**
    * 失败原因，若核销失败，附上原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 渠道附加返回信息，一般情况可以不关注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdVerificationReturnData")
    @Expose
    private String ThirdVerificationReturnData;

    /**
     * Get 云企付渠道核销订单号 
     * @return ChannelVerificationId 云企付渠道核销订单号
     */
    public String getChannelVerificationId() {
        return this.ChannelVerificationId;
    }

    /**
     * Set 云企付渠道核销订单号
     * @param ChannelVerificationId 云企付渠道核销订单号
     */
    public void setChannelVerificationId(String ChannelVerificationId) {
        this.ChannelVerificationId = ChannelVerificationId;
    }

    /**
     * Get 第三方支付渠道核销订单号 
     * @return ThirdVerificationId 第三方支付渠道核销订单号
     */
    public String getThirdVerificationId() {
        return this.ThirdVerificationId;
    }

    /**
     * Set 第三方支付渠道核销订单号
     * @param ThirdVerificationId 第三方支付渠道核销订单号
     */
    public void setThirdVerificationId(String ThirdVerificationId) {
        this.ThirdVerificationId = ThirdVerificationId;
    }

    /**
     * Get 核销金额，单位分 
     * @return VerificationAmount 核销金额，单位分
     */
    public Long getVerificationAmount() {
        return this.VerificationAmount;
    }

    /**
     * Set 核销金额，单位分
     * @param VerificationAmount 核销金额，单位分
     */
    public void setVerificationAmount(Long VerificationAmount) {
        this.VerificationAmount = VerificationAmount;
    }

    /**
     * Get 核销状态
INIT("INIT","初始化"),
SUCCESS("SUCCESS","核销成功"),
FAILED("FAILED","核销失败"),
PROCESSING("PROCESSING","核销中"); 
     * @return VerificationStatus 核销状态
INIT("INIT","初始化"),
SUCCESS("SUCCESS","核销成功"),
FAILED("FAILED","核销失败"),
PROCESSING("PROCESSING","核销中");
     */
    public String getVerificationStatus() {
        return this.VerificationStatus;
    }

    /**
     * Set 核销状态
INIT("INIT","初始化"),
SUCCESS("SUCCESS","核销成功"),
FAILED("FAILED","核销失败"),
PROCESSING("PROCESSING","核销中");
     * @param VerificationStatus 核销状态
INIT("INIT","初始化"),
SUCCESS("SUCCESS","核销成功"),
FAILED("FAILED","核销失败"),
PROCESSING("PROCESSING","核销中");
     */
    public void setVerificationStatus(String VerificationStatus) {
        this.VerificationStatus = VerificationStatus;
    }

    /**
     * Get 失败原因，若核销失败，附上原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 失败原因，若核销失败，附上原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因，若核销失败，附上原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 失败原因，若核销失败，附上原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 渠道附加返回信息，一般情况可以不关注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdVerificationReturnData 渠道附加返回信息，一般情况可以不关注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThirdVerificationReturnData() {
        return this.ThirdVerificationReturnData;
    }

    /**
     * Set 渠道附加返回信息，一般情况可以不关注
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdVerificationReturnData 渠道附加返回信息，一般情况可以不关注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdVerificationReturnData(String ThirdVerificationReturnData) {
        this.ThirdVerificationReturnData = ThirdVerificationReturnData;
    }

    public QueryOpenBankVerificationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankVerificationResult(QueryOpenBankVerificationResult source) {
        if (source.ChannelVerificationId != null) {
            this.ChannelVerificationId = new String(source.ChannelVerificationId);
        }
        if (source.ThirdVerificationId != null) {
            this.ThirdVerificationId = new String(source.ThirdVerificationId);
        }
        if (source.VerificationAmount != null) {
            this.VerificationAmount = new Long(source.VerificationAmount);
        }
        if (source.VerificationStatus != null) {
            this.VerificationStatus = new String(source.VerificationStatus);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.ThirdVerificationReturnData != null) {
            this.ThirdVerificationReturnData = new String(source.ThirdVerificationReturnData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelVerificationId", this.ChannelVerificationId);
        this.setParamSimple(map, prefix + "ThirdVerificationId", this.ThirdVerificationId);
        this.setParamSimple(map, prefix + "VerificationAmount", this.VerificationAmount);
        this.setParamSimple(map, prefix + "VerificationStatus", this.VerificationStatus);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "ThirdVerificationReturnData", this.ThirdVerificationReturnData);

    }
}

