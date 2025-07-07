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

public class CreateCodePackRequest extends AbstractModel {

    /**
    * 商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 码长度
    */
    @SerializedName("CodeLength")
    @Expose
    private Long CodeLength;

    /**
    * 码类型 alphabet 字母, number 数字, mixin 混合
    */
    @SerializedName("CodeType")
    @Expose
    private String CodeType;

    /**
    * 生码数量 普通码包时必填
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
    * 码包规格
    */
    @SerializedName("PackSpec")
    @Expose
    private PackSpec [] PackSpec;

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
    * 关联产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 层级码时是否提前生成关联关系，默认为 1
    */
    @SerializedName("RelateType")
    @Expose
    private Long RelateType;

    /**
    * 场景值
    */
    @SerializedName("SceneCode")
    @Expose
    private Long SceneCode;

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
     * Get 码长度 
     * @return CodeLength 码长度
     */
    public Long getCodeLength() {
        return this.CodeLength;
    }

    /**
     * Set 码长度
     * @param CodeLength 码长度
     */
    public void setCodeLength(Long CodeLength) {
        this.CodeLength = CodeLength;
    }

    /**
     * Get 码类型 alphabet 字母, number 数字, mixin 混合 
     * @return CodeType 码类型 alphabet 字母, number 数字, mixin 混合
     */
    public String getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 码类型 alphabet 字母, number 数字, mixin 混合
     * @param CodeType 码类型 alphabet 字母, number 数字, mixin 混合
     */
    public void setCodeType(String CodeType) {
        this.CodeType = CodeType;
    }

    /**
     * Get 生码数量 普通码包时必填 
     * @return Amount 生码数量 普通码包时必填
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 生码数量 普通码包时必填
     * @param Amount 生码数量 普通码包时必填
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
     * Get 码包规格 
     * @return PackSpec 码包规格
     */
    public PackSpec [] getPackSpec() {
        return this.PackSpec;
    }

    /**
     * Set 码包规格
     * @param PackSpec 码包规格
     */
    public void setPackSpec(PackSpec [] PackSpec) {
        this.PackSpec = PackSpec;
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

    /**
     * Get 关联产品ID 
     * @return ProductId 关联产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 关联产品ID
     * @param ProductId 关联产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 层级码时是否提前生成关联关系，默认为 1 
     * @return RelateType 层级码时是否提前生成关联关系，默认为 1
     */
    public Long getRelateType() {
        return this.RelateType;
    }

    /**
     * Set 层级码时是否提前生成关联关系，默认为 1
     * @param RelateType 层级码时是否提前生成关联关系，默认为 1
     */
    public void setRelateType(Long RelateType) {
        this.RelateType = RelateType;
    }

    /**
     * Get 场景值 
     * @return SceneCode 场景值
     */
    public Long getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景值
     * @param SceneCode 场景值
     */
    public void setSceneCode(Long SceneCode) {
        this.SceneCode = SceneCode;
    }

    public CreateCodePackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCodePackRequest(CreateCodePackRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.CodeLength != null) {
            this.CodeLength = new Long(source.CodeLength);
        }
        if (source.CodeType != null) {
            this.CodeType = new String(source.CodeType);
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
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.SerialType != null) {
            this.SerialType = new Long(source.SerialType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "CodeLength", this.CodeLength);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "PackType", this.PackType);
        this.setParamSimple(map, prefix + "PackLevel", this.PackLevel);
        this.setParamArrayObj(map, prefix + "PackSpec.", this.PackSpec);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "SerialType", this.SerialType);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "RelateType", this.RelateType);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);

    }
}

