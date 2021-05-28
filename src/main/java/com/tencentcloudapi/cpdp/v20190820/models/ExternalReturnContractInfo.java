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

public class ExternalReturnContractInfo extends AbstractModel{

    /**
    * 第三方渠道协议id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnAgreementId")
    @Expose
    private String ExternalReturnAgreementId;

    /**
    * 第三方渠道协议生效时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnContractEffectiveTimestamp")
    @Expose
    private String ExternalReturnContractEffectiveTimestamp;

    /**
    * 第三方渠道协议解约时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnContractTerminationTimestamp")
    @Expose
    private String ExternalReturnContractTerminationTimestamp;

    /**
    * 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnContractStatus")
    @Expose
    private String ExternalReturnContractStatus;

    /**
    * 第三方渠道请求序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnRequestId")
    @Expose
    private String ExternalReturnRequestId;

    /**
    * 第三方渠道协议签署时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnContractSignedTimestamp")
    @Expose
    private String ExternalReturnContractSignedTimestamp;

    /**
    * 第三方渠道协议到期时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnContractExpiredTimestamp")
    @Expose
    private String ExternalReturnContractExpiredTimestamp;

    /**
    * 第三方渠道返回的合约数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnContractData")
    @Expose
    private String ExternalReturnContractData;

    /**
    * 第三方渠道解约备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnContractTerminationRemark")
    @Expose
    private String ExternalReturnContractTerminationRemark;

    /**
    * 第三方渠道协议解约方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnContractTerminationMode")
    @Expose
    private String ExternalReturnContractTerminationMode;

    /**
     * Get 第三方渠道协议id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnAgreementId 第三方渠道协议id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnAgreementId() {
        return this.ExternalReturnAgreementId;
    }

    /**
     * Set 第三方渠道协议id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnAgreementId 第三方渠道协议id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnAgreementId(String ExternalReturnAgreementId) {
        this.ExternalReturnAgreementId = ExternalReturnAgreementId;
    }

    /**
     * Get 第三方渠道协议生效时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnContractEffectiveTimestamp 第三方渠道协议生效时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnContractEffectiveTimestamp() {
        return this.ExternalReturnContractEffectiveTimestamp;
    }

    /**
     * Set 第三方渠道协议生效时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnContractEffectiveTimestamp 第三方渠道协议生效时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnContractEffectiveTimestamp(String ExternalReturnContractEffectiveTimestamp) {
        this.ExternalReturnContractEffectiveTimestamp = ExternalReturnContractEffectiveTimestamp;
    }

    /**
     * Get 第三方渠道协议解约时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnContractTerminationTimestamp 第三方渠道协议解约时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnContractTerminationTimestamp() {
        return this.ExternalReturnContractTerminationTimestamp;
    }

    /**
     * Set 第三方渠道协议解约时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnContractTerminationTimestamp 第三方渠道协议解约时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnContractTerminationTimestamp(String ExternalReturnContractTerminationTimestamp) {
        this.ExternalReturnContractTerminationTimestamp = ExternalReturnContractTerminationTimestamp;
    }

    /**
     * Get 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnContractStatus 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnContractStatus() {
        return this.ExternalReturnContractStatus;
    }

    /**
     * Set 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnContractStatus 平台合约状态
协议状态，枚举值：
CONTRACT_STATUS_SIGNED：已签约
CONTRACT_STATUS_TERMINATED：未签约
CONTRACT_STATUS_PENDING：签约进行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnContractStatus(String ExternalReturnContractStatus) {
        this.ExternalReturnContractStatus = ExternalReturnContractStatus;
    }

    /**
     * Get 第三方渠道请求序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnRequestId 第三方渠道请求序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnRequestId() {
        return this.ExternalReturnRequestId;
    }

    /**
     * Set 第三方渠道请求序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnRequestId 第三方渠道请求序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnRequestId(String ExternalReturnRequestId) {
        this.ExternalReturnRequestId = ExternalReturnRequestId;
    }

    /**
     * Get 第三方渠道协议签署时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnContractSignedTimestamp 第三方渠道协议签署时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnContractSignedTimestamp() {
        return this.ExternalReturnContractSignedTimestamp;
    }

    /**
     * Set 第三方渠道协议签署时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnContractSignedTimestamp 第三方渠道协议签署时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnContractSignedTimestamp(String ExternalReturnContractSignedTimestamp) {
        this.ExternalReturnContractSignedTimestamp = ExternalReturnContractSignedTimestamp;
    }

    /**
     * Get 第三方渠道协议到期时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnContractExpiredTimestamp 第三方渠道协议到期时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnContractExpiredTimestamp() {
        return this.ExternalReturnContractExpiredTimestamp;
    }

    /**
     * Set 第三方渠道协议到期时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnContractExpiredTimestamp 第三方渠道协议到期时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnContractExpiredTimestamp(String ExternalReturnContractExpiredTimestamp) {
        this.ExternalReturnContractExpiredTimestamp = ExternalReturnContractExpiredTimestamp;
    }

    /**
     * Get 第三方渠道返回的合约数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnContractData 第三方渠道返回的合约数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnContractData() {
        return this.ExternalReturnContractData;
    }

    /**
     * Set 第三方渠道返回的合约数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnContractData 第三方渠道返回的合约数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnContractData(String ExternalReturnContractData) {
        this.ExternalReturnContractData = ExternalReturnContractData;
    }

    /**
     * Get 第三方渠道解约备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnContractTerminationRemark 第三方渠道解约备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnContractTerminationRemark() {
        return this.ExternalReturnContractTerminationRemark;
    }

    /**
     * Set 第三方渠道解约备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnContractTerminationRemark 第三方渠道解约备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnContractTerminationRemark(String ExternalReturnContractTerminationRemark) {
        this.ExternalReturnContractTerminationRemark = ExternalReturnContractTerminationRemark;
    }

    /**
     * Get 第三方渠道协议解约方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnContractTerminationMode 第三方渠道协议解约方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnContractTerminationMode() {
        return this.ExternalReturnContractTerminationMode;
    }

    /**
     * Set 第三方渠道协议解约方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnContractTerminationMode 第三方渠道协议解约方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnContractTerminationMode(String ExternalReturnContractTerminationMode) {
        this.ExternalReturnContractTerminationMode = ExternalReturnContractTerminationMode;
    }

    public ExternalReturnContractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalReturnContractInfo(ExternalReturnContractInfo source) {
        if (source.ExternalReturnAgreementId != null) {
            this.ExternalReturnAgreementId = new String(source.ExternalReturnAgreementId);
        }
        if (source.ExternalReturnContractEffectiveTimestamp != null) {
            this.ExternalReturnContractEffectiveTimestamp = new String(source.ExternalReturnContractEffectiveTimestamp);
        }
        if (source.ExternalReturnContractTerminationTimestamp != null) {
            this.ExternalReturnContractTerminationTimestamp = new String(source.ExternalReturnContractTerminationTimestamp);
        }
        if (source.ExternalReturnContractStatus != null) {
            this.ExternalReturnContractStatus = new String(source.ExternalReturnContractStatus);
        }
        if (source.ExternalReturnRequestId != null) {
            this.ExternalReturnRequestId = new String(source.ExternalReturnRequestId);
        }
        if (source.ExternalReturnContractSignedTimestamp != null) {
            this.ExternalReturnContractSignedTimestamp = new String(source.ExternalReturnContractSignedTimestamp);
        }
        if (source.ExternalReturnContractExpiredTimestamp != null) {
            this.ExternalReturnContractExpiredTimestamp = new String(source.ExternalReturnContractExpiredTimestamp);
        }
        if (source.ExternalReturnContractData != null) {
            this.ExternalReturnContractData = new String(source.ExternalReturnContractData);
        }
        if (source.ExternalReturnContractTerminationRemark != null) {
            this.ExternalReturnContractTerminationRemark = new String(source.ExternalReturnContractTerminationRemark);
        }
        if (source.ExternalReturnContractTerminationMode != null) {
            this.ExternalReturnContractTerminationMode = new String(source.ExternalReturnContractTerminationMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalReturnAgreementId", this.ExternalReturnAgreementId);
        this.setParamSimple(map, prefix + "ExternalReturnContractEffectiveTimestamp", this.ExternalReturnContractEffectiveTimestamp);
        this.setParamSimple(map, prefix + "ExternalReturnContractTerminationTimestamp", this.ExternalReturnContractTerminationTimestamp);
        this.setParamSimple(map, prefix + "ExternalReturnContractStatus", this.ExternalReturnContractStatus);
        this.setParamSimple(map, prefix + "ExternalReturnRequestId", this.ExternalReturnRequestId);
        this.setParamSimple(map, prefix + "ExternalReturnContractSignedTimestamp", this.ExternalReturnContractSignedTimestamp);
        this.setParamSimple(map, prefix + "ExternalReturnContractExpiredTimestamp", this.ExternalReturnContractExpiredTimestamp);
        this.setParamSimple(map, prefix + "ExternalReturnContractData", this.ExternalReturnContractData);
        this.setParamSimple(map, prefix + "ExternalReturnContractTerminationRemark", this.ExternalReturnContractTerminationRemark);
        this.setParamSimple(map, prefix + "ExternalReturnContractTerminationMode", this.ExternalReturnContractTerminationMode);

    }
}

