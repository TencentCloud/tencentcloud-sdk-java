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

public class SyncContractDataRequest extends AbstractModel{

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
    * 签约使用的渠道
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 业务签约合同协议号
    */
    @SerializedName("OutContractCode")
    @Expose
    private String OutContractCode;

    /**
    * 签约状态，枚举值
CONTRACT_STATUS_INVALID=无效状态
CONTRACT_STATUS_SIGNED=已签约
CONTRACT_STATUS_TERMINATED=已解约
CONTRACT_STATUS_PENDING=签约进行中
    */
    @SerializedName("ContractStatus")
    @Expose
    private String ContractStatus;

    /**
    * 签约同步信息
    */
    @SerializedName("ContractSyncInfo")
    @Expose
    private ContractSyncInfo ContractSyncInfo;

    /**
    * 按照聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 聚鑫计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 用户类型，枚举值
USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 场景信息
    */
    @SerializedName("SceneInfo")
    @Expose
    private SceneInfo SceneInfo;

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
     * Get 签约使用的渠道 
     * @return Channel 签约使用的渠道
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 签约使用的渠道
     * @param Channel 签约使用的渠道
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 业务签约合同协议号 
     * @return OutContractCode 业务签约合同协议号
     */
    public String getOutContractCode() {
        return this.OutContractCode;
    }

    /**
     * Set 业务签约合同协议号
     * @param OutContractCode 业务签约合同协议号
     */
    public void setOutContractCode(String OutContractCode) {
        this.OutContractCode = OutContractCode;
    }

    /**
     * Get 签约状态，枚举值
CONTRACT_STATUS_INVALID=无效状态
CONTRACT_STATUS_SIGNED=已签约
CONTRACT_STATUS_TERMINATED=已解约
CONTRACT_STATUS_PENDING=签约进行中 
     * @return ContractStatus 签约状态，枚举值
CONTRACT_STATUS_INVALID=无效状态
CONTRACT_STATUS_SIGNED=已签约
CONTRACT_STATUS_TERMINATED=已解约
CONTRACT_STATUS_PENDING=签约进行中
     */
    public String getContractStatus() {
        return this.ContractStatus;
    }

    /**
     * Set 签约状态，枚举值
CONTRACT_STATUS_INVALID=无效状态
CONTRACT_STATUS_SIGNED=已签约
CONTRACT_STATUS_TERMINATED=已解约
CONTRACT_STATUS_PENDING=签约进行中
     * @param ContractStatus 签约状态，枚举值
CONTRACT_STATUS_INVALID=无效状态
CONTRACT_STATUS_SIGNED=已签约
CONTRACT_STATUS_TERMINATED=已解约
CONTRACT_STATUS_PENDING=签约进行中
     */
    public void setContractStatus(String ContractStatus) {
        this.ContractStatus = ContractStatus;
    }

    /**
     * Get 签约同步信息 
     * @return ContractSyncInfo 签约同步信息
     */
    public ContractSyncInfo getContractSyncInfo() {
        return this.ContractSyncInfo;
    }

    /**
     * Set 签约同步信息
     * @param ContractSyncInfo 签约同步信息
     */
    public void setContractSyncInfo(ContractSyncInfo ContractSyncInfo) {
        this.ContractSyncInfo = ContractSyncInfo;
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
     * Get 用户类型，枚举值
USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID 
     * @return UserType 用户类型，枚举值
USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型，枚举值
USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID
     * @param UserType 用户类型，枚举值
USER_ID: 用户ID
ANONYMOUS: 匿名类型 USER_ID
默认值为 USER_ID
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 场景信息 
     * @return SceneInfo 场景信息
     */
    public SceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set 场景信息
     * @param SceneInfo 场景信息
     */
    public void setSceneInfo(SceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
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

    public SyncContractDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncContractDataRequest(SyncContractDataRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.OutContractCode != null) {
            this.OutContractCode = new String(source.OutContractCode);
        }
        if (source.ContractStatus != null) {
            this.ContractStatus = new String(source.ContractStatus);
        }
        if (source.ContractSyncInfo != null) {
            this.ContractSyncInfo = new ContractSyncInfo(source.ContractSyncInfo);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.SceneInfo != null) {
            this.SceneInfo = new SceneInfo(source.SceneInfo);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "OutContractCode", this.OutContractCode);
        this.setParamSimple(map, prefix + "ContractStatus", this.ContractStatus);
        this.setParamObj(map, prefix + "ContractSyncInfo.", this.ContractSyncInfo);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamObj(map, prefix + "SceneInfo.", this.SceneInfo);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

