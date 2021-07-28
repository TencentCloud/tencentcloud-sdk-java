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

public class TerminateContractRequest extends AbstractModel{

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 用户ID，长度不小于5位，仅支持字母和数字的组合
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 指定渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 枚举值：
CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE: 按OutContractCode+ContractSceneId解约
CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE：按ChannelContractCode解约
    */
    @SerializedName("TerminateMode")
    @Expose
    private String TerminateMode;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 按照聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 聚鑫计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 业务签约合同协议号 当TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填
    */
    @SerializedName("OutContractCode")
    @Expose
    private String OutContractCode;

    /**
    * 签约场景ID，当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填，在米大师侧托管后生成
    */
    @SerializedName("ContractSceneId")
    @Expose
    private String ContractSceneId;

    /**
    * 米大师生成的协议号 当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE 时 必填
    */
    @SerializedName("ChannelContractCode")
    @Expose
    private String ChannelContractCode;

    /**
    * 第三方渠道合约数据，json字符串，与特定渠道有关
    */
    @SerializedName("ExternalContractData")
    @Expose
    private String ExternalContractData;

    /**
    * 终止合约原因
    */
    @SerializedName("TerminationReason")
    @Expose
    private String TerminationReason;

    /**
    * 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 签约方式
    */
    @SerializedName("ContractMethod")
    @Expose
    private String ContractMethod;

    /**
    * 签约代扣穿透查询存量数据迁移模式
    */
    @SerializedName("MigrateMode")
    @Expose
    private String MigrateMode;

    /**
     * Get 聚鑫分配的支付主MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主MidasAppId
     * @param MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 用户ID，长度不小于5位，仅支持字母和数字的组合 
     * @return UserId 用户ID，长度不小于5位，仅支持字母和数字的组合
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID，长度不小于5位，仅支持字母和数字的组合
     * @param UserId 用户ID，长度不小于5位，仅支持字母和数字的组合
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 指定渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定 
     * @return Channel 指定渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 指定渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定
     * @param Channel 指定渠道：  wechat：微信支付  qqwallet：QQ钱包 
 bank：网银支付  只有一个渠道时需要指定
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 枚举值：
CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE: 按OutContractCode+ContractSceneId解约
CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE：按ChannelContractCode解约 
     * @return TerminateMode 枚举值：
CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE: 按OutContractCode+ContractSceneId解约
CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE：按ChannelContractCode解约
     */
    public String getTerminateMode() {
        return this.TerminateMode;
    }

    /**
     * Set 枚举值：
CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE: 按OutContractCode+ContractSceneId解约
CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE：按ChannelContractCode解约
     * @param TerminateMode 枚举值：
CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE: 按OutContractCode+ContractSceneId解约
CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE：按ChannelContractCode解约
     */
    public void setTerminateMode(String TerminateMode) {
        this.TerminateMode = TerminateMode;
    }

    /**
     * Get 聚鑫分配的安全ID 
     * @return MidasSecretId 聚鑫分配的安全ID
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 聚鑫分配的安全ID
     * @param MidasSecretId 聚鑫分配的安全ID
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 按照聚鑫安全密钥计算的签名 
     * @return MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 按照聚鑫安全密钥计算的签名
     * @param MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get 聚鑫计费SubAppId，代表子商户 
     * @return SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 聚鑫计费SubAppId，代表子商户
     * @param SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 业务签约合同协议号 当TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填 
     * @return OutContractCode 业务签约合同协议号 当TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填
     */
    public String getOutContractCode() {
        return this.OutContractCode;
    }

    /**
     * Set 业务签约合同协议号 当TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填
     * @param OutContractCode 业务签约合同协议号 当TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填
     */
    public void setOutContractCode(String OutContractCode) {
        this.OutContractCode = OutContractCode;
    }

    /**
     * Get 签约场景ID，当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填，在米大师侧托管后生成 
     * @return ContractSceneId 签约场景ID，当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填，在米大师侧托管后生成
     */
    public String getContractSceneId() {
        return this.ContractSceneId;
    }

    /**
     * Set 签约场景ID，当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填，在米大师侧托管后生成
     * @param ContractSceneId 签约场景ID，当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_OUT_CONTRACT_CODE 时 必填，在米大师侧托管后生成
     */
    public void setContractSceneId(String ContractSceneId) {
        this.ContractSceneId = ContractSceneId;
    }

    /**
     * Get 米大师生成的协议号 当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE 时 必填 
     * @return ChannelContractCode 米大师生成的协议号 当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE 时 必填
     */
    public String getChannelContractCode() {
        return this.ChannelContractCode;
    }

    /**
     * Set 米大师生成的协议号 当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE 时 必填
     * @param ChannelContractCode 米大师生成的协议号 当 TerminateMode=CONTRACT_TERMINATION_MODE_BY_CHANNEL_CONTRACT_CODE 时 必填
     */
    public void setChannelContractCode(String ChannelContractCode) {
        this.ChannelContractCode = ChannelContractCode;
    }

    /**
     * Get 第三方渠道合约数据，json字符串，与特定渠道有关 
     * @return ExternalContractData 第三方渠道合约数据，json字符串，与特定渠道有关
     */
    public String getExternalContractData() {
        return this.ExternalContractData;
    }

    /**
     * Set 第三方渠道合约数据，json字符串，与特定渠道有关
     * @param ExternalContractData 第三方渠道合约数据，json字符串，与特定渠道有关
     */
    public void setExternalContractData(String ExternalContractData) {
        this.ExternalContractData = ExternalContractData;
    }

    /**
     * Get 终止合约原因 
     * @return TerminationReason 终止合约原因
     */
    public String getTerminationReason() {
        return this.TerminationReason;
    }

    /**
     * Set 终止合约原因
     * @param TerminationReason 终止合约原因
     */
    public void setTerminationReason(String TerminationReason) {
        this.TerminationReason = TerminationReason;
    }

    /**
     * Get 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release 
     * @return MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     * @param MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    /**
     * Get USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID 
     * @return UserType USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID
     * @param UserType USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 签约方式 
     * @return ContractMethod 签约方式
     */
    public String getContractMethod() {
        return this.ContractMethod;
    }

    /**
     * Set 签约方式
     * @param ContractMethod 签约方式
     */
    public void setContractMethod(String ContractMethod) {
        this.ContractMethod = ContractMethod;
    }

    /**
     * Get 签约代扣穿透查询存量数据迁移模式 
     * @return MigrateMode 签约代扣穿透查询存量数据迁移模式
     */
    public String getMigrateMode() {
        return this.MigrateMode;
    }

    /**
     * Set 签约代扣穿透查询存量数据迁移模式
     * @param MigrateMode 签约代扣穿透查询存量数据迁移模式
     */
    public void setMigrateMode(String MigrateMode) {
        this.MigrateMode = MigrateMode;
    }

    public TerminateContractRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateContractRequest(TerminateContractRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.TerminateMode != null) {
            this.TerminateMode = new String(source.TerminateMode);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.OutContractCode != null) {
            this.OutContractCode = new String(source.OutContractCode);
        }
        if (source.ContractSceneId != null) {
            this.ContractSceneId = new String(source.ContractSceneId);
        }
        if (source.ChannelContractCode != null) {
            this.ChannelContractCode = new String(source.ChannelContractCode);
        }
        if (source.ExternalContractData != null) {
            this.ExternalContractData = new String(source.ExternalContractData);
        }
        if (source.TerminationReason != null) {
            this.TerminationReason = new String(source.TerminationReason);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.ContractMethod != null) {
            this.ContractMethod = new String(source.ContractMethod);
        }
        if (source.MigrateMode != null) {
            this.MigrateMode = new String(source.MigrateMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "TerminateMode", this.TerminateMode);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "OutContractCode", this.OutContractCode);
        this.setParamSimple(map, prefix + "ContractSceneId", this.ContractSceneId);
        this.setParamSimple(map, prefix + "ChannelContractCode", this.ChannelContractCode);
        this.setParamSimple(map, prefix + "ExternalContractData", this.ExternalContractData);
        this.setParamSimple(map, prefix + "TerminationReason", this.TerminationReason);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "ContractMethod", this.ContractMethod);
        this.setParamSimple(map, prefix + "MigrateMode", this.MigrateMode);

    }
}

