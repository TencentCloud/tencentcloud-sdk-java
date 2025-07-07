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

public class ApplyDeclareData extends AbstractModel {

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 第三方指令编号
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 受理状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 申报流水号
    */
    @SerializedName("DeclareId")
    @Expose
    private String DeclareId;

    /**
    * 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalDeclareId")
    @Expose
    private String OriginalDeclareId;

    /**
    * 付款人ID
    */
    @SerializedName("PayerId")
    @Expose
    private String PayerId;

    /**
     * Get 商户号 
     * @return MerchantId 商户号
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号
     * @param MerchantId 商户号
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 第三方指令编号 
     * @return TransactionId 第三方指令编号
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 第三方指令编号
     * @param TransactionId 第三方指令编号
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 受理状态 
     * @return Status 受理状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 受理状态
     * @param Status 受理状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 申报流水号 
     * @return DeclareId 申报流水号
     */
    public String getDeclareId() {
        return this.DeclareId;
    }

    /**
     * Set 申报流水号
     * @param DeclareId 申报流水号
     */
    public void setDeclareId(String DeclareId) {
        this.DeclareId = DeclareId;
    }

    /**
     * Get 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalDeclareId 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalDeclareId() {
        return this.OriginalDeclareId;
    }

    /**
     * Set 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalDeclareId 原申报流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalDeclareId(String OriginalDeclareId) {
        this.OriginalDeclareId = OriginalDeclareId;
    }

    /**
     * Get 付款人ID 
     * @return PayerId 付款人ID
     */
    public String getPayerId() {
        return this.PayerId;
    }

    /**
     * Set 付款人ID
     * @param PayerId 付款人ID
     */
    public void setPayerId(String PayerId) {
        this.PayerId = PayerId;
    }

    public ApplyDeclareData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyDeclareData(ApplyDeclareData source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DeclareId != null) {
            this.DeclareId = new String(source.DeclareId);
        }
        if (source.OriginalDeclareId != null) {
            this.OriginalDeclareId = new String(source.OriginalDeclareId);
        }
        if (source.PayerId != null) {
            this.PayerId = new String(source.PayerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeclareId", this.DeclareId);
        this.setParamSimple(map, prefix + "OriginalDeclareId", this.OriginalDeclareId);
        this.setParamSimple(map, prefix + "PayerId", this.PayerId);

    }
}

