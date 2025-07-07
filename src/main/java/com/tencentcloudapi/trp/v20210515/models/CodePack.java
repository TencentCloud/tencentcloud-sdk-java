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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodePack extends AbstractModel {

    /**
    * 码id
    */
    @SerializedName("PackId")
    @Expose
    private String PackId;

    /**
    * 企业id
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 商户id
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 执行日志
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 创建人
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * 码数
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 防伪码长度
    */
    @SerializedName("CodeLength")
    @Expose
    private Long CodeLength;

    /**
    * 码类型
    */
    @SerializedName("CodeType")
    @Expose
    private String CodeType;

    /**
    * 是否暗码
    */
    @SerializedName("Cipher")
    @Expose
    private Long Cipher;

    /**
    * [弃用] 文字码地址，通过另一个接口查
    */
    @SerializedName("TextUrl")
    @Expose
    private String TextUrl;

    /**
    * [弃用] 二维码地址，通过另一个接口查
    */
    @SerializedName("PackUrl")
    @Expose
    private String PackUrl;

    /**
    * 商户名
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 码规则类型 0: 默认, 1: 自定义
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 自定义码规则ID
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 码包类型 0: 普通码包 1: 层级码包
    */
    @SerializedName("PackType")
    @Expose
    private Long PackType;

    /**
    * 生码层级
    */
    @SerializedName("PackLevel")
    @Expose
    private Long PackLevel;

    /**
    * 层级码配置
    */
    @SerializedName("PackSpec")
    @Expose
    private PackSpec [] PackSpec;

    /**
    * 商品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 商品规格
    */
    @SerializedName("ProductSpecification")
    @Expose
    private String ProductSpecification;

    /**
    * 商品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 码关系是否预关联
0:否, 1:是
    */
    @SerializedName("RelateType")
    @Expose
    private Long RelateType;

    /**
    * 场景码
    */
    @SerializedName("SceneCode")
    @Expose
    private Long SceneCode;

    /**
    * 码规则
    */
    @SerializedName("CodeRule")
    @Expose
    private String CodeRule;

    /**
    * 已使用码数
    */
    @SerializedName("UsedAmount")
    @Expose
    private Long UsedAmount;

    /**
    * 开始流水号
    */
    @SerializedName("SerialStart")
    @Expose
    private Long SerialStart;

    /**
    * 结束流水号
    */
    @SerializedName("SerialEnd")
    @Expose
    private Long SerialEnd;

    /**
     * Get 码id 
     * @return PackId 码id
     */
    public String getPackId() {
        return this.PackId;
    }

    /**
     * Set 码id
     * @param PackId 码id
     */
    public void setPackId(String PackId) {
        this.PackId = PackId;
    }

    /**
     * Get 企业id 
     * @return CorpId 企业id
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业id
     * @param CorpId 企业id
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 商户id 
     * @return MerchantId 商户id
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户id
     * @param MerchantId 商户id
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败 
     * @return Status 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
     * @param Status 制码状态 init: 初始化, pending: 执行中, done: 完成, error: 失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 执行日志 
     * @return Log 执行日志
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 执行日志
     * @param Log 执行日志
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 创建人 
     * @return CreateUser 创建人
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set 创建人
     * @param CreateUser 创建人
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get 码数 
     * @return Amount 码数
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 码数
     * @param Amount 码数
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 防伪码长度 
     * @return CodeLength 防伪码长度
     */
    public Long getCodeLength() {
        return this.CodeLength;
    }

    /**
     * Set 防伪码长度
     * @param CodeLength 防伪码长度
     */
    public void setCodeLength(Long CodeLength) {
        this.CodeLength = CodeLength;
    }

    /**
     * Get 码类型 
     * @return CodeType 码类型
     */
    public String getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 码类型
     * @param CodeType 码类型
     */
    public void setCodeType(String CodeType) {
        this.CodeType = CodeType;
    }

    /**
     * Get 是否暗码 
     * @return Cipher 是否暗码
     */
    public Long getCipher() {
        return this.Cipher;
    }

    /**
     * Set 是否暗码
     * @param Cipher 是否暗码
     */
    public void setCipher(Long Cipher) {
        this.Cipher = Cipher;
    }

    /**
     * Get [弃用] 文字码地址，通过另一个接口查 
     * @return TextUrl [弃用] 文字码地址，通过另一个接口查
     */
    public String getTextUrl() {
        return this.TextUrl;
    }

    /**
     * Set [弃用] 文字码地址，通过另一个接口查
     * @param TextUrl [弃用] 文字码地址，通过另一个接口查
     */
    public void setTextUrl(String TextUrl) {
        this.TextUrl = TextUrl;
    }

    /**
     * Get [弃用] 二维码地址，通过另一个接口查 
     * @return PackUrl [弃用] 二维码地址，通过另一个接口查
     */
    public String getPackUrl() {
        return this.PackUrl;
    }

    /**
     * Set [弃用] 二维码地址，通过另一个接口查
     * @param PackUrl [弃用] 二维码地址，通过另一个接口查
     */
    public void setPackUrl(String PackUrl) {
        this.PackUrl = PackUrl;
    }

    /**
     * Get 商户名 
     * @return MerchantName 商户名
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名
     * @param MerchantName 商户名
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 码规则类型 0: 默认, 1: 自定义 
     * @return RuleType 码规则类型 0: 默认, 1: 自定义
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 码规则类型 0: 默认, 1: 自定义
     * @param RuleType 码规则类型 0: 默认, 1: 自定义
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 自定义码规则ID 
     * @return CustomId 自定义码规则ID
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 自定义码规则ID
     * @param CustomId 自定义码规则ID
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 码包类型 0: 普通码包 1: 层级码包 
     * @return PackType 码包类型 0: 普通码包 1: 层级码包
     */
    public Long getPackType() {
        return this.PackType;
    }

    /**
     * Set 码包类型 0: 普通码包 1: 层级码包
     * @param PackType 码包类型 0: 普通码包 1: 层级码包
     */
    public void setPackType(Long PackType) {
        this.PackType = PackType;
    }

    /**
     * Get 生码层级 
     * @return PackLevel 生码层级
     */
    public Long getPackLevel() {
        return this.PackLevel;
    }

    /**
     * Set 生码层级
     * @param PackLevel 生码层级
     */
    public void setPackLevel(Long PackLevel) {
        this.PackLevel = PackLevel;
    }

    /**
     * Get 层级码配置 
     * @return PackSpec 层级码配置
     */
    public PackSpec [] getPackSpec() {
        return this.PackSpec;
    }

    /**
     * Set 层级码配置
     * @param PackSpec 层级码配置
     */
    public void setPackSpec(PackSpec [] PackSpec) {
        this.PackSpec = PackSpec;
    }

    /**
     * Get 商品名称 
     * @return ProductName 商品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 商品名称
     * @param ProductName 商品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 商品规格 
     * @return ProductSpecification 商品规格
     */
    public String getProductSpecification() {
        return this.ProductSpecification;
    }

    /**
     * Set 商品规格
     * @param ProductSpecification 商品规格
     */
    public void setProductSpecification(String ProductSpecification) {
        this.ProductSpecification = ProductSpecification;
    }

    /**
     * Get 商品ID 
     * @return ProductId 商品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 商品ID
     * @param ProductId 商品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 码关系是否预关联
0:否, 1:是 
     * @return RelateType 码关系是否预关联
0:否, 1:是
     */
    public Long getRelateType() {
        return this.RelateType;
    }

    /**
     * Set 码关系是否预关联
0:否, 1:是
     * @param RelateType 码关系是否预关联
0:否, 1:是
     */
    public void setRelateType(Long RelateType) {
        this.RelateType = RelateType;
    }

    /**
     * Get 场景码 
     * @return SceneCode 场景码
     */
    public Long getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景码
     * @param SceneCode 场景码
     */
    public void setSceneCode(Long SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get 码规则 
     * @return CodeRule 码规则
     */
    public String getCodeRule() {
        return this.CodeRule;
    }

    /**
     * Set 码规则
     * @param CodeRule 码规则
     */
    public void setCodeRule(String CodeRule) {
        this.CodeRule = CodeRule;
    }

    /**
     * Get 已使用码数 
     * @return UsedAmount 已使用码数
     */
    public Long getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 已使用码数
     * @param UsedAmount 已使用码数
     */
    public void setUsedAmount(Long UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get 开始流水号 
     * @return SerialStart 开始流水号
     */
    public Long getSerialStart() {
        return this.SerialStart;
    }

    /**
     * Set 开始流水号
     * @param SerialStart 开始流水号
     */
    public void setSerialStart(Long SerialStart) {
        this.SerialStart = SerialStart;
    }

    /**
     * Get 结束流水号 
     * @return SerialEnd 结束流水号
     */
    public Long getSerialEnd() {
        return this.SerialEnd;
    }

    /**
     * Set 结束流水号
     * @param SerialEnd 结束流水号
     */
    public void setSerialEnd(Long SerialEnd) {
        this.SerialEnd = SerialEnd;
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
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductSpecification != null) {
            this.ProductSpecification = new String(source.ProductSpecification);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.RelateType != null) {
            this.RelateType = new Long(source.RelateType);
        }
        if (source.SceneCode != null) {
            this.SceneCode = new Long(source.SceneCode);
        }
        if (source.CodeRule != null) {
            this.CodeRule = new String(source.CodeRule);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new Long(source.UsedAmount);
        }
        if (source.SerialStart != null) {
            this.SerialStart = new Long(source.SerialStart);
        }
        if (source.SerialEnd != null) {
            this.SerialEnd = new Long(source.SerialEnd);
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
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductSpecification", this.ProductSpecification);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "RelateType", this.RelateType);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);
        this.setParamSimple(map, prefix + "CodeRule", this.CodeRule);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "SerialStart", this.SerialStart);
        this.setParamSimple(map, prefix + "SerialEnd", this.SerialEnd);

    }
}

