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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodePack extends AbstractModel{

    /**
    * 码id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackId")
    @Expose
    private String PackId;

    /**
    * 企业id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 商户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 执行日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * 码数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 防伪码长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeLength")
    @Expose
    private Long CodeLength;

    /**
    * 码类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeType")
    @Expose
    private String CodeType;

    /**
    * 是否暗码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cipher")
    @Expose
    private Long Cipher;

    /**
    * [弃用] 文字码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextUrl")
    @Expose
    private String TextUrl;

    /**
    * [弃用] 二维码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackUrl")
    @Expose
    private String PackUrl;

    /**
    * 商户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 码规则类型 0: 默认, 1: 自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 自定义码规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 码包类型 0: 普通码包 1: 层级码包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackType")
    @Expose
    private Long PackType;

    /**
    * 生码层级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackLevel")
    @Expose
    private Long PackLevel;

    /**
    * 层级码配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackSpec")
    @Expose
    private PackSpec [] PackSpec;

    /**
     * Get 码id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackId 码id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackId() {
        return this.PackId;
    }

    /**
     * Set 码id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackId 码id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackId(String PackId) {
        this.PackId = PackId;
    }

    /**
     * Get 企业id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId 企业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId 企业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 商户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantId 商户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantId 商户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 执行日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Log 执行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 执行日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param Log 执行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get 码数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount 码数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 码数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount 码数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 防伪码长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeLength 防伪码长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCodeLength() {
        return this.CodeLength;
    }

    /**
     * Set 防伪码长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeLength 防伪码长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeLength(Long CodeLength) {
        this.CodeLength = CodeLength;
    }

    /**
     * Get 码类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeType 码类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 码类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeType 码类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeType(String CodeType) {
        this.CodeType = CodeType;
    }

    /**
     * Get 是否暗码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cipher 是否暗码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCipher() {
        return this.Cipher;
    }

    /**
     * Set 是否暗码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cipher 是否暗码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCipher(Long Cipher) {
        this.Cipher = Cipher;
    }

    /**
     * Get [弃用] 文字码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextUrl [弃用] 文字码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTextUrl() {
        return this.TextUrl;
    }

    /**
     * Set [弃用] 文字码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextUrl [弃用] 文字码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextUrl(String TextUrl) {
        this.TextUrl = TextUrl;
    }

    /**
     * Get [弃用] 二维码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackUrl [弃用] 二维码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackUrl() {
        return this.PackUrl;
    }

    /**
     * Set [弃用] 二维码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackUrl [弃用] 二维码地址，通过另一个接口查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackUrl(String PackUrl) {
        this.PackUrl = PackUrl;
    }

    /**
     * Get 商户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantName 商户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantName 商户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 码规则类型 0: 默认, 1: 自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 码规则类型 0: 默认, 1: 自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 码规则类型 0: 默认, 1: 自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 码规则类型 0: 默认, 1: 自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 自定义码规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomId 自定义码规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 自定义码规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomId 自定义码规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 码包类型 0: 普通码包 1: 层级码包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackType 码包类型 0: 普通码包 1: 层级码包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPackType() {
        return this.PackType;
    }

    /**
     * Set 码包类型 0: 普通码包 1: 层级码包
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackType 码包类型 0: 普通码包 1: 层级码包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackType(Long PackType) {
        this.PackType = PackType;
    }

    /**
     * Get 生码层级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackLevel 生码层级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPackLevel() {
        return this.PackLevel;
    }

    /**
     * Set 生码层级
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackLevel 生码层级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackLevel(Long PackLevel) {
        this.PackLevel = PackLevel;
    }

    /**
     * Get 层级码配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackSpec 层级码配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PackSpec [] getPackSpec() {
        return this.PackSpec;
    }

    /**
     * Set 层级码配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackSpec 层级码配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackSpec(PackSpec [] PackSpec) {
        this.PackSpec = PackSpec;
    }

    public CodePack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodePack(CodePack source) {
        if (source.PackId != null) {
            this.PackId = new String(source.PackId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.CodeLength != null) {
            this.CodeLength = new Long(source.CodeLength);
        }
        if (source.CodeType != null) {
            this.CodeType = new String(source.CodeType);
        }
        if (source.Cipher != null) {
            this.Cipher = new Long(source.Cipher);
        }
        if (source.TextUrl != null) {
            this.TextUrl = new String(source.TextUrl);
        }
        if (source.PackUrl != null) {
            this.PackUrl = new String(source.PackUrl);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.PackType != null) {
            this.PackType = new Long(source.PackType);
        }
        if (source.PackLevel != null) {
            this.PackLevel = new Long(source.PackLevel);
        }
        if (source.PackSpec != null) {
            this.PackSpec = new PackSpec[source.PackSpec.length];
            for (int i = 0; i < source.PackSpec.length; i++) {
                this.PackSpec[i] = new PackSpec(source.PackSpec[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackId", this.PackId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "CodeLength", this.CodeLength);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);
        this.setParamSimple(map, prefix + "Cipher", this.Cipher);
        this.setParamSimple(map, prefix + "TextUrl", this.TextUrl);
        this.setParamSimple(map, prefix + "PackUrl", this.PackUrl);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamSimple(map, prefix + "PackType", this.PackType);
        this.setParamSimple(map, prefix + "PackLevel", this.PackLevel);
        this.setParamArrayObj(map, prefix + "PackSpec.", this.PackSpec);

    }
}

