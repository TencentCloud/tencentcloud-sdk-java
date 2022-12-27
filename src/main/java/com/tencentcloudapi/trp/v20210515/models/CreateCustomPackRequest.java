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

public class CreateCustomPackRequest extends AbstractModel{

    /**
    * 商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 生码数量, 普通码包时必填
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 码包类型 0: 普通码包 1: 层级码包
    */
    @SerializedName("PackType")
    @Expose
    private Long PackType;

    /**
    * 码包层级
    */
    @SerializedName("PackLevel")
    @Expose
    private Long PackLevel;

    /**
    * 层级码包规则
    */
    @SerializedName("PackSpec")
    @Expose
    private PackSpec [] PackSpec;

    /**
    * 码规则ID,  和CodeParts二选一必填
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 码段配置，和CustomId二选一必填
    */
    @SerializedName("CodeParts")
    @Expose
    private CodePart [] CodeParts;

    /**
    * 批次ID，如果传了生码后会同时绑定批次，并激活码
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 是否有流水码 0:无 1:有
    */
    @SerializedName("SerialType")
    @Expose
    private Long SerialType;

    /**
     * Get 商户ID 
     * @return MerchantId 商户ID
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户ID
     * @param MerchantId 商户ID
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 生码数量, 普通码包时必填 
     * @return Amount 生码数量, 普通码包时必填
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 生码数量, 普通码包时必填
     * @param Amount 生码数量, 普通码包时必填
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
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
     * Get 码包层级 
     * @return PackLevel 码包层级
     */
    public Long getPackLevel() {
        return this.PackLevel;
    }

    /**
     * Set 码包层级
     * @param PackLevel 码包层级
     */
    public void setPackLevel(Long PackLevel) {
        this.PackLevel = PackLevel;
    }

    /**
     * Get 层级码包规则 
     * @return PackSpec 层级码包规则
     */
    public PackSpec [] getPackSpec() {
        return this.PackSpec;
    }

    /**
     * Set 层级码包规则
     * @param PackSpec 层级码包规则
     */
    public void setPackSpec(PackSpec [] PackSpec) {
        this.PackSpec = PackSpec;
    }

    /**
     * Get 码规则ID,  和CodeParts二选一必填 
     * @return CustomId 码规则ID,  和CodeParts二选一必填
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 码规则ID,  和CodeParts二选一必填
     * @param CustomId 码规则ID,  和CodeParts二选一必填
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 码段配置，和CustomId二选一必填 
     * @return CodeParts 码段配置，和CustomId二选一必填
     */
    public CodePart [] getCodeParts() {
        return this.CodeParts;
    }

    /**
     * Set 码段配置，和CustomId二选一必填
     * @param CodeParts 码段配置，和CustomId二选一必填
     */
    public void setCodeParts(CodePart [] CodeParts) {
        this.CodeParts = CodeParts;
    }

    /**
     * Get 批次ID，如果传了生码后会同时绑定批次，并激活码 
     * @return BatchId 批次ID，如果传了生码后会同时绑定批次，并激活码
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID，如果传了生码后会同时绑定批次，并激活码
     * @param BatchId 批次ID，如果传了生码后会同时绑定批次，并激活码
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 是否有流水码 0:无 1:有 
     * @return SerialType 是否有流水码 0:无 1:有
     */
    public Long getSerialType() {
        return this.SerialType;
    }

    /**
     * Set 是否有流水码 0:无 1:有
     * @param SerialType 是否有流水码 0:无 1:有
     */
    public void setSerialType(Long SerialType) {
        this.SerialType = SerialType;
    }

    public CreateCustomPackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomPackRequest(CreateCustomPackRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
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
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.CodeParts != null) {
            this.CodeParts = new CodePart[source.CodeParts.length];
            for (int i = 0; i < source.CodeParts.length; i++) {
                this.CodeParts[i] = new CodePart(source.CodeParts[i]);
            }
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.SerialType != null) {
            this.SerialType = new Long(source.SerialType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "PackType", this.PackType);
        this.setParamSimple(map, prefix + "PackLevel", this.PackLevel);
        this.setParamArrayObj(map, prefix + "PackSpec.", this.PackSpec);
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamArrayObj(map, prefix + "CodeParts.", this.CodeParts);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "SerialType", this.SerialType);

    }
}

