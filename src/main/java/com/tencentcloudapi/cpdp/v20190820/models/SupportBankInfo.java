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

public class SupportBankInfo extends AbstractModel{

    /**
    * 银行简称。
    */
    @SerializedName("BankCode")
    @Expose
    private String BankCode;

    /**
    * 银行名称。
    */
    @SerializedName("BankName")
    @Expose
    private String BankName;

    /**
    * 状态。
__MAINTAINING__: 维护中
__WORKING__: 正常工作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaintainStatus")
    @Expose
    private String MaintainStatus;

    /**
    * 银行渠道维护公告。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankNotice")
    @Expose
    private String BankNotice;

    /**
     * Get 银行简称。 
     * @return BankCode 银行简称。
     */
    public String getBankCode() {
        return this.BankCode;
    }

    /**
     * Set 银行简称。
     * @param BankCode 银行简称。
     */
    public void setBankCode(String BankCode) {
        this.BankCode = BankCode;
    }

    /**
     * Get 银行名称。 
     * @return BankName 银行名称。
     */
    public String getBankName() {
        return this.BankName;
    }

    /**
     * Set 银行名称。
     * @param BankName 银行名称。
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * Get 状态。
__MAINTAINING__: 维护中
__WORKING__: 正常工作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaintainStatus 状态。
__MAINTAINING__: 维护中
__WORKING__: 正常工作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaintainStatus() {
        return this.MaintainStatus;
    }

    /**
     * Set 状态。
__MAINTAINING__: 维护中
__WORKING__: 正常工作
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaintainStatus 状态。
__MAINTAINING__: 维护中
__WORKING__: 正常工作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaintainStatus(String MaintainStatus) {
        this.MaintainStatus = MaintainStatus;
    }

    /**
     * Get 银行渠道维护公告。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankNotice 银行渠道维护公告。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankNotice() {
        return this.BankNotice;
    }

    /**
     * Set 银行渠道维护公告。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankNotice 银行渠道维护公告。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankNotice(String BankNotice) {
        this.BankNotice = BankNotice;
    }

    public SupportBankInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportBankInfo(SupportBankInfo source) {
        if (source.BankCode != null) {
            this.BankCode = new String(source.BankCode);
        }
        if (source.BankName != null) {
            this.BankName = new String(source.BankName);
        }
        if (source.MaintainStatus != null) {
            this.MaintainStatus = new String(source.MaintainStatus);
        }
        if (source.BankNotice != null) {
            this.BankNotice = new String(source.BankNotice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BankCode", this.BankCode);
        this.setParamSimple(map, prefix + "BankName", this.BankName);
        this.setParamSimple(map, prefix + "MaintainStatus", this.MaintainStatus);
        this.setParamSimple(map, prefix + "BankNotice", this.BankNotice);

    }
}

