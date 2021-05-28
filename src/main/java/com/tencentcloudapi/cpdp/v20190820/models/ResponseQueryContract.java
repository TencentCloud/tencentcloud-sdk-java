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

public class ResponseQueryContract extends AbstractModel{

    /**
    * 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnCode")
    @Expose
    private String ExternalReturnCode;

    /**
    * 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnMessage")
    @Expose
    private String ExternalReturnMessage;

    /**
    * 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnData")
    @Expose
    private String ExternalReturnData;

    /**
    * 米大师内部商户号
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 米大师内部子商户号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 米大师内部应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelAppId")
    @Expose
    private String ChannelAppId;

    /**
    * 米大师内部子应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelSubAppId")
    @Expose
    private String ChannelSubAppId;

    /**
    * 渠道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 返回的合约信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnContractInfo")
    @Expose
    private ReturnContractInfo ReturnContractInfo;

    /**
    * 签约通知地址
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
     * Get 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnCode 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnCode() {
        return this.ExternalReturnCode;
    }

    /**
     * Set 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnCode 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnCode(String ExternalReturnCode) {
        this.ExternalReturnCode = ExternalReturnCode;
    }

    /**
     * Get 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnMessage 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnMessage() {
        return this.ExternalReturnMessage;
    }

    /**
     * Set 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnMessage 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnMessage(String ExternalReturnMessage) {
        this.ExternalReturnMessage = ExternalReturnMessage;
    }

    /**
     * Get 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnData 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnData() {
        return this.ExternalReturnData;
    }

    /**
     * Set 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnData 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnData(String ExternalReturnData) {
        this.ExternalReturnData = ExternalReturnData;
    }

    /**
     * Get 米大师内部商户号 
     * @return ChannelMerchantId 米大师内部商户号
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 米大师内部商户号
     * @param ChannelMerchantId 米大师内部商户号
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 米大师内部子商户号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelSubMerchantId 米大师内部子商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 米大师内部子商户号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelSubMerchantId 米大师内部子商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 米大师内部应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelAppId 米大师内部应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelAppId() {
        return this.ChannelAppId;
    }

    /**
     * Set 米大师内部应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelAppId 米大师内部应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelAppId(String ChannelAppId) {
        this.ChannelAppId = ChannelAppId;
    }

    /**
     * Get 米大师内部子应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelSubAppId 米大师内部子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelSubAppId() {
        return this.ChannelSubAppId;
    }

    /**
     * Set 米大师内部子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelSubAppId 米大师内部子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelSubAppId(String ChannelSubAppId) {
        this.ChannelSubAppId = ChannelSubAppId;
    }

    /**
     * Get 渠道名称 
     * @return ChannelName 渠道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称
     * @param ChannelName 渠道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 返回的合约信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnContractInfo 返回的合约信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReturnContractInfo getReturnContractInfo() {
        return this.ReturnContractInfo;
    }

    /**
     * Set 返回的合约信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnContractInfo 返回的合约信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnContractInfo(ReturnContractInfo ReturnContractInfo) {
        this.ReturnContractInfo = ReturnContractInfo;
    }

    /**
     * Get 签约通知地址 
     * @return NotifyUrl 签约通知地址
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 签约通知地址
     * @param NotifyUrl 签约通知地址
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    public ResponseQueryContract() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseQueryContract(ResponseQueryContract source) {
        if (source.ExternalReturnCode != null) {
            this.ExternalReturnCode = new String(source.ExternalReturnCode);
        }
        if (source.ExternalReturnMessage != null) {
            this.ExternalReturnMessage = new String(source.ExternalReturnMessage);
        }
        if (source.ExternalReturnData != null) {
            this.ExternalReturnData = new String(source.ExternalReturnData);
        }
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.ChannelAppId != null) {
            this.ChannelAppId = new String(source.ChannelAppId);
        }
        if (source.ChannelSubAppId != null) {
            this.ChannelSubAppId = new String(source.ChannelSubAppId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ReturnContractInfo != null) {
            this.ReturnContractInfo = new ReturnContractInfo(source.ReturnContractInfo);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalReturnCode", this.ExternalReturnCode);
        this.setParamSimple(map, prefix + "ExternalReturnMessage", this.ExternalReturnMessage);
        this.setParamSimple(map, prefix + "ExternalReturnData", this.ExternalReturnData);
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelAppId", this.ChannelAppId);
        this.setParamSimple(map, prefix + "ChannelSubAppId", this.ChannelSubAppId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamObj(map, prefix + "ReturnContractInfo.", this.ReturnContractInfo);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);

    }
}

