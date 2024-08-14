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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageRecords extends AbstractModel {

    /**
    * 使用金额（微分）
    */
    @SerializedName("UsedAmount")
    @Expose
    private Long UsedAmount;

    /**
    * 使用时间
    */
    @SerializedName("UsedTime")
    @Expose
    private String UsedTime;

    /**
    * 使用记录细节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsageDetails")
    @Expose
    private UsageDetails [] UsageDetails;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 查询的券id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * 交易场景：（adjust：调账、common：正常交易场景）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayScene")
    @Expose
    private String PayScene;

    /**
    * 唯一id,对应交易:预付费的dealName,调账/后付费的outTradeNo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SeqId")
    @Expose
    private String SeqId;

    /**
     * Get 使用金额（微分） 
     * @return UsedAmount 使用金额（微分）
     */
    public Long getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 使用金额（微分）
     * @param UsedAmount 使用金额（微分）
     */
    public void setUsedAmount(Long UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get 使用时间 
     * @return UsedTime 使用时间
     */
    public String getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set 使用时间
     * @param UsedTime 使用时间
     */
    public void setUsedTime(String UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get 使用记录细节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsageDetails 使用记录细节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsageDetails [] getUsageDetails() {
        return this.UsageDetails;
    }

    /**
     * Set 使用记录细节
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsageDetails 使用记录细节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsageDetails(UsageDetails [] UsageDetails) {
        this.UsageDetails = UsageDetails;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 查询的券id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoucherId 查询的券id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set 查询的券id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoucherId 查询的券id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get 交易场景：（adjust：调账、common：正常交易场景）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayScene 交易场景：（adjust：调账、common：正常交易场景）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayScene() {
        return this.PayScene;
    }

    /**
     * Set 交易场景：（adjust：调账、common：正常交易场景）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayScene 交易场景：（adjust：调账、common：正常交易场景）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayScene(String PayScene) {
        this.PayScene = PayScene;
    }

    /**
     * Get 唯一id,对应交易:预付费的dealName,调账/后付费的outTradeNo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeqId 唯一id,对应交易:预付费的dealName,调账/后付费的outTradeNo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeqId() {
        return this.SeqId;
    }

    /**
     * Set 唯一id,对应交易:预付费的dealName,调账/后付费的outTradeNo
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeqId 唯一id,对应交易:预付费的dealName,调账/后付费的outTradeNo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeqId(String SeqId) {
        this.SeqId = SeqId;
    }

    public UsageRecords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageRecords(UsageRecords source) {
        if (source.UsedAmount != null) {
            this.UsedAmount = new Long(source.UsedAmount);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new String(source.UsedTime);
        }
        if (source.UsageDetails != null) {
            this.UsageDetails = new UsageDetails[source.UsageDetails.length];
            for (int i = 0; i < source.UsageDetails.length; i++) {
                this.UsageDetails[i] = new UsageDetails(source.UsageDetails[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.PayScene != null) {
            this.PayScene = new String(source.PayScene);
        }
        if (source.SeqId != null) {
            this.SeqId = new String(source.SeqId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamArrayObj(map, prefix + "UsageDetails.", this.UsageDetails);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "PayScene", this.PayScene);
        this.setParamSimple(map, prefix + "SeqId", this.SeqId);

    }
}

