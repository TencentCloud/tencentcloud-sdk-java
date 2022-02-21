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

public class BindOpenBankExternalSubMerchantBankAccountResult extends AbstractModel{

    /**
    * 渠道申请编号。
    */
    @SerializedName("ChannelApplyId")
    @Expose
    private String ChannelApplyId;

    /**
    * 绑定状态。
__SUCCESS__: 绑定成功
__FAILED__: 绑定失败
__PROCESSING__: 绑定中。
注意：若返回绑定中，需要再次调用绑定结果查询接口,查询结果。
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * 绑定返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindMessage")
    @Expose
    private String BindMessage;

    /**
    * 渠道子商户银行账户信息, 为JSON格式字符串（绑定成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalSubMerchantBankAccountReturnData")
    @Expose
    private String ExternalSubMerchantBankAccountReturnData;

    /**
    * 绑卡序列号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindSerialNo")
    @Expose
    private String BindSerialNo;

    /**
     * Get 渠道申请编号。 
     * @return ChannelApplyId 渠道申请编号。
     */
    public String getChannelApplyId() {
        return this.ChannelApplyId;
    }

    /**
     * Set 渠道申请编号。
     * @param ChannelApplyId 渠道申请编号。
     */
    public void setChannelApplyId(String ChannelApplyId) {
        this.ChannelApplyId = ChannelApplyId;
    }

    /**
     * Get 绑定状态。
__SUCCESS__: 绑定成功
__FAILED__: 绑定失败
__PROCESSING__: 绑定中。
注意：若返回绑定中，需要再次调用绑定结果查询接口,查询结果。 
     * @return BindStatus 绑定状态。
__SUCCESS__: 绑定成功
__FAILED__: 绑定失败
__PROCESSING__: 绑定中。
注意：若返回绑定中，需要再次调用绑定结果查询接口,查询结果。
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 绑定状态。
__SUCCESS__: 绑定成功
__FAILED__: 绑定失败
__PROCESSING__: 绑定中。
注意：若返回绑定中，需要再次调用绑定结果查询接口,查询结果。
     * @param BindStatus 绑定状态。
__SUCCESS__: 绑定成功
__FAILED__: 绑定失败
__PROCESSING__: 绑定中。
注意：若返回绑定中，需要再次调用绑定结果查询接口,查询结果。
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get 绑定返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindMessage 绑定返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindMessage() {
        return this.BindMessage;
    }

    /**
     * Set 绑定返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindMessage 绑定返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindMessage(String BindMessage) {
        this.BindMessage = BindMessage;
    }

    /**
     * Get 渠道子商户银行账户信息, 为JSON格式字符串（绑定成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalSubMerchantBankAccountReturnData 渠道子商户银行账户信息, 为JSON格式字符串（绑定成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalSubMerchantBankAccountReturnData() {
        return this.ExternalSubMerchantBankAccountReturnData;
    }

    /**
     * Set 渠道子商户银行账户信息, 为JSON格式字符串（绑定成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalSubMerchantBankAccountReturnData 渠道子商户银行账户信息, 为JSON格式字符串（绑定成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalSubMerchantBankAccountReturnData(String ExternalSubMerchantBankAccountReturnData) {
        this.ExternalSubMerchantBankAccountReturnData = ExternalSubMerchantBankAccountReturnData;
    }

    /**
     * Get 绑卡序列号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindSerialNo 绑卡序列号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindSerialNo() {
        return this.BindSerialNo;
    }

    /**
     * Set 绑卡序列号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindSerialNo 绑卡序列号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindSerialNo(String BindSerialNo) {
        this.BindSerialNo = BindSerialNo;
    }

    public BindOpenBankExternalSubMerchantBankAccountResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindOpenBankExternalSubMerchantBankAccountResult(BindOpenBankExternalSubMerchantBankAccountResult source) {
        if (source.ChannelApplyId != null) {
            this.ChannelApplyId = new String(source.ChannelApplyId);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.BindMessage != null) {
            this.BindMessage = new String(source.BindMessage);
        }
        if (source.ExternalSubMerchantBankAccountReturnData != null) {
            this.ExternalSubMerchantBankAccountReturnData = new String(source.ExternalSubMerchantBankAccountReturnData);
        }
        if (source.BindSerialNo != null) {
            this.BindSerialNo = new String(source.BindSerialNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelApplyId", this.ChannelApplyId);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "BindMessage", this.BindMessage);
        this.setParamSimple(map, prefix + "ExternalSubMerchantBankAccountReturnData", this.ExternalSubMerchantBankAccountReturnData);
        this.setParamSimple(map, prefix + "BindSerialNo", this.BindSerialNo);

    }
}

