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

public class CreateSinglePayResult extends AbstractModel{

    /**
    * 受理状态（S：处理成功；F：处理失败）
    */
    @SerializedName("HandleStatus")
    @Expose
    private String HandleStatus;

    /**
    * 受理状态描述
    */
    @SerializedName("HandleMsg")
    @Expose
    private String HandleMsg;

    /**
    * 业务流水号，历史唯一
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 银行指令流水
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankSerialNo")
    @Expose
    private String BankSerialNo;

    /**
    * 付款状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayStatus")
    @Expose
    private String PayStatus;

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
     * Get 受理状态（S：处理成功；F：处理失败） 
     * @return HandleStatus 受理状态（S：处理成功；F：处理失败）
     */
    public String getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set 受理状态（S：处理成功；F：处理失败）
     * @param HandleStatus 受理状态（S：处理成功；F：处理失败）
     */
    public void setHandleStatus(String HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get 受理状态描述 
     * @return HandleMsg 受理状态描述
     */
    public String getHandleMsg() {
        return this.HandleMsg;
    }

    /**
     * Set 受理状态描述
     * @param HandleMsg 受理状态描述
     */
    public void setHandleMsg(String HandleMsg) {
        this.HandleMsg = HandleMsg;
    }

    /**
     * Get 业务流水号，历史唯一
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialNo 业务流水号，历史唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 业务流水号，历史唯一
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialNo 业务流水号，历史唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get 银行指令流水
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankSerialNo 银行指令流水
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankSerialNo() {
        return this.BankSerialNo;
    }

    /**
     * Set 银行指令流水
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankSerialNo 银行指令流水
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankSerialNo(String BankSerialNo) {
        this.BankSerialNo = BankSerialNo;
    }

    /**
     * Get 付款状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayStatus 付款状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayStatus() {
        return this.PayStatus;
    }

    /**
     * Set 付款状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayStatus 付款状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayStatus(String PayStatus) {
        this.PayStatus = PayStatus;
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

    public CreateSinglePayResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSinglePayResult(CreateSinglePayResult source) {
        if (source.HandleStatus != null) {
            this.HandleStatus = new String(source.HandleStatus);
        }
        if (source.HandleMsg != null) {
            this.HandleMsg = new String(source.HandleMsg);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.BankSerialNo != null) {
            this.BankSerialNo = new String(source.BankSerialNo);
        }
        if (source.PayStatus != null) {
            this.PayStatus = new String(source.PayStatus);
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
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "HandleMsg", this.HandleMsg);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "BankSerialNo", this.BankSerialNo);
        this.setParamSimple(map, prefix + "PayStatus", this.PayStatus);
        this.setParamSimple(map, prefix + "BankRetCode", this.BankRetCode);
        this.setParamSimple(map, prefix + "BankRetMsg", this.BankRetMsg);

    }
}

