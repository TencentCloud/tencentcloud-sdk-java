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

public class CreateOpenBankExternalAggregatedSubMerchantRegistrationResult extends AbstractModel {

    /**
    * 进件状态 
SUCCESS: 进件成功 
FAILED: 进件失败
PROCESSING: 进件中 
注意：若返回进件中，需要再次调用进件结果查询接口，查询结果。
    */
    @SerializedName("RegistrationStatus")
    @Expose
    private String RegistrationStatus;

    /**
    * 进件返回描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistrationMessage")
    @Expose
    private String RegistrationMessage;

    /**
    * 渠道进件序列号
    */
    @SerializedName("ChannelRegistrationNo")
    @Expose
    private String ChannelRegistrationNo;

    /**
    * 渠道子商户ID
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
     * Get 进件状态 
SUCCESS: 进件成功 
FAILED: 进件失败
PROCESSING: 进件中 
注意：若返回进件中，需要再次调用进件结果查询接口，查询结果。 
     * @return RegistrationStatus 进件状态 
SUCCESS: 进件成功 
FAILED: 进件失败
PROCESSING: 进件中 
注意：若返回进件中，需要再次调用进件结果查询接口，查询结果。
     */
    public String getRegistrationStatus() {
        return this.RegistrationStatus;
    }

    /**
     * Set 进件状态 
SUCCESS: 进件成功 
FAILED: 进件失败
PROCESSING: 进件中 
注意：若返回进件中，需要再次调用进件结果查询接口，查询结果。
     * @param RegistrationStatus 进件状态 
SUCCESS: 进件成功 
FAILED: 进件失败
PROCESSING: 进件中 
注意：若返回进件中，需要再次调用进件结果查询接口，查询结果。
     */
    public void setRegistrationStatus(String RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    /**
     * Get 进件返回描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistrationMessage 进件返回描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistrationMessage() {
        return this.RegistrationMessage;
    }

    /**
     * Set 进件返回描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistrationMessage 进件返回描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistrationMessage(String RegistrationMessage) {
        this.RegistrationMessage = RegistrationMessage;
    }

    /**
     * Get 渠道进件序列号 
     * @return ChannelRegistrationNo 渠道进件序列号
     */
    public String getChannelRegistrationNo() {
        return this.ChannelRegistrationNo;
    }

    /**
     * Set 渠道进件序列号
     * @param ChannelRegistrationNo 渠道进件序列号
     */
    public void setChannelRegistrationNo(String ChannelRegistrationNo) {
        this.ChannelRegistrationNo = ChannelRegistrationNo;
    }

    /**
     * Get 渠道子商户ID 
     * @return ChannelSubMerchantId 渠道子商户ID
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户ID
     * @param ChannelSubMerchantId 渠道子商户ID
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    public CreateOpenBankExternalAggregatedSubMerchantRegistrationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankExternalAggregatedSubMerchantRegistrationResult(CreateOpenBankExternalAggregatedSubMerchantRegistrationResult source) {
        if (source.RegistrationStatus != null) {
            this.RegistrationStatus = new String(source.RegistrationStatus);
        }
        if (source.RegistrationMessage != null) {
            this.RegistrationMessage = new String(source.RegistrationMessage);
        }
        if (source.ChannelRegistrationNo != null) {
            this.ChannelRegistrationNo = new String(source.ChannelRegistrationNo);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistrationStatus", this.RegistrationStatus);
        this.setParamSimple(map, prefix + "RegistrationMessage", this.RegistrationMessage);
        this.setParamSimple(map, prefix + "ChannelRegistrationNo", this.ChannelRegistrationNo);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);

    }
}

