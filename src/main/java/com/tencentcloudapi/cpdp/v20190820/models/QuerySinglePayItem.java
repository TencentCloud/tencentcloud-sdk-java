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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuerySinglePayItem extends AbstractModel{

    /**
    * 付款状态（S：支付成功；P：支付处理中；F：支付失败）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayStatus")
    @Expose
    private String PayStatus;

    /**
    * 平台信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlatformMsg")
    @Expose
    private String PlatformMsg;

    /**
    * 银行原始返回码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankRetCode")
    @Expose
    private String BankRetCode;

    /**
    * 银行原始返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankRetMsg")
    @Expose
    private String BankRetMsg;

    /**
     * Get 付款状态（S：支付成功；P：支付处理中；F：支付失败）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayStatus 付款状态（S：支付成功；P：支付处理中；F：支付失败）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayStatus() {
        return this.PayStatus;
    }

    /**
     * Set 付款状态（S：支付成功；P：支付处理中；F：支付失败）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayStatus 付款状态（S：支付成功；P：支付处理中；F：支付失败）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayStatus(String PayStatus) {
        this.PayStatus = PayStatus;
    }

    /**
     * Get 平台信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlatformMsg 平台信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlatformMsg() {
        return this.PlatformMsg;
    }

    /**
     * Set 平台信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlatformMsg 平台信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlatformMsg(String PlatformMsg) {
        this.PlatformMsg = PlatformMsg;
    }

    /**
     * Get 银行原始返回码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankRetCode 银行原始返回码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankRetCode() {
        return this.BankRetCode;
    }

    /**
     * Set 银行原始返回码
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankRetCode 银行原始返回码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankRetCode(String BankRetCode) {
        this.BankRetCode = BankRetCode;
    }

    /**
     * Get 银行原始返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankRetMsg 银行原始返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankRetMsg() {
        return this.BankRetMsg;
    }

    /**
     * Set 银行原始返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankRetMsg 银行原始返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankRetMsg(String BankRetMsg) {
        this.BankRetMsg = BankRetMsg;
    }

    public QuerySinglePayItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySinglePayItem(QuerySinglePayItem source) {
        if (source.PayStatus != null) {
            this.PayStatus = new String(source.PayStatus);
        }
        if (source.PlatformMsg != null) {
            this.PlatformMsg = new String(source.PlatformMsg);
        }
        if (source.BankRetCode != null) {
            this.BankRetCode = new String(source.BankRetCode);
        }
        if (source.BankRetMsg != null) {
            this.BankRetMsg = new String(source.BankRetMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayStatus", this.PayStatus);
        this.setParamSimple(map, prefix + "PlatformMsg", this.PlatformMsg);
        this.setParamSimple(map, prefix + "BankRetCode", this.BankRetCode);
        this.setParamSimple(map, prefix + "BankRetMsg", this.BankRetMsg);

    }
}

